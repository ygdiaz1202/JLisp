import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import jline.ConsoleReader;
import java.io.IOException;
public class JLispInterpreter extends JLispBaseVisitor<Value> {
    /**
     * "memory" ; variable/value pairs go here
     */
    boolean not_break=true;
    ConsoleReader reader;
    Map<String, Value> memory = new HashMap<String, Value>();
    int numOps = 1; //numero de operaciones, comienza en 1 porque al menos se carga el argumento del main
    int localVarNum = 1; // cantidad de variables locales. Comienza en 1 porque la variable local 0 hace referencia al caso String[] args del metodo main

    public JLispInterpreter(ConsoleReader reader){
      this.reader=reader;
    }
    /**
    *visitDecimal,the the decimal value
    */
    @Override
    public Value visitDecimal(JLispParser.DecimalContext ctx) {
        int value = Integer.valueOf(ctx.INT().getText());
        //System.out.println(value);
        return new Value(value);
    }

    @Override
    public Value visitProgram( JLispParser.ProgramContext ctx){
        if (ctx.sexpr()!=null) {
        	System.out.println(visit(ctx.sexpr()).toString());
            return visit(ctx.sexpr());
        }else
        	if (ctx.comands()!=null) 
        	  System.out.println("El comando \""+ctx.getText()+"\" no es valido en esta instancia salga al menu con ctr+d e intente nuevamente");       	
        return new Value("");
    }

    @Override
    public Value visitSexpr(JLispParser.SexprContext ctx) {
       try{
        if (ctx.list()!=null) {
        	return visit(ctx.list());
         }
          else{
          	if (ctx.atom()!=null) {
          	  return visit(ctx.atom());	
          	}
          	
          }
        }catch(Exception ex){

          }
         return null;
        }
        
    @Override
    public Value visitReal(JLispParser.RealContext ctx) {
    	String fraction=ctx.REAL().getText();
        return new Value(fraction);
    }
    
    @Override
    public Value visitList(JLispParser.ListContext ctx) {
        //System.out.println(visit(ctx.list_body()));
        if (ctx.list_body()==null) {
        	return new Value("NIL");
        }else
           return visit(ctx.list_body());
    } 

    @Override
    public Value visitRacional(JLispParser.RacionalContext ctx){
       String rvalue=visit(ctx.decimal(0)).toString();
       String lvalue=visit(ctx.decimal(1)).toString();
       String e="";
       try{e=visit(ctx.epart()).toString();}catch(Exception exs ){}
       String value=rvalue+"."+lvalue+e;
       //System.out.println("Racional :"+value);
       return new Value(value);
    }
    
     @Override
    public Value visitString(JLispParser.StringContext ctx){
    	String str=ctx.getText();
        return new Value(str);
    }

    @Override
    public Value visitEpart(JLispParser.EpartContext ctx){
      String e=ctx.E().getText();
      JLispParser.DecimalContext ctx1;
      String decim=visit(ctx.decimal()).toString();
      String ep=e+decim;
      return new Value(ep);
    }
   
    @Override
    public Value visitMacro_print(JLispParser.Macro_printContext ctx) {
       final String resultado=visit(ctx.sexpr()).toString();
       //System.out.println(resultado);
       return new Value(resultado);
    }

    @Override 
    public Value visitMacro_max(JLispParser.Macro_maxContext ctx) {
      int index=1;
      Value number=new Value(visit(ctx.sexpr(0)).toString());
      while (ctx.sexpr().size() > index) {
        number.max(visit(ctx.sexpr(index)));
        index++;
      }
      return number;
    }

/**
**Evaluación de las expresiones aritmétricas
*/
    @Override
    public Value visitAritm_expr(JLispParser.Aritm_exprContext ctx) {
        String operation = ctx.A_OPERATOR().getText();//Obtenemos la operación a efectuar
        Value number = new Value(0);//El acumulador del resultado
        int index =0;//list index
        Value accumulator=new Value(0);
     /*Realizar las operaciones según el operando correspondiente*/
        switch (operation) {
            case "+":
                while (ctx.sexpr().size() > index) {//Mientras que la lista de atomos contenga elementos
                    number.add(visit(ctx.sexpr(index)));
                    index++;
                }
                break;
			      case "-":
                index=1;
                number=new Value(visit(ctx.sexpr(0)).toString());
                while (ctx.sexpr().size() > index) {
                    accumulator.add(visit(ctx.sexpr(index)));
                    index++;
                }
                number.sub(accumulator.toString());
                break;
            case "*":
                index=0;
                number = new Value(1);
                while (ctx.sexpr().size() > index) {
                    number.mul(visit(ctx.sexpr(index)));
                    index++;
                }
             break;
            case "/":
                index=0;
                accumulator=new Value(1);
                number=new Value(visit(ctx.sexpr(0)).toString());
                while (ctx.sexpr().size() > index) {
                    accumulator.mul(visit(ctx.sexpr(index)));
                    index++;
                }
                number.div(accumulator.toString());
             break;
            default:
                System.out.println("Not valid operand");
        }
            return number;  
      }

     @Override
    public Value visitLogic_expr(JLispParser.Logic_exprContext ctx){
        if (ctx.sexpr().size()==1) {
        	return new Value("T");
        }
        String logic_operator = ctx.L_OPERATOR().getText();//El operando logico a efectuar
        Value number = new Value(0);//El acumulador del resultado
        int index =1;//list index
        boolean cmp=true;
        number=new Value(visit(ctx.sexpr(0)).toString());
        switch (logic_operator) {
        	case "<":
                while (ctx.sexpr().size() > index&&cmp) {
                    cmp=number.lt(visit(ctx.sexpr(index)));
                    index++;
                }
               break;
            case ">":
                while (ctx.sexpr().size() > index&&cmp) {
                  cmp=number.gt(visit(ctx.sexpr(index)));
                  index++;
                }
             break;
         }
       if(cmp){
           return new Value("T");
       }else
          return new Value("NIL");
     }

    @Override
    public Value visitCondition(JLispParser.ConditionContext ctx){
       if (visit(ctx.sexpr())!=null) {
       	 if (visit(ctx.sexpr()).toString().toUpperCase().compareTo("NIL")==0) {
       	 	return visit(ctx.sexpr());
       	 }
       	 return new Value("T");
       }
       return new Value("NIL");
    }
    
	@Override
    public Value visitMacro_read(JLispParser.Macro_readContext ctx){
        Value v=new Value();
        return v.readInput(reader);
    }

    @Override
    public Value visitIf_statement(JLispParser.If_statementContext ctx){
    	if (visit(ctx.condition()).toString().toUpperCase().compareTo("T")==0) {
    		return visit(ctx.true_cond());
    	}else{
         if (ctx.false_cond()!=null) {
            return visit(ctx.false_cond());
         }
    	      return new Value("NIL");
       }
    }

   @Override
    public Value visitLoop_statement(JLispParser.Loop_statementContext ctx){
        boolean b=true;
        while(b){
          for (JLispParser.SexprContext vctx : ctx.sexpr()) {
            b=(visit(vctx).toString().toUpperCase().compareTo("break")!=0);          
          } 
        }
        return new Value("");
    }

  @Override
    public Value  visitBreak_expr(JLispParser.Break_exprContext ctx){
       return new Value("break");
    }
    @Override
    public Value visitMacro_quote(JLispParser.Macro_quoteContext ctx){
      if (ctx.sexpr()!=null) {
        return new Value(ctx.sexpr().getText());
      }else
        return new Value(ctx.string().getText());
    
    }

     @Override
    public Value visitMacro_setf(JLispParser.Macro_setfContext ctx){
         memory.put(ctx.symbol().getText(),visit(ctx.sexpr()));
         return visit(ctx.sexpr());
    }

    @Override
   public Value visitSymbol(JLispParser.SymbolContext ctx) {
       if(memory.containsKey(ctx.getText())){
          return memory.get(ctx.getText());
       }
       System.out.println("El identificador <"+ctx.getText()+"> No ha sido declarado con anterioridad");
       return null;
   }  

   @Override 
   public Value visitSpecial_symbol(JLispParser.Special_symbolContext ctx) { 
        return new Value(ctx.getText().toUpperCase());
   }
}