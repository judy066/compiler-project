// Generated from C:/Users/lenovo/IdeaProjects/Compiler2/src/JavaSpring.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaSpringParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaSpringVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaSpringParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaSpringParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaSpringParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaSpringParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaSpringParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaSpringParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(JavaSpringParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaSpringParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(JavaSpringParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaSpringParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaSpringParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaSpringParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaSpringParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaSpringParser.ExpressionContext ctx);
}