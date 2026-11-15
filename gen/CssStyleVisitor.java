// Generated from C:/Users/lenovo/IdeaProjects/Compiler2/src/CssStyle.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssStyleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssStyleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CssStyleParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(CssStyleParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssStyleParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(CssStyleParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssStyleParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CssStyleParser.DeclarationContext ctx);
}