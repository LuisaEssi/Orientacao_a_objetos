
package visao;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controle.*;

public class TelaLojaCliente implements ActionListener{
		
		private static JFrame janela = new JFrame("Escolha do produto");
		private static JLabel titulo = new JLabel("Opções de Compra");
		private static JButton oculos = new JButton("Óculos");
		private static JButton contato = new JButton("Lentes de contato");
		
		public static ControleObjetos dados = new ControleObjetos();
		
				
		public TelaLojaCliente() {
			titulo.setFont(new Font("Arial", Font.BOLD, 14));
			titulo.setBounds(70, 10, 200, 30);
			oculos.setBounds(80, 40, 140, 30);
			contato.setBounds(50, 80, 200, 30);
					
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(oculos);
			janela.add(contato);
			
			janela.setSize(300, 150);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);	
			oculos.addActionListener(this);
			contato.addActionListener(this);
		}
			
		public static void main(String[] args) {
			TelaLoja menu = new TelaLoja();
			
			contato.addActionListener(menu);
			oculos.addActionListener(menu);
			
		}
		

		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == contato) {
//				System.out.println("oculos ou contato");
				new TelaListaProdutos().mostrarDados(dados, 3);
								}
			
			if(src == oculos) {
			new TelaListaProdutos().mostrarDados(dados, 3);

				}
		

	
		}

}


