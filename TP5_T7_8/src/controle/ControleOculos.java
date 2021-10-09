package controle;

import modelo.*;

/**
 * Faz o cálculo do valor do Oculos
 * @author Luisa Caroline
 * @version Out 2021
 */
public class ControleOculos {
	
	/**
	 * Calcula o valor do óculos a partir dos valores da armacao e lente 
	 * vindos por gets dos objetos Armacao e Lente respetivamente
	 * @param lente objeto que contem os atributos da da lente
	 * @param armacao um double que contem o valor da armacao
	 * @return valor do oculos em double
	 */
	public static double getValorOculos(Lente lente, Armacao armacao){
		double valorOculos;
		valorOculos = lente.getValorDaLente()+armacao.getValorDaArmacao();
		return valorOculos;
	}
	
	
}
