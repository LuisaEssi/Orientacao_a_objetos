package controle;
import modelo.*;

/**
 * Requisita os valores nos gets da classe funcionario. Faz a busca de funcionario e retorna strings com funcionarios e seus atributos. 
 * @author Luisa Caroline
 * @version Out 2021
 */

public class ControleArmacao {
	private Armacao[] arm;
	private int qtdArmacao;
	
	/**
	 * Metodo para adquirir as armações e sua quantindade
	 * @param d objeto tipo Dados com acesso aos atributos da armacao
	 */
	public ControleArmacao(ControleObjetos d) {
		arm = d.getArmacao();
		qtdArmacao = d.getQtdarmacao();
		
	}
	

	/**
	 * Manda dados da armacao e gera um array de string de retorno para a lista
	 * Faz um laço para passar por todas as posicões da armação
	 * @return string com o material, cor e classificação da armacao
	 */
	public String[] getDadosArmacao() {
		String[] s = new String[qtdArmacao];
		for(int i = 0; i < qtdArmacao; i++) {
			s[i] = "Armação "+ arm[i].getMaterialDaArmacao()+" "+arm[i].getCorDaArmacao()+" "+arm[i].getClassificacao();
		}
		return s;
	}	
	/**
	 * Pesquisa por classificação nos dados da lista de armacao 
	 * @param pesArm string com a classificação pesquisada
	 * @return array de string com o material, cor e classificação da armacao
	 */
	
	public String[] getPesquisaArmacao(String pesArm) {
		String[] s = new String[qtdArmacao];
		for(int i = 0; i < qtdArmacao; i++) {
			if ((arm[i].getClassificacao()).contains(pesArm)) {
			s[i] = "Armação "+ arm[i].getMaterialDaArmacao()+" "+arm[i].getCorDaArmacao()+" "+arm[i].getClassificacao();
			}
		} 
		return s;
	}
		
}


