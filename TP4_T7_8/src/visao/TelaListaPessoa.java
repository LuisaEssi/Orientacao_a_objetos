package visao;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaListaPessoa implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton atualizaCliente;
	private JButton cadastroFuncionario;
	private JButton atualizaFuncionario;
	private static ControleObjetos dados;
	private JList<String> listaClientesCadastrados;
	private JList<String> listaFuncionariosCadastrados;
	private String[] listaNomes = new String[50];
	

	public void mostrarDados(ControleObjetos d, int op){
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de Clientes cadastrados (JList)
			listaNomes = new ControleCliente(dados).getNomeCliente();
			listaClientesCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			atualizaCliente = new JButton("Atualizar");
			
			System.out.println(listaNomes);
//			JScrollPane panel = new JScrollPane();
//			panel.setBounds(200, 10, 30, 100);
//	        janela.add(panel);
			
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(90, 10, 250, 30);
			listaClientesCadastrados.setBounds(20, 50, 350, 120);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientesCadastrados.setVisibleRowCount(10);

			cadastroCliente.setBounds(70, 177, 110, 30);
			atualizaCliente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaClientesCadastrados);
			janela.add(cadastroCliente);
			janela.add(atualizaCliente);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroCliente.addActionListener(this);
			atualizaCliente.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados de Funcionarios cadastrados (JList)
			listaNomes = new ControleFuncionario(dados).getNomeFuncionario();
			listaFuncionariosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Funcion??rios");
			titulo = new JLabel("Funcion??rios Cadastrados");
			cadastroFuncionario = new JButton("Cadastrar");
			atualizaFuncionario = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 14));
			titulo.setBounds(90, 10, 250, 30);
			listaFuncionariosCadastrados.setBounds(20, 50, 350, 120);
			listaFuncionariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaFuncionariosCadastrados.setVisibleRowCount(10);


			cadastroFuncionario.setBounds(70, 177, 110, 30);
			atualizaFuncionario.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaFuncionariosCadastrados);
			janela.add(cadastroFuncionario);
			janela.add(atualizaFuncionario);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroFuncionario.addActionListener(this);
			atualizaFuncionario.addActionListener(this);
			listaFuncionariosCadastrados.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null,"Op????o n??o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}



	//Captura eventos relacionados aos botoes da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo Cliente
		if(src == cadastroCliente)
			new TelaDadosPessoaFisica().inserirEditar(1, dados, this, 0);

		//Cadastro de novo Funcionario
		if(src == cadastroFuncionario)
			new TelaDadosPessoaFisica().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de Clientes mostrada no JList
		if(src == atualizaCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeCliente());			
			listaClientesCadastrados.updateUI();
		}

//		 Atualiza a lista de nomes de Funcionarioes mostrada no JList
		if(src == atualizaFuncionario) {
			listaFuncionariosCadastrados.setListData(new ControleFuncionario(dados).getNomeFuncionario());
			listaFuncionariosCadastrados.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaDadosPessoaFisica().inserirEditar(3, dados, this, 
					listaClientesCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaFuncionariosCadastrados) {
			new TelaDadosPessoaFisica().inserirEditar(4, dados, this, 
					listaFuncionariosCadastrados.getSelectedIndex());
		}
	}

}