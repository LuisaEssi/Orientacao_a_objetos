package controle;
import modelo.*;

public class ControleContato {
	private LenteDeContato[] con;
	private int qtdContato;
	
	public ControleContato(ControleObjetos d) {
		con = d.getContato();
		qtdContato = d.getQtdcontato();
		
	}
	
	public String[] getDadosContato() {
		String[] s = new String[qtdContato];
		for(int i = 0; i < qtdContato; i++) {

			s[i] = "Lente "+ con[i].getMaterialDaLente()+" com descarte "+con[i].getTipoDeDescarte();
		}
		
		return s;
	}
	
	public int getQtdcontato() {
		return qtdContato;
	}

	
	public void setQtdcontato(int qtdContato) {
		this.qtdContato= qtdContato;
	}
	public String getMaterialDaLente(int i) {		
		return con[i].getMaterialDaLente();
	}
	
	public String getTipoDeDescarte(int i) {		
		return con[i].getTipoDeDescarte();
	}
	public String getMarca(int i) {		
		return con[i].getMarca();
	}
	
	public String getCor(int i) {		
		return con[i].getCor();
	}
	
	public String getValorContato(int i) {
		String valorContato = String.valueOf(con[i].getValorContato());
		return valorContato;
	}
	
	public String getProdutosDeHig(int i) {		
		return con[i].getProdutosDeHig();
	}

	public String getEstoqueContato(int i) {	
		String numEstoque = String.valueOf(con[i].getEstoqueContato());
		return numEstoque;
	}
	

	
}






//package controle;
//
//import java.awt.*;
//
//import java.awt.event.*;
//import javax.swing.*;
//
//import visualizar.Menu;
//
//
//@SuppressWarnings("serial")
//public class CadastroCliente extends JFrame {
//	
//	private static JPanel cadastrarCliente;
//	private static JLabel titulo = new JLabel("Cadastro de Cliente");
//	private static JTextField cpfCliente;
//	private static JLabel textocpfCliente = new JLabel("CPF:");
//	private static JPasswordField senhaCliente;
//	private static JLabel textosenhaCliente = new JLabel("Senha:");
//	private static JLabel textoNome = new JLabel("Nome:");
//	private static JTextField nomeCliente;
//	private static JLabel textoTelefone = new JLabel("Telefone:");;
//	private static JTextField enderecoCliente;
//	private static JLabel textoEndereco = new JLabel("Endere??o:");;
//	private static JTextField emailCliente;
//	private static JLabel textoClienteEmail = new JLabel("Email:");
//	private static JTextField telefoneCliente;
//	private static JButton cadastrar = new JButton("Cadastrar");
//	private static JButton cancelar = new JButton("Cancelar");
//	
//	public static modelo.Cliente clienteTemporario;
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CadastroCliente frame = new CadastroCliente();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
//	public CadastroCliente() {
//		
//		cadastrarCliente.setSize(500, 280);
//		
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		cadastrarCliente = new JPanel();
//		cadastrarCliente.setBorder(null);
//		setContentPane(cadastrarCliente);
//		cadastrarCliente.setLayout(null);
//		
//		//titulo
//		titulo.setBounds(300, 108, 50, 25);
//		cadastrarCliente.add(titulo);
//		
//		//nome
//		textoNome.setToolTipText("");
//		textoNome.setHorizontalAlignment(SwingConstants.RIGHT);
//		textoNome.setBounds(266, 108, 50, 25);
//		cadastrarCliente.add(textoNome);
//		
//		nomeCliente = new JTextField();
//		nomeCliente.setColumns(11);
//		nomeCliente.setBounds(334, 108, 168, 25);
//		cadastrarCliente.add(nomeCliente);
//		
//		//cpf
//		
//		textocpfCliente.setToolTipText("Fa??a login com seu CPF");
//		textocpfCliente.setBounds(250, 35, 50, 25);
//		cadastrarCliente.add(textocpfCliente);
//		
//		cpfCliente = new JTextField();
//		cpfCliente.setToolTipText("Apenas n??meros e 11 d??gitos");
//		cpfCliente.setBounds(334, 35, 168, 25);
//		cadastrarCliente.add(cpfCliente);
//		cpfCliente.setColumns(11);
//		
//		//senha
//		textosenhaCliente.setHorizontalAlignment(SwingConstants.RIGHT);
//		textosenhaCliente.setBounds(266, 70, 50, 25);
//		cadastrarCliente.add(textosenhaCliente);
//				
//		senhaCliente = new JPasswordField();
//		senhaCliente.setBounds(334, 70, 168, 25);
//		cadastrarCliente.add(senhaCliente);
//		
//		//
//		JSeparator separator = new JSeparator();
//		separator.setBounds(246, 20, 300, 2);
//		cadastrarCliente.add(separator);
//		
//		//email
//		
//		textoClienteEmail.setHorizontalAlignment(SwingConstants.RIGHT);
//		textoClienteEmail.setBounds(236, 181, 80, 25);
//		cadastrarCliente.add(textoClienteEmail);
//		
//		emailCliente = new JTextField();
//		emailCliente.setColumns(11);
//		emailCliente.setBounds(334, 181, 168, 25);
//		cadastrarCliente.add(emailCliente);
//		
//		//telefone
//		telefoneCliente = new JTextField();
//		telefoneCliente.setToolTipText("Apenas n??meros, 8 ou 9 d??gitos");
//		telefoneCliente.setColumns(11);
//		telefoneCliente.setBounds(381, 144, 121, 25);
//		cadastrarCliente.add(telefoneCliente);
//		
//		textoTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
//		textoTelefone.setBounds(236, 143, 80, 25);
//		cadastrarCliente.add(textoTelefone);		
//		
//		//endere??o
//		
//		enderecoCliente = new JTextField();
//		enderecoCliente.setToolTipText("Apenas n??meros, 8 ou 9 d??gitos");
//		enderecoCliente.setColumns(11);
//		enderecoCliente.setBounds(390, 144, 121, 25);
//		cadastrarCliente.add(enderecoCliente);
//		
//		textoEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
//		textoEndereco.setBounds(240, 143, 80, 25);
//		cadastrarCliente.add(textoEndereco);	
//		
//		
//		cadastrar.setBounds(246, 515, 125, 25);		
//		cadastrarCliente.add(cadastrar);
//		
//		cancelar.setBounds(421, 515, 125, 25);
//		cadastrarCliente.add(cancelar);
//				
//		cadastrar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				EventQueue.invokeLater(new Runnable() {
//					public void run() {
//						try{
//							setVisible(controle.ControleObjetos.cadastrarCliente(cadastrarCliente,nomeCliente, cpfCliente,	
//																		telefoneCliente, emailCliente, senhaCliente, enderecoCliente,
//																		modelo.main.objCliente));
//						}catch (Exception e) {
//							e.printStackTrace();
//						}
//					}
//				});
//			}
//		});
//		
//		
//		cancelar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				EventQueue.invokeLater(new Runnable() {
//					public void run() {
//						try {
//							Menu frame = new Menu();
//							frame.setVisible(true);
//							setVisible(false);
//							}
//						
//						catch (Exception e) {
//							e.printStackTrace();
//							}
//										}
//												});
//													}
//														});
//		
//		}
//		
//	}