package modelo;
import java.util.ArrayList;
public class Compra {
	
	private String produtosSelecionados; //Lente de contato ou óculos
	private int quantidadeDoProduto;
	private int codigoDaCompra;
	private String formaDePagamento; 
	private String frete;
	private double valorTotal;
	
	private Cliente cliente;	 //agregação

	private ArrayList<LenteDeContato> compraContato = new ArrayList<LenteDeContato>();
	private ArrayList<Oculos> compraOculos = new ArrayList<Oculos>();
	
	
// --------------construtor-----------
	
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
	
	
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	
	
	public ArrayList<LenteDeContato> getCompraContato() {
		return compraContato;
	}

	public void setCompraContato(ArrayList<LenteDeContato> compraContato) {
		this.compraContato = compraContato;
	}


	public ArrayList<Oculos> getCompraOculos() {
		return compraOculos;
	}

	public void setCompraOculos(ArrayList<Oculos> compraOculos) {
		this.compraOculos = compraOculos;
	}
	
		
	
	//-------------Metodos-----------------

		public int quantidadeCompraContato() {
			return compraContato.size();
		}
		
		public int quantidadeCompraOculos() {
			return compraOculos.size();
		}
		
	
		public void adicionaCliente(Cliente nomeCliente) {
			//adicionaocliente
			nomeCliente.getNome(); 

		}
		
		//Sobrecarga do metodo compra
		
		public void compra(Oculos oculos) {
			compraOculos.add(oculos);
		}
		
		public void compra(LenteDeContato contato) {
			compraContato.add(contato);
		}
		
		
		
		public double getValorTotal() {
			
			double valor = 0;
			
			if (compraContato.size() > 0) {
			for(int i = 0; i < compraContato.size(); i++) {
				valor += compraContato.get(i).getValorContato();
			}
			
			}
			
			if (compraOculos.size() > 0) {
			for(int i = 0; i < compraOculos.size(); i++) {
				valor += compraOculos.get(i).getValorOculos();
			}
			
			}
	
			return valor;
		}

		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}

		
//		public void editCompra() {
//			
//			//editar compra
//		}
//		public void buscCompra () {
//			
//			//deletar compra
//		}
		public void exibirCompra() {
			// exibir compra
			System.out.println();
			System.out.println("Produto Selecionado: " + this.getProdutosSelecionados());
			System.out.println("Quantidade: " + this.getQuantidadeDoProduto());
			System.out.println("Código da Compra: " + this.getCodigoDaCompra());
			System.out.println("Frete: " + this.getFrete());
			System.out.println("Nome do Cliente: " + this.getCliente().getNome());
			System.out.println("Valor total: " + this.getValorTotal()); // realizar a soma dos produtos

		}
			
}
