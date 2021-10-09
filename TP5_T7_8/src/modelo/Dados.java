package modelo;

/**
 * Faz o pré cadastramento de dados com seus gets e sets. Aumenta a quantidade dos objetos se necessario
 * @author Luisa Caroline
 * @version Out 2021
 */

public class Dados {
	private  Cliente[] clientes = new Cliente[100];
	private int qtdclientes = 0;
	private Funcionario [] funcionarios = new Funcionario[100];
	private int qtdfuncionarios = 0;
	private DadosReceita[] dadosReceita = new DadosReceita[100];
	private int qtddadosReceita = 0;
	private Armacao[] armacao = new Armacao[100];
	private int qtdarmacao = 0;
	private Lente[] lente = new Lente[100];
	private int qtdlente = 0;
	private LenteDeContato[] contato = new LenteDeContato[100];
	private int qtdcontato = 0;
	private Compra[] compra = new Compra[100];
	private int qtdcompra = 0;
	private Oculos[] oculos = new Oculos[100];
	private int qtdoculos = 0;

	
	/**
	 * Pré cadastras dados nas classes Cliente, Funcionario, Lente, Lente de Contato, Armacao, DadosReceita, Compras e Oculos
	 */
	public void fillWithSomeData() {
		for(int i = 0; i < 3; i++) {
			clientes[i] = new Cliente("Cliente","clie"+i+"@gmail.com","614052856"+(i), "0000000000"+i,"Brasilia");
			funcionarios[i] = new Funcionario("Funcionário","func"+i+"@gmail.com","615002898"+i, "0000000001"+i, "gerente", "8:00 às 14:00", "10.00");
			dadosReceita[i] = new DadosReceita(true,"2", "2","3"+i,"multifoca");
			armacao[i] = new Armacao("Masculino "+i, "Azul "+i, "Acetato","Esporte","Ray Ban", 50+100.00*i, 1+i);
			lente[i] = new Lente("Degradê "+i, "Acrílico "+i+1, 50+120.0*i, "Rosa", 145-(i*10), i);	
			contato[i] = new LenteDeContato("Hidrogel "+i, "mensal "+i, "Acuvue"+i, "transparente", "Soro", 2+i, 100+100.00*0.5*i);
			compra[i] = new Compra("Armacao 123 "+i,1, 123,"boleto","retirada na loja", clientes[i]);
			oculos[i] = new Oculos(lente[i],armacao[i]);
		}
		
		qtdclientes = 3;
		qtdfuncionarios = 3;
		qtddadosReceita = 3;
		qtdarmacao = 3;
		qtdlente = 3;
		qtdcontato= 3;
		qtdoculos = 3;
	}


	/**
	 * Adquire o array de clientes
	 * @return array de clientes
	 */
	public Cliente[] getClientes() {
		return clientes;
	}


	/**
	 * Atualiza dados do cliente
	 * @param clientes um array de clientes
	 */
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}


	/**
	 * Adquire a quantidade de clientes
	 * @return quantidade de clientes
	 */
	public int getQtdclientes() {
		return qtdclientes;
	}


	/**
	 * Atualiza quantidade de clientes
	 * @param qtdclientes intero com quantidade de clientes
	 */
	public void setQtdclientes(int qtdclientes) {
		this.qtdclientes = qtdclientes;
	}


	/**
	 * Adquire o array de funcionarios
	 * @return array de funcionarios
	 */
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}


	/**
	 * Atualiza dados do funcionario
	 * @param funcionarios um array de funcionario
	 */
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}


	/**
	 * Adquire a quantidade de funcionarios
	 * @return quantidade de funcionarios
	 */
	public int getQtdfuncionarios() {
		return qtdfuncionarios;
	}


	/**
	 * Atualiza quantidade de funcionarios
	 * @param qtdfuncionarios inteiro quantidade de funcionarios
	 */
	public void setQtdfuncionarios(int qtdfuncionarios) {
		this.qtdfuncionarios = qtdfuncionarios;
	}


	/**
	 * Adquire o array de dados da receita
	 * @return array de dados da receita
	 */
	public DadosReceita[] getDadosReceita() {
		return dadosReceita;
	}


	/**
	 * Atualiza dados da receita
	 * @param dadosReceita um array de funcionario
	 */
	public void setDadosReceita(DadosReceita[] dadosReceita) {
		this.dadosReceita = dadosReceita;
	}

	/**
	 * Adquire a quantidade de receitas
	 * @return quantidade de receitas
	 */
	public int getQtddadosReceita() {
		return qtddadosReceita;
	}


	/**
	 * Atualiza quantidade de receitas
	 * @param qtddadosReceita inteiro com a quantidade de receitas
	 */
	public void setQtddadosReceita(int qtddadosReceita) {
		this.qtddadosReceita = qtddadosReceita;
	}

	/**
	 * Adquire o array de armacao
	 * @return array de armacao
	 */
	public Armacao[] getArmacao() {
		return armacao;
	}

	/**
	 * Atualiza dados da armacao
	 * @param armacao um array de armacao
	 */
	public void setArmacao(Armacao[] armacao) {
		this.armacao = armacao;
	}


	/**
	 * Adquire a quantidade de armacoes
	 * @return quantidade de armacoes
	 */
	public int getQtdarmacao() {
		return qtdarmacao;
	}

	/**
	 * Atualiza quantidade de armacoes
	 * @param qtdarmacao inteiro com a quantidade armacoes
	 */
	public void setQtdarmacao(int qtdarmacao) {
		this.qtdarmacao = qtdarmacao;
	}


	/**
	 * Adquire o array de lente
	 * @return array de lente
	 */
	public Lente[] getLente() {
		return lente;
	}

	/**
	 * Atualiza dados da lente
	 * @param lente um array de lente
	 */
	public void setLente(Lente[] lente) {
		this.lente = lente;
	}


	/**
	 * Adquire a quantidade de lente
	 * @return quantidade de lente
	 */
	public int getQtdlente() {
		return qtdlente;
	}
	/**
	 * Atualiza quantidade de receitas
	 * @param qtdlente inteiro com a quantidade de lentes
	 */

	public void setQtdlente(int qtdlente) {
		this.qtdlente = qtdlente;
	}


	/**
	 * Adquire o array de lente de contato
	 * @return array de lente de contato
	 */
	public LenteDeContato[] getContato() {
		return contato;
	}


	/**
	 * Atualiza dados da lente de contato
	 * @param contato um array de lente de contato
	 */
	public void setContato(LenteDeContato[] contato) {
		this.contato = contato;
	}


	/**
	 * Adquire a quantidade de lente de contato
	 * @return quantidade de lente de contato
	 */
	public int getQtdcontato() {
		return qtdcontato;
	}

	/**
	 * Atualiza quantidade de lentes de contato
	 * @param qtdcontato inteiro com a quantidade de lentes de contato
	 */
	
	public void setQtdcontato(int qtdcontato) {
		this.qtdcontato = qtdcontato;
	}

	/**
	 * Adquire o array de compra
	 * @return array de compra
	 */
	public Compra[] getCompra() {
		return compra;
	}

	/**
	 * Atualiza dados da compra
	 * @param compra um array de compra
	 */
	public void setCompra(Compra[] compra) {
		this.compra = compra;
	}
	
	/**
	 * Adquire a quantidade de compra
	 * @return quantidade de compra
	 */
	public int getQtdcompra() {
		return qtdcompra;
	}

	/**
	 * Atualiza quantidade de compras
	 * @param qtdcompra inteiro com a quantidade de compras
	 */

	public void setQtdcompra(int qtdcompra) {
		this.qtdcompra = qtdcompra;
	}

	/**
	 * Adquire o array de oculos
	 * @return array de oculos
	 */
	public Oculos[] getOculos() {
		return oculos;
	}

	/**
	 * Atualiza dados do oculos
	 * @param oculos um array de oculos
	 */
	public void setOculos(Oculos[] oculos) {
		this.oculos = oculos;
	}
	
	/**
	 * Adquire a quantidade de oculos
	 * @return quantidade de oculos
	 */
	public int getQtdOculos() {
		return qtdoculos;
	}


	/**
	 * Atualiza quantidade de oculos
	 * @param qtdoculos inteiro com a quantidade de oculos
	 */

	public void setQtdOculos(int qtdoculos) {
		this.qtdoculos = qtdoculos;
	}
	//-------------------------inserir e editar 
	
		
	/**
	 * Inseri novo cliente se necessario
	 * @param cli objeto clientes
	 * @param pos aumenta a quantidade de posicoes se necessario
	 */
	public void inserirEditarCliente(Cliente cli, int pos) {
		this.clientes[pos] = cli;
		if(pos == qtdclientes) qtdclientes++;
	}
	
	/**
	 * Inseri novo funcionario se necessario
	 * @param fun objeto funcionario
	 * @param pos aumenta a quantidade de posicoes se necessario se necessario
	 */
	public void inserirEditarFuncionario(Funcionario fun, int pos) {
		this.funcionarios[pos] = fun;
		if(pos == qtdfuncionarios) qtdfuncionarios++;
	}
	
	/**
	 * Inseri nova armacao se necessario
	 * @param arm objeto armacao
	 * @param pos aumenta a quantidade de posicoes se necessario
	 */
	public void inserirEditarArmacao(Armacao arm, int pos) {
		this.armacao[pos] = arm;
		if(pos == qtdarmacao) qtdarmacao++;
	}
	
	/**
	 * Inseri nova lente se necessario
	 * @param len objeto lente
	 * @param pos aumenta a quantidade de posicoes se necessario
	 */
	public void inserirEditarLente(Lente len, int pos) {
		this.lente[pos] = len;
		if(pos == qtdlente) qtdlente++;
	}
	
	/**
	 * Inseri nova lente de contato se necessario
	 * @param con objeto lente de contato
	 * @param pos aumenta a quantidade de posicoes se necessario
	 */
	public void inserirEditarLenteDeContato(LenteDeContato con, int pos) {
		this.contato[pos] = con;
		if(pos == qtdcontato) qtdcontato++;
	}
	
	/**
	 * Inseri novo dado de receita se necessario
	 * @param rec objeto receita
	 * @param pos aumenta a quantidade de posicoes se necessario
	 */
	public void inserirEditarDadosReceita(DadosReceita rec, int pos) {
		this.dadosReceita[pos] = rec;
		if(pos == qtddadosReceita) qtddadosReceita++;
	}
	
	/**
	 * Inseri nova compra se necessario
	 * @param com objeto compra
	 * @param pos aumenta a quantidade de posicoes se necessario
	 */
	public void inserirEditarCompra(Compra com, int pos) {
		this.compra[pos] = com;
		if(pos == qtdcompra) qtdcompra++;
	}
	
	/**
	 * Inseri novo oculos se necessario
	 * @param ocu objeto oculos
	 * @param pos aumenta a quantidade de posicoes se necessario
	 */
	public void inserirOculos(Oculos ocu, int pos) {
		this.oculos[pos] = ocu;
		if(pos == qtdoculos) qtdoculos++;
	}
	
}