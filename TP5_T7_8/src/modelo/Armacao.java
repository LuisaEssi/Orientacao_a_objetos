package modelo;

/**
 * Classe para a construção do objeto armacao
 * @author Luisa Caroline
 * @version Out 2021
 */

public class Armacao {
	
	private String classificacao; 		// (feminino, masculino, infantil): String 
	private String corDaArmacao; 		//  
	private String materialDaArmacao;
	private String modelo; 				// (aviador, redondo, quadrado, …): String 
	private String marca;
	private double valorDaArmacao;
	
	private int estoqueArmacao;		//associacao
	
	
	// -------------Construtor --------------

	/** 
	 * Metodo construtor da classe armacao
	 * @param classificacao string classificacao (masculino/feminino)
	 * @param corDaArmacao string com cor 
	 * @param materialDaArmacao string com material
	 * @param modelo string com modelo
	 * @param marca string com marca
	 * @param valorDaArmacao double com valor 
	 * @param estoqueArmacao inteiro com estoque 
	 */
	public Armacao(String classificacao, String corDaArmacao, String materialDaArmacao, String modelo, String marca,
			double valorDaArmacao, int estoqueArmacao) {  
		super();
		this.classificacao = classificacao;
		this.corDaArmacao = corDaArmacao;
		this.materialDaArmacao = materialDaArmacao;
		this.modelo = modelo;
		this.marca = marca;
		this.valorDaArmacao = valorDaArmacao;
		this.estoqueArmacao = estoqueArmacao;

	}

	
	
	//get and set
		/**
		 * Adquire a classificacao da Armacao
		 * @return classificacao
		 */
		public String getClassificacao() {
			return classificacao;
		}

	/**
	 * set classificacao
	 * @param classificacao string da classificacao
	 */
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	/**
	 * Adquire a cor da Armacao
	 * @return cor
	 */
	public String getCorDaArmacao() {
		return corDaArmacao;
	}


	/**
	 * set cor da armacao
	 * @param corDaArmacao string
	 */
	public void setCorDaArmacao(String corDaArmacao) {
		this.corDaArmacao = corDaArmacao;
	}
	/**
	 * Adquire a material da Armacao
	 * @return material
	 */
	public String getMaterialDaArmacao() {
		return materialDaArmacao;
	}

	/**
	 * set material da armacao
	 * @param materialDaArmacao string de material
	 */
	public void setMaterialDaArmacao(String materialDaArmacao) {
		this.materialDaArmacao = materialDaArmacao;
	}

	/**
	 * Adquire a modelo da Armacao
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * set modelo
	 * @param modelo string de modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Adquire a marca da Armacao
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * set marca
	 * @param marca string marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * Adquire a valor da Armacao
	 * @return valor
	 */
	public double getValorDaArmacao() {
		return valorDaArmacao;
	}

	/**
	 * set valor
	 * @param valorDaArmacao doule valor da armacao
	 */
	public void setValorDaArmacao(double valorDaArmacao) {
		this.valorDaArmacao = valorDaArmacao;
	}
	
	/**
	 * Adquire o estoque da Armacao
	 * @return estoque
	 */
	public int getEstoqueArmacao() {
		return estoqueArmacao;
	}
	
	
	/**
	 * set estoque
	 * @param estoqueArmacao inteiro com estoque da armacao
	 */
	public void setEstoqueArmacao(int estoqueArmacao) {
		this.estoqueArmacao = estoqueArmacao;
	}

		
}
