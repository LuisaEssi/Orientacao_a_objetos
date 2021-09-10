
public class Estoque {

	private String produtoID;
	private int quantidade;
	
	
	
	
	
//---------construtor----------
	
	public Estoque(String produtoID, int quantidade) {
		super();
		this.produtoID = produtoID;
		this.quantidade = quantidade;

	}	
	
// get and set
	public String getProdutoID() {
		return produtoID;
	}
	
	public void setProdutoID(String produtoID) {
		this.produtoID = produtoID;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
		
//-------------Metodos-----------------


public void cadEsto() {
	//cadastro de estoque
}
public void editEsto() {
	
	//editar estoque
}
public void delEsto () {
	
	//deletar estoque
}

public void exibirEsto() {
	
	// exibir estoque
	System.out.println();
	System.out.println("ID do Produto: " + this.getProdutoID());
	System.out.println("Quantidade no estoque: " + this.getQuantidade());
	
	
}
	
	
	
}
