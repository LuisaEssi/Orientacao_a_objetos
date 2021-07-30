import java.util.Scanner;

public class TP1 {
	
	static String cliente[][] = new String[50][3];
	static String produto[][] = new String[50][5];
	static int numero_clientes_antigos = 10,numero_produtos_antigos = 10;

//clientes pré cadastrados
	public static void carregaCliente(){

								//nomecliente |  telefone  |  endereço
		cliente[0] = new String [] {"Cliente 1","telefone 1","Local 1"};	
		cliente[1] = new String [] {"Cliente 2","telefone 2","Local 2"};	
		cliente[2] = new String [] {"Cliente 3","telefone 3","Local 3"};	
		cliente[3] = new String [] {"Cliente 4","telefone 4","Local 4"};	
		cliente[4] = new String [] {"Cliente 5","telefone 5","Local 5"};	
		cliente[5] = new String [] {"Cliente 6","telefone 6","Local 6"};	
		cliente[6] = new String [] {"Cliente 7","telefone 7","Local 7"};	
		cliente[7] = new String [] {"Cliente 8","telefone 8","Local 8"};	
		cliente[8] = new String [] {"Cliente 9","telefone 9","Local 9"};	
		cliente[9] = new String [] {"Cliente 10","telefone 10","Local 10"};	
	}

// produtos pré cadastrados	
	public static void carregaProduto(){
								 //nomeproduto | descricao  | valor	| lucro | quantidade
		produto[0] = new String [] {"Produto 1","Descricao 1","1.0","Lucro 1","1"};	
		produto[1] = new String [] {"Produto 2","Descricao 2","2.0","Lucro 2","2"};	
		produto[2] = new String [] {"Produto 3","Descricao 3","3.0","Lucro 3","3"};	
		produto[3] = new String [] {"Produto 4","Descricao 4","4.0","Lucro 4","4"};	
		produto[4] = new String [] {"Produto 5","Descricao 5","5.0","Lucro 5","5"};	
		produto[5] = new String [] {"Produto 6","Descricao 6","6.0","Lucro 6","6"};	
		produto[6] = new String [] {"Produto 7","Descricao 7","7.0","Lucro 7","7"};	
		produto[7] = new String [] {"Produto 8","Descricao 8","8.0","Lucro 8","8"};	
		produto[8] = new String [] {"Produto 9","Descricao 9","9.0","Lucro 9","9"};	
		produto[9] = new String [] {"Produto 10","Descricao 10","10.0","Lucro 10","10"};	
		
	}
	
//Menu		
	public static void menu() {
	
	System.out.println("1 - Cadastro de novo cliente");	
	System.out.println("2 - Busca por cliente");		
	System.out.println("3 - Cadastro de novo produto");	
	System.out.println("4 - Busca por produto");	
	System.out.println("5 - Cadastro de venda");	
	System.out.println("6 - Mostrar produtos em estoque");	
	System.out.println("7 - Sair");	
	
	}	

// 1 - Cadastro de novo cliente
	public static void cadastroDeNovoCliente() {
		Scanner ler = new Scanner(System.in);

		int numero_clientes, j=0;
				
		System.out.println("Quantos clientes irá cadastrar?");
		numero_clientes = ler.nextInt();
						
		for (int i = 0; i < numero_clientes; i++) {
				
				String compara_cliente;
				System.out.println("Digite o nome:");
				ler = new Scanner(System.in);
				compara_cliente = ler.nextLine();
					
				while(!(compara_cliente.equals(cliente[j][0]))){
					j++;
					
					if (j==50) {
						break;
							}	
				}
				
				if (j==50) {
					
					cliente[i+numero_clientes_antigos][0] = compara_cliente;
					System.out.println("Digite o telefone:");
					
					ler = new Scanner(System.in);
					cliente[i+numero_clientes_antigos][1]= ler.nextLine();
					System.out.println("Digite o endereço:");
					ler = new Scanner(System.in);
					cliente[i+numero_clientes_antigos][2]= ler.nextLine();	
					
				}
				
				else {
					System.out.println("Cliente cadastrado!");
					}
			j = 0;
			compara_cliente="";
			
			
			}
		
		numero_clientes_antigos += numero_clientes;
			
		}
	
// 2 - Busca por cliente
	public static void buscaPorCliente() {
		int i = 0, alterar;
		Scanner ler = new Scanner(System.in);
		String buscando, teste;

		System.out.println("Digite o nome do cliente:");
		buscando = ler.nextLine();
		if (buscando != "") {
			while(!(buscando.equals(cliente[i][0]))){
			i++;
			
			if (i==50) {
				System.out.println("Cliente não encontrado!");
			break;
					}		
			
				}
		}
		if (i<50) {	
		System.out.println("Nome: "+cliente[i][0] +"\n"+"Telefone: "+cliente[i][1]+"\n"+"Endereço: "+cliente[i][2]+"\n");
		
		System.out.println("Deseja alterar cadastro?");
		System.out.println("1 - Não");
		System.out.println("2 - Sim");
		alterar = ler.nextInt();
		
		if(alterar == 1) {
			System.out.println("Obrigada!");	
		}
		
		else if(alterar == 2) {
			
			
			
			System.out.println("Digite o nome:");
			ler = new Scanner(System.in);
			cliente[i][0]= ler.nextLine();
						
			System.out.println("Digite o telefone:");
			ler = new Scanner(System.in);
			cliente[i][1]= ler.nextLine();
			
			System.out.println("Digite o endereço:");
			ler = new Scanner(System.in);
			cliente[i][2]= ler.nextLine();
		}
		
		else {
			System.out.println("Inválido!");
				}
			}	
		}
			
// 3 - Cadastro de novo produto
	public static void cadastroDeNovoProduto() {
		
		int numero_produtos, j=0, aumenta_estoque, quantidade_nova, estoque, estoque_novo; // 10 produtos já cadastrados
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos produtos irá cadastrar?");
		numero_produtos = ler.nextInt();
				
		for (int i = 0; i < numero_produtos; i++) {
			
			String compara_produto;
			System.out.println("Digite o nome do produto:");
			ler = new Scanner(System.in);
			compara_produto = ler.nextLine();
				
			while(!(compara_produto.equals(produto[j][0]))){
				j++;
				
				if (j==50) {
					break;
						}	
			}
			
			if (j==50) {
				
				produto[i+numero_produtos_antigos][0] = compara_produto;
				
				System.out.println("Descreva o produto:");
				ler = new Scanner(System.in);
				produto[i+numero_produtos_antigos][1]= ler.nextLine();
				System.out.println("Digite o preço do produto(coloque '.' para separar os centavos): ");
				ler = new Scanner(System.in);
				produto[i+numero_produtos_antigos][2]= ler.nextLine();
				System.out.println("Digite a porcentagem de lucro do produto:");
				ler = new Scanner(System.in);
				produto[i+numero_produtos_antigos][3]= ler.nextLine();
				System.out.println("Digite a quantidade:");
				ler = new Scanner(System.in);
				produto[i+numero_produtos_antigos][4]= ler.nextLine();
				
			}
			
			else {
				System.out.println("Produto cadastrado!");
				System.out.println("Deseja acrescentar mais deste produto ao estoque?(digite apenas números)");	
				System.out.println("1 - Não");
				System.out.println("2 - Sim");	
				
				ler = new Scanner(System.in);
				aumenta_estoque = ler.nextInt();
				
				if(aumenta_estoque == 2) {
					System.out.println("Coloque a quantidade de produto a ser acrescentado(digite apenas números)");		
					ler = new Scanner(System.in);
					quantidade_nova = ler.nextInt();
					
					estoque = Integer.parseInt(produto[j][4]);
					estoque_novo = estoque + quantidade_nova;
					System.out.println("Obrigada!");
					produto[j][4] = Integer.toString(estoque_novo) ;
					}
				
				else {
					System.out.println("Obrigada!");
				}
								
				}
			j = 0;
			compara_produto="";

			}
		numero_produtos_antigos += numero_produtos;
	
	}
	
// 4 - Busca por produto
	public static void buscaPorProduto() {
		
		int i = 0, alterar;
		Scanner ler = new Scanner(System.in);
		String buscando;
		System.out.println("Digite o nome do produto:");
		buscando = ler.nextLine();
			
			while(!(buscando.equals(produto[i][0]))){
			i++;	
			if (i==50) {
				System.out.println("Produto não encontrado!");
			break;
					}		
				}
			
		if (i<50) {	
		System.out.println("Nome: "+produto[i][0] +"\n"+"Descrição: "+produto[i][1]+"\n"+"Valor: "+produto[i][2]+"\n"+"Lucro: "+produto[i][3]+"\n"+"Estoque: "+produto[i][4]);
		
		System.out.println("Deseja alterar cadastro do produto?");
		System.out.println("1 - Não");
		System.out.println("2 - Sim");
		alterar = ler.nextInt();
		
		if(alterar == 1) {
			System.out.println("Obrigada!");	
		}
		
		else if(alterar == 2) {
			
			System.out.println("Digite o nome do produto:");
			ler = new Scanner(System.in);
			produto[i][0]= ler.nextLine();
			System.out.println("Descreva o produto:");
			ler = new Scanner(System.in);
			produto[i][1]= ler.nextLine();
			System.out.println("Digite o preço do produto(coloque '.' para separar os centavos): ");
			ler = new Scanner(System.in);
			produto[i][2]= ler.nextLine();
			System.out.println("Digite a porcentagem de lucro do produto:");
			ler = new Scanner(System.in);
			produto[i][3]= ler.nextLine();
			System.out.println("Digite a quantidade:");
			ler = new Scanner(System.in);
			produto[i][4]= ler.nextLine();
		}
		
		else {
			System.out.println("Inválido!");
				}
			}	
	}
	
// 5 - Cadastro de venda
	public static void cadastroDeVenda() 
	
	{
		int cliente_venda, produto_venda, quantidade_venda, continuar_venda, manter_venda, i=0, j=0, estoque, estoque_int, zero;
		Scanner ler = new Scanner(System.in);
		System.out.println("Lista de Clientes");

		for (i = 0; i<50; i++) 
			{
				System.out.println((i+1)+"-"+cliente[i][0]); //  imprime lista de clientes
			}
		System.out.println("Selecione o usuário (digite apenas números):");
		cliente_venda = ler.nextInt()-1; //**	

		if (cliente_venda < 50) 
			{
				System.out.println("Lista de Produtos");
				for (j = 0; j<50; j++) 
					{
						System.out.println((j+1)+"-"+produto[j][0]); // imprime lista de produtos 
					}
				
				System.out.println("Selecione o produto(digite apenas números):");	
				produto_venda = ler.nextInt()-1;
				
				zero = Integer.parseInt(produto[produto_venda][4]);
				
				if(zero == 0) 
					{
						System.out.println("Produto esgotado!");
					}

				else 
					{
						if(produto_venda < 50) 
							{
								System.out.println("Quantos produtos o cliente irá comprar?(digite apenas números)");	
								quantidade_venda = ler.nextInt();
								estoque = Integer.parseInt(produto[produto_venda][4]);			
								estoque_int = estoque - quantidade_venda;

							if(estoque_int < 0) 
								{
									System.out.println("Quantidade insufienciente no estoque!");
									System.out.println("");

									System.out.println("Vai realizar a compra total do estoque?(digite apenas números)");	
									System.out.println("1 - Não");
									System.out.println("2 - Sim");	
									manter_venda = ler.nextInt();

									if (manter_venda == 2) 
										{
											produto[produto_venda][4] = "0";
										}
									else
										{
											produto[produto_venda][4] = Integer.toString(quantidade_venda + estoque);													
										}
								}

							else 
								{
									produto[produto_venda][4] = Integer.toString(estoque_int);
								}
							}

						else 
							{
								System.out.println("Produto Inválido!");
							}
					}
			}
		else 
			{
				System.out.println("Cliente Inválido!");
			}

		while(true) {
		System.out.println("Deseja continuar a comprar?(digite apenas números)");	
		System.out.println("1 - Não");
		System.out.println("2 - Sim");	
		continuar_venda = ler.nextInt();
		if (continuar_venda == 1) 
			{
				break;			
			}
		else if(continuar_venda == 2) 
			{
				j = 0;
				if (j<50) 
					{
						System.out.println("Lista de Produtos");
						for (j = 0; j<50; j++) 
							{
								System.out.println((j+1)+"-"+produto[j][0]); // imprime lista de produtos 
							}	
						System.out.println("Selecione o produto(digite apenas números):");	
						produto_venda = ler.nextInt()-1;
						
						zero = Integer.parseInt(produto[produto_venda][4]);
						if(zero == 0) 
							{
								System.out.println("Produto esgotado!");							
							}
						else 
							{
								if(produto_venda<50) 
									{
										System.out.println("Quantos produtos o cliente irá comprar?(digite apenas números)");	
										quantidade_venda = ler.nextInt();
										estoque = Integer.parseInt(produto[produto_venda][4]);
										estoque_int = estoque - quantidade_venda;
		
										if(estoque_int < 0)
											{
												System.out.println("Quantidade insufienciente no estoque!");
												System.out.println("");
		
												System.out.println("Vai realizar a compra total do estoque?(digite apenas números)");	
												System.out.println("1 - Não");
												System.out.println("2 - Sim");	
												manter_venda = ler.nextInt();
												if (manter_venda == 2) 
													{
														produto[produto_venda][4] = "0";
													}
												else 
													{
														produto[produto_venda][4] = quantidade_venda + Integer.toString(estoque_int);
													}
											}
										else 
											{
												produto[produto_venda][4] = Integer.toString(estoque_int);
											}
									}
								else 
									{
										System.out.println("Produto Inválido!");
									}
							}
					}			
			}
		else
			{
				System.out.println("Inválido!");			
			}
		}
	}
	
// 6 - Mostrar produtos em estoque
	public static void mostrarProdutosEmEstoque() {
		int i=0;
		
		for (i = 0; i<50; i++) {
			 //  imprime lista de produtos e estoque
			System.out.println("Produto:"+produto[i][0]+" | "+"Estoque:"+produto[i][4]);		
			}
		
	}

// Limpar matriz	
	public static void limpar() 
	{
		for (int i = 10; i < 50; i++) 
			{
			for (int j = 0; j < 3; j++) 
				{
					cliente [i][j] = "";
				}
			for (int k = 0; k < 5; k++) 
				{
					produto [i][k] = "";
				}
			}
	}
				
	public static void main(String[] args) {
		
		carregaCliente();
		carregaProduto();
		limpar();
		
		while(true) {			
		menu();
		System.out.println("Selecione uma opção no menu!(digite apenas números)");
		Scanner ler = new Scanner(System.in);
		int opcao = ler.nextInt();
		
		if (opcao<7) {
		
        switch(opcao)
	        {
	        		case 1:
	        	cadastroDeNovoCliente();
	            break;

	            case 2:
	            	buscaPorCliente();
	                break;

	            case 3:
	            	cadastroDeNovoProduto();
	                break;

	            case 4:
	            	buscaPorProduto();
	                break;
	            case 5:
	            	cadastroDeVenda();
	                break;
	            case 6:
	            	mostrarProdutosEmEstoque();
	                break;
	                }
        }
		
        else if(opcao == 7) {
        	break;
        		}
		
        else {
        	 System.out.println("Digite uma opcao valida\\n"); 	
        	} 			
	    } 
	}
}
