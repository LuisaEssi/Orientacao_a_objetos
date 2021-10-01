package visao;

import java.awt.*;




import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Loja de Óculos");
	private static JLabel titulo = new JLabel("Loja de Óculos");
	private static JButton comprar = new JButton("Comprar");
	private static JButton entrar = new JButton("Entrar");
	
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 18));
		titulo.setBounds(120, 10, 150, 30);
		comprar.setBounds(140, 50, 100, 30);
		entrar.setBounds(140, 100, 100, 30);
				
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(comprar);
		janela.add(entrar);
		
		janela.setSize(380, 180);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		comprar.addActionListener(menu);
		entrar.addActionListener(menu);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == comprar) {
			new TelaLoja();
							}
		
		if(src == entrar) {
			new TelaFuncionarioOuCliente();
			
			
							}

	}
}