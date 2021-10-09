package controle;

/**
 * Verifica se os dados fornecidos estão no formato correto 
 * @author Luisa Caroline
 * @version Out 2021
 */

public class Validador {
	/**
	 * Verifica se o nome está no formato correto
	 * São realizadas duas verificações
	 * (1) Se o nome passado é uma string com inteiros
	 * (2) Se o nome passado é uma string vazia
	 * @param nome uma string que contem um nome a ser verificado
	 * @return verdadeiro ou falso, que indica se o nome é ou não válido
	 */
	
	public static boolean nome(String nome) {		
		if ((nome.matches(".*\\d.*"))|| nome.isEmpty())
		{return false;}
		else
		{return true;}
	}
	
	/**
	 * Verifica se o email está no formato correto
	 * São realizadas três verificações
	 * (1) Se o email contem @ 
	 * (2) Se o email começa com @ 
	 * (3)  Se o email passado é uma string vazia 
	 * @param email uma string que contem um email a ser verificado
	 * @return verdadeiro ou falso, que indica se o email é ou não válido
	 */
	
	public static boolean email(String email) {		
		if ((!email.contains("@")) ||(email.charAt(0)=='@')|| email.isEmpty())
		{return false;}
		else
		{return true;}
	}
	/**
	 * Verifica se o cpf está no formato correto
	 * São realizadas três verificações
	 * (1) Se o cpf passado possui apenas números inteiros
	 * (2) Se o cpf passado possui 11 dígitos
	 * (3) Se o cpf passado é uma string vazia
	 * @param cpf uma string que contem um cpf a ser verificado
	 * @return verdadeiro ou falso, que indica se o cpf é ou não válido
	 */
	
	public static boolean cpf(String cpf) {		
		if ((!cpf.matches("[0-9]+"))|| (cpf.length() != 11) || cpf.isEmpty())
		{return false;}
		else
		{return true;}
	}
	/**
	 * Verifica se o telefone está no formato correto
	 * São realizadas quatro verificações
	 * (1) Se o telefone passado possui apenas números inteiros
	 * (2) Se o telefone passado é menor que 10 dígitos
	 * (3) Se o telefone passado é maior que 11 dígitos
	 * (4) Se o telefone passado é uma string vazia
	 * @param telefone uma string que contem um telefone a ser verificado
	 * @return verdadeiro ou falso, que indica se o telefone é ou não válido
	 */
	
	public static boolean telefone(String telefone) {		
		if ((!telefone.matches("[0-9]+"))||(telefone.length() < 10) || (telefone.length() > 11) || telefone.isEmpty())
		{return false;}
		else
		{return true;}
	}
	/**
	 * Verifica se o valor do produto está no formato correto
	 * São realizadas duas verificações
	 * (1) Se o valor passado possui apenas números inteiros
	 * (2) Se o valor passado é uma string vazia
	 * @param valor uma string que contem um valor de um produto a ser verificado
	 * @return verdadeiro ou falso, que indica se o valor do produto é ou não válido
	 */
	
	public static boolean valorDoProduto(String valor) {		
		if ((!valor.matches("[0.0-9.0]+")) || valor.isEmpty())
		{return false;}
		else
		{return true;}
	}
	/**
	 * Verifica se locais que são numeros estao no formato correto
	 * São realizadas duas verificações
	 * (1) Se o local com numero passado possui apenas inteiros
	 * (2) Se o local com numero passado é uma string vazia
	 * @param numero uma string que contem um apenas numeros a ser verificado
	 * @return verdadeiro ou falso, que indica se o numero é ou não válido
	 */
	
	public static boolean numero(String numero) {		
		if ((!numero.matches("[0-9]+")) || numero.isEmpty())
		{return false;}
		else
		{return true;}
	}
	
	/**
	 * Verifica se todos os locais escritos estão no formato correto
	 * São realizadas uma verificação
	 * (1) Se o todos os locais não são strings vazias 
	 * @param todos uma string que contem todos os locais escritos a ser verificado
	 * @return verdadeiro ou falso, que indica se os locais escritos é ou não válido
	 */
	
	public static boolean todos(String todos) {		
		if (todos.isEmpty())
		{return false;}
		else
		{return true;}
	}

}
