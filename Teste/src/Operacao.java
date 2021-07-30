import java.util.Scanner; //leitura de dados
public class Operacao {
    public static void main(String[] args) {
    	 int A, B;
    	 
    	 Scanner ler = new Scanner(System.in);
    	 System.out.print("Entre com a operação a ser realizada (+, - ou *):\n");
    	 
    	 String sinal = ler.next();
    	        
    	 System.out.print("Entre com o primeiro número:\n");    
         A = ler.nextInt();
         
         System.out.print("Entre com o segundo número:\n");    
         B = ler.nextInt();
              
	        switch (sinal) {
	            case ("+"): System.out.println("O resultado da operação é: " + (A+B));
	                     break;
	            case ("-"): System.out.println("O resultado da operação é: " + (A-B));
	                     break;
	            case ("*"): System.out.println("O resultado da operação é: " + (A*B));
	                     break;
	            default: System.out.println("Operação inválida");
	                     break;
	        }
	        
	        
	}

}
