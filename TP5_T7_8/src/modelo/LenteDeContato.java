package modelo;


/**Classe para a construção do objeto lente de contato
 * @author Luisa Caroline
 * @version Out 2021
 */
public class LenteDeContato {
	
	private String materialDaLente; 			// (gelatinosa, higrogel, ...): String 
	private String tipoDeDescarte; 				// (diario, quinzenal, mensal, ): String 
	private String marca; 
	private String cor;
	private String produtosDeHig; 				// (soluções, colírios, estojos, ….): String
	private double valorContato;				//valor da lente de contato
	
	private int estoqueContato; 				//associacao
//	private DadosReceita receita;				//associação
	
	//---------construtor----------
	/**
	 * Metodo construtor da classe lente de contato
	 * @param materialDaLente string com o material
	 * @param tipoDeDescarte string com o tipo de descarte
	 * @param marca string com marca
	 * @param cor string com cor
	 * @param produtosDeHig string com produtos de higiene
	 * @param estoqueContato inteiro com estoque
	 * @param valorContato double com valor 
	 */
	public LenteDeContato(String materialDaLente, String tipoDeDescarte, String marca, String cor, String produtosDeHig, int estoqueContato,
			double valorContato) {
		super();
		this.materialDaLente = materialDaLente;
		this.tipoDeDescarte = tipoDeDescarte;
		this.marca = marca;
		this.cor = cor;
		this.produtosDeHig = produtosDeHig;
		this.estoqueContato = estoqueContato;
		this.valorContato = valorContato;
//		this.receita = receita;
	}

	
	// get and set
	/**
	 * get material da lente de contato
	 * @return material da lente de contato
	 */
	public String getMaterialDaLente() {
		return materialDaLente;
	}

	/**
	 * set material da lente de contato
	 * @param materialDaLente string com material da lente de contato
	 */
	public void setMaterialDaLente(String materialDaLente) {
		this.materialDaLente = materialDaLente;
	}
	/**
	 * get com tipo de descarte 
	 * @return tipo de descarte da da lente de contato
	 */
	public String getTipoDeDescarte() {
		return tipoDeDescarte;
	}
	/**
	 * set tipo de descarte
	 * @param tipoDeDescarte string com tipo de descarte da lente de contato
	 */
	public void setTipoDeDescarte(String tipoDeDescarte) {
		this.tipoDeDescarte = tipoDeDescarte;
	}
	/**
	 * get marca
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * set marca 
	 * @param marca string com a marca da lente de contato
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * get cor
	 * @return cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * set cor
	 * @param cor string com a cor da lente de contato
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	/**
	 * get produtos de higiene
	 * @return produtos de higiene
	 */
	public String getProdutosDeHig() {
		return produtosDeHig;
	}

	/**
	 * set produtos de higiene
	 * @param produtosDeHig string com produtos de higiene
	 */
	public void setProdutosDeHig(String produtosDeHig) {
		this.produtosDeHig = produtosDeHig;
	}
	
	/**
	 * set estoque da lente de contato
	 * @return estoque da lente de contato
	 */
	public int getEstoqueContato() {
		return estoqueContato;
	}

	/**
	 * set estoque da lente de contato
	 * @param estoqueContato inteiro com estoque da lente de contato
	 */
	public void setEstoqueContato(int estoqueContato) {
		this.estoqueContato = estoqueContato;
	}
	
	/**
	 * set valor da lente de contato
	 * @return valor da lente de contato
	 */
	public double getValorContato() {
		return valorContato;
	}


	/**
	 * set valor da lente de contato
	 * @param valorContato double com valor da lente de contato
	 */
	public void setValorContato(double valorContato) {
		this.valorContato = valorContato;
	}
	
	
}
