package modelo;

/**
 * Classe abstrata pai para a construção das classes filho Funcionario e Cliente
 * @author Luisa Caroline
 * @version Out 2021
 */
public abstract class PessoaFisica {
	
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	

	
//// -----------construtor --------------
	/**
	 * Metodo construtor da classe abstrata pessoa fisica
	 * @param nome string com nome
	 * @param email string com email
	 * @param telefone string com telefone
	 * @param cpf string cpf
	 */
	public PessoaFisica(String nome, String email, String telefone, String cpf) {
	super();
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	this.cpf = cpf;
}
	
	
	// get and set
	
	/**
	 * get Nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * set Nome
	 * @param nome string
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * get Email
	 * @return emal 
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * set Email
	 * @param email string
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * get Telefone
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * set telefone
	 * @param telefone string
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * get Cpf
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * set Cpf
	 * @param cpf string
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
