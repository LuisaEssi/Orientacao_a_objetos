package modelo;

/**
 * Classe filho para a construção do objeto Funcionario
 * @author Luisa Caroline
 * @version Out 2021
 */
public class Funcionario extends PessoaFisica {				//heranca
	
	private String funcao;
	private String horarioDeTrabalho;
	private String salarioHora;
	
	
/**
 * @param nome string com nome
 * @param email string com email
 * @param telefone string com telefone
 * @param cpf string cpf
 * @param funcao string com funcao
 * @param horarioDeTrabalho string com horario de trabalho
 * @param salarioHora string com salario/hora
 */
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
	/** 
	 * get funcao
	 * @return funcao
	 */
	public String getFuncao() {
		return funcao;
	}
	/**
	 * set funcao
	 * @param funcao string
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	/** 
	 * get horario de trabalho
	 * @return horario de trabalho
	 */
	public String getHorarioDeTrabalho() {
		return horarioDeTrabalho;
	}
	/**
	 * set  horario de trabalho
	 * @param horarioDeTrabalho string com  horario de trabalho
	 */
	public void setHorarioDeTrabalho(String horarioDeTrabalho) {
		this.horarioDeTrabalho = horarioDeTrabalho;
	}
	/**
	 * get salario/hora
	 * @return salario/hora
	 */
	public String getSalarioHora() {
		return salarioHora;
	}
	/**
	 * set salario/hora
	 * @param salarioHora string com salario/hora
	 */
	public void setSalarioHora(String salarioHora) {
		this.salarioHora = salarioHora;
	}

	
}
