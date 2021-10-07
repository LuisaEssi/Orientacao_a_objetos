package controle;
import modelo.*;
import visao.TelaListaPessoa;

public class ControleCliente {
	private Cliente[] cli;
	private int qtdClientes;
	
	public ControleCliente(ControleObjetos d) {
		cli = d.getClientes();
		qtdClientes = d.getQtdclientes();
		
	}
	
	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			s[i] = cli[i].getNome();
		}
		return s;
	}
	
	
	public String[] getPesquisaCliente(String pesCli) {
		String[] s = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			if ((cli[i].getNome()).contains(pesCli)|| pesCli.equals(cli[i].getCpf())) {
			s[i] = cli[i].getNome();
			}
		} 
		return s;
	}
	
	
	public String getNome(int i) {		
		return cli[i].getNome();
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(cli[i].getCpf());
		return numCPF;
	}	
	
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	
	public String getTelefone(int i) {		
		return cli[i].getTelefone();
	}	
	
	public String getEmail(int i) {		
		return cli[i].getEmail();
	}	
	
	public String getEndereco(int i) {		
		return cli[i].getEndereco();
	}	
	
}
