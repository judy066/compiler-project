// Generated from C:/Users/lenovo/IdeaProjects/Compiler2/src/JavaSpring.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaSpringParser}.
 */
public interface JavaSpringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaSpringParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaSpringParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaSpringParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaSpringParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaSpringParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaSpringParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaSpringParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaSpringParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaSpringParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaSpringParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaSpringParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaSpringParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(JavaSpringParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(JavaSpringParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaSpringParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaSpringParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaSpringParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaSpringParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaSpringParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaSpringParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaSpringParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaSpringParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaSpringParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaSpringParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaSpringParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaSpringParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaSpringParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaSpringParser.ExpressionContext ctx);
}