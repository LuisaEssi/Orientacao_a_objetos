package visao;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaListaProdutos implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroContato = new JButton("Cadastrar Lente de Contato");
	private JButton atualizaContato = new JButton("Atualizar Lente de Contato");
	private JButton editaContato = new JButton("Editar Lente de Contato");
	
	private JButton cadastroArmacao = new JButton("Cadastrar Armação");
	private JButton atualizaArmacao = new JButton("Atualizar Armação");
	private JButton editaArmacao = new JButton("Editar Armação");
	
	private JButton cadastroLente = new JButton("Cadastrar Lente");
	private JButton atualizaLente = new JButton("Atualizar Lente");
	private JButton editaLente = new JButton("Editar Lente");
	
	private static ControleObjetos dados;
	private JList<String> listaContatoCadastrados;
	private JList<String> listaArmacaoCadastradas;
	private JList<String> listaLenteCadastradas;
	private JList<String> listaContatoCadastradosedi;
	private JList<String> listaArmacaoCadastradasedi;
	private JList<String> listaLenteCadastradasedi;
	private String[] listaContato = new String[50];
	private String[] listaArmacao = new String[50];
	private String[] listaLente = new String[50];
	
	
	public void mostrarDados(ControleObjetos d, int op){
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de Lente de Contato cadastrados (JList)
			listaContato = new ControleContato(dados).getDadosContato();
			listaContatoCadastrados = new JList<String>(listaContato);
			janela = new JFrame("Lente de Contato");
			titulo = new JLabel("Escolha sua Lente de Contato");
//			cadastroContato = new JButton("Cadastrar");
//			atualizaContato = new JButton("Atualizar");
			//						
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(60, 10, 300, 30);
			listaContatoCadastrados.setBounds(20, 50, 350, 120);
			listaContatoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaContatoCadastrados.setVisibleRowCount(10);

//			cadastroContato.setBounds(70, 177, 110, 30);
//			atualizaContato.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaContatoCadastrados);
//			janela.add(cadastroContato);
//			janela.add(atualizaContato);

			janela.setSize(400, 250);
			janela.setVisible(true);

//			cadastroContato.addActionListener(this);
//			atualizaContato.addActionListener(this);
			listaContatoCadastrados.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados  (JList)
//			--------------Armacao------------
			

			listaArmacao = new ControleArmacao(dados).getDadosArmacao();
			listaArmacaoCadastradas = new JList<String>(listaArmacao);
			janela = new JFrame("Armação");
			titulo = new JLabel("Escolha sua Armação");
//			cadastroArmacao = new JButton("Cadastrar");
//			atualizaArmacao = new JButton("Atualizar");
			//						
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(60, 10, 300, 30);
			listaArmacaoCadastradas.setBounds(20, 50, 350, 120);
			listaArmacaoCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaArmacaoCadastradas.setVisibleRowCount(10);

//			cadastroArmacao.setBounds(70, 177, 110, 30);
//			atualizaArmacao.setBounds(200, 177, 100, 30);
			janela.setLayout(null);
			
			
			janela.add(titulo);
			janela.add(listaArmacaoCadastradas);
//			janela.add(cadastroArmacao);
//			janela.add(atualizaArmacao);

			janela.setSize(400, 250);
			janela.setVisible(true);

//			cadastroArmacao.addActionListener(this);
//			atualizaArmacao.addActionListener(this);
			listaArmacaoCadastradas.addListSelectionListener(this);
//			------------------Lente--------
			break;
			
		case 3:			
			
			
			janela = new JFrame("Produtos para alteração");
			titulo = new JLabel("Escolha o Produto");
				
			cadastroContato.setBounds(70, 120, 200, 30);
			editaContato.setBounds(150, 120, 200, 30);
						
			cadastroArmacao.setBounds(70, 150, 200, 30);
			editaArmacao.setBounds(200, 150, 200, 30);
			
			
			cadastroLente.setBounds(70, 180, 200, 30);
			editaLente.setBounds(200, 180, 200, 30);
			
			
			janela.setLayout(null);
			
			janela.add(cadastroContato);
			janela.add(editaContato);			
				
			janela.add(cadastroArmacao);
			janela.add(editaArmacao);		
			
			janela.add(cadastroLente);
			janela.add(editaLente);
			
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			cadastroContato.addActionListener(this);
			editaContato.addActionListener(this);
			cadastroArmacao.addActionListener(this);
			editaArmacao.addActionListener(this);
			cadastroLente.addActionListener(this);
			editaLente.addActionListener(this);
			
			break;
			
//		case 4:
//			
//			listaLente = new ControleLente(dados).getDadosLente();
//			listaLenteCadastradas = new JList<String>(listaLente);
//			janela = new JFrame("Lentes");
//			titulo = new JLabel("Escolha sua Lente");
////			cadastroLente = new JButton("Cadastrar");
////			atualizaLente = new JButton("Atualizar");
//
//			titulo.setFont(new Font("Arial", Font.BOLD, 14));
//			titulo.setBounds(90, 10, 250, 30);
//			listaLenteCadastradas.setBounds(20, 50, 350, 120);
//			listaLenteCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//			listaLenteCadastradas.setVisibleRowCount(10);
//
////
////			cadastroLente.setBounds(70, 177, 110, 30);
////			atualizaLente.setBounds(200, 177, 100, 30);
//
//			janela.setLayout(null);
//
//			janela.add(titulo);
//			janela.add(listaLenteCadastradas);
////			janela.add(cadastroLente);
////			janela.add(atualizaLente);
//
//			janela.setSize(400, 250);
//			janela.setVisible(true);
//
////			cadastroLente.addActionListener(this);
////			atualizaLente.addActionListener(this);
//			listaLenteCadastradas.addListSelectionListener(this);
//			break;
		case 4:
			listaContato = new ControleContato(dados).getDadosContato();
			listaContatoCadastradosedi = new JList<String>(listaContato);
			janela = new JFrame("Lente de Contato");
			titulo = new JLabel("Escolha sua Lente de Contato");
//			cadastroContato = new JButton("Cadastrar");
			atualizaContato = new JButton("Atualizar");
			//						
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(60, 10, 300, 30);
			listaContatoCadastradosedi.setBounds(20, 50, 350, 120);
			listaContatoCadastradosedi.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaContatoCadastradosedi.setVisibleRowCount(10);

//			cadastroContato.setBounds(70, 177, 110, 30);
			atualizaContato.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaContatoCadastradosedi);
//			janela.add(cadastroContato);
			janela.add(atualizaContato);

			janela.setSize(400, 250);
			janela.setVisible(true);

//			cadastroContato.addActionListener(this);
			atualizaContato.addActionListener(this);
			listaContatoCadastradosedi.addListSelectionListener(this);
			break;
			
		case 5:
			listaLente = new ControleLente(dados).getDadosLente();
			listaLenteCadastradasedi = new JList<String>(listaLente);
			janela = new JFrame("Lentes");
			titulo = new JLabel("Escolha sua Lente");
//			cadastroLente = new JButton("Cadastrar");
			atualizaLente = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 14));
			titulo.setBounds(90, 10, 250, 30);
			listaLenteCadastradasedi.setBounds(20, 50, 350, 120);
			listaLenteCadastradasedi.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaLenteCadastradasedi.setVisibleRowCount(10);

//
//			cadastroLente.setBounds(70, 177, 110, 30);
			atualizaLente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaLenteCadastradasedi);
//			janela.add(cadastroLente);
			janela.add(atualizaLente);

			janela.setSize(400, 250);
			janela.setVisible(true);

//			cadastroLente.addActionListener(this);
			atualizaLente.addActionListener(this);
			listaLenteCadastradasedi.addListSelectionListener(this);
//		
			break;
			
		case 6:
			listaArmacao = new ControleArmacao(dados).getDadosArmacao();
			listaArmacaoCadastradasedi = new JList<String>(listaArmacao);
			janela = new JFrame("Armação");
			titulo = new JLabel("Editar Armação");
//			cadastroArmacao = new JButton("Cadastrar");
			atualizaArmacao = new JButton("Atualizar");
			//						
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(60, 10, 300, 30);
			listaArmacaoCadastradasedi.setBounds(20, 50, 350, 120);
			listaArmacaoCadastradasedi.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaArmacaoCadastradasedi.setVisibleRowCount(10);

//			cadastroArmacao.setBounds(70, 177, 110, 30);
			atualizaArmacao.setBounds(200, 177, 100, 30);
			janela.setLayout(null);
			
			
			janela.add(titulo);
			janela.add(listaArmacaoCadastradasedi);
//			janela.add(cadastroArmacao);
			janela.add(atualizaArmacao);

			janela.setSize(400, 250);
			janela.setVisible(true);

//			cadastroArmacao.addActionListener(this);
			atualizaArmacao.addActionListener(this);
			listaArmacaoCadastradasedi.addListSelectionListener(this);
			break;
			
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}
//
//	if (op == 1) s = "Funcionário Editar Armacao";
//	if (op == 2) s = "Funcionário Cadastrar Armacao";
//	if (op == 3) s = "Funcionário Editar Lente";
//	if (op == 4) s = "Funcionário Cadastrar Lente";
//	if (op == 5) s = "Funcionário Editar Lente de Contato";
//	if (op == 6) s = "Funcionário Cadastrar Lente de Contato";


	//Captura eventos relacionados aos botoes da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Edita Armacao
			if(src == editaArmacao) {
				new TelaListaProdutos().mostrarDados(dados, 6);
			}
		
		//Cadastro nova Armacao
			if(src == cadastroArmacao) {
				new TelaDadosProdutos().inserirEditar(2, dados, this, 0);
			}	
			
		//Edita Lente
			if(src == editaLente) {
				new TelaListaProdutos().mostrarDados(dados, 5);
			
				
			}
		//Cadastro  nova Lente
			if(src == cadastroLente) {
				new TelaDadosProdutos().inserirEditar(4, dados, this, 0);
			}			
		//Editar Lente de Contato
			if(src == editaContato) {
				
				new TelaListaProdutos().mostrarDados(dados, 4);		
				
			}
		//Cadastro nova Lente de  Contato
		if(src == cadastroContato) {
			new TelaDadosProdutos().inserirEditar(6, dados, this, 0);
		}	
				
		// Atualiza a lista de nomes de Contato mostrada no JList
		if(src == atualizaContato) {
			listaContatoCadastrados.setListData(new ControleContato(dados).getDadosContato());			
			listaContatoCadastrados.updateUI();
		}
		
		if(src == atualizaArmacao) {
			listaArmacaoCadastradas.setListData(new ControleArmacao(dados).getDadosArmacao());			
			listaArmacaoCadastradas.updateUI();
		}

//		 Atualiza a lista de nomes de Funcionarioes mostrada no JList
		if(src == atualizaLente) {
			listaLenteCadastradas.setListData(new ControleLente(dados).getDadosLente());
			listaLenteCadastradas.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		
		if(e.getValueIsAdjusting() && src == listaContatoCadastrados) {
					
			new TelaDadosProdutos().inserirEditar(7, dados, this, 
					listaContatoCadastrados.getSelectedIndex());
		
			}

		if(e.getValueIsAdjusting() && src == listaArmacaoCadastradas) {
			
				
			listaLente = new ControleLente(dados).getDadosLente();
			listaLenteCadastradas = new JList<String>(listaLente);
			janela = new JFrame("Lentes");
			titulo = new JLabel("Escolha sua Lente");
//			cadastroLente = new JButton("Cadastrar");
//			atualizaLente = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 14));
			titulo.setBounds(90, 10, 250, 30);
			listaLenteCadastradas.setBounds(20, 50, 350, 120);
			listaLenteCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaLenteCadastradas.setVisibleRowCount(10);

//
//			cadastroLente.setBounds(70, 177, 110, 30);
//			atualizaLente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaLenteCadastradas);
//			janela.add(cadastroLente);
//			janela.add(atualizaLente);

			janela.setSize(400, 250);
			janela.setVisible(true);

//			cadastroLente.addActionListener(this);
//			atualizaLente.addActionListener(this);
			listaLenteCadastradas.addListSelectionListener(this);
			
//			new TelaDadosProdutos().exibirDados(8, dados, this, 
//					listaContatoCadastrados.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaLenteCadastradas) {
			if(src == editaLente) {
			new TelaDadosProdutos().inserirEditar(8, dados, this, 
					listaLenteCadastradas.getSelectedIndex());
			}
		}
		
		if(e.getValueIsAdjusting() && src == listaLenteCadastradasedi) {
			if(src == editaLente) {
			new TelaDadosProdutos().inserirEditar(3, dados, this, 
					listaLenteCadastradasedi.getSelectedIndex());
			}
		}
		
		if(e.getValueIsAdjusting() && src == listaContatoCadastradosedi) {
			
			new TelaDadosProdutos().inserirEditar(5, dados, this, 
					listaContatoCadastradosedi.getSelectedIndex());
		
			}	
		if(e.getValueIsAdjusting() && src == listaArmacaoCadastradasedi) {
			
			new TelaDadosProdutos().inserirEditar(1, dados, this, 
					listaArmacaoCadastradasedi.getSelectedIndex());
		
			}
		
//		if(e.getValueIsAdjusting() && src == listaFuncionariosCadastrados) {
//			new TelaDadosProdutos().inserirEditar(4, dados, this, 
//					listaFuncionariosCadastrados.getSelectedIndex());
	}

}