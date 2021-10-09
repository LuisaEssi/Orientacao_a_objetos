package visao;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

/**
 * Classe de construção da tela com dados dos produtos e botões para salvar, excluir, voltar, escolher lente, detalhes do oculos, detalhes da compra e finalizar compra
 * @author Luisa Caroline
 * @version Out 2021
 */
	public class TelaDadosProdutos implements ActionListener {
		private JFrame janela;
		private int estoqueContato;
		private int estoqueLente;
		private int estoqueArmacao;
		
//				------------Armacao-------
		private double valorTotalOculos; 
		
						
		private JLabel labelAClassificacao = new JLabel("Classificação: ");
		private JTextField valorAClassificacao;
		private JLabel labelAcorDaArmacao = new JLabel("Cor da Armação: ");
		private JTextField valorAcorDaArmacao;
		private JLabel labelAmaterialDaArmacao = new JLabel("Material da Armação: ");
		private JTextField valorAmaterialDaArmacao;
		private JLabel labelAmodelo = new JLabel("Modelo: ");
		private JTextField valorAmodelo;
		private JLabel labelAmarca = new JLabel("Marca: ");
		private JTextField valorAmarca;
		private JLabel labelAvalorDaArmacao = new JLabel("Valor da Armação (R$): ");
		private JTextField valorAvalorDaArmacao;
		private JLabel labelAestoqueArmacao = new JLabel("Estoque Armação: ");
		private JTextField valorAestoqueArmacao;
		
		private JLabel AClassificacao;
		private JLabel AcorDaArmacao;
		private JLabel AmaterialDaArmacao;
		private JLabel Amodelo;
		private JLabel Amarca;
		private JLabel AvalorDaArmacao;
		private JLabel AestoqueArmacao;
		
//					-----------Lente--------

		private JLabel labelLtipoDeLente = new JLabel("Tipo de Lente: ");
		private JTextField valorLtipoDeLente;
		private JLabel labelLmaterialDaLente = new JLabel("Material da Lente: ");
		private JTextField valorLmaterialDaLente;
		private JLabel labelLvalorDaLente = new JLabel("Valor da Lente (R$): ");
		private JTextField valorLvalorDaLente;
		private JLabel labelLcorDaLente = new JLabel("Cor da Lente: ");
		private JTextField valorLcorDaLente;
		private JLabel labelLlenteID = new JLabel("ID da Lente: ");
		private JTextField valorLlenteID;		
		private JLabel labelLestoqueLente = new JLabel("Estoque Lente: ");
		private JTextField valorLestoqueLente;
		
		
		private JLabel LtipoDeLente;
		private JLabel LmaterialDaLente;
		private JLabel LvalorDaLente;
		private JLabel LcorDaLente;
		private JLabel LlenteID;		
		private JLabel LestoqueLente;
		
		
//				---------------Lende de Contato ----------
		private double valorCTotalContato;
	
		private JLabel labelCmaterialDaLente = new JLabel("Material da Lente: ");
		private JTextField valorCmaterialDaLente; 
		private JLabel labelCtipoDeDescarte = new JLabel("Tipo de Descarte: ");
		private JTextField valorCtipoDeDescarte;
		private JLabel labelCmarca = new JLabel("Marca: ");
		private JTextField valorCmarca;
		private JLabel labelCcor = new JLabel("Cor: ");
		private JTextField valorCcor;
		private JLabel labelCprodutosDeHig = new JLabel("Produtos de Higiene: ");
		private JTextField valorCprodutosDeHig;
		private JLabel labelCestoqueContato = new JLabel("Estoque Lente de Contato: ");
		private JTextField valorCestoqueContato;
		private JLabel labelCvalorContato = new JLabel("Valor da Lente e Contato (R$): ");
		private JTextField valorCvalorContato;		
		
// ---------------------------Oculos -----------------------		
		
		private JLabel CmaterialDaLente; 
		private JLabel CtipoDeDescarte;
		private JLabel Cmarca;
		private JLabel Ccor;
		private JLabel CprodutosDeHig;
		private JLabel CestoqueContato;
		private JLabel CvalorContato;	
		
			
		private JButton botaoExcluir = new JButton("Excluir");
		private JButton botaoSalvar = new JButton("Salvar");
		private JButton botaoFinalizar = new JButton("Finalizar compra");
		private JButton botaoIrLente = new JButton("Escolher Lente");
		private JButton botaoVoltar = new JButton("Voltar");
		private JButton botaoDetalhesOculos = new JButton("Detalhes do Óculos");
		private JButton botaodadosReceita = new JButton("Adicionar Receita");
		private JButton botaoDetalhesCompra = new JButton("Detalhes da Compra");
		
		
		
		private String[] novoDadoArm = new String[100];
		private String[] novoDadoCon = new String[100];
		private String[] novoDadoLen = new String[100];
		private String[] novoDadoOcu = new String[100];
		
		private static ControleObjetos dados;
		
		private int posicao;
		private int opcao;
		private String s;

		/**
		 * Construção da Tela de inserir, visualizar e editar produtos (lente, lente de contato, armacao e oculos)
		 * @param op inteiro que determina a tela que vai ser exibida ao usuario
		 * @param d parametro da classe de controle objetos com os dados do objeto a ser exibido/editado
		 * @param p parametro da Tela Lista de Produtos
		 * @param pos inteiro com a posicao específica do objeto
		 */
		public void inserirEditar(int op, ControleObjetos d, 
				TelaListaProdutos p, int pos) {
		
			opcao = op;
			posicao = pos;
			dados = d;

			if (op == 1) s = "Funcionário Editar Armacao";
			if (op == 2) s = "Funcionário Cadastrar Armacao";
			if (op == 3) s = "Funcionário Editar Lente";
			if (op == 4) s = "Funcionário Cadastrar Lente";
			if (op == 5) s = "Funcionário Editar Lente de Contato";
			if (op == 6) s = "Funcionário Cadastrar Lente de Contato";
			if (op == 7) s = "Detalhes da sua Lente de Contato";
			if (op == 8) s = "Detalhes da sua Armação";	
			if (op == 9) s = "Detalhes da sua Lente";
			if (op == 10) s = "Detalhes do Óculos";
			
			janela = new JFrame(s);

			
			if (op == 1 || op == 8) {		//	"Funcionário Editar Armacao";
						
				valorAClassificacao = new JTextField(dados.getArmacao()[pos].getClassificacao(), 200);
				valorAcorDaArmacao = new JTextField(dados.getArmacao()[pos].getCorDaArmacao(), 200);
				valorAmaterialDaArmacao = new JTextField(dados.getArmacao()[pos].getMaterialDaArmacao(), 200);
				valorAmodelo = new JTextField(dados.getArmacao()[pos].getModelo(), 200);
				valorAmarca = new JTextField(dados.getArmacao()[pos].getMarca(), 200);
				valorAvalorDaArmacao = new JTextField(String.valueOf(dados.getArmacao()[pos].getValorDaArmacao()), 200);
				valorAestoqueArmacao = new JTextField(String.valueOf(dados.getArmacao()[pos].getEstoqueArmacao()), 200);
			
				
				valorCmaterialDaLente = new JTextField(200);
				valorCtipoDeDescarte = new JTextField(200);
				valorCmarca = new JTextField(200);
				valorCcor = new JTextField(200);
				valorCprodutosDeHig = new JTextField(200);
				valorCestoqueContato = new JTextField(200);
				valorCvalorContato = new JTextField(200);
				
				valorLtipoDeLente = new JTextField(200);
				valorLmaterialDaLente = new JTextField(200);
				valorLvalorDaLente = new JTextField(200);
				valorLcorDaLente = new JTextField(200);
				valorLlenteID = new JTextField(200);
				valorLestoqueLente = new JTextField(200);

		
			} else if (op == 3 || op == 9) { 	//"Funcionário Editar Lente";
				valorLtipoDeLente = new JTextField(dados.getLente()[pos].getTipoDeLente(), 200);
				valorLmaterialDaLente = new JTextField(dados.getLente()[pos].getMaterialDaLente(), 200);
				valorLvalorDaLente = new JTextField(String.valueOf(dados.getLente()[pos].getValorDaLente()), 200);
				valorLcorDaLente = new JTextField(dados.getLente()[pos].getCorDaLente(), 200);
				valorLlenteID = new JTextField(String.valueOf(dados.getLente()[pos].getLenteID()), 200);
				valorLestoqueLente = new JTextField(String.valueOf(dados.getLente()[pos].getEstoqueLente()), 200);
				
				valorCmaterialDaLente = new JTextField(200);
				valorCtipoDeDescarte = new JTextField(200);
				valorCmarca = new JTextField(200);
				valorCcor = new JTextField(200);
				valorCprodutosDeHig = new JTextField(200);
				valorCestoqueContato = new JTextField(200);
				valorCvalorContato = new JTextField(200);
						
				valorAClassificacao = new JTextField(200);
				valorAcorDaArmacao = new JTextField(200);
				valorAmaterialDaArmacao = new JTextField(200);
				valorAmodelo = new JTextField(200);
				valorAmarca = new JTextField(200);
				valorAvalorDaArmacao = new JTextField(200);
				valorAestoqueArmacao = new JTextField(200);
								
			
		
			} else if (op == 5 || op == 7) { //"Funcionário Editar Lente de Contato";
				valorLtipoDeLente = new JTextField(200);
				valorLmaterialDaLente = new JTextField(200);
				valorLvalorDaLente = new JTextField(200);
				valorLcorDaLente = new JTextField(200);
				valorLlenteID = new JTextField(200);
				valorLestoqueLente = new JTextField(200);
				
				valorAClassificacao = new JTextField(200);
				valorAcorDaArmacao = new JTextField(200);
				valorAmaterialDaArmacao = new JTextField(200);
				valorAmodelo = new JTextField(200);
				valorAmarca = new JTextField(200);
				valorAvalorDaArmacao = new JTextField(200);
				valorAestoqueArmacao = new JTextField(200);
				
				valorCmaterialDaLente = new JTextField(dados.getContato()[pos].getMaterialDaLente(), 200);
				valorCtipoDeDescarte = new JTextField(dados.getContato()[pos].getTipoDeDescarte(), 200);
				valorCmarca = new JTextField(dados.getContato()[pos].getMarca(), 200);
				valorCcor = new JTextField(dados.getContato()[pos].getCor(), 200);
				valorCprodutosDeHig = new JTextField(dados.getContato()[pos].getProdutosDeHig(), 200);
				valorCestoqueContato = new JTextField(String.valueOf(dados.getContato()[pos].getEstoqueContato()), 200);
				valorCvalorContato = new JTextField(String.valueOf(dados.getContato()[pos].getValorContato()), 200);
				
				
			} else if(op ==10) {
				
				valorAClassificacao = new JTextField(dados.getArmacao()[pos].getClassificacao(), 200);
				valorAcorDaArmacao = new JTextField(dados.getArmacao()[TelaListaProdutos.getPosicaoArmacao()].getCorDaArmacao(), 200);
				valorLtipoDeLente = new JTextField(dados.getLente()[TelaListaProdutos.getPosicaoLente()].getTipoDeLente(), 200);
				
				valorCmaterialDaLente = new JTextField(200);
				valorCtipoDeDescarte = new JTextField(200);
				valorCmarca = new JTextField(200);
				valorCcor = new JTextField(200);
				valorCprodutosDeHig = new JTextField(200);
				valorCestoqueContato = new JTextField(200);
				valorCvalorContato = new JTextField(200);	
						
				valorAmaterialDaArmacao = new JTextField(200);
				valorAmodelo = new JTextField(200);
				valorAmarca = new JTextField(200);
				valorAvalorDaArmacao = new JTextField(200);
				valorAestoqueArmacao = new JTextField(200);
				
				valorLmaterialDaLente = new JTextField(200);
				valorLvalorDaLente = new JTextField(200);
				valorLcorDaLente = new JTextField(200);
				valorLlenteID = new JTextField(200);
				valorLestoqueLente = new JTextField(200);
				
			}
			
			else {//Não preenche com dados op == 6, 2 e 4

				 //"Funcionário Cadastra Lente de Contato";
				valorCmaterialDaLente = new JTextField(200);
				valorCtipoDeDescarte = new JTextField(200);
				valorCmarca = new JTextField(200);
				valorCcor = new JTextField(200);
				valorCprodutosDeHig = new JTextField(200);
				valorCestoqueContato = new JTextField(200);
				valorCvalorContato = new JTextField(200);	
								
				//  //"Funcionário Cadastrar Armacao";
				valorAClassificacao = new JTextField(200);
				valorAcorDaArmacao = new JTextField(200);
				valorAmaterialDaArmacao = new JTextField(200);
				valorAmodelo = new JTextField(200);
				valorAmarca = new JTextField(200);
				valorAvalorDaArmacao = new JTextField(200);
				valorAestoqueArmacao = new JTextField(200);
				
				
				//"Funcionário Cadastra Lente";
				valorLtipoDeLente = new JTextField(200);
				valorLmaterialDaLente = new JTextField(200);
				valorLvalorDaLente = new JTextField(200);
				valorLcorDaLente = new JTextField(200);
				valorLlenteID = new JTextField(200);
				valorLestoqueLente = new JTextField(200);
				}								
			
//			-------------------BOUNDS-----------------------
			
			// --------------Label e Field de Armacao
			labelAClassificacao.setBounds(20, 20, 150, 25);
			valorAClassificacao.setBounds(200, 20, 180, 25);
						
			labelAcorDaArmacao.setBounds(20, 50, 150, 25);
			valorAcorDaArmacao.setBounds(200, 50, 180, 25);
					
			labelAmaterialDaArmacao.setBounds(20, 80, 150, 25);
			valorAmaterialDaArmacao.setBounds(200, 80, 180, 25);
			
			
			labelAmarca.setBounds(20, 110, 150, 25);
			valorAmarca.setBounds(200, 110, 180, 25);
			
			labelAmodelo.setBounds(20, 140, 150, 25);
			valorAmodelo.setBounds(200, 140, 180, 25);
			
			labelAvalorDaArmacao.setBounds(20, 170, 150, 25);
			valorAvalorDaArmacao.setBounds(200, 170, 180, 25);
			
			labelAestoqueArmacao.setBounds(20, 200, 150, 25);
			valorAestoqueArmacao.setBounds(200, 200, 180, 25);	
			
		
		// --------------Label e Field de Lente

			valorLtipoDeLente.setBounds(200, 20, 180, 25);	
			
			labelLmaterialDaLente.setBounds(20, 50, 150, 25);
			valorLmaterialDaLente.setBounds(200, 50, 180, 25);	
		
			labelLvalorDaLente.setBounds(20, 140, 150, 25);
			valorLvalorDaLente.setBounds(200, 140, 180, 25);
			
			labelLcorDaLente.setBounds(20, 110, 150, 25);
			valorLcorDaLente.setBounds(200, 110, 180, 25);
			
			labelLlenteID.setBounds(20, 80, 150, 25);
			valorLlenteID.setBounds(200, 80, 180, 25);
			
			labelLestoqueLente.setBounds(20, 170, 150, 25);
			valorLestoqueLente.setBounds(200, 170, 180, 25);
			
		// --------------Label e Field de Contato
			
			labelCmaterialDaLente.setBounds(20, 20, 180, 25);
			valorCmaterialDaLente.setBounds(200, 20, 180, 25);
			
			labelCtipoDeDescarte.setBounds(20, 50, 150, 25);
			valorCtipoDeDescarte.setBounds(200, 50, 180, 25);
			
			labelCmarca.setBounds(20, 80, 150, 25);
			valorCmarca.setBounds(200, 80, 180, 25);	
			
			labelCcor.setBounds(20, 110, 150, 25);
			valorCcor.setBounds(200, 110, 180, 25);	
			
			labelCprodutosDeHig.setBounds(20, 140, 150, 25);
			valorCprodutosDeHig.setBounds(200, 140, 180, 25);
			
			labelCestoqueContato.setBounds(20, 170, 150, 25);
			valorCestoqueContato.setBounds(200, 170, 180, 25);
			
			labelCvalorContato.setBounds(20, 200, 150, 25);
			valorCvalorContato.setBounds(200, 200, 180, 25);	
			
//		----------- BOUNDS BOTÕES
			
			botaoVoltar.setBounds(40, 230, 120,30);	
			botaoFinalizar.setBounds(200, 230, 180,30);	
			botaodadosReceita.setBounds(20, 270, 160,30);	
			botaoDetalhesCompra.setBounds(200, 270, 180,30);	
			botaoIrLente.setBounds(180, 230, 200,30);
			botaoSalvar.setBounds(90, 230, 100, 30);
			botaoExcluir.setBounds(210, 230, 100, 30);
			botaoDetalhesOculos.setBounds(180, 230, 200,30);
				
			valorCTotalContato = dados.getContato()[pos].getValorContato();
			
//			------------------ADD JANELA ---------------------------
//			-------------Edição e Cadastros----------------
			
			if (op == 1 || op == 2) { //editar e cadastrar armacao

				this.janela.add(labelAClassificacao);
				this.janela.add(valorAClassificacao);
				this.janela.add(labelAcorDaArmacao);
				this.janela.add(valorAcorDaArmacao);
				this.janela.add(labelAmaterialDaArmacao);
				this.janela.add(valorAmaterialDaArmacao);
				this.janela.add(labelAmodelo);
				this.janela.add(valorAmodelo);	
				this.janela.add(labelAmarca);
				this.janela.add(valorAmarca);			
				this.janela.add(labelAvalorDaArmacao);
				this.janela.add(valorAvalorDaArmacao);
				this.janela.add(labelAestoqueArmacao);
				this.janela.add(valorAestoqueArmacao);
				if (op == 1) {
					this.janela.add(botaoExcluir);		
					botaoExcluir.addActionListener(this);
				}
				this.janela.add(botaoSalvar);
				botaoSalvar.addActionListener(this);
				
				
			}

			// editar e cadastrar lente 
			if( op == 3 || op == 4) {
				labelLtipoDeLente.setBounds(20, 20, 150, 25);
				this.janela.add(labelLtipoDeLente);
				this.janela.add(valorLtipoDeLente);
				this.janela.add(labelLmaterialDaLente);
				this.janela.add(valorLmaterialDaLente);
				this.janela.add(labelLvalorDaLente);
				this.janela.add(valorLvalorDaLente);
				this.janela.add(labelLcorDaLente);
				this.janela.add(valorLcorDaLente);
				this.janela.add(labelLlenteID);
				this.janela.add(valorLlenteID);
				this.janela.add(labelLestoqueLente);
				this.janela.add(valorLestoqueLente);
				
				if (op == 3) {
					
					this.janela.add(botaoExcluir);
					botaoExcluir.addActionListener(this);
				}
				this.janela.add(botaoSalvar);
				botaoSalvar.addActionListener(this);
				
			}		

			// editar e cadastrar lente de contato
			if(op == 5 || op == 6) {
				
				this.janela.add(labelCmaterialDaLente);
				this.janela.add(valorCmaterialDaLente);
				this.janela.add(labelCtipoDeDescarte);
				this.janela.add(valorCtipoDeDescarte);
				this.janela.add(labelCcor);
				this.janela.add(valorCcor);	
				this.janela.add(labelCprodutosDeHig);
				this.janela.add(valorCprodutosDeHig);
				this.janela.add(labelCmarca);
				this.janela.add(valorCmarca);	
				this.janela.add(labelCvalorContato );
				this.janela.add(valorCvalorContato );
				this.janela.add(labelCestoqueContato );
				this.janela.add(valorCestoqueContato );
				
				if(op == 5){ 
					this.janela.add(botaoExcluir);	
					botaoExcluir.addActionListener(this);	
				}
				this.janela.add(botaoSalvar);							
				botaoSalvar.addActionListener(this);
				
			}

//				  ---------------Exibição de Dados------------
			
			if (op == 7) {		//Exibir Lente de contato e finalizar compra
				
				CmaterialDaLente = new JLabel(dados.getContato()[pos].getMaterialDaLente());
				CtipoDeDescarte = new JLabel(dados.getContato()[pos].getTipoDeDescarte());
				Cmarca =new JLabel(dados.getContato()[pos].getMarca());
				Ccor = new JLabel(dados.getContato()[pos].getCor());
				CprodutosDeHig = new JLabel(dados.getContato()[pos].getProdutosDeHig());
				CestoqueContato = new JLabel(String.valueOf(dados.getContato()[pos].getEstoqueContato()));
				CvalorContato = new JLabel(String.valueOf(dados.getContato()[pos].getValorContato()));
				
				CmaterialDaLente.setBounds(200, 20, 180, 25);
				CtipoDeDescarte.setBounds(200, 50, 180, 25);
				Cmarca.setBounds(200, 80, 180, 25);
				Ccor.setBounds(200, 110, 180, 25);	
				CprodutosDeHig.setBounds(200, 140, 180, 25);
				CestoqueContato.setBounds(200, 170, 180, 25);
				CvalorContato.setBounds(200, 200, 180, 25);
				
				this.janela.add(labelCmaterialDaLente);
				this.janela.add(CmaterialDaLente);
				this.janela.add(labelCtipoDeDescarte);
				this.janela.add(CtipoDeDescarte);
				this.janela.add(labelCcor);
				this.janela.add(Ccor);	
				this.janela.add(labelCmarca);
				this.janela.add(Cmarca);
				this.janela.add(labelCprodutosDeHig);
				this.janela.add(CprodutosDeHig);
				this.janela.add(labelCvalorContato);
				this.janela.add(CvalorContato);
				this.janela.add(labelCestoqueContato);
				this.janela.add(CestoqueContato);
								
				this.janela.add(botaoFinalizar);
				this.janela.add(botaoVoltar);
				this.janela.add(botaodadosReceita);
				this.janela.add(botaoDetalhesCompra);
				
				botaodadosReceita.addActionListener(this);
				botaoDetalhesCompra.addActionListener(this);				
				botaoFinalizar.addActionListener(this);	
				botaoVoltar.addActionListener(this);		

				
			}
			
			if (op == 8) { // exibir Armacao
				
				AClassificacao = new JLabel(dados.getArmacao()[pos].getClassificacao());
				AcorDaArmacao = new JLabel(dados.getArmacao()[pos].getCorDaArmacao());
				AmaterialDaArmacao = new JLabel(dados.getArmacao()[pos].getMaterialDaArmacao());
				Amodelo = new JLabel (dados.getArmacao()[pos].getModelo());
				Amarca = new JLabel(dados.getArmacao()[pos].getMarca());
				AvalorDaArmacao = new JLabel(String.valueOf(dados.getArmacao()[pos].getValorDaArmacao()));
				AestoqueArmacao = new JLabel(String.valueOf(dados.getArmacao()[pos].getEstoqueArmacao()));

				AClassificacao.setBounds(200, 20, 180, 25);			
				AcorDaArmacao.setBounds(200, 50, 180, 25);
				AmaterialDaArmacao.setBounds(200, 80, 180, 25);
				Amarca.setBounds(200, 110, 180, 25);
				Amodelo.setBounds(200, 140, 180, 25);
				AvalorDaArmacao.setBounds(200, 170, 180, 25);
				AestoqueArmacao.setBounds(200, 200, 180, 25);	
				
				this.janela.add(labelAClassificacao);
				this.janela.add(AClassificacao);
				this.janela.add(labelAcorDaArmacao);
				this.janela.add(AcorDaArmacao);
				this.janela.add(labelAmaterialDaArmacao);
				this.janela.add(AmaterialDaArmacao);
				this.janela.add(labelAmodelo);
				this.janela.add(Amodelo);	
				this.janela.add(labelAmarca);
				this.janela.add(Amarca);			
				this.janela.add(labelAvalorDaArmacao);
				this.janela.add(AvalorDaArmacao);
				this.janela.add(labelAestoqueArmacao);
				this.janela.add(AestoqueArmacao);
				
				this.janela.add(botaoIrLente);
				this.janela.add(botaoVoltar);
				
				botaoIrLente.addActionListener(this);	
				botaoVoltar.addActionListener(this);

				
			}
			
			
			// exibir lente
			if (op == 9) { 
				
				labelLtipoDeLente.setBounds(20, 20, 150, 25);
				LtipoDeLente = new JLabel (dados.getLente()[pos].getTipoDeLente());
				LmaterialDaLente = new JLabel(dados.getLente()[pos].getMaterialDaLente());
				LvalorDaLente = new JLabel(String.valueOf(dados.getLente()[pos].getValorDaLente()));
				LcorDaLente = new JLabel(dados.getLente()[pos].getCorDaLente());
				LlenteID = new JLabel(String.valueOf(dados.getLente()[pos].getLenteID()));
				LestoqueLente = new JLabel(String.valueOf(dados.getLente()[pos].getEstoqueLente()));
			
				LtipoDeLente.setBounds(200, 20, 180, 25);
				LmaterialDaLente.setBounds(200, 50, 180, 25);	
				LvalorDaLente.setBounds(200, 140, 180, 25);
				LcorDaLente.setBounds(200, 110, 180, 25);
				LlenteID.setBounds(200, 80, 180, 25);
				LestoqueLente.setBounds(200, 170, 180, 25);
				
				this.janela.add(labelLtipoDeLente);
				this.janela.add(LtipoDeLente);
				this.janela.add(labelLmaterialDaLente);
				this.janela.add(LmaterialDaLente);
				this.janela.add(labelLvalorDaLente);
				this.janela.add(LvalorDaLente);				
				this.janela.add(labelLcorDaLente);
				this.janela.add(LcorDaLente);
				this.janela.add(labelLlenteID);
				this.janela.add(LlenteID);
				this.janela.add(labelLestoqueLente);
				this.janela.add(LestoqueLente);

				
				this.janela.add(botaoVoltar);				
				this.janela.add(botaoDetalhesOculos);
	
				botaoDetalhesOculos.addActionListener(this);
				botaoVoltar.addActionListener(this);	

			}
	 
////			//exibir oculos e finalizar compra	
			if (op == 10) { 
				
				labelLtipoDeLente.setBounds(20, 80, 180, 25);
				valorTotalOculos = ControleOculos.getValorOculos((dados.getLente()[TelaListaProdutos.getPosicaoLente()]),
						(dados.getArmacao()[TelaListaProdutos.getPosicaoArmacao()]));
				
				AClassificacao = new JLabel(dados.getArmacao()[TelaListaProdutos.getPosicaoArmacao()].getClassificacao());
				AcorDaArmacao = new JLabel( dados.getArmacao()[TelaListaProdutos.getPosicaoArmacao()].getCorDaArmacao());
				LtipoDeLente = new JLabel(dados.getLente()[TelaListaProdutos.getPosicaoLente()].getTipoDeLente());
				
				AClassificacao.setBounds(200, 20, 180, 25);			
				AcorDaArmacao.setBounds(200, 50, 180, 25);
				LtipoDeLente.setBounds(200, 80, 180, 25);
				
				this.janela.add(labelAClassificacao);
				this.janela.add(AClassificacao);
				this.janela.add(labelAcorDaArmacao);
				this.janela.add(AcorDaArmacao);
				this.janela.add(labelLtipoDeLente);
				this.janela.add(LtipoDeLente);	
//					
				
				this.janela.add(botaoVoltar);				
				this.janela.add(botaoFinalizar);
				this.janela.add(botaodadosReceita);
				this.janela.add(botaoDetalhesCompra);
				
				botaodadosReceita.addActionListener(this);
				botaoDetalhesCompra.addActionListener(this);
				botaoFinalizar.addActionListener(this);
				botaoVoltar.addActionListener(this);
				
				}
				
							
			this.janela.setLayout(null);

			this.janela.setSize(400, 340);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			this.janela.setVisible(true);

			botaoSalvar.addActionListener(this);
			botaoExcluir.addActionListener(this);


			
		}
		
	/**
	 * Metodo para pegar acao em um botão
	 * Os botões são:
	 * (1) Salvar, que salva alterações ou edições de uma armação, lente ou lente de contato
	 * (2) Excluir, que exclui uma armação, lente ou lente de contato
	 * (4) Finalizar compra, que finaliza a compra de algum produto
	 * (3) Escolher Lente, que direciona o usuário para lista de lente após a escolha de uma armação
	 * (4) Voltar, que volta para tela anterior
	 * (5) Detalhes do Óculos, que exibe um resumo do óculos comprado
 	 * (6) Adicionar Receita, que recebe as informações de receita do usuário (não implementado)
	 * (7) Detalhes da Compra, onde é exibido um resumo da compra do cliente.
	 */
		
	@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
		if(src == botaoSalvar) {
				try {
					boolean res=false; 
					if(opcao == 2) {//cadastro de novo aramcao
						novoDadoArm[0] = Integer.toString(dados.getQtdarmacao());
					}
					else if (opcao == 4) { // cadastro de novo Lente
						novoDadoLen[0] = Integer.toString(dados.getQtdlente());
					}
					else if (opcao == 6) { // cadastro de novo Lente de contato
						novoDadoCon[0] = Integer.toString(dados.getQtdcontato());
					}
					else {// edicao de dado existente
						novoDadoArm[0] = Integer.toString(posicao);
						novoDadoCon[0] = Integer.toString(posicao);
						novoDadoLen[0] = Integer.toString(posicao);
						novoDadoOcu[0] = Integer.toString(posicao);
						}

					
					if (opcao == 1 || opcao == 2) {				
					
					novoDadoArm[1] =  valorAClassificacao.getText();
					novoDadoArm[2] =  valorAcorDaArmacao.getText();
					novoDadoArm[3] =  valorAmaterialDaArmacao.getText();
					novoDadoArm[4] =  valorAmodelo.getText();
					novoDadoArm[5] =  valorAmarca.getText();
					novoDadoArm[6] =  valorAvalorDaArmacao.getText();
					novoDadoArm[7] =  valorAestoqueArmacao.getText();
					res = dados.inserirEditarArmacao(novoDadoArm);
				
					} else if (opcao == 3 || opcao == 4) {
						
					novoDadoLen[1] =  valorLtipoDeLente.getText();
					novoDadoLen[2] =  valorLmaterialDaLente.getText();
					novoDadoLen[3] =  valorLvalorDaLente.getText();
					novoDadoLen[4] =  valorLcorDaLente.getText();
					novoDadoLen[5] =  valorLlenteID.getText();
					novoDadoLen[6] =  valorLestoqueLente.getText();
					res = dados.inserirEditarLente(novoDadoLen);
						
					}		
					
					else if(opcao == 5 || opcao == 6) {
						novoDadoCon[1] =  valorCmaterialDaLente.getText();
						novoDadoCon[2] =  valorCtipoDeDescarte.getText();
						novoDadoCon[3] =  valorCmarca.getText();
						novoDadoCon[4] =  valorCcor.getText();
						novoDadoCon[5] =  valorCprodutosDeHig.getText();
						novoDadoCon[6] =  valorCestoqueContato.getText();
						novoDadoCon[7] =  valorCvalorContato.getText();
						res = dados.inserirEditarLenteDeContato(novoDadoCon);

					}
					else if (opcao == 8 || opcao == 9) {
					novoDadoOcu[1] =  valorLtipoDeLente.getText();
					novoDadoOcu[2] =  valorLmaterialDaLente.getText();
					novoDadoOcu[3] =  valorLvalorDaLente.getText();
					novoDadoOcu[4] =  valorLcorDaLente.getText();
					novoDadoOcu[5] =  valorLlenteID.getText();
					novoDadoOcu[6] =  valorLestoqueLente.getText();
					novoDadoOcu[7] =  valorAClassificacao.getText();
					novoDadoArm[8] =  valorAcorDaArmacao.getText();
					novoDadoArm[9] =  valorAmaterialDaArmacao.getText();
					novoDadoArm[10] =  valorAmodelo.getText();
					novoDadoArm[11] =  valorAmarca.getText();
					novoDadoArm[12] =  valorAvalorDaArmacao.getText();
					novoDadoArm[13] =  valorAestoqueArmacao.getText();
					
					res = dados.inserirOculos(novoDadoCon);
					}

				if(res) {
						mensagemSucessoCadastro();
					}
						else mensagemErroCadastro();
				} 
				catch (NullPointerException exc1) {
					mensagemErroCadastro();
				}
				catch (NumberFormatException exc1) {
				mensagemErroCadastro();
			}			
			
			
			}

		if(src == botaoExcluir) {
				boolean res = false;

				if (opcao == 1) {//exclui armacao
					res = dados.removerArmacao(posicao);
					if (res) mensagemSucessoExclusao(); 

				}
					
				if (opcao == 3){ //exclui Lente
					res = dados.removerLente(posicao);
					if (res) mensagemSucessoExclusao(); 
	 
				}
				
				if (opcao == 5){ //exclui Lente de contato
					res = dados.removerContato(posicao);
					if (res) mensagemSucessoExclusao(); 
	 
				}
				janela.dispose();
			}
		
		
		if(src == botaoIrLente) {
			if((dados.getArmacao()[TelaListaProdutos.getPosicaoArmacao()].getEstoqueArmacao())>0) {
				new TelaListaProdutos().mostrarDados(dados, 7); //abre lista de lentes disponíveis
				janela.dispose();
			}
			else {
				fimDeEstoque();
				}
			}
			
		if(src == botaoDetalhesOculos) {	 // vai para case e volta para exibir dados básicos do oculos
			if((dados.getLente()[TelaListaProdutos.getPosicaoLente()].getEstoqueLente()) > 0) {
				
				new TelaListaProdutos().mostrarDados(dados, 8);

				janela.dispose();
			}
			else {
				fimDeEstoque();
				}
		}
			
		if(src == botaoFinalizar) { // finaliza compras
			
			
		
				if (opcao == 7) { // finaliza compra de Lente de Contato
					
					if((dados.getContato()[posicao].getEstoqueContato()) > 0) {
					valorCompraLenteDeContato();	
					// Subtrai do estoque da Lente de contato
					estoqueContato = (dados.getContato()[posicao].getEstoqueContato()) - 1;
					dados.getContato()[posicao].setEstoqueContato(estoqueContato);
					}
				
				else {
					fimDeEstoque();
					}
				}
				
				if (opcao == 10) { // finaliza compra de Óculos
					
					valorCompraOculos();	
					// Subtrai do estoque da Lente 
					estoqueLente = (dados.getLente()[TelaListaProdutos.getPosicaoLente()].getEstoqueLente()) - 1;
					dados.getLente()[TelaListaProdutos.getPosicaoLente()].setEstoqueLente(estoqueLente);
					// Subtrai do estoque da Armacao
					estoqueArmacao = (dados.getArmacao()[TelaListaProdutos.getPosicaoArmacao()].getEstoqueArmacao()) - 1;
					dados.getArmacao()[TelaListaProdutos.getPosicaoArmacao()].setEstoqueArmacao(estoqueArmacao);
					
				}
				
				janela.dispose();
					}
			
			
			
			
		if(src == botaoVoltar) {
				
				if (opcao == 7) {		// volta para opção de escolher lente de contato
					
					new TelaListaProdutos().mostrarDados(dados, 1);
					janela.dispose();
				}
				if (opcao == 8) {		// volta para opção de escolher armação
					
					new TelaListaProdutos().mostrarDados(dados, 2); 
					janela.dispose();
				}
				
				if (opcao == 9) { 		// volta para opção de escolher lente
					
					new TelaListaProdutos().mostrarDados(dados, 7);
					janela.dispose();
				}
				
			}	

			
		if(src == botaodadosReceita) {
				
				mensagemDeNaoImplementacao(); //áreas não implementadas
		}
		if(src == botaoDetalhesCompra) {
				
				mensagemDeNaoImplementacao(); //áreas não implementadas
		}
			
		}

		/**
		 * Mensagem de dados excluidos com sucesso
		 */
		public void mensagemSucessoExclusao() {
			JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
					JOptionPane.INFORMATION_MESSAGE);
//			janela.dispose();
		}

		/**
		 * Mensagem de dados salvos com sucesso
		 */
		public void mensagemSucessoCadastro() {
			JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
					JOptionPane.INFORMATION_MESSAGE);
//			janela.dispose();
		}

		/**
		 * Mensagem de erro a salvar 
		 */
		public void mensagemErroCadastro() {
			JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
					+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
					+ "1. O estoque, ID e/ou o valor não estão preenchidos com números \n"
					+"2. Os dados podem estar vazios \n", null, 
					JOptionPane.ERROR_MESSAGE);
//			janela.dispose();
		}

		/**
		 * Mensagem valor da lente de contato
		 */
		public void valorCompraLenteDeContato() {
			JOptionPane.showMessageDialog(null, "O valor da sua Lente de Contato é de R$ " 
					+ valorCTotalContato, null, 
					JOptionPane.INFORMATION_MESSAGE);
		
			janela.dispose();
		}

		/**
		 * Mensagem de valor do oculos
		 */
		public void valorCompraOculos() {
				JOptionPane.showMessageDialog(null, "O valor do seu Óculos é de R$ " 
					+ valorTotalOculos, null, 
					JOptionPane.INFORMATION_MESSAGE);	
			
			janela.dispose();
			
		}		

		/**
		 * Mensagem de fim do estoque do produto
		 */
		public void fimDeEstoque() {
			JOptionPane.showMessageDialog(null, "Não possui estoque deste produto \n", null, 
					JOptionPane.INFORMATION_MESSAGE);	
			}
		
		/**
		 * Mensagem de não implementação da classe
		 */
		public void mensagemDeNaoImplementacao() {
			JOptionPane.showMessageDialog(null, "Não foram implementadas as funcionalidades\n"
					+ "relacionadas a Dados da Receita e Detalhes da Compra", null, 
					JOptionPane.INFORMATION_MESSAGE);
//			janela.dispose();
		}
		
}
