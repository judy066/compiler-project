// Generated from C:/Users/lenovo/IdeaProjects/Compiler2/src/HtmlTemplate.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlTemplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlTemplateParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HtmlTemplateParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HtmlTemplateParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlTemplateParser#normalTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTag(HtmlTemplateParser.NormalTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlTemplateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(HtmlTemplateParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlTemplateParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(HtmlTemplateParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlTemplateParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThymeleafAttribute(HtmlTemplateParser.ThymeleafAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlTemplateParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HtmlTemplateParser.ContentContext ctx);
}