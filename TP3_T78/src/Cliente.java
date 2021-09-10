
public class Cliente extends PessoaFisica{ 				//heranca
	
	private Compra[] compra = new Compra[500];		//agregação 
	private String endereco;
	
	
public Cliente(String nome, String email, String telefone, String cpf) { //, Compra[] compra, String endereco
		super(nome, email, telefone, cpf);
		this.setNome(nome);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setCpf(cpf);
	//	this.compra = compra;
	//	this.endereco = endereco;
	}
// get and set codigoDaCompra
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
	public Compra[] getCompra() {
		return compra;
	}

	public void setCompra(Compra[] compra) {
		this.compra = compra;
	}

	
	public void exibirPessoa () {
		// buscar pessoa (cliente)
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("E-mail: " + this.getEmail());
		System.out.println("Telefone: "  + this.getTelefone());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("ID da Compra: " + this.getCompra());
	}
	
	
}
