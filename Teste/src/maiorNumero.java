import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		int numero[]=new int [5], maior; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro numero:\n");
		numero[0] = ler.nextInt();
		
		System.out.print("Entre com o segundo numero:\n");
		numero[1] = ler.nextInt();
		
		System.out.print("Entre com o terceiro numero:\n");
		numero[2] = ler.nextInt();
		
		System.out.print("Entre com o quarto numero:\n");
		numero[3] = ler.nextInt();
		
		System.out.print("Entre com o quinto numero:\n");
		numero[4] = ler.nextInt();
		
		maior = numero[0];
		
		for (int i=0; i<5;i++) 
			{
				if (maior<numero[i])
					{
					maior = numero[i];
					}		
				
			}
		System.out.print(maior);

	}
}