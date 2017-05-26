// Generated from Trabalho1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Trabalho1Parser}.
 */
public interface Trabalho1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Trabalho1Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Trabalho1Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(Trabalho1Parser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(Trabalho1Parser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(Trabalho1Parser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(Trabalho1Parser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(Trabalho1Parser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(Trabalho1Parser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#ultimocomando}.
	 * @param ctx the parse tree
	 */
	void enterUltimocomando(Trabalho1Parser.UltimocomandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#ultimocomando}.
	 * @param ctx the parse tree
	 */
	void exitUltimocomando(Trabalho1Parser.UltimocomandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void enterNomedafuncao(Trabalho1Parser.NomedafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void exitNomedafuncao(Trabalho1Parser.NomedafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#listavar}.
	 * @param ctx the parse tree
	 */
	void enterListavar(Trabalho1Parser.ListavarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#listavar}.
	 * @param ctx the parse tree
	 */
	void exitListavar(Trabalho1Parser.ListavarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(Trabalho1Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(Trabalho1Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void enterListadenomes(Trabalho1Parser.ListadenomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void exitListadenomes(Trabalho1Parser.ListadenomesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#listaexp}.
	 * @param ctx the parse tree
	 */
	void enterListaexp(Trabalho1Parser.ListaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#listaexp}.
	 * @param ctx the parse tree
	 */
	void exitListaexp(Trabalho1Parser.ListaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(Trabalho1Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(Trabalho1Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void enterExpprefixo(Trabalho1Parser.ExpprefixoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void exitExpprefixo(Trabalho1Parser.ExpprefixoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#expprefixoSemRecursao}.
	 * @param ctx the parse tree
	 */
	void enterExpprefixoSemRecursao(Trabalho1Parser.ExpprefixoSemRecursaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#expprefixoSemRecursao}.
	 * @param ctx the parse tree
	 */
	void exitExpprefixoSemRecursao(Trabalho1Parser.ExpprefixoSemRecursaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadadefuncao(Trabalho1Parser.ChamadadefuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadadefuncao(Trabalho1Parser.ChamadadefuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Trabalho1Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Trabalho1Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(Trabalho1Parser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(Trabalho1Parser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void enterCorpodafuncao(Trabalho1Parser.CorpodafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void exitCorpodafuncao(Trabalho1Parser.CorpodafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#listapar}.
	 * @param ctx the parse tree
	 */
	void enterListapar(Trabalho1Parser.ListaparContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#listapar}.
	 * @param ctx the parse tree
	 */
	void exitListapar(Trabalho1Parser.ListaparContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#construtortabela}.
	 * @param ctx the parse tree
	 */
	void enterConstrutortabela(Trabalho1Parser.ConstrutortabelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#construtortabela}.
	 * @param ctx the parse tree
	 */
	void exitConstrutortabela(Trabalho1Parser.ConstrutortabelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#listadecampos}.
	 * @param ctx the parse tree
	 */
	void enterListadecampos(Trabalho1Parser.ListadecamposContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#listadecampos}.
	 * @param ctx the parse tree
	 */
	void exitListadecampos(Trabalho1Parser.ListadecamposContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(Trabalho1Parser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(Trabalho1Parser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#separadordecampos}.
	 * @param ctx the parse tree
	 */
	void enterSeparadordecampos(Trabalho1Parser.SeparadordecamposContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#separadordecampos}.
	 * @param ctx the parse tree
	 */
	void exitSeparadordecampos(Trabalho1Parser.SeparadordecamposContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#opbin}.
	 * @param ctx the parse tree
	 */
	void enterOpbin(Trabalho1Parser.OpbinContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#opbin}.
	 * @param ctx the parse tree
	 */
	void exitOpbin(Trabalho1Parser.OpbinContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trabalho1Parser#opunaria}.
	 * @param ctx the parse tree
	 */
	void enterOpunaria(Trabalho1Parser.OpunariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trabalho1Parser#opunaria}.
	 * @param ctx the parse tree
	 */
	void exitOpunaria(Trabalho1Parser.OpunariaContext ctx);
}