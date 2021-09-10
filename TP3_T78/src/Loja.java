import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		

		Armacao arm1 = new Armacao("Feminino", "Verde", "Acetato","Aviador","Prada", 100.00);
		
		arm1.exibirArm();
		
		Cliente cli1 = new Cliente("Luisa","luisa@gmail.com","40028922", "00000000001");
		
		cli1.exibirPessoa();
		
		Compra com1 = new Compra("Armacao 123",1, 123,"boleto","retirada na loja");
		
		com1.exibirCompra();
	
		DadosReceita dad1 = new DadosReceita(true,"2", "2","30","multifoca");
		
		dad1.exibirDados();
			
		Estoque est1 = new Estoque("123",5);
		
		est1.exibirEsto();
		
		Funcionario fun1 = new Funcionario("Luisa","luisa@gmail.com","40028922", "00000000001", "gerente", "8:00 às 14:00", 10.00);
		
		fun1.exibirPessoa();
		
		Lente lent1 = new Lente("Antirreflexo", "Acrílico", 100.00, "Transparente");
		
		lent1.exibirLente();
		
		LenteDeContato cont1 = new LenteDeContato("Hidrogel", "mensal", "Acuvue", "transparente", "Soro");
		
		cont1.exibirContato();
	
	}
	
	
}
