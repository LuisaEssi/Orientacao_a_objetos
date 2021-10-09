package modelo;

/**
 * Classe para a construção do objeto Oculos
 * @author Luisa Caroline
 * @version Out 2021
 */
public class Oculos {
	
	private Lente lente;// composicao
	private Armacao armacao;

	
	// ----------construtor-------------
	/**
	 * @param lente objeto lente da classe lente
	 * @param armacao objeto armacao da classe armacao
	 */
	public Oculos(Lente lente, Armacao armacao) {
		super();
		this.lente = lente;
		this.armacao = armacao;
	}

	//get 
	/** get valor do oculos 
	 * @return valor do oculos double
	 */
	public double getValorOculos(){
		double valorOculos;
		valorOculos = lente.getValorDaLente()+armacao.getValorDaArmacao();
		return valorOculos;
	}
	
}
