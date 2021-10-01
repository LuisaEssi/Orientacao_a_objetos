package modelo;

public class Funcionario extends PessoaFisica {				//heranca
	
	private String funcao;
	private String horarioDeTrabalho;
	private String salarioHora;
	
	
public Funcionario( String nome, String email, String telefone, String cpf, String funcao, String horarioDeTrabalho, String salarioHora) {
		super(nome, email, telefone, cpf);
		this.setNome(nome);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setCpf(cpf);
		this.funcao = funcao;
		this.horarioDeTrabalho = horarioDeTrabalho;
		this.salarioHora = salarioHora;
	}

// get and set
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getHorarioDeTrabalho() {
		return horarioDeTrabalho;
	}
	public void setHorarioDeTrabalho(String horarioDeTrabalho) {
		this.horarioDeTrabalho = horarioDeTrabalho;
	}
	public String getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(String salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	public boolean loginFuncionario(String cpf, String senha) {
		if (cpf == getCpf() && senha.equals(getSenha())) return true;
		else return false;
	}
	
	// aumentar estoque
	
	public void adicionaEstoqueArmacao(Armacao estoqueArmacao) {
		estoqueArmacao.getEstoqueArmacao();
	}
	
	public void adicionaEstoqueLente(Lente estoqueLente) {
		estoqueLente.getEstoqueLente();
	}
	
	public void adicionaEstoqueContato(LenteDeContato estoqueContato) {
		estoqueContato.getEstoqueContato();
	}
	
	
	public void exibirPessoa () {
		// buscar pessoa (cliente)
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("E-mail: " + this.getEmail());
		System.out.println("Telefone: "  + this.getTelefone());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Função: " + this.getFuncao());
		System.out.println("Horário de Trabalho: " + this.getHorarioDeTrabalho());
		System.out.println("Salário/Hora: " + this.getSalarioHora());
	}
	
	
	
	
}
