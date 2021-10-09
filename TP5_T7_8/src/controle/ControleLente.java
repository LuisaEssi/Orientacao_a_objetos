package controle;
import modelo.*;

/**
 * Requisita os valores nos gets da classe cliente. Faz a busca de cliente e retorna strings com clientes e seus atributos. 
 * @author Luisa Caroline
 * @version Out 2021
 */
public class ControleLente {
	private Lente[] len;
	private int qtdLente;
	
	/**
	 * Metodo para adquirir as lentee sua quantindade
	 * @param d objeto tipo Dados com acesso aos atributos da lente
	 */
	
	public ControleLente(ControleObjetos d) {
		len = d.getLente();
		qtdLente = d.getQtdlente();
		
	}
	
	/**
	 * Manda dados da lente e gera um array de string de retorno para a lista
	 * Faz um laço para passar por todas as posicões da lente
	 * @return string com o material e cor da lente
	 */
	
	public String[] getDadosLente() {
		String[] s = new String[qtdLente];
		for(int i = 0; i < qtdLente; i++) {
			s[i] = "Lente "+ len[i].getMaterialDaLente()+" "+len[i].getCorDaLente();
		}
		
		return s;
	}
	/**
	 * Pesquisa por material nos dados da lista de lente 
	 * @param pesLen string com o material pesquisado
	 * @return array de string com o material e cor da lente
	 */
	
	public String[] getPesquisaLente(String pesLen) {
		String[] s = new String[qtdLente];
		for(int i = 0; i < qtdLente; i++) {
			if ((len[i].getMaterialDaLente()).contains(pesLen)) {
				s[i] = "Lente "+ len[i].getMaterialDaLente()+" "+len[i].getCorDaLente();
			}
		} 
		return s;
	}
	
	
}


