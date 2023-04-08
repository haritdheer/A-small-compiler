// Generated from C:\Users\harit\OneDrive\Documents\NetBeansProjects\COMP123\src\comp123\Grammar123.g4 by ANTLR 4.7.2

package comp123;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Grammar123Parser}.
 */
public interface Grammar123Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Grammar123Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Grammar123Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar123Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Grammar123Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar123Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Grammar123Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar123Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Grammar123Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar123Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Grammar123Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar123Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Grammar123Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar123Parser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(Grammar123Parser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar123Parser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(Grammar123Parser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammar123Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(Grammar123Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammar123Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(Grammar123Parser.AtomContext ctx);
}