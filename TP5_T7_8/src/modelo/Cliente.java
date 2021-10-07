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
// get and set 
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
	
}
