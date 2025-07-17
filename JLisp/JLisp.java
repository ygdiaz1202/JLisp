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
public class JLisp {
    private static void print_mensage(){
/*		System.out.println("     ██╗██╗     ██╗███████╗██████╗ ");
		System.out.println("     ██║██║     ██║██╔════╝██╔══██╗");
		System.out.println("     ██║██║     ██║███████╗██████╔╝");
		System.out.println("██   ██║██║     ██║╚════██║██╔═══╝ ");
		System.out.println("╚█████╔╝███████╗██║███████║██║     ");
		System.out.println(" ╚════╝ ╚══════╝╚═╝╚══════╝╚═╝     ");
		System.out.println("                                   ");
*/
 /*       
		System.out.println("     ▄█  ▄█        ▄█     ▄████████    ▄███████▄ ");
		System.out.println("    ███ ███       ███    ███    ███   ███    ███ ");
		System.out.println("    ███ ███       ███▌   ███    █▀    ███    ███ ");
		System.out.println("    ███ ███       ███▌   ███          ███    ███ ");
		System.out.println("    ███ ███       ███▌ ▀███████████ ▀█████████▀  ");
		System.out.println("    ███ ███       ███           ███   ███        ");
		System.out.println("    ███ ███▌    ▄ ███     ▄█    ███   ███        ");
		System.out.println("█▄ ▄███ █████▄▄██ █▀    ▄████████▀   ▄████▀      ");
		System.out.println("▀▀▀▀▀▀  ▀                                        ");
 */       		

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
/*
		System.out.println("    ___                                    ___           ___   ");
		System.out.println("   /  /\\                     ___          /  /\\         /  /\\  ");
		System.out.println("  /  /:/                    /  /\\        /  /:/_       /  /::\\ ");
		System.out.println(" /__/::\\     ___     ___   /  /:/       /  /:/ /\\     /  /:/\\:\\");
		System.out.println(" \\__\\/\\:\\   /__/\\   /  /\\ /__/::\\      /  /:/ /::\\   /  /:/~/:/");
		System.out.println("    \\  \\:\\  \\  \\:\\ /  /:/ \\__\\/\\:\\__  /__/:/ /:/\\:\\ /__/:/ /:/ ");
		System.out.println("     \\__\\:\\  \\  \\:\\  /:/     \\  \\:\\/\\ \\  \\:\\/:/~/:/ \\  \\:\\/:/  ");
		System.out.println("     /  /:/   \\  \\:\\/:/       \\__\\::/  \\  \\::/ /:/   \\  \\::/   ");
		System.out.println("    /__/:/     \\  \\::/        /__/:/    \\__\\/ /:/     \\  \\:\\   ");
		System.out.println("    \\__\\/       \\__\\/         \\__\\/       /__/:/       \\  \\:\\  ");
		System.out.println("                                          \\__\\/         \\__\\/  ");	
*/			
		System.out.println("Welcome to Java Lisp Interpreter and Compiler JLISP 0.1 (2015-04-21)");
		System.out.println("Write --help for begin");
    }

  private static String promp(int cont){
  	return "["+cont+"] >";
  }

    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        int cont=1;
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        ConsoleReader reader = new ConsoleReader();
		History hist = new History(new File("/home/yanir/.pyantlr_history"));
		reader.setHistory(hist);
		reader.clearScreen();
		PrintWriter out = new PrintWriter(System.out);
        print_mensage();

        try {
            String str;
            boolean contin=true;
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
                parser.removeErrorListeners(); // remove ConsoleErrorListener
                parser.setBuildParseTree(true);
                ParseTree tree = parser.program(); // parse
                // show tree in text form
                //System.out.println("Tree: \n"+tree.toStringTree(parser));
                JLispMenu option = new JLispMenu();
                option.visit(tree);
                cont++;
                }catch(RuntimeException ex){
                    ex.printStackTrace();
                }
                out.flush();
            }
        } catch (IOException io) {
            //io.printStackTrace();
        }
    }
}