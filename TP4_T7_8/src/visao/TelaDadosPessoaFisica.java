package visao;

import java.awt.event.ActionEvent;



import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDadosPessoaFisica implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCpf = new JLabel("CPF: ");
	private JTextField valorCpf;
	private JLabel labelEmail = new JLabel("E-mail: ");
	private JTextField valorEmail;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorTelefone;
	private JLabel labelEndereco = new JLabel("Endereco: ");
	private JTextField valorEndereco;

	private JLabel labelFuncao = new JLabel("Função: ");
	private JTextField valorFuncao;
	private JLabel labelSalarioHora = new JLabel("Salário/Hora (R$): ");
	private JTextField valorSalarioHora;
	private JLabel labelHorarioDeTrabalho = new JLabel("Horário de Trabalho: ");
	private JTextField valorHorarioDeTrabalho;
	
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private JButton botaoComprar = new JButton("Comprar");
	private JButton botaoAddproduto = new JButton("Add Produto");
	
	private String[] novoDado = new String[9]; //???/
	
	private static ControleObjetos dados;
	
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleObjetos d, 
			TelaListaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Cliente";
		if (op == 2) s = "Cadastro de Funcionário";
		if (op == 3) s = "Detalhe de Cliente";
		if (op == 4) s = "Detalhe de Funcionário";
		
		janela = new JFrame(s);

		//Preenche dados com dados do cliente clicado
		if (op == 3) {			
			valorNome = new JTextField(dados.getClientes()[pos].getNome(), 200);
			valorCpf = new JTextField(String.valueOf(dados.getClientes()[pos].getCpf()), 200);
			valorEmail = new JTextField(String.valueOf(dados.getClientes()[pos].getEmail()), 200);
			valorTelefone = new JTextField(String.valueOf(dados.getClientes()[pos].getTelefone()), 200);
			valorEndereco = new JTextField(dados.getClientes()[pos].getEndereco(),200);
			valorSalarioHora = new JTextField(200);
			valorHorarioDeTrabalho =  new JTextField(200);
			valorFuncao = new JTextField(200);

		} else if (op == 4) { //Preenche dados com dados do funcionario clicado 
			valorNome = new JTextField(dados.getFuncionarios()[pos].getNome(), 200);
			valorCpf = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getCpf()), 200);
			valorEmail = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getEmail()), 200);
			valorTelefone = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getTelefone()), 200);
			valorEndereco = new JTextField(200);
			valorSalarioHora = new JTextField(dados.getFuncionarios()[pos].getSalarioHora(),200);
			valorHorarioDeTrabalho = new JTextField(dados.getFuncionarios()[pos].getHorarioDeTrabalho(),200);
			valorFuncao = new JTextField(dados.getFuncionarios()[pos].getFuncao(),200);
						
			
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorCpf = new JTextField(200);
			valorEmail = new JTextField(200);
			valorTelefone = new JTextField(200);
			valorEndereco = new JTextField(200);
			valorSalarioHora = new JTextField(200);
			valorHorarioDeTrabalho =  new JTextField(200);
			valorFuncao = new JTextField(200);
			
		}

		labelNome.setBounds(20, 20, 150, 25);
		valorNome.setBounds(200, 20, 180, 25);
		
		labelCpf.setBounds(20, 50, 150, 25);
		valorCpf.setBounds(200, 50, 180, 25);
		
		labelEmail.setBounds(20, 80, 150, 25);
		valorEmail.setBounds(200, 80, 180, 25);
		
		labelTelefone.setBounds(20, 110, 150, 25);
		valorTelefone.setBounds(200, 110, 180, 25);
		
		labelEndereco.setBounds(20, 140, 150, 25);
		valorEndereco.setBounds(200, 140, 180, 25);
		
		labelHorarioDeTrabalho.setBounds(20, 170, 180, 25);
		valorHorarioDeTrabalho.setBounds(200, 170, 180, 25);	
		
		labelFuncao.setBounds(20, 200, 150, 25);
		valorFuncao.setBounds(200, 200, 180, 25);	
		
		labelSalarioHora.setBounds(20, 230, 150, 25);
		valorSalarioHora.setBounds(200, 230, 180, 25);	
		
				
		//Coloca os campos relacionados a endereco se cliente
		if (op == 1 || op == 3 ) {
			this.janela.add(labelEndereco);
			this.janela.add(valorEndereco);
			
			this.janela.setSize(400, 250);
			
			botaoSalvar.setBounds(10, 175, 100, 30);
			botaoExcluir.setBounds(120, 175, 100, 30);
			botaoComprar.setBounds(230, 175, 100,30);

		}

		//Coloca campos relacionados a valor horario de trabalho e funcao se funcionario
		if (op == 2 || op == 4) {

			this.janela.add(labelFuncao);
			this.janela.add(valorFuncao);
			this.janela.add(labelHorarioDeTrabalho);
			this.janela.add(valorHorarioDeTrabalho);
			this.janela.add(labelSalarioHora);
			this.janela.add(valorSalarioHora);
			botaoAddproduto.setBounds(230, 280, 150,30);
			
			
			this.janela.setSize(400, 350);
			
			botaoSalvar.setBounds(10, 280, 100, 30);
			botaoExcluir.setBounds(120, 280, 100, 30);
			
		}

		//Coloca botoes de excluir e salvar quando detalhes do cliente ou funcionario
		if (op == 3 || op == 4) {
			
			this.janela.add(botaoExcluir);
			
		}
	
	if (op == 3) {
			
			this.janela.add(botaoComprar);
			
		}	
	if (op == 4) {
			
			this.janela.add(botaoAddproduto);
			
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEmail);
		this.janela.add(valorEmail);
		this.janela.add(labelTelefone);
		this.janela.add(valorTelefone);		
		this.janela.add(labelCpf);
		this.janela.add(valorCpf);
				
		this.janela.add(botaoSalvar);
						
		this.janela.setLayout(null);

//		this.janela.setSize(400, 300);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
		
		botaoComprar.addActionListener(this);
		botaoAddproduto.addActionListener(this);
		janela.setResizable(false);
	}
	

@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) {//cadastro de novo funcionario
					novoDado[0] = Integer.toString(dados.getQtdclientes());
				}
				else if (opcao == 2) { // cadastro de novo cliente
					novoDado[0] = Integer.toString(dados.getQtdfuncionarios());
				}
				else {// edicao de dado existente
					novoDado[0] = Integer.toString(posicao);
					}

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorEmail.getText();
				novoDado[3] =  valorTelefone.getText();
				novoDado[4] =  valorCpf.getText();
				
				

				if (opcao == 1 || opcao == 3) {
					novoDado[5] =  valorEndereco.getText();
					res = dados.inserirEditarCliente(novoDado);
				} else {
					novoDado[5] =  valorFuncao.getText();
					res = dados.inserirEditarFuncionario(novoDado);
					novoDado[6] =  valorHorarioDeTrabalho.getText();
					res = dados.inserirEditarFuncionario(novoDado);
					novoDado[7] =  valorSalarioHora.getText();
					res = dados.inserirEditarFuncionario(novoDado);
					
					
				}

				if(res) {
					mensagemSucessoCadastro();
				}
					else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui cliente
				res = dados.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 

			}
				
			if (opcao == 4){ //exclui funcionario
				res = dados.removerFuncionario(posicao);
				if (res) mensagemSucessoExclusao(); 
 
			}


			
		}
		
		if(src == botaoAddproduto) {			
			new TelaListaProdutos().mostrarDados(dados, 3);
		}
		
		if(src == botaoComprar) {			
			new TelaLoja();
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
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF e telefone devem conter apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

//	public void mensagemErroExclusaoCliente() {
//		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
//				+ "Verifique se o cliente está na lista de \n"
//				+ "cliente cadastrados na loja e tente novamente.", null, 
//				JOptionPane.ERROR_MESSAGE);
//	}
//	
//	public void mensagemErroExclusaoFuncionario() {
//		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
//				+ "Verifique se o funcionario esta na lista de \n"
//				+ "funcionários da loja e tente novamente ", null, 
//				JOptionPane.ERROR_MESSAGE);
//	}

}
