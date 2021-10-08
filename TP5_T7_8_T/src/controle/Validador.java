package controle;

public class Validador {
	
	public static boolean nome(String nome) {		
		if ((nome.matches(".*\\d.*"))|| nome.isEmpty())
		{return false;}
		else
		{return true;}
	}
	
	public static boolean email(String email) {		
		if ((!email.contains("@")) ||(email.charAt(0)=='@')|| email.isEmpty())
		{return false;}
		else
		{return true;}
	}
	
	public static boolean cpf(String cpf) {		
		if ((!cpf.matches("[0-9]+"))|| (cpf.length() != 11) || cpf.isEmpty())
		{return false;}
		else
		{return true;}
	}
	
	public static boolean telefone(String telefone) {		
		if ((!telefone.matches("[0-9]+"))||(telefone.length() < 10) || (telefone.length() > 11) || telefone.isEmpty())
		{return false;}
		else
		{return true;}
	}
	
	public static boolean valorDoProduto(String valor) {		
		if ((!valor.matches("[0-9]+")) || valor.isEmpty())
		{return false;}
		else
		{return true;}
	}
	
	public static boolean estoqueDoProduto(String estoque) {		
		if ((!estoque.matches("[0-9]+")) || estoque.isEmpty())
		{return false;}
		else
		{return true;}
	}
	
	public static boolean idDoProduto(String idPro) {		
		if ((!idPro.matches("[0-9]+")) ||idPro.isEmpty())
		{return false;}
		else
		{return true;}
	}

}
