// Generated from /Users/zskyh/university/third-year/second-term/procesadores/Fortran-To-C-Translator/fortranTranslator/src/Translator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TranslatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TranslatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#axioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxioma(TranslatorParser.AxiomaContext ctx);
}