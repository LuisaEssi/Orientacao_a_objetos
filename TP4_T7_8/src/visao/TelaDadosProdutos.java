package visao;

import java.awt.Component;
import java.awt.event.ActionEvent;



import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

	public class TelaDadosProdutos implements ActionListener {
		
//				------------Armacao-------
		private JLabel labelOTotalOculos = new JLabel("Valor Óculos: ");
		private JTextField valorOTotalOculos;
		
//		private double valorTotalOculos = 0.0;
		private JFrame janela;
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
		
		
//				---------------Lende de Contato ----------
		
	
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
			
		private JButton botaoExcluir = new JButton("Excluir");
		private JButton botaoSalvar = new JButton("Salvar");
		private JButton botaoFinalizar = new JButton("Finalizar compra");
//		private JButton botaoAddproduto = new JButton("Add Produto");
		
		private String[] novoDadoArm = new String[100]; //???/
		private String[] novoDadoCon = new String[100];
		private String[] novoDadoLen = new String[100];
		
		private JLabel material = new JLabel();
				
		private static ControleObjetos dados;
		
		private int posicao;
		private int opcao;
		private String s;
		
		

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
			if (op == 7) s = "Detalhes de sua compra";
			if (op == 8) s = "Detalhes de sua compra";	

			
			janela = new JFrame(s);

			
			if (op == 1 || op == 8) {		//	"Funcionário Editar Armacao";
						
				valorAClassificacao = new JTextField(dados.getArmacao()[pos].getClassificacao(), 200);
				valorAcorDaArmacao = new JTextField(dados.getArmacao()[pos].getCorDaArmacao(), 200);
				valorAmaterialDaArmacao = new JTextField(dados.getArmacao()[pos].getMaterialDaArmacao(), 200);
				valorAmodelo = new JTextField(dados.getArmacao()[pos].getModelo(), 200);
				valorAmarca = new JTextField(dados.getArmacao()[pos].getMarca(), 200);
				valorAvalorDaArmacao = new JTextField(String.valueOf(dados.getArmacao()[pos].getValorDaArmacao()), 200);
				valorAestoqueArmacao = new JTextField(String.valueOf(dados.getArmacao()[pos].getEstoqueArmacao()), 200);
				
				material = new JLabel ();
				
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
		
			} else if (op == 3 || op == 8) { 	//"Funcionário Editar Lente";
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
				
				material = new JLabel ();
				
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
				
				material = new JLabel (dados.getContato()[pos].getMaterialDaLente());
				//material.setAlignmentX(Component.RIGHT_ALIGNMENT);
				
				valorCtipoDeDescarte = new JTextField(dados.getContato()[pos].getTipoDeDescarte(), 200);
				valorCmarca = new JTextField(dados.getContato()[pos].getMarca(), 200);
				valorCcor = new JTextField(dados.getContato()[pos].getCor(), 200);
				valorCprodutosDeHig = new JTextField(dados.getContato()[pos].getProdutosDeHig(), 200);
				valorCestoqueContato = new JTextField(String.valueOf(dados.getContato()[pos].getEstoqueContato()), 200);
				valorCvalorContato = new JTextField(String.valueOf(dados.getContato()[pos].getValorContato()), 200);
				
			} else {//Não preenche com dados

				 //"Funcionário Cadastra Lente de Contato";
				valorCmaterialDaLente = new JTextField(200);
				valorCtipoDeDescarte = new JTextField(200);
				valorCmarca = new JTextField(200);
				valorCcor = new JTextField(200);
				valorCprodutosDeHig = new JTextField(200);
				valorCestoqueContato = new JTextField(200);
				valorCvalorContato = new JTextField(200);	
				
				material = new JLabel ();
				
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
			// --------------Label e Field de Armacao
			labelAClassificacao.setBounds(20, 20, 150, 25);
			valorAClassificacao.setBounds(200, 20, 180, 25);
			
			labelAcorDaArmacao.setBounds(20, 50, 150, 25);
			valorAcorDaArmacao.setBounds(200, 50, 180, 25);
			
			labelAmaterialDaArmacao.setBounds(20, 80, 150, 25);
			valorAmaterialDaArmacao.setBounds(200, 80, 180, 25);
			
			labelAmarca.setBounds(20, 110, 150, 25);
			valorAmarca.setBounds(200, 110, 180, 25);
			
			labelAmodelo.setBounds(20, 110, 150, 25);
			valorAmodelo.setBounds(200, 110, 180, 25);
			
			labelAvalorDaArmacao.setBounds(20, 140, 150, 25);
			valorAvalorDaArmacao.setBounds(200, 140, 180, 25);
			
			labelAestoqueArmacao.setBounds(20, 170, 180, 25);
			valorAestoqueArmacao.setBounds(200, 170, 180, 25);	
			
		
		// --------------Label e Field de Lente
			
			labelLtipoDeLente.setBounds(20, 200, 150, 25);
			valorLtipoDeLente.setBounds(200, 200, 180, 25);	
			
			labelLmaterialDaLente.setBounds(20, 230, 150, 25);
			valorLmaterialDaLente.setBounds(200, 230, 180, 25);	
			
			labelLvalorDaLente.setBounds(20, 20, 150, 25);
			valorLvalorDaLente.setBounds(200, 20, 180, 25);
			
			labelLcorDaLente.setBounds(20, 130, 150, 25);
			valorLcorDaLente.setBounds(200, 200, 180, 25);
			
			labelLlenteID.setBounds(20, 50, 150, 25);
			valorLlenteID.setBounds(200, 50, 180, 25);
			
			labelLestoqueLente.setBounds(20, 80, 150, 25);
			valorLestoqueLente.setBounds(200, 80, 180, 25);
		
		// --------------Label e Field de Contato
			
			labelCmaterialDaLente.setBounds(20, 110, 150, 25);
			labelCmaterialDaLente.setBounds(200, 110, 180, 25);
			valorCmaterialDaLente.setBounds(200, 110, 180, 25);
			
			labelCtipoDeDescarte.setBounds(20, 140, 150, 25);
			valorCtipoDeDescarte.setBounds(200, 140, 180, 25);
			
			labelCmarca.setBounds(20, 200, 150, 25);
			valorCmarca.setBounds(200, 200, 180, 25);	
			
			labelCcor.setBounds(20, 230, 150, 25);
			valorCcor.setBounds(200, 230, 180, 25);	
			
			labelCprodutosDeHig.setBounds(20, 20, 150, 25);
			valorCprodutosDeHig.setBounds(200, 20, 180, 25);
			
			labelCestoqueContato.setBounds(20, 50, 150, 25);
			valorCestoqueContato.setBounds(200, 50, 180, 25);
			
			labelCvalorContato.setBounds(20, 80, 150, 25);
			valorCvalorContato.setBounds(200, 80, 180, 25);	
			
			botaoFinalizar.setBounds(120, 175, 200,30);	
			botaoSalvar.setBounds(10, 175, 100, 30);
			botaoExcluir.setBounds(120, 175, 100, 30);
			
//			}
			
//			
//			else //if (op == 7) {				
//				valorCmaterialDaLente = new JTextField(dados.getContato()[pos].getMaterialDaLente(), 200);
//				valorCtipoDeDescarte = new JTextField(dados.getContato()[pos].getTipoDeDescarte(), 200);
//				valorCmarca = new JTextField(dados.getContato()[pos].getMarca(), 200);
//				valorCcor = new JTextField(dados.getContato()[pos].getCor(), 200);
//				valorCprodutosDeHig = new JTextField(dados.getContato()[pos].getProdutosDeHig(), 200);
//				valorCestoqueContato = new JTextField(String.valueOf(dados.getContato()[pos].getEstoqueContato()), 200);
//				valorCvalorContato = new JTextField(String.valueOf(dados.getContato()[pos].getValorContato()), 200);
//			// Inserir Dados
//				
//				this.janela.add(labelCmaterialDaLente);
//				this.janela.add(valorCmaterialDaLente);
//				this.janela.add(labelCtipoDeDescarte);
//				this.janela.add(valorCtipoDeDescarte);
//				this.janela.add(labelCcor);
//				this.janela.add(valorCcor);		
//				this.janela.add(labelCvalorContato );
//				this.janela.add(valorCvalorContato );
//				
//				botaoFinalizar.setBounds(230, 175, 200,30);	
//				
//				this.janela.add(botaoFinalizar);
//								
//				this.janela.setLayout(null);
//
//				this.janela.setSize(1000, 400);
//				this.janela.setVisible(true);
//
//				botaoFinalizar.addActionListener(this);		
//					
//				
//			}
//			
//			else {
//				valorAClassificacao = new JTextField(dados.getArmacao()[pos].getClassificacao(), 200);
//				valorAcorDaArmacao = new JTextField(dados.getArmacao()[pos].getCorDaArmacao(), 200);
//				valorLtipoDeLente = new JTextField(dados.getLente()[pos].getTipoDeLente(), 200);
//				valorAvalorDaArmacao = new JTextField(String.valueOf(dados.getArmacao()[pos].getValorDaArmacao()), 200);
//				valorLvalorDaLente = new JTextField(String.valueOf(dados.getLente()[pos].getValorDaLente()), 200);	
//				 
//				
//				this.janela.add(labelAClassificacao);
//				this.janela.add(valorAClassificacao);
//				this.janela.add(labelAcorDaArmacao);
//				this.janela.add(valorAcorDaArmacao);
//				this.janela.add(labelLtipoDeLente);
//				this.janela.add(valorLtipoDeLente);		
//				this.janela.add(labelOTotalOculos);
//				this.janela.add(valorOTotalOculos);
//				
//				botaoFinalizar.setBounds(230, 175, 100,30);		
//				this.janela.add(botaoFinalizar);
//								
//				this.janela.setLayout(null);
//
//				this.janela.setSize(1000, 400);
//				this.janela.setVisible(true);
//
//				botaoFinalizar.addActionListener(this);		
			valorOTotalOculos = new JTextField(String.valueOf((dados.getLente()[pos].getValorDaLente()) + 
					(dados.getArmacao()[pos].getValorDaArmacao())), 200) ;	
			
			if (op == 1) { //editar armacao

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
				this.janela.add(botaoSalvar);
				this.janela.add(botaoExcluir);
			}
			//construir armacao
			
			if (op == 2) {

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
			}
			// editar lente
			if( op == 3) {
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
				this.janela.add(botaoSalvar);
				this.janela.add(botaoExcluir);
				
			}		
			//cadastrar lente
			
			if(op == 4) {
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
				this.janela.add(botaoSalvar);
				
			}
			// editar lente de contato
			if(op == 5) {
				
				this.janela.add(labelCmaterialDaLente);
				this.janela.add(valorCmaterialDaLente);
				this.janela.add(labelCtipoDeDescarte);
				this.janela.add(valorCtipoDeDescarte);
				this.janela.add(labelCcor);
				this.janela.add(valorCcor);		
				this.janela.add(labelCvalorContato );
				this.janela.add(valorCvalorContato );
				this.janela.add(labelCestoqueContato );
				this.janela.add(valorCestoqueContato );
				
//				System.out.println(op);
				this.janela.add(botaoSalvar);
				
				this.janela.add(botaoExcluir);
			}
				// cadastrar lente de contato
			if(op == 6) {
				
				this.janela.add(labelCmaterialDaLente);
				this.janela.add(valorCmaterialDaLente);
				this.janela.add(labelCtipoDeDescarte);
				this.janela.add(valorCtipoDeDescarte);
				this.janela.add(labelCcor);
				this.janela.add(valorCcor);		
				this.janela.add(labelCvalorContato );
				this.janela.add(valorCvalorContato );
				this.janela.add(botaoSalvar);
				
			}
			
				
			//dados para exibir a compra
			if (op == 7) {			
				
				this.janela.add(labelCmaterialDaLente);
				this.janela.add(material);
				
//				this.janela.add(valorCmaterialDaLente);
				this.janela.add(labelCtipoDeDescarte);
				this.janela.add(valorCtipoDeDescarte);
				this.janela.add(labelCcor);
				this.janela.add(valorCcor);		
				this.janela.add(labelCvalorContato );
				this.janela.add(valorCvalorContato );
				this.janela.add(labelCestoqueContato );
				this.janela.add(valorCestoqueContato );
	
				botaoFinalizar.addActionListener(this);		
				
			}
			// exibir oculos
			if (op == 8) { 
				
				this.janela.add(labelAClassificacao);
				this.janela.add(valorAClassificacao);
				this.janela.add(labelAcorDaArmacao);
				this.janela.add(valorAcorDaArmacao);
				this.janela.add(labelLtipoDeLente);
				this.janela.add(valorLtipoDeLente);	
				
				
				this.janela.add(botaoFinalizar);
	
				botaoFinalizar.addActionListener(this);		
				
			}
		
			
		
							
			this.janela.setLayout(null);

			this.janela.setSize(500, 400);
			this.janela.setVisible(true);

			botaoSalvar.addActionListener(this);
			botaoExcluir.addActionListener(this);
			botaoFinalizar.addActionListener(this);
//			botaoComprar.addActionListener(this);
//			botaoAddproduto.addActionListener(this);
			janela.setResizable(false);
			
		}

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
						novoDadoCon[0] = Integer.toString(posicao);
						novoDadoArm[0] = Integer.toString(posicao);
						novoDadoLen[0] = Integer.toString(posicao);
						}

					
					if (opcao == 1 || opcao == 2) {				
					
					novoDadoArm[1] =  valorAClassificacao.getText();
					res = dados.inserirEditarArmacao(novoDadoArm);
					novoDadoArm[2] =  valorAcorDaArmacao.getText();
					res = dados.inserirEditarArmacao(novoDadoArm);
					novoDadoArm[3] =  valorAmaterialDaArmacao.getText();
					res = dados.inserirEditarArmacao(novoDadoArm);
					novoDadoArm[4] =  valorAmodelo.getText();
					res = dados.inserirEditarArmacao(novoDadoArm);
					novoDadoArm[5] =  valorAmarca.getText();
					res = dados.inserirEditarArmacao(novoDadoArm);
					novoDadoArm[6] =  valorAvalorDaArmacao.getText();
					res = dados.inserirEditarArmacao(novoDadoArm);
					novoDadoArm[7] =  valorAestoqueArmacao.getText();
					res = dados.inserirEditarArmacao(novoDadoArm);
				
					} else if (opcao == 3 || opcao == 4) {
						
					novoDadoLen[1] =  valorLtipoDeLente.getText();
					res = dados.inserirEditarLente(novoDadoLen);
					novoDadoLen[2] =  valorLmaterialDaLente.getText();
					res = dados.inserirEditarLente(novoDadoLen);
					novoDadoLen[3] =  valorLvalorDaLente.getText();
					res = dados.inserirEditarLente(novoDadoLen);
					novoDadoLen[4] =  valorLlenteID.getText();
					res = dados.inserirEditarLente(novoDadoLen);
					novoDadoLen[5] =  valorLestoqueLente.getText();
					res = dados.inserirEditarLente(novoDadoLen);
						
					}		
					
					else if(opcao == 5) {
						novoDadoCon[1] =  valorCmaterialDaLente.getText();
						res = dados.inserirEditarLenteDeContato(novoDadoCon);
						System.out.println(novoDadoCon);
						novoDadoCon[2] =  valorCtipoDeDescarte.getText();
						res = dados.inserirEditarLenteDeContato(novoDadoCon);
//						System.out.println(res);
						novoDadoCon[3] =  valorCmarca.getText();
						res = dados.inserirEditarLenteDeContato(novoDadoCon);
//						System.out.println(res);
						novoDadoCon[4] =  valorCcor.getText();
						res = dados.inserirEditarLenteDeContato(novoDadoCon);
//						System.out.println(res);
						novoDadoCon[5] =  valorCprodutosDeHig.getText();
						res = dados.inserirEditarLenteDeContato(novoDadoCon);
//						System.out.println(res);
						novoDadoCon[6] =  valorCestoqueContato.getText();
//						System.out.println(res);
						res = dados.inserirEditarLenteDeContato(novoDadoCon);
						novoDadoCon[7] =  valorCvalorContato.getText();
						res = dados.inserirEditarLenteDeContato(novoDadoCon);
//						}	
					//	System.out.println(res);
					}
					res=true;
				if(res) {
						mensagemSucessoCadastro();
					}
						else mensagemErroCadastro();

				} catch (NullPointerException exc1) {
					mensagemErroCadastro();
				}
//				catch (NumberFormatException exc2) {
//					mensagemErroCadastro();
//				}
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


				
			}
			
			if(src == botaoFinalizar) {
				
			this.janela.add(labelOTotalOculos);
			this.janela.add(valorOTotalOculos);	
				
//				
//			System.out.println("Dados e valor do produto comprado");
				
			}
					
			
		}

		public void mensagemSucessoExclusao() {
			JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}

		public void mensagemSucessoCadastro() {
			JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}

		public void mensagemErroCadastro() {
			JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
					+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
					+ "1. O estoque deve ser preenchido com número \n", null, 
					JOptionPane.ERROR_MESSAGE);
		}



}
