
public abstract class PessoaFisica {
	
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	
//// -----------construtor --------------
	public PessoaFisica(String nome, String email, String telefone, String cpf) {
	super();
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	this.cpf = cpf;
}
	
	
	// get and set
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//-------------Metodos-----------------
	

	public void CadPessoa () {
		//cadastro de pessoa
	}

	public void EditPessoa() {
		
		//editar pessoa
	}
	public void DelPessoa () {
		
		//deletar pessoa
	}
	public void BuscPessoa () {
		
		
	}
	
}
