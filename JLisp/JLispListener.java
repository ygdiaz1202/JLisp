// Generated from JLisp.g4 by ANTLR 4.2

  import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JLispParser}.
 */
public interface JLispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JLispParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull JLispParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull JLispParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#racional}.
	 * @param ctx the parse tree
	 */
	void enterRacional(@NotNull JLispParser.RacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#racional}.
	 * @param ctx the parse tree
	 */
	void exitRacional(@NotNull JLispParser.RacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#macro_max}.
	 * @param ctx the parse tree
	 */
	void enterMacro_max(@NotNull JLispParser.Macro_maxContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#macro_max}.
	 * @param ctx the parse tree
	 */
	void exitMacro_max(@NotNull JLispParser.Macro_maxContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#false_cond}.
	 * @param ctx the parse tree
	 */
	void enterFalse_cond(@NotNull JLispParser.False_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#false_cond}.
	 * @param ctx the parse tree
	 */
	void exitFalse_cond(@NotNull JLispParser.False_condContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull JLispParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull JLispParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void enterSexpr(@NotNull JLispParser.SexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void exitSexpr(@NotNull JLispParser.SexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#break_expr}.
	 * @param ctx the parse tree
	 */
	void enterBreak_expr(@NotNull JLispParser.Break_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#break_expr}.
	 * @param ctx the parse tree
	 */
	void exitBreak_expr(@NotNull JLispParser.Break_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(@NotNull JLispParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(@NotNull JLispParser.Loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#macro_expt}.
	 * @param ctx the parse tree
	 */
	void enterMacro_expt(@NotNull JLispParser.Macro_exptContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#macro_expt}.
	 * @param ctx the parse tree
	 */
	void exitMacro_expt(@NotNull JLispParser.Macro_exptContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#num_atom}.
	 * @param ctx the parse tree
	 */
	void enterNum_atom(@NotNull JLispParser.Num_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#num_atom}.
	 * @param ctx the parse tree
	 */
	void exitNum_atom(@NotNull JLispParser.Num_atomContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#epart}.
	 * @param ctx the parse tree
	 */
	void enterEpart(@NotNull JLispParser.EpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#epart}.
	 * @param ctx the parse tree
	 */
	void exitEpart(@NotNull JLispParser.EpartContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#macro_expr}.
	 * @param ctx the parse tree
	 */
	void enterMacro_expr(@NotNull JLispParser.Macro_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#macro_expr}.
	 * @param ctx the parse tree
	 */
	void exitMacro_expr(@NotNull JLispParser.Macro_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(@NotNull JLispParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(@NotNull JLispParser.RealContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#help}.
	 * @param ctx the parse tree
	 */
	void enterHelp(@NotNull JLispParser.HelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#help}.
	 * @param ctx the parse tree
	 */
	void exitHelp(@NotNull JLispParser.HelpContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#genBytecode}.
	 * @param ctx the parse tree
	 */
	void enterGenBytecode(@NotNull JLispParser.GenBytecodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#genBytecode}.
	 * @param ctx the parse tree
	 */
	void exitGenBytecode(@NotNull JLispParser.GenBytecodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(@NotNull JLispParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(@NotNull JLispParser.AlphaContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#compile}.
	 * @param ctx the parse tree
	 */
	void enterCompile(@NotNull JLispParser.CompileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#compile}.
	 * @param ctx the parse tree
	 */
	void exitCompile(@NotNull JLispParser.CompileContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(@NotNull JLispParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(@NotNull JLispParser.ExecuteContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(@NotNull JLispParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(@NotNull JLispParser.SymbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull JLispParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull JLispParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#comands}.
	 * @param ctx the parse tree
	 */
	void enterComands(@NotNull JLispParser.ComandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#comands}.
	 * @param ctx the parse tree
	 */
	void exitComands(@NotNull JLispParser.ComandsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#true_cond}.
	 * @param ctx the parse tree
	 */
	void enterTrue_cond(@NotNull JLispParser.True_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#true_cond}.
	 * @param ctx the parse tree
	 */
	void exitTrue_cond(@NotNull JLispParser.True_condContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#macro_print}.
	 * @param ctx the parse tree
	 */
	void enterMacro_print(@NotNull JLispParser.Macro_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#macro_print}.
	 * @param ctx the parse tree
	 */
	void exitMacro_print(@NotNull JLispParser.Macro_printContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#macro_setf}.
	 * @param ctx the parse tree
	 */
	void enterMacro_setf(@NotNull JLispParser.Macro_setfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#macro_setf}.
	 * @param ctx the parse tree
	 */
	void exitMacro_setf(@NotNull JLispParser.Macro_setfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull JLispParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull JLispParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#special_symbol}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_symbol(@NotNull JLispParser.Special_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#special_symbol}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_symbol(@NotNull JLispParser.Special_symbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#interprete}.
	 * @param ctx the parse tree
	 */
	void enterInterprete(@NotNull JLispParser.InterpreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#interprete}.
	 * @param ctx the parse tree
	 */
	void exitInterprete(@NotNull JLispParser.InterpreteContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(@NotNull JLispParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(@NotNull JLispParser.DecimalContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#list_body}.
	 * @param ctx the parse tree
	 */
	void enterList_body(@NotNull JLispParser.List_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#list_body}.
	 * @param ctx the parse tree
	 */
	void exitList_body(@NotNull JLispParser.List_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void enterCond_expr(@NotNull JLispParser.Cond_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void exitCond_expr(@NotNull JLispParser.Cond_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#symb_atom}.
	 * @param ctx the parse tree
	 */
	void enterSymb_atom(@NotNull JLispParser.Symb_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#symb_atom}.
	 * @param ctx the parse tree
	 */
	void exitSymb_atom(@NotNull JLispParser.Symb_atomContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr(@NotNull JLispParser.Logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr(@NotNull JLispParser.Logic_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull JLispParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull JLispParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull JLispParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull JLispParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#aritm_expr}.
	 * @param ctx the parse tree
	 */
	void enterAritm_expr(@NotNull JLispParser.Aritm_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#aritm_expr}.
	 * @param ctx the parse tree
	 */
	void exitAritm_expr(@NotNull JLispParser.Aritm_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#macro_progn}.
	 * @param ctx the parse tree
	 */
	void enterMacro_progn(@NotNull JLispParser.Macro_prognContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#macro_progn}.
	 * @param ctx the parse tree
	 */
	void exitMacro_progn(@NotNull JLispParser.Macro_prognContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#macro_read}.
	 * @param ctx the parse tree
	 */
	void enterMacro_read(@NotNull JLispParser.Macro_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#macro_read}.
	 * @param ctx the parse tree
	 */
	void exitMacro_read(@NotNull JLispParser.Macro_readContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#macro_quote}.
	 * @param ctx the parse tree
	 */
	void enterMacro_quote(@NotNull JLispParser.Macro_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#macro_quote}.
	 * @param ctx the parse tree
	 */
	void exitMacro_quote(@NotNull JLispParser.Macro_quoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link JLispParser#init_symbol}.
	 * @param ctx the parse tree
	 */
	void enterInit_symbol(@NotNull JLispParser.Init_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JLispParser#init_symbol}.
	 * @param ctx the parse tree
	 */
	void exitInit_symbol(@NotNull JLispParser.Init_symbolContext ctx);
}