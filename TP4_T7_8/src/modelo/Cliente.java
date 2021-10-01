package modelo;

public class Cliente extends PessoaFisica { 				//heranca
	
	
	private String endereco;

public Cliente(String nome, String email, String telefone, String cpf, String endereco) { //
	super(nome, email, telefone, cpf);
	this.setNome(nome);
	this.setEmail(email);
	this.setTelefone(telefone);
	this.setCpf(cpf);
	this.endereco = endereco;
}
// get and set codigoDaCompra
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	

	
//	public String dadosCliente() {
//
//		return getNome() + "\nCPF: " + getCpf() + "\n" + getTelefone()+  "\n" + getEndereco()+ "\n" +getEmail() ;
//
//	}
//	
//
//	public void adicionaCompraOculos(Compra compra, Oculos armacao, Oculos lente) {
//		compra.getCompraOculos().add(armacao);
//		compra.getCompraOculos().add(lente);
//	}
//
//	public void adicionaCompraContato(Compra compra, LenteDeContato contato) {
//		compra.getCompraContato().add(contato);
//	}
//
//	public void removeCompraOculos(Compra compra) {
//		for(int i = 0; i < compra.getCompraOculos().size(); i++) {
//			compra.getCompraOculos().remove(i);
//		}
//	}
//
//	public void removeCompraContato(Compra compra) {
//		for(int i = 0; i < compra.getCompraContato().size(); i++) {
//			compra.getCompraContato().remove(i);
//		}
//	}
//
//	
//	public boolean loginCliente(String cpf, String senha) {
//		if (cpf == getCpf() && senha.equals(getSenha())) return true;
//		else return false;
//	}
//	

		
	public void exibirPessoa () {
		// buscar pessoa (cliente)
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("E-mail: " + this.getEmail());
		System.out.println("Telefone: "  + this.getTelefone());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Endereço: " + this.getEndereco());
//		System.out.println("ID da Compra: " + this.getCompra());
	}
	
	
}
