public class Compra {
	
	private String produtosSelecionados; //Lente de contato ou óculos
	private int quantidadeDoProduto;
	private int codigoDaCompra;
	private String formaDePagamento; 
	private String frete;
	
	private Cliente nomeDoCliente;	 //agregação
	private Cliente enderecoDoCliente;	//agregação

	private LenteDeContato compra_contato[] = new LenteDeContato [50]; //associacao
	private Oculos compra_oculos[] = new Oculos [50];	//associacao
	
	
// --------------construtor-----------
	
	public Compra(String produtosSelecionados, int quantidadeDoProduto, int codigoDaCompra, String formaDePagamento,
			String frete) { //, Cliente nomeDoCliente, Cliente enderecoDoCliente, LenteDeContato[] compra_contato, Oculos[] compra_oculos
		super();
		this.produtosSelecionados = produtosSelecionados;
		this.quantidadeDoProduto = quantidadeDoProduto;
		this.codigoDaCompra = codigoDaCompra;
		this.formaDePagamento = formaDePagamento;
		this.frete = frete;
//		this.nomeDoCliente = nomeDoCliente;
//		this.enderecoDoCliente = enderecoDoCliente;
//		this.compra_contato = compra_contato;
//		this.compra_oculos = compra_oculos;
	}
	
	
	// get and set
	public String getProdutosSelecionados() {
		return produtosSelecionados;
	}
	
	public void setProdutosSelecionados(String produtosSelecionados) {
		this.produtosSelecionados = produtosSelecionados;
	}
	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}
	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}
	public int getCodigoDaCompra() {
		return codigoDaCompra;
	}
	public void setCodigoDaCompra(int codigoDaCompra) {
		this.codigoDaCompra = codigoDaCompra;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public String getFrete() {
		return frete;
	}
	public void setFrete(String frete) {
		this.frete = frete;
	} 
	
	public Cliente getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(Cliente nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	public Cliente getEnderecoDoCliente() {
		return enderecoDoCliente;
	}
	public void setEnderecoDoCliente(Cliente enderecoDoCliente) {
		this.enderecoDoCliente = enderecoDoCliente;
	}

		public LenteDeContato[] getCompra_contato() {
		return compra_contato;
	}


	public void setCompra_contato(LenteDeContato[] compra_contato) {
		this.compra_contato = compra_contato;
	}


	public Oculos[] getCompra_oculos() {
		return compra_oculos;
	}


	public void setCompra_oculos(Oculos[] compra_oculos) {
		this.compra_oculos = compra_oculos;
	}

	
	//-------------Metodos-----------------



		public void cadCompra() {
			//cadastro de compra
			
			// produtos selecionados
		}
		public void editCompra() {
			
			//editar compra
		}
		public void buscCompra () {
			
			//deletar compra
		}
		public void exibirCompra() {
			// exibir compra
			System.out.println();
			System.out.println("Produto Selecionado: " + this.getProdutosSelecionados());
			System.out.println("Quantidade: " + this.getQuantidadeDoProduto());
			System.out.println("Código da Compra: " + this.getCodigoDaCompra());
			System.out.println("Frete: " + this.getFrete());
			System.out.println("Nome do Cliente: " + this.getNomeDoCliente());
//			System.out.println("Valor total: " + "XXXXX" ); // realizar a soma dos produtos

		}
			
}
