
public class Funcionario extends PessoaFisica {				//heranca
	
	private String funcao;
	private String horarioDeTrabalho;
	private double salarioHora;
	
	
public Funcionario( String nome, String email, String telefone, String cpf, String funcao, String horarioDeTrabalho, double salarioHora) {
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
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
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
