import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JLispGeneratorB extends JLispBaseListener{
    Map<String,VarInfo> memory = new HashMap<>();
    int numOps = 1; //numero de operaciones, comienza en 1 porque al menos se carga el argumento del main
    int labelCount = 0;
    int break_label=1;
    boolean breake=false;
    ParseTreeProperty<ST> jlisp = new ParseTreeProperty<>();
    STGroup templates = new STGroupFile("generator.stg");
    public JLispGeneratorB(int numOps, Map<String,VarInfo> memory) {
         this.memory = memory; // apunta al mapa creado en el parser
         this.numOps=numOps;
    }
     /**
     * Listen to matches of classDeclaration
     */
    @Override
    public void exitProgram(JLispParser.ProgramContext ctx) {
        //jasminFile(maxStackDepth, maxLocals, instructions)
        JLispParser.SexprContext sexpctx = ctx.sexpr();
        ST tag = templates.getInstanceOf("jasminFile");
        tag.add("maxStackDepth", numOps + 2);
        tag.add("maxLocals", memory.size() + 2);
        tag.add("instructions", jlisp.get(sexpctx));
        jlisp.put(ctx, tag);
    }

    @Override 
	public void exitHelp(JLispParser.HelpContext ctx) {
	   System.out.println(" COMMAND        ABBR     DESCRIPTION");
	   System.out.println("--help          --h      Muestra la ayuda sobre los comandos disponibles");
       System.out.println("--compile       --c      Compilar el bytecode generado en resources/jlispfile.bcjava");
       System.out.println("--execute       --e      Ejecutar el JLisp.class generado con el jasmin");
       System.out.println("ctr+d                    Salir de la presente instancia");
       System.out.println("ctr+c                    Salir de el programa");				  
	   return ;
	}

    @Override 
	public void exitInterprete(JLispParser.InterpreteContext ctx){
		System.out.println("El comando "+ctx.getText()+"no es valido en esta instancia salga al menu con ctr+d e intente nuevamente");
        return;
	}

	@Override 
	public void exitGenBytecode(JLispParser.GenBytecodeContext ctx) {
		System.out.println("El comando "+ctx.getText()+"no es valido en esta instancia salga al menu con ctr+d e intente nuevamente");
		return;
	}

    @Override 
	public void exitExecute(JLispParser.ExecuteContext ctx) {
        exec("java output.JLisp");
		return ; 
	}

	@Override 
	public void exitCompile(JLispParser.CompileContext ctx) {	
        exec("java -jar resources/jasmin.jar resources/jlispfile.bcjava");	 
		return ;
	}

	private void exec(String comando1){
    	  String s = null;
          try {
             // Determinar en qué SO estamos
             String so = System.getProperty("os.name");
             String comando;
             // Comando para Linux
             if (so.equals("Linux"))
               comando=comando1;
               // Comando para Windows
              else
               comando = "cmd /c "+comando1;
               // Ejcutamos el comando
               Process p = Runtime.getRuntime().exec(comando);
               BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
               BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
               // Leemos la salida del comando
               while ((s = stdInput.readLine()) != null) {
                   System.out.println(s);
               }
               // Leemos los errores si los hubiera
               while ((s = stdError.readLine()) != null) {
                  System.out.println(s);
               }
               } catch (IOException e) {
                 System.out.println("Excepción: ");
                 e.printStackTrace();
               }
    }

	@Override
    public void exitLogic_expr(JLispParser.Logic_exprContext ctx) {
 		String logic_operator = ctx.L_OPERATOR().getText();//El operando logico a efectuar
        int index =1;//list index
        boolean cmp=true;
        switch (logic_operator) {
        	case "<":
 			   ST lt = templates.getInstanceOf("lt");
               lt.add("a",jlisp.get(ctx.sexpr(0)));
               while (ctx.sexpr().size() > index&&cmp) {
                    lt.add("b",jlisp.get(ctx.sexpr(index)));
                    index++;
                }
                lt.add("label1",++labelCount);
                lt.add("label2",++labelCount);
                jlisp.put(ctx,lt);
        	break;
        	case ">":
  			  ST gt = templates.getInstanceOf("gt");   
              gt.add("a",jlisp.get(ctx.sexpr(0)));
              while (ctx.sexpr().size() > index&&cmp) {
                  gt.add("b",jlisp.get(ctx.sexpr(index)));
                  index++;
              }
              gt.add("label1",++labelCount);
              gt.add("label2",++labelCount);
              jlisp.put(ctx,gt);       
        	break;
        }
    }

    @Override
    public void exitAritm_expr(JLispParser.Aritm_exprContext ctx) {
        String operation = ctx.A_OPERATOR().getText();//Obtenemos la operación a efectuar
        boolean float1=(ctx.type==EnumType.FLOAT);
        int index =1;//list index
        int size=ctx.sexpr().size();
        switch(operation){
            case "+":
               ST iadd = templates.getInstanceOf("iadd");
			   ST fadd = templates.getInstanceOf("fadd");
               if (!float1){//Si el atomo es de tipo entero
                iadd.add("first", jlisp.get(ctx.sexpr(0)));//Adicionamos el primer operando de la suma
               }else
                  if (float1){//Si el atomo es de tipo float
                    fadd.add("first", jlisp.get(ctx.sexpr(0)));
                  }
               while (size > index) {//Mientras que la lista de atomos contenga elementos
                   if (!float1) {
                        iadd.add("values", jlisp.get(ctx.sexpr(index)));
                    }else
                    if (float1) {
                     fadd.add("values", jlisp.get(ctx.sexpr(index)));
                    }
                    index++;
                }

               if (size>1)
                   if(float1) fadd.add("end","fadd");else iadd.add("end","iadd"); 

               if (!float1){
                jlisp.put(ctx, iadd);
               }else{
                jlisp.put(ctx, fadd);
               }
              break;
            case "-":
               ST isub = templates.getInstanceOf("isub");
			   ST fsub = templates.getInstanceOf("fsub");
               if (!float1){//Si el atomo es de tipo entero
                isub.add("first", jlisp.get(ctx.sexpr(0)));//Adicionamos el primer operando de la resta
               }else
                  if (float1){//Si el atomo es de tipo float
                    fsub.add("first", jlisp.get(ctx.sexpr(0)));
                  }
               while (size> index) {//Mientras que la lista de atomos contenga elementos
                   if (!float1) {
                        isub.add("values", jlisp.get(ctx.sexpr(index)));
                    }else
                    if (float1) {
                     fsub.add("values", jlisp.get(ctx.sexpr(index)));
                    }
                    index++;
                }
             if (size>1)
              if(float1) fsub.add("end","fsub");else isub.add("end","isub"); 
             if (!float1){
                jlisp.put(ctx, isub);
             }else{
                jlisp.put(ctx, fsub);
             }
             break;
           case "*":
                ST imul = templates.getInstanceOf("imul");
				ST fmul = templates.getInstanceOf("fmul");
               if (!float1){//Si el atomo es de tipo entero
                 imul.add("first", jlisp.get(ctx.sexpr(0)));//Adicionamos el primer operando de la multiplicacion
               }else
                  if (float1){//Si el atomo es de tipo float
                    fmul.add("first", jlisp.get(ctx.sexpr(0)));
                  }
               while (size > index) {//Mientras que la lista de atomos contenga elementos
                   if (!float1) {
                        imul.add("values", jlisp.get(ctx.sexpr(index)));
                    }else
                    if (float1) {
                     fmul.add("values", jlisp.get(ctx.sexpr(index)));
                    }
                    index++;
                }

               if (size>1)
                   if(float1)fmul.add("end","fmul"); else imul.add("end","imul");          
               if (!float1){
                jlisp.put(ctx, imul);
               }else{
                jlisp.put(ctx, fmul);
               }
              break;
            case "/":
             ST idiv = templates.getInstanceOf("idiv");
			 ST fdiv = templates.getInstanceOf("fdiv");
             index=1;
             if (!float1){//Si el atomo es de tipo entero
                idiv.add("first", jlisp.get(ctx.sexpr(0)));//Adicionamos el primer operando de la división
              }else
                 if (float1){//Si el atomo es de tipo float
                   fdiv.add("first", jlisp.get(ctx.sexpr(0)));
                 }
             while (size > index) {//Mientras que la lista de atomos contenga elementos
                   if (!float1) {
                        idiv.add("values", jlisp.get(ctx.sexpr(index)));
                    }else
                    if (float1) {
                     fdiv.add("values", jlisp.get(ctx.sexpr(index)));
                    }
                    index++;
                }
             if (size>1)
                   if(float1)fdiv.add("end","fdiv");else idiv.add("end","idiv");         
             if (!float1){
                jlisp.put(ctx, idiv);
             }else{
                jlisp.put(ctx, fdiv);
             }
             break;
        }
    }

    @Override
    public void exitMacro_expr(JLispParser.Macro_exprContext ctx){
       if(ctx.macro_read()!=null)
       	  jlisp.put(ctx,jlisp.get(ctx.macro_read()));
       	else
       		if (ctx.macro_print()!=null)
       	      jlisp.put(ctx,jlisp.get(ctx.macro_print()));
       	    else
       		  if (ctx.macro_setf()!=null) 
                 jlisp.put(ctx,jlisp.get(ctx.macro_setf()));
       		  else
       		   if(ctx.macro_progn()!=null)
       		    jlisp.put(ctx,jlisp.get(ctx.macro_progn()));
       		   else
       		    if (ctx.macro_quote()!=null) 
       		  	 jlisp.put(ctx,jlisp.get(ctx.macro_quote()));
       		    else
       		      if(ctx.macro_expt()!=null)
       		        jlisp.put(ctx,jlisp.get(ctx.macro_expt()));
       		       else 
       		        jlisp.put(ctx,jlisp.get(ctx.macro_max()));	 

    }

/**
*Función expt
*@param dos sepxr 
*@return el valor de la evaluación de la primera sexpr elevada al resultado de evaluar la segunda
*/
	@Override
    public void exitMacro_expt(JLispParser.Macro_exptContext ctx){
         ST expt = templates.getInstanceOf("expt");
         String type1=(ctx.sexpr(0).type==EnumType.FLOAT)?"f":"i";
         String type2=(ctx.sexpr(1).type==EnumType.FLOAT)?"f":"i";
         String typeReturn=(ctx.type==EnumType.FLOAT)?"f":"i";         
         expt.add("value1",jlisp.get(ctx.sexpr(0)));
         expt.add("value2",jlisp.get(ctx.sexpr(1)));
         expt.add("type1",type1);
         expt.add("type2",type2);
         expt.add("typeReturn",typeReturn);
         jlisp.put(ctx,expt);
    }
/**
*Función max
*@param lista de sexpr
*@return el mayor valor del resultado de evaluar cada una de las sexpr
*/
    @Override
    public void exitMacro_max(JLispParser.Macro_maxContext ctx){
      if(ctx.type==EnumType.FLOAT){
         ST maxf = templates.getInstanceOf("maxf");
         maxf.add("first",jlisp.get(ctx.sexpr(0)));
         for (int i=1;ctx.sexpr().size()>i;i++)
           maxf.add("values",jlisp.get(ctx.sexpr(i)));
         if(ctx.sexpr().size()>1)
          maxf.add("end","invokestatic java/lang/Math.max(FF)F");
         jlisp.put(ctx,maxf);
      }else
      	if(ctx.type==EnumType.INT){
      	   ST maxi = templates.getInstanceOf("maxi");
           maxi.add("first",jlisp.get(ctx.sexpr(0)));
           for (int i=1;ctx.sexpr().size()>i;i++)
             maxi.add("values",jlisp.get(ctx.sexpr(i)));
           if(ctx.sexpr().size()>1)
            maxi.add("end","invokestatic java/lang/Math.max(II)I");
           jlisp.put(ctx,maxi);
      	}
    }
/**
*Función setf
*@param un identificador (nombre de la variable) y una sexpr
*@return asignación de el resultado de evaluar la sexpr al identificador
*/
    @Override
    public void exitMacro_read(JLispParser.Macro_readContext ctx){
       ST read = templates.getInstanceOf("read");
       read.add("temp1",memory.get("read").getNum());//para realizar la lectura necesitamos dos variables locales
       read.add("temp2",memory.get("read").getNum()+1);
       read.add("label1",++labelCount);//necesitamos dos etiquetas para su funcionamiento
       read.add("label2",++labelCount);
       jlisp.put(ctx,read);/**El resultado de la lectura queda almacenado en la pila*/
    }

	@Override
    public void exitMacro_setf(JLispParser.Macro_setfContext ctx){
       ST set = templates.getInstanceOf("set");//Para guardar el contenido de una variable
       set.add("varNum",memory.get(ctx.symbol().getText()).getNum());//Numero de la variable
       set.add("v",jlisp.get(ctx.sexpr()));//Contenido a guardar
       set.add("id",ctx.symbol().getText());//Identificador
       if(ctx.type==EnumType.FLOAT)
         set.add("type","f"); 
       else
       	 set.add("type","i");  
       jlisp.put(ctx,set);
    }

    @Override
    public void exitSexpr(JLispParser.SexprContext ctx) {
    	if (jlisp.get(ctx.list())!=null) {
    		jlisp.put(ctx, jlisp.get(ctx.list()));
    	}else
    	   jlisp.put(ctx, jlisp.get(ctx.atom()));
        
    }

    @Override
    public void exitList(JLispParser.ListContext ctx) {
        jlisp.put(ctx, jlisp.get(ctx.list_body()));
    }

    @Override
    public void exitList_body(JLispParser.List_bodyContext ctx) {
    	if (ctx.aritm_expr()!=null) {
    		jlisp.put(ctx,jlisp.get(ctx.aritm_expr()));
    	}else
    		if (ctx.macro_expr()!=null) {
    		  jlisp.put(ctx, jlisp.get(ctx.macro_expr()));  	
    		}else
    		  if (ctx.logic_expr()!=null) {
    		  	jlisp.put(ctx, jlisp.get(ctx.logic_expr()));
    		  }else
    		     if (ctx.cond_expr()!=null) 
    		      jlisp.put(ctx, jlisp.get(ctx.cond_expr()));
    		     else
    		     	 if (ctx.break_expr()!=null) {
    		     	 	jlisp.put(ctx, jlisp.get(ctx.break_expr()));
    		     	 }
    		        
    }
/**
*Valor de los átomos numéricos(solo tres casos hasta el momento enteros , floats y string)
*los valores NIL (0) y T(1) ;false y true respectivamente
*/
	@Override
    public void exitNum_atom(JLispParser.Num_atomContext ctx){
    	if (ctx.decimal()!=null) {
    		 jlisp.put(ctx, value(ctx.decimal().getText()));
    	}else{
    		if (ctx.racional()!=null) {
    			 jlisp.put(ctx, value(ctx.racional().getText()));
    		}    	
    	}
    	
    }

	@Override
    public void exitAtom(JLispParser.AtomContext ctx){
       if(ctx.num_atom()!=null)
       	   jlisp.put(ctx,jlisp.get(ctx.num_atom()));
       	else
       		 if (ctx.string()!=null) 
       		 	jlisp.put(ctx,jlisp.get(ctx.string()));
       		 else
       		 	jlisp.put(ctx,jlisp.get(ctx.symb_atom()));
    }

    @Override
    public void exitSymb_atom(JLispParser.Symb_atomContext ctx){
        if(ctx.symbol()!=null)
        	jlisp.put(ctx,jlisp.get(ctx.symbol()));
        else
           jlisp.put(ctx,jlisp.get(ctx.special_symbol()));	

    }

     @Override
    public void exitString(JLispParser.StringContext ctx){
      jlisp.put(ctx, value(ctx.getText()));
    }

	@Override
    public  void exitSymbol(JLispParser.SymbolContext ctx){
     if (memory.get(ctx.getText())!=null) {
     	if (memory.get(ctx.getText()).getEnumType()==EnumType.FLOAT)
      	jlisp.put(ctx,var(memory.get(ctx.getText()).getNum(),ctx.getText(),"f"));
      else	
      	jlisp.put(ctx,var(memory.get(ctx.getText()).getNum(),ctx.getText(),"i"));
     }
      
    }

   @Override
    public  void exitSpecial_symbol(JLispParser.Special_symbolContext ctx){
         ST logics = templates.getInstanceOf("logics");
         if (ctx.type==EnumType.NIL) {
         	logics.add("value",0); 
         }else
            logics.add("value",1);  
        jlisp.put(ctx,logics);
    }

	@Override
    public  void exitMacro_progn(JLispParser.Macro_prognContext ctx){
       ST progn = templates.getInstanceOf("progn");
       for (JLispParser.SexprContext vctx : ctx.sexpr()) {
         progn.add("instructions", jlisp.get(vctx));
        }  
       jlisp.put(ctx,progn);
    }

    ST value(Object x) {//Carga de las constantes numericas
            ST st = templates.getInstanceOf("value");
            st.add("x", x);
            return st;
        }

    ST var(Object x,String id,String type){
        ST st = templates.getInstanceOf("var");
        st.add("x", x);
        st.add("id",id);
        st.add("type",type);
        return st;
    }

    @Override
    public void exitMacro_print(JLispParser.Macro_printContext ctx){
         ST print = templates.getInstanceOf("print");
         print.add("instructions",jlisp.get(ctx.sexpr()));
         if (ctx.type==EnumType.INT) {
          	 print.add("type","I");
          }else
             if (ctx.type==EnumType.FLOAT) {
              	 print.add("type","F");
              }else
                 if (ctx.type==EnumType.T) {
                   ST printB = templates.getInstanceOf("printB");
                   printB.add("instructions",jlisp.get(ctx.sexpr()));
                   printB.add("label1",++labelCount);
                   printB.add("label2",++labelCount);
                   jlisp.put(ctx,printB);
                   return; 
                 }else
                    print.add("type","Ljava/lang/String;");        
         jlisp.put(ctx,print);
    }

/*##############if statement###############*/
	@Override
    public void exitCond_expr(JLispParser.Cond_exprContext ctx){
    	if (ctx.if_statement()!=null) {
    		jlisp.put(ctx,jlisp.get(ctx.if_statement()));
    	}else
    	   jlisp.put(ctx,jlisp.get(ctx.loop_statement()));
       
    }

 	@Override
    public void exitIf_statement(JLispParser.If_statementContext ctx){
      ST ifstatement = templates.getInstanceOf("cond");
      ifstatement.add("condition",jlisp.get(ctx.condition()));
      ifstatement.add("trueCond",jlisp.get(ctx.true_cond()));
      ifstatement.add("falseCond",jlisp.get(ctx.false_cond()));
      ifstatement.add("label1",++labelCount);
      ifstatement.add("label2",++labelCount);
      jlisp.put(ctx,ifstatement);
    }

	@Override
    public void exitCondition(JLispParser.ConditionContext ctx){
        jlisp.put(ctx,jlisp.get(ctx.sexpr()));
    }

    @Override
    public void exitTrue_cond(JLispParser.True_condContext ctx){
        jlisp.put(ctx,jlisp.get(ctx.sexpr()));
    }

	@Override
    public void exitFalse_cond(JLispParser.False_condContext ctx){
        jlisp.put(ctx,jlisp.get(ctx.sexpr()));
    }

/**###############End if statement####################*/
	@Override
    public void enterBreak_expr(JLispParser.Break_exprContext ctx){
        ST breakloop = templates.getInstanceOf("breakloop");
        breake=true;
        breakloop.add("label1",++labelCount);
        break_label=labelCount;
        jlisp.put(ctx,breakloop);
	}

	@Override
    public void exitLoop_statement(JLispParser.Loop_statementContext ctx){
      ST loopexp = templates.getInstanceOf("loopexp");
      for (JLispParser.SexprContext vctx : ctx.sexpr()) {
         loopexp.add("expresion",jlisp.get(vctx));
       }
      loopexp.add("label1",++labelCount);
      if (breake)
       loopexp.add("label2","Label"+break_label+":");
      jlisp.put(ctx,loopexp);
    }

	@Override
    public void exitMacro_quote(JLispParser.Macro_quoteContext ctx){
    	if (ctx.string()!=null) {
    		  jlisp.put(ctx,value(ctx.string().getText()));
    	}else
              jlisp.put(ctx,value("\""+ctx.sexpr().getText()+"\""));
      
    }  
}