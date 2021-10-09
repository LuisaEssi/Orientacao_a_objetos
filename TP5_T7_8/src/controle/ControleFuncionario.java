package controle;
import modelo.*;


/**
 * Requisita os valores nos gets da classe cliente. Faz a busca de cliente e retorna strings com clientes e seus atributos. 
 * @author Luisa Caroline
 * @version Out 2021
 */

public class ControleFuncionario {
	private static Funcionario[] fun;
	private int qtdFuncionarios;
	
	/**
	 * Metodo para adquirir os funcionarios sua quantindade
	 * @param d objeto tipo Dados com acesso aos atributos do funcionario
	 */
	
	public ControleFuncionario(ControleObjetos d) {
		fun = d.getFuncionarios();
		qtdFuncionarios = d.getQtdfuncionarios();
		
	}
	
	/**
	 * Manda dados do funcionario e gera um array string de retorno para a lista
	 * Faz um laço para passar por todas as posicões do funcionario
	 * @return string com o nome do funcionario
	 */
	
	public String[] getNomeFuncionario() {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			s[i] = fun[i].getNome();
		}
		
		return s;
	}
	/**
	 * Pesquisa por nome ou cpf nos dados da lista de funcionarios
	 * A pesquisa funciona com duas condições:
	 * (1) O nome pode conter parte da string pesquisada  
	 * (2) O cpf deve conter toda a string pesquisada
	 * @param pesFun string com a nome(parte) ou cpf(completo) 
	 * @return array de string com o nome do funcionario
	 */
	public String[] getPesquisaFuncionario(String pesFun) {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			if ((fun[i].getNome()).contains(pesFun) || pesFun.equals(fun[i].getCpf())) {
			s[i] = fun[i].getNome();
			}
		} 
		return s;
	}

}

