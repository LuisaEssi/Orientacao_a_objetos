package controle;
import modelo.*;

/**
 * Requisita os valores nos gets da classe cliente. Faz a busca de cliente e retorna strings com clientes e seus atributos. 
 * @author Luisa Caroline
 * @version Out 2021
 */
public class ControleContato {
	private LenteDeContato[] con;
	private int qtdContato;
	
	/**
	 * Metodo para adquirir as lentes de contato e sua quantindade
	 * @param d objeto tipo Dados com acesso aos atributos da lentes de contato
	 */
	
	public ControleContato(ControleObjetos d) {
		con = d.getContato();
		qtdContato = d.getQtdcontato();
		
	}
	
	/**
	 * Manda dados da lente de contato e gera um array string de retorno para a lista
	 * Faz um laço para passar por todas as posicões da lente de contato
	 * @return string com o material e tipo de descarte da lente de contato
	 */
	
	public String[] getDadosContato() {
		String[] s = new String[qtdContato];
		for(int i = 0; i < qtdContato; i++) {
			s[i] = "Lente "+ con[i].getMaterialDaLente()+" com descarte "+con[i].getTipoDeDescarte();
		}
		
		return s;
	}
	
	/**
	 * Pesquisa por tipo de descarte nos dados da lista de lente de contato 
	 * @param pesCon string com a tipo de descarte pesquisado
	 * @return array de string com o material e tipo de descarte da lente de contato
	 */
	
	
	public String[] getPesquisaContato(String pesCon) {
		String[] s = new String[qtdContato];
		for(int i = 0; i < qtdContato; i++) {
				if ((con[i].getTipoDeDescarte()).contains(pesCon)) {
			s[i] = "Lente "+ con[i].getMaterialDaLente()+" com descarte "+con[i].getTipoDeDescarte();
			System.out.println(s);
				}
		} 
		return s;
	}
	
}
