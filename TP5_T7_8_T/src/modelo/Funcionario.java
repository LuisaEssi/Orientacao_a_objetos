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

	
}
