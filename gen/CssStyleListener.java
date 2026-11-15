// Generated from C:/Users/lenovo/IdeaProjects/Compiler2/src/CssStyle.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssStyleParser}.
 */
public interface CssStyleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CssStyleParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CssStyleParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssStyleParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CssStyleParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssStyleParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(CssStyleParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssStyleParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(CssStyleParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssStyleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CssStyleParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssStyleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CssStyleParser.DeclarationContext ctx);
}