import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
    int numero = 0, soma = 0;
    Scanner ler = new Scanner(System.in);
    do {   
     	soma += numero; 
    	System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
		numero = ler.nextInt();
   
     } while (numero>=0);
    
	System.out.println("A soma é: " + soma);
}
    }