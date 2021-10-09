package controle;
import modelo.*;

/**
 * Requisita os valores nos gets da classe cliente. Faz a busca de cliente e retorna strings com clientes e seus atributos. 
 * @author Luisa Caroline
 * @version Out 2021
 */

public class ControleCliente {
	private static Cliente[] cli;
	private int qtdClientes;
	
	/**
	 * Metodo para adquirir os clientes e sua quantindade
	 * @param d objeto tipo Dados com acesso aos atributos do cliente
	 */
	
	public ControleCliente(ControleObjetos d) {
		cli = d.getClientes();
		qtdClientes = d.getQtdclientes();
		
	}
	
	/**
	 * Manda dados do cliente e gera um array string de retorno para a lista
	 * Faz um laço para passar por todas as posicões do cliente
	 * @return string com o nome do cliente
	 */
	
	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			s[i] = cli[i].getNome();
		}
		return s;
	}
	/**
	 * Pesquisa por nome ou cpf nos dados da lista de clientes
	 * A pesquisa funciona com duas condições:
	 * (1) O nome pode conter parte da string pesquisada  
	 * (2) O cpf deve conter toda a string pesquisada
	 * @param pesCli string com a nome(parte) ou cpf(completo) 
	 * @return array de string com o nome do cliente
	 */
	
	public String[] getPesquisaCliente(String pesCli) {
		String[] s = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			if ((cli[i].getNome()).contains(pesCli)|| pesCli.equals(cli[i].getCpf())) {
			s[i] = cli[i].getNome();
			}
		} 
		return s;
	}	
	
}
