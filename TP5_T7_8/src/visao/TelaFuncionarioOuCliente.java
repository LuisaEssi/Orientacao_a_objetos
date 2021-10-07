package visao;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.*;

public class TelaFuncionarioOuCliente implements ActionListener{
		
		private static JFrame janela = new JFrame("Usuário");
		private static JLabel titulo = new JLabel("Acesso");
		private static JButton funcionario = new JButton("Funcionário");
		private static JButton cliente = new JButton("Cliente");
		
		public static ControleObjetos dados = new ControleObjetos();
		
				
		public TelaFuncionarioOuCliente() {
			titulo.setFont(new Font("Arial", Font.BOLD, 14));
			titulo.setBounds(120, 10, 150, 30);
			funcionario.setBounds(80, 40, 140, 30);
			cliente.setBounds(80, 80, 140, 30);
					
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(funcionario);
			janela.add(cliente);
			
			janela.setSize(300, 150);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);	
			funcionario.addActionListener(this);
			cliente.addActionListener(this);
		}
			
		public static void main(String[] args) {
			TelaFuncionarioOuCliente menu = new TelaFuncionarioOuCliente();
			
			cliente.addActionListener(menu);
			funcionario.addActionListener(menu);
			
		}
		

		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == cliente) {

				new TelaListaPessoa().mostrarDados(dados, 1); //mostra lista de cliente
				
								}
			
			if(src == funcionario) {
			new TelaListaPessoa().mostrarDados(dados, 2);  //mostra lista de funcionarios

				}

	
		}

}
