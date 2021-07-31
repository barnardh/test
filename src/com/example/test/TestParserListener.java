// Generated from TestParser.g4 by ANTLR 4.9.2

package com.example.test;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(TestParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(TestParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(TestParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(TestParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#outputDecl}.
	 * @param ctx the parse tree
	 */
	void enterOutputDecl(TestParser.OutputDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#outputDecl}.
	 * @param ctx the parse tree
	 */
	void exitOutputDecl(TestParser.OutputDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void enterPackageDecl(TestParser.PackageDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void exitPackageDecl(TestParser.PackageDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#outputAnnotationDecl}.
	 * @param ctx the parse tree
	 */
	void enterOutputAnnotationDecl(TestParser.OutputAnnotationDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#outputAnnotationDecl}.
	 * @param ctx the parse tree
	 */
	void exitOutputAnnotationDecl(TestParser.OutputAnnotationDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#structAnnotationDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructAnnotationDecl(TestParser.StructAnnotationDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#structAnnotationDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructAnnotationDecl(TestParser.StructAnnotationDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#classAnnotationDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassAnnotationDecl(TestParser.ClassAnnotationDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#classAnnotationDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassAnnotationDecl(TestParser.ClassAnnotationDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(TestParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(TestParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(TestParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(TestParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#tagsDecl}.
	 * @param ctx the parse tree
	 */
	void enterTagsDecl(TestParser.TagsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#tagsDecl}.
	 * @param ctx the parse tree
	 */
	void exitTagsDecl(TestParser.TagsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#tagDecl}.
	 * @param ctx the parse tree
	 */
	void enterTagDecl(TestParser.TagDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#tagDecl}.
	 * @param ctx the parse tree
	 */
	void exitTagDecl(TestParser.TagDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(TestParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(TestParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#functionDeclType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclType(TestParser.FunctionDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#functionDeclType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclType(TestParser.FunctionDeclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(TestParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(TestParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#functionParameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterDecl(TestParser.FunctionParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#functionParameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterDecl(TestParser.FunctionParameterDeclContext ctx);
}