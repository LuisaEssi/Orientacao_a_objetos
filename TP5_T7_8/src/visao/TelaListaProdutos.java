package visao;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Classe de construção da tela com lista de dados das armacoes, lentes e lentes de contato com botões para cadastro,atualiza, pesquisa de armacoes, lentes e lentes de contato 
 * @author Luisa Caroline
 * @version Out 2021
 */

public class TelaListaProdutos implements ActionListener, ListSelectionListener {		
	
	private static int posicaoArmacao;
	private static int posicaoLente;
	private static int opcao;
	
	private String pesContato;
	private String pesArmacao;
	private String pesLente;

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
	
	private JLabel pesquisaGeral;
	private JButton pesquisaArmacao = new JButton("Pesquisar");
	private JTextField barraArmacao;	
	private JButton pesquisaLente = new JButton("Pesquisar");
	private JTextField barraLente;
	private JButton pesquisaContato = new JButton("Pesquisar");
	private JTextField barraContato;
	
	
	private static ControleObjetos dados;
	private JList<String> listaContatoCadastrados;
	private JList<String> listaArmacaoCadastradas;
	private JList<String> listaLenteCadastradas;

	private String[] listaContato = new String[50];
	private String[] listaArmacao = new String[50];
	private String[] listaLente = new String[50];
	
	
	/**
	 * Metodo para mostrar listas com armacao, lente ou lente de contato
	 * @param d parametro da classe de controle objetos com os dados do objeto a ser exibido/editado
	 * @param op  inteiro que determina qual lista vai ser exibida ao usuario
	 */
	public void mostrarDados(ControleObjetos d, int op){
		dados = d;

		switch (op) {
	
		case 1:// Mostra Lentes de Contato cadastradas (JList)
			
			opcao = op;			
			listaContato = new ControleContato(dados).getDadosContato();
			listaContatoCadastrados = new JList<String>(listaContato);
			janela = new JFrame("Lente de Contato");
			titulo = new JLabel("Escolha sua Lente de Contato");
			pesquisaGeral = new JLabel("Pesquise por tipo de descarte");
						
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(60, 10, 300, 30);
			listaContatoCadastrados.setBounds(20, 50, 350, 120);
			listaContatoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaContatoCadastrados.setVisibleRowCount(10);
			barraContato = new JTextField(200);
			
			pesquisaContato.setBounds(260, 200, 110, 30);
			barraContato.setBounds(30, 200, 220, 30);
			pesquisaGeral.setBounds(30, 170, 280, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaContatoCadastrados);
			janela.add(pesquisaContato);
			janela.add(barraContato);
			janela.add(pesquisaGeral);


			janela.setSize(400, 280);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setVisible(true);
			pesquisaContato.addActionListener(this);
			listaContatoCadastrados.addListSelectionListener(this);

			break;

		case 2:// Mostra Armações cadastradas  (JList)
			opcao = op;
			listaArmacao = new ControleArmacao(dados).getDadosArmacao();
			listaArmacaoCadastradas = new JList<String>(listaArmacao);
			janela = new JFrame("Armação");
			titulo = new JLabel("Escolha sua Armação");
			pesquisaGeral = new JLabel("Pesquise por classificação (fem ou mas)");
						
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(60, 10, 300, 30);
			listaArmacaoCadastradas.setBounds(20, 50, 350, 120);
			listaArmacaoCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaArmacaoCadastradas.setVisibleRowCount(10);
			
			barraArmacao = new JTextField(200);
			
			pesquisaArmacao.setBounds(260, 200, 110, 30);
			barraArmacao.setBounds(30, 200, 220, 30);
			pesquisaGeral.setBounds(30, 170, 300, 30);

			janela.setLayout(null);
			
			
			janela.add(titulo);
			janela.add(listaArmacaoCadastradas);
			janela.add(pesquisaArmacao);
			janela.add(barraArmacao);
			janela.add(pesquisaGeral);
			
			janela.setSize(400, 280);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setVisible(true);

			pesquisaArmacao.addActionListener(this);
			listaArmacaoCadastradas.addListSelectionListener(this);
			
			break;
	
				
		case 3:	//Mostra opções para funcionario editar ou cadastrar um Produto	
			opcao = op;
			janela = new JFrame("Produtos para alteração");
			titulo = new JLabel("Escolha o Produto");
				
			cadastroContato.setBounds(20, 20, 210, 25);
			editaContato.setBounds(240, 20, 210, 25);
						
			cadastroArmacao.setBounds(20, 50, 210, 25);
			editaArmacao.setBounds(240, 50, 210, 25);
			
			
			cadastroLente.setBounds(20, 80, 210, 25);
			editaLente.setBounds(240, 80, 210, 25);
			
			
			janela.setLayout(null);
			
			janela.add(cadastroContato);
			janela.add(editaContato);			
				
			janela.add(cadastroArmacao);
			janela.add(editaArmacao);		
			
			janela.add(cadastroLente);
			janela.add(editaLente);
			
			janela.setSize(470, 160);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setVisible(true);
			
			cadastroContato.addActionListener(this);
			editaContato.addActionListener(this);
			cadastroArmacao.addActionListener(this);
			editaArmacao.addActionListener(this);
			cadastroLente.addActionListener(this);
			editaLente.addActionListener(this);
			
			break;
			
			
		case 4: // Mostra lista de Lente de Contato para edição
			opcao = op;
			listaContato = new ControleContato(dados).getDadosContato();
			listaContatoCadastrados = new JList<String>(listaContato);
			janela = new JFrame("Lente de Contato");
			titulo = new JLabel("Escolha sua Lente de Contato");
			atualizaContato = new JButton("Atualizar");
								
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(60, 10, 300, 30);
			listaContatoCadastrados.setBounds(20, 50, 350, 120);
			listaContatoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaContatoCadastrados.setVisibleRowCount(10);

			atualizaContato.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaContatoCadastrados);
			janela.add(cadastroContato);
			janela.add(atualizaContato);

			janela.setSize(400, 250);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setVisible(true);

			atualizaContato.addActionListener(this);
			listaContatoCadastrados.addListSelectionListener(this);
			break;
	
			
		case 5: // Mostra lista de Lente para edição
			opcao = op;
			listaLente = new ControleLente(dados).getDadosLente();
			listaLenteCadastradas = new JList<String>(listaLente);
			janela = new JFrame("Lentes");
			titulo = new JLabel("Escolha sua Lente");
			atualizaLente = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 14));
			titulo.setBounds(90, 10, 250, 30);
			listaLenteCadastradas.setBounds(20, 50, 350, 120);
			listaLenteCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaLenteCadastradas.setVisibleRowCount(10);

			atualizaLente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaLenteCadastradas);
			janela.add(atualizaLente);

			janela.setSize(400, 250);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setVisible(true);

			atualizaLente.addActionListener(this);
			listaLenteCadastradas.addListSelectionListener(this);
		
			break;
	
		case 6: // Mostra lista de Armações para edição
			opcao = op;
			listaArmacao = new ControleArmacao(dados).getDadosArmacao();
			listaArmacaoCadastradas = new JList<String>(listaArmacao);
			janela = new JFrame("Armação");
			titulo = new JLabel("Editar Armação");
			atualizaArmacao = new JButton("Atualizar");
									
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(60, 10, 300, 30);
			listaArmacaoCadastradas.setBounds(20, 50, 350, 120);
			listaArmacaoCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaArmacaoCadastradas.setVisibleRowCount(10);

			atualizaArmacao.setBounds(200, 177, 100, 30);
			janela.setLayout(null);
			
			
			janela.add(titulo);
			janela.add(listaArmacaoCadastradas);
			janela.add(atualizaArmacao);

			janela.setSize(400, 250);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setVisible(true);

			atualizaArmacao.addActionListener(this);
			listaArmacaoCadastradas.addListSelectionListener(this);
			break;
		
			
		case 7: // Mostra Lentes cadastradas (JList)
			opcao = op;
			listaLente = new ControleLente(dados).getDadosLente();
			listaLenteCadastradas = new JList<String>(listaLente);
			janela = new JFrame("Lentes");
			titulo = new JLabel("Escolha sua Lente");
			pesquisaGeral = new JLabel("Pesquise pelo material da lente");

			titulo.setFont(new Font("Arial", Font.BOLD, 14));
			titulo.setBounds(90, 10, 250, 30);
			listaLenteCadastradas.setBounds(20, 50, 350, 120);
			listaLenteCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaLenteCadastradas.setVisibleRowCount(10);
			
			barraLente = new JTextField(200);
			
			pesquisaLente.setBounds(260, 200, 110, 30);
			barraLente.setBounds(30, 200, 220, 30);
			pesquisaGeral.setBounds(30, 170, 280, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaLenteCadastradas);
			janela.add(pesquisaLente);
			janela.add(barraLente);
			janela.add(pesquisaGeral);

			janela.setSize(400, 280);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setVisible(true);
			
			pesquisaLente.addActionListener(this);
			listaLenteCadastradas.addListSelectionListener(this);			
			
			break;
		case 8: // Mostra detalhes do óculos
			opcao = op;
			new TelaDadosProdutos().inserirEditar(10, dados, this, 0);
			break;
			
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}

	//Captura eventos relacionados aos botoes da interface
   /**
	 * Metodo de captura eventos relacionados aos botoes da interface
	 * (1) edicao da armacao (feita por funcionario)
	 * (2) cadastra nova armacao (feita por funcionario)
	 * (3) edicao da lente (feita por funcionario)
	 * (4) cadastra nova lente (feita por funcionario)
	 * (5) edicao da lente de contato (feita por funcionario)
	 * (6) cadastra nova lente  de contato(feita por funcionario)
	 * (7) atualiza lente de contato (atualiza lista)
	 * (8) atualiza armacao (atualiza lista)
	 * (9) atualiza lente(atualiza lista)
	 * (10) pesquisa lente de contato (por tipo de descarte)
	 * (11) pesquisa armacao (por classificação)
	 * (12) pesquisa lente (por material)
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Edita Armacao
			if(src == editaArmacao) {
				new TelaListaProdutos().mostrarDados(dados, 6);
				janela.dispose();
			}
		
		//Cadastro nova Armacao
			if(src == cadastroArmacao) {
				new TelaDadosProdutos().inserirEditar(2, dados, this, 0);
				janela.dispose();
				
			}	
			
		//Edita Lente
			if(src == editaLente) {
				new TelaListaProdutos().mostrarDados(dados, 5);	
				janela.dispose();
				
			}
		//Cadastro  nova Lente
			if(src == cadastroLente) {
				new TelaDadosProdutos().inserirEditar(4, dados, this, 0);
				janela.dispose();
				
			}			
		//Editar Lente de Contato
			if(src == editaContato) {
				
				new TelaListaProdutos().mostrarDados(dados, 4);	
				janela.dispose();
				
			}
		//Cadastro nova Lente de  Contato
		if(src == cadastroContato) {			
			new TelaDadosProdutos().inserirEditar(6, dados, this, 0);
			janela.dispose();
			
		}	
				
		// Atualiza a lista de nomes de Contato mostrada no JList
		if(src == atualizaContato) {
			janela.dispose();
			listaContatoCadastrados.setListData(new ControleContato(dados).getDadosContato());			
			listaContatoCadastrados.updateUI();
			
		}
		
		if(src == atualizaArmacao) {
			janela.dispose();
			listaArmacaoCadastradas.setListData(new ControleArmacao(dados).getDadosArmacao());			
			listaArmacaoCadastradas.updateUI();
		}

//		 Atualiza a lista de nomes de Funcionarioes mostrada no JList
		if(src == atualizaLente) {
			janela.dispose();
			listaLenteCadastradas.setListData(new ControleLente(dados).getDadosLente());
			listaLenteCadastradas.updateUI();
		}
		
		if(src == pesquisaContato) {
			pesContato = barraContato.getText();
			listaContatoCadastrados.setListData(new ControleContato(dados).getPesquisaContato(pesContato));
			listaContatoCadastrados.updateUI();
		}
		
		
		if(src == pesquisaArmacao) {
			pesArmacao = barraArmacao.getText();
			listaArmacaoCadastradas.setListData(new ControleArmacao(dados).getPesquisaArmacao(pesArmacao));
			listaArmacaoCadastradas.updateUI();
		}
		
		if(src == pesquisaLente) {
			pesLente = barraLente.getText();
			listaLenteCadastradas.setListData(new ControleLente(dados).getPesquisaLente(pesLente));
			listaLenteCadastradas.updateUI();
		}

	}
	
	
	//Captura eventos relacionados ao JList
	/**
	 *Metodo de eventos relacionados ao JList 
	 *(1) Lista de Lentes de contato (abre tela de dados para edicao, exclusão ou visualizacao) 
	 *(2) Lista de Lentes (abre tela de dados para edicao, exclusão ou visualizacao) 
	 *(3) Lista de Armações (abre tela de dados para edicao, exclusão ou visualizacao)
	 */
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		
		if(e.getValueIsAdjusting() && src == listaContatoCadastrados) {
			
			if(opcao == 1) {					
			new TelaDadosProdutos().inserirEditar(7, dados, this, 
					listaContatoCadastrados.getSelectedIndex());
					janela.dispose();
					}
			else if(opcao == 4) {
				new TelaDadosProdutos().inserirEditar(5, dados, this, 
						listaContatoCadastrados.getSelectedIndex());
						janela.dispose();
						}
			}
		
		if(e.getValueIsAdjusting() && src == listaArmacaoCadastradas) {
			posicaoArmacao = listaArmacaoCadastradas.getSelectedIndex();
			if (opcao == 6) {
				new TelaDadosProdutos().inserirEditar(1, dados, this, 
						listaArmacaoCadastradas.getSelectedIndex());
						janela.dispose();
						}
			else if (opcao == 2){
				new TelaDadosProdutos().inserirEditar(8, dados, this, 
						listaArmacaoCadastradas.getSelectedIndex());
						janela.dispose();
						}
				
		}
		
		
		if(e.getValueIsAdjusting() && src == listaLenteCadastradas) {
			posicaoLente = listaLenteCadastradas.getSelectedIndex();
			if(opcao == 5) {
				new TelaDadosProdutos().inserirEditar(3, dados, this, 
						listaLenteCadastradas.getSelectedIndex());
						janela.dispose();
				}
			else if (opcao == 7){
				new TelaDadosProdutos().inserirEditar(9, dados, this, 
						listaLenteCadastradas.getSelectedIndex());
						janela.dispose();
				}
		}
				
	}
	
	//Guarda a posição da Armacao

	/**
	 * get da posicao da armacao
	 * @return posicao da armacao em um inteiro
	 */
	public static int getPosicaoArmacao() {
		return posicaoArmacao;
	}
	
	//Guarda a posição da Lente
	/** 
	 * get da posicao da lente
	 * @return posicao da lente em um inteiro
	 */
	public static int getPosicaoLente() {
		return posicaoLente;
	}


}