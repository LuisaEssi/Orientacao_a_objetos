package modelo;

/**
 * Classe filho para a construção do objeto Cliente
 * @author Luisa Caroline
 * @version Out 2021
 */
public class Cliente extends PessoaFisica { 				//heranca
	
	
private String endereco;

/**
 * @param nome string com nome
 * @param email string com email
 * @param telefone string com telefone
 * @param cpf string cpf
 * @param endereco string com endereço
 */
public Cliente(String nome, String email, String telefone, String cpf, String endereco) { //
	super(nome, email, telefone, cpf);
	this.setNome(nome);
	this.setEmail(email);
	this.setTelefone(telefone);
	this.setCpf(cpf);
	this.endereco = endereco;
}
// get and set 
	
	/**
	 * get endereco
	 * @return endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * set endereco
	 * @param endereco string endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
	
}
