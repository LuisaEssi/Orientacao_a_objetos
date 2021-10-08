package controle;
import modelo.*;

public class ControleFuncionario {
	private Funcionario[] fun;
	private int qtdFuncionarios;
	
	public ControleFuncionario(ControleObjetos d) {
		fun = d.getFuncionarios();
		qtdFuncionarios = d.getQtdfuncionarios();
		
	}
	
	public String[] getNomeFuncionario() {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			s[i] = fun[i].getNome();
		}
		
		return s;
	}
	
	public String[] getPesquisaFuncionario(String pesFun) {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			if ((fun[i].getNome()).contains(pesFun) || pesFun.equals(fun[i].getCpf())) {
			s[i] = fun[i].getNome();
			}
		} 
		return s;
	}
	
	
	
	public int getQtd() {
		return qtdFuncionarios;
	}

	public void setQtd(int qtd) {
		this.qtdFuncionarios = qtd;
	}
	
	public String getNome(int i) {		
		return fun[i].getNome();
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(fun[i].getCpf());
		return numCPF;
	}	
	
	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public String getTelefone(int i) {		
		return fun[i].getTelefone();
	}	
	
	public String getEmail(int i) {		
		return fun[i].getEmail();
	}	
	
	public String getSalarioHora(int i) {		
		return fun[i].getSalarioHora();
	}	
	
	public String getFuncao(int i) {		
		return fun[i].getFuncao();
	}	
	
	public String getHorarioDeTrabalho(int i) {		
		return fun[i].getHorarioDeTrabalho();
	}	
}

