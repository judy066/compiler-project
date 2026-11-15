// Generated from C:/Users/lenovo/IdeaProjects/Compiler2/src/HtmlTemplate.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlTemplateParser}.
 */
public interface HtmlTemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlTemplateParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HtmlTemplateParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlTemplateParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HtmlTemplateParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HtmlTemplateParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HtmlTemplateParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlTemplateParser#normalTag}.
	 * @param ctx the parse tree
	 */
	void enterNormalTag(HtmlTemplateParser.NormalTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlTemplateParser#normalTag}.
	 * @param ctx the parse tree
	 */
	void exitNormalTag(HtmlTemplateParser.NormalTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlTemplateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(HtmlTemplateParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlTemplateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(HtmlTemplateParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlTemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HtmlTemplateParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlTemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HtmlTemplateParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlTemplateParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 */
	void enterThymeleafAttribute(HtmlTemplateParser.ThymeleafAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlTemplateParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 */
	void exitThymeleafAttribute(HtmlTemplateParser.ThymeleafAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlTemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HtmlTemplateParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlTemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HtmlTemplateParser.ContentContext ctx);
}