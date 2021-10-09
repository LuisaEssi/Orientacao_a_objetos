package modelo;

/**Classe para a construção do objeto lente
 * @author Luisa Caroline
 * @version Out 2021
 */
public class Lente {
	

	private String tipoDeLente; 		//(antirreflexo, filtro azul): String
	private String materialDaLente; 	// (acrílico, trivex, policarbonato, ...): String 
	private double valorDaLente;
	private String corDaLente;
	
	private int estoqueLente;		//associacao
//	private DadosReceita receita;		//associação
	
	private int lenteID;
	
	
	//	----------construtor------------
	/**
	 * Metodo construtor da classe lente
	 * @param tipoDeLente string tipo de lente (antirreflexo)
	 * @param materialDaLente string material da lente (acrílico)
	 * @param valorDaLente double valor da lente
	 * @param corDaLente string cor da lente
	 * @param lenteID inteiro ID da lente
	 * @param estoqueLente inteiro estoque da lente
	 */
	public Lente(String tipoDeLente, String materialDaLente, double valorDaLente, String corDaLente, 
			int lenteID, int estoqueLente) {
		super();
		this.tipoDeLente = tipoDeLente;
		this.materialDaLente = materialDaLente;
		this.valorDaLente = valorDaLente;
		this.corDaLente = corDaLente;
		this.lenteID = lenteID;
		this.estoqueLente = estoqueLente;
	//	this.receita = receita;
	}
	
	// get and set 
	
	/**
	 * get tipo de lente
	 * @return tipoDeLente
	 */
	public String getTipoDeLente() {
		return tipoDeLente;
	}
	/**
	 * set tipo de lente
	 * @param tipoDeLente string tipo de lente
	 */
	public void setTipoDeLente(String tipoDeLente) {
		this.tipoDeLente = tipoDeLente;
	}
	/**
	 * get material da lente
	 * @return string materialDaLente
	 */
	public String getMaterialDaLente() {
		return materialDaLente;
	}
	/** set material da lente
	 * @param materialDaLente string material da lente
	 */
	public void setMaterialDaLente(String materialDaLente) {
		this.materialDaLente = materialDaLente;
	}
	/**
	 * get valor da lente
	 * @return double valorDaLente
	 */
	public double getValorDaLente() {
		return valorDaLente;
	}
	/**
	 * set valor da lente
	 * @param valorDaLente double valor da lente
	 */
	public void setValorDaLente(double valorDaLente) {
		this.valorDaLente = valorDaLente;
	}
	/**
	 * get cor da lente
	 * @return string corDaLente
	 */
	public String getCorDaLente() {
		return corDaLente;
	}
	/**
     * set cor da lente
	 * @param corDaLente string cor da lente
	 */
	public void setCorDaLente(String corDaLente) {
		this.corDaLente = corDaLente;
	}
	
	/**
	 * get ID da lente
	 * @return int lenteID
	 */
	public int getLenteID() {
		return lenteID;
	}
	/**
	 * set ID da lente
	 * @param lenteID inteiro ID da lente
	 */
	public void setLenteID(int lenteID) {
		this.lenteID = lenteID;
	}
		
	/**
	 * get Estoque
	 * @return estoque
	 */
	public int getEstoqueLente() {
		return estoqueLente;
	}

	/**
	 * set estoque
	 * @param estoqueLente inteiro com estoque
	 */
	public void setEstoqueLente(int estoqueLente) {
		this.estoqueLente = estoqueLente;
	}
		
	
}
