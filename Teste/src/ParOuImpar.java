import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    int numero, resto = 0;
	    System.out.println("Digite um numero:");
	    numero = ler.nextInt();
	    
	    resto = numero%2;
	    
	    if(resto == 0) {
	    
		System.out.print(true);
	    }
	    else {
	    	System.out.print(false);
	    	}
	}

}
