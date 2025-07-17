// Generated from JLisp.g4 by ANTLR 4.2

  import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JLispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JLispVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JLispParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull JLispParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#racional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRacional(@NotNull JLispParser.RacionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#macro_max}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_max(@NotNull JLispParser.Macro_maxContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#false_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse_cond(@NotNull JLispParser.False_condContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull JLispParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#sexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexpr(@NotNull JLispParser.SexprContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#break_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_expr(@NotNull JLispParser.Break_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(@NotNull JLispParser.Loop_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#macro_expt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_expt(@NotNull JLispParser.Macro_exptContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#num_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_atom(@NotNull JLispParser.Num_atomContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#epart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpart(@NotNull JLispParser.EpartContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#macro_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_expr(@NotNull JLispParser.Macro_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(@NotNull JLispParser.RealContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#help}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelp(@NotNull JLispParser.HelpContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#genBytecode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenBytecode(@NotNull JLispParser.GenBytecodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(@NotNull JLispParser.AlphaContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#compile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompile(@NotNull JLispParser.CompileContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(@NotNull JLispParser.ExecuteContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(@NotNull JLispParser.SymbolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull JLispParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#comands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComands(@NotNull JLispParser.ComandsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#true_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_cond(@NotNull JLispParser.True_condContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#macro_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_print(@NotNull JLispParser.Macro_printContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#macro_setf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_setf(@NotNull JLispParser.Macro_setfContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull JLispParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#special_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_symbol(@NotNull JLispParser.Special_symbolContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#interprete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterprete(@NotNull JLispParser.InterpreteContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(@NotNull JLispParser.DecimalContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#list_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_body(@NotNull JLispParser.List_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#cond_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expr(@NotNull JLispParser.Cond_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#symb_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymb_atom(@NotNull JLispParser.Symb_atomContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr(@NotNull JLispParser.Logic_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull JLispParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull JLispParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#aritm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritm_expr(@NotNull JLispParser.Aritm_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#macro_progn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_progn(@NotNull JLispParser.Macro_prognContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#macro_read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_read(@NotNull JLispParser.Macro_readContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#macro_quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_quote(@NotNull JLispParser.Macro_quoteContext ctx);

	/**
	 * Visit a parse tree produced by {@link JLispParser#init_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_symbol(@NotNull JLispParser.Init_symbolContext ctx);
}