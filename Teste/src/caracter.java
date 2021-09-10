import java.util.Scanner;

public class caracter {

	public static void main(String[] args) {
		
	char caracter;	
	int digito;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o caracter a ser verificado:");
	
	caracter = ler.next().charAt(0);
	digito = (int) caracter;
				
	if (digito >= 48 && digito <= 57) 
		{
			System.out.print("true");
		}
	else 
		{
			System.out.print("false");
		}
	
	}

}
