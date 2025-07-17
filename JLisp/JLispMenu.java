import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import jline.ConsoleReader;
import jline.History;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JLispMenu extends JLispBaseVisitor<Integer> {
	@Override 
	public Integer visitHelp(JLispParser.HelpContext ctx) {
	   System.out.println(" COMMAND        ABBR     DESCRIPTION");
	   System.out.println("--help          --h      Muestra la ayuda sobre los comandos disponibles");
     System.out.println("--compile       --c      Compilar el bytecode generado en resources/jlispfile.bcjava");
     System.out.println("--interprete    --i      Iniciar Interprete");
     System.out.println("--gbytecode     --g      Iniciar Generador de bytecode");
     System.out.println("--execute       --e      Ejecutar el JLisp.class generado con el jasmin");
     System.out.println("ctr+d                    Salir de la presente instancia");
     System.out.println("ctr+c                    Salir de el programa");				  
	   return 1;
	}

  public static class BailSimpleLexer extends JLispLexer {
    public BailSimpleLexer(CharStream input) { super(input); }
    public void recover(LexerNoViableAltException e) {
        throw new RuntimeException(e); // Bail out
    }
  }

  @Override
    public Integer visitProgram(JLispParser.ProgramContext ctx){
         if (ctx.comands()!=null)
             visit(ctx.comands());
         else
           System.out.println("El comando no es valido --help para ver lista de comandos validos");
            return 1;
}

 private static void print_mensage(int numMensage){
 	switch(numMensage){
        case 1:
		System.out.println("     ██╗██╗     ██╗███████╗██████╗ ");
		System.out.println("     ██║██║     ██║██╔════╝██╔══██╗");
		System.out.println("     ██║██║     ██║███████╗██████╔╝");
		System.out.println("██   ██║██║     ██║╚════██║██╔═══╝ ");
		System.out.println("╚█████╔╝███████╗██║███████║██║     ");
		System.out.println(" ╚════╝ ╚══════╝╚═╝╚══════╝╚═╝     ");
		System.out.println("                                   ");
		System.out.println("Welcome to Java Lisp Interpreter 0.1 (2015-04-21)");
		break;
		case 2:
        System.out.println("     ▄█  ▄█        ▄█     ▄████████    ▄███████▄ ");
		System.out.println("    ███ ███       ███    ███    ███   ███    ███ ");
		System.out.println("    ███ ███       ███▌   ███    █▀    ███    ███ ");
		System.out.println("    ███ ███       ███▌   ███          ███    ███ ");
		System.out.println("    ███ ███       ███▌ ▀███████████ ▀█████████▀  ");
		System.out.println("    ███ ███       ███           ███   ███        ");
		System.out.println("    ███ ███▌    ▄ ███     ▄█    ███   ███        ");
		System.out.println("█▄ ▄███ █████▄▄██ █▀    ▄████████▀   ▄████▀      ");
		System.out.println("▀▀▀▀▀▀  ▀                                        "); 
		System.out.println("Welcome to Java Lisp Bytecode Generator 0.1 (2015-04-21)");
		System.out.println("Write --help for show the options");
		break;
		default:
		System.out.println(" ▄▄▄██▀▀▀ ██▓     ██▓  ██████  ██▓███  ");
		System.out.println("   ▒██   ▓██▒    ▓██▒▒██    ▒ ▓██░  ██▒");
		System.out.println("   ░██   ▒██░    ▒██▒░ ▓██▄   ▓██░ ██▓▒");
		System.out.println("▓██▄██▓  ▒██░    ░██░  ▒   ██▒▒██▄█▓▒ ▒");
		System.out.println(" ▓███▒   ░██████▒░██░▒██████▒▒▒██▒ ░  ░");
		System.out.println(" ▒▓▒▒░   ░ ▒░▓  ░░▓  ▒ ▒▓▒ ▒ ░▒▓▒░ ░  ░");
		System.out.println(" ▒ ░▒░   ░ ░ ▒  ░ ▒ ░░ ░▒  ░ ░░▒ ░     ");
		System.out.println(" ░ ░ ░     ░ ░    ▒ ░░  ░  ░  ░░       ");
		System.out.println(" ░   ░       ░  ░ ░░   ");
		System.out.println("       ");
		System.out.println("Welcome to Java Lisp Interpreter and Compiler JLISP 0.1 (2015-04-21)");
		System.out.println("Write --help for begin");
 	}    
		      		
   }

   private static String promp(int cont){
  	return "["+cont+"] >";
   }
 
   private void interprete(){
   	    try {
	   	    int cont=1;
			ConsoleReader reader = new ConsoleReader();
			History hist = new History(new File("/home/yanir/.pyantlr_historyInterpreter"));
			reader.setHistory(hist);
			reader.clearScreen();
			PrintWriter out = new PrintWriter(System.out);
            String str;
            boolean contin=true;
            print_mensage(1);
            while (contin) {
            	reader.setDefaultPrompt(promp(cont));
            	contin=((str=reader.readLine())!=null);
            	if (!contin) {
            		System.out.println("");
            		break;
            	}
                ANTLRInputStream input = new ANTLRInputStream(str);
                // create a lexer that feeds off of input CharStream
                JLispLexer lexer = new JLispLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                JLispParser parser = new JLispParser(tokens);
                try{
                parser.setErrorHandler(new BailErrorStrategy());
                parser.setBuildParseTree(true);
                ParseTree tree = parser.program(); // parse
                // show tree in text form
                //System.out.println("Tree: \n"+tree.toStringTree(parser));
                JLispInterpreter eval = new JLispInterpreter(reader);
                eval.visit(tree);
                cont++;
                }catch(RuntimeException ex){
                    ex.printStackTrace();
                }
                out.flush();
            }
         print_mensage(0);
        } catch (IOException io) {
            io.printStackTrace();
        }
   }
   private void compiler(){
     	    try {
	   	    int cont=1;
			ConsoleReader reader = new ConsoleReader();
			History hist = new History(new File("/home/yanir/.pyantlr_historyCompiler"));
			reader.setHistory(hist);
			reader.clearScreen();
			PrintWriter out = new PrintWriter(System.out);
            String str;
            boolean contin=true;
            print_mensage(2);
            while (contin) {
            	reader.setDefaultPrompt(promp(cont));
            	contin=((str=reader.readLine())!=null);
            	if (!contin) {
            		System.out.println("");
            		break;
            	}
                ANTLRInputStream input = new ANTLRInputStream(str);
                // create a lexer that feeds off of input CharStream
                JLispLexer lexer = new JLispLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                JLispParser parser = new JLispParser(tokens);
                try{
                parser.setErrorHandler(new BailErrorStrategy());
                parser.setBuildParseTree(true);
                ParseTree tree = parser.program(); // parse
                ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
                JLispGeneratorB extractor = new JLispGeneratorB(parser.numOps,parser.memory);
                walker.walk(extractor, tree); // initiate walk of tree with listener
                if(!parser.comand){
	                FileWriter jasminFile = new FileWriter("resources/jlispfile.bcjava");
	                String output=extractor.jlisp.get(tree).render();
	                jasminFile.write(output);
	                jasminFile.close();
                }
                cont++;
                }catch(RuntimeException ex){
                    ex.printStackTrace();
                }
                out.flush();
            }
            print_mensage(0);
        } catch (IOException io) {
            io.printStackTrace();
        }
   }

	@Override 
	public Integer visitInterprete(JLispParser.InterpreteContext ctx){
		interprete();
        return 1;
	}

	@Override 
	public Integer visitExecute(JLispParser.ExecuteContext ctx) {
        exec("java output.JLisp");
		return 1; 
	}

	@Override 
	public Integer visitCompile(JLispParser.CompileContext ctx) {	
        exec("java -jar resources/jasmin.jar resources/jlispfile.bcjava");	 
		return 1;
	}

	@Override 
	public Integer visitGenBytecode(JLispParser.GenBytecodeContext ctx) {
		compiler();
		return 1;
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
}