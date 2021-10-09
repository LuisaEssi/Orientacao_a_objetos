package modelo;

/**
 * Classe para a construção do objeto Compra
 * @author Luisa Caroline
 * @version Out 2021
 */

public class Compra {
	
	private String produtosSelecionados; //Lente de contato ou óculos
	private int quantidadeDoProduto;
	private int codigoDaCompra;
	private String formaDePagamento; 
	private String frete;
//	private double valorTotal;
	
	private Cliente cliente;	 //agregação
	
// --------------construtor-----------
	
	/**
	 * @param produtosSelecionados string de produtos selecionados
	 * @param quantidadeDoProduto inteiro de quantidade de produto	
	 * @param codigoDaCompra inteiro de codigo da compra
	 * @param formaDePagamento string de forma de pagamento
	 * @param frete string de frente
	 * @param cliente objeto cliente
	 */
	public Compra(String produtosSelecionados, int quantidadeDoProduto, int codigoDaCompra, String formaDePagamento,
			String frete, Cliente cliente) {			//) {
		super();
		this.produtosSelecionados = produtosSelecionados;	//IDdoproduto
		this.quantidadeDoProduto = quantidadeDoProduto;		//estoque
		this.codigoDaCompra = codigoDaCompra;				//IDcompra
		this.formaDePagamento = formaDePagamento;			//pagamento
		this.frete = frete;									//frete
		this.cliente = cliente;								//nome do cliente
	}
		
	// get and set
	/**
	 *get produtos selecionados
	 * @return string produtosSelecionados
	 */
	public String getProdutosSelecionados() {
		return produtosSelecionados;
	}
	
	/**
	 * set produtos selecionados
	 * @param produtosSelecionados string de produtos selecionados
	 */
	public void setProdutosSelecionados(String produtosSelecionados) {
		this.produtosSelecionados = produtosSelecionados;
	}
	
	/**
	 * get quantidade do produto
	 * @return int de quantidade de produtos
	 */
	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}
	
	/**
	 * get quantidadeDoProduto
	 * @param quantidadeDoProduto inteiro de quantidade do produto
	 */
	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}
	/**
     * get código da compra
	 * @return inteiro do código da compra
	 */
	public int getCodigoDaCompra() {
		return codigoDaCompra;
	}
	/**
     * set codigo da compra
	 * @param codigoDaCompra inteiro código da compra
	 */
	public void setCodigoDaCompra(int codigoDaCompra) {
		this.codigoDaCompra = codigoDaCompra;
	}
	/**
     * get forma de pagamento
	 * @return string de forma de pagamento
	 */
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	/**
     *  set forma de pagamento
	 * @param formaDePagamento string de forma de pagamento
	 */
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	/**
     * get frete
	 * @return string de frete
	 */
	public String getFrete() {
		return frete;
	}
	/**
     * set frete
	 * @param frete string de frete
	 */
	public void setFrete(String frete) {
		this.frete = frete;
	} 	
	
	/**
     * get cliente
	 * @return vetor de objetos cliente
	 */
	public Cliente getCliente() {
		return this.cliente;
	}


}
