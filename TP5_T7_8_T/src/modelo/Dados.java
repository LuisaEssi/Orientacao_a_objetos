package modelo;

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

	public void fillWithSomeData() {
		for(int i = 0; i < 3; i++) {
			clientes[i] = new Cliente("Cliente","clie"+i+"@gmail.com","614052856"+(i), "0000000000"+i,"Brasilia");
			funcionarios[i] = new Funcionario("Funcionário","func"+i+"@gmail.com","615002898"+i, "0000000000"+i, "gerente", "8:00 às 14:00", "10.00");
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


	public Cliente[] getClientes() {
		return clientes;
	}


	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}


	public int getQtdclientes() {
		return qtdclientes;
	}


	public void setQtdclientes(int qtdclientes) {
		this.qtdclientes = qtdclientes;
	}


	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}


	public int getQtdfuncionarios() {
		return qtdfuncionarios;
	}


	public void setQtdfuncionarios(int qtdfuncionarios) {
		this.qtdfuncionarios = qtdfuncionarios;
	}


	public DadosReceita[] getDadosReceita() {
		return dadosReceita;
	}


	public void setDadosReceita(DadosReceita[] dadosReceita) {
		this.dadosReceita = dadosReceita;
	}


	public int getQtddadosReceita() {
		return qtddadosReceita;
	}


	public void setQtddadosReceita(int qtddadosReceita) {
		this.qtddadosReceita = qtddadosReceita;
	}


	public Armacao[] getArmacao() {
		return armacao;
	}


	public void setArmacao(Armacao[] armacao) {
		this.armacao = armacao;
	}


	public int getQtdarmacao() {
		return qtdarmacao;
	}


	public void setQtdarmacao(int qtdarmacao) {
		this.qtdarmacao = qtdarmacao;
	}


	public Lente[] getLente() {
		return lente;
	}


	public void setLente(Lente[] lente) {
		this.lente = lente;
	}


	public int getQtdlente() {
		return qtdlente;
	}


	public void setQtdlente(int qtdlente) {
		this.qtdlente = qtdlente;
	}


	public LenteDeContato[] getContato() {
		return contato;
	}


	public void setContato(LenteDeContato[] contato) {
		this.contato = contato;
	}


	public int getQtdcontato() {
		return qtdcontato;
	}


	public void setQtdcontato(int qtdcontato) {
		this.qtdcontato = qtdcontato;
	}


	public Compra[] getCompra() {
		return compra;
	}


	public void setCompra(Compra[] compra) {
		this.compra = compra;
	}


	public int getQtdcompra() {
		return qtdcompra;
	}


	public void setQtdcompra(int qtdcompra) {
		this.qtdcompra = qtdcompra;
	}


	public Oculos[] getOculos() {
		return oculos;
	}


	public void setOculos(Oculos[] oculos) {
		this.oculos = oculos;
	}
	//-------------------------inserir e editar 
	
		
	public void inserirEditarCliente(Cliente cli, int pos) {
		this.clientes[pos] = cli;
		if(pos == qtdclientes) qtdclientes++;
	}
	
	public void inserirEditarFuncionario(Funcionario fun, int pos) {
		this.funcionarios[pos] = fun;
		if(pos == qtdfuncionarios) qtdfuncionarios++;
	}
	
	public void inserirEditarArmacao(Armacao arm, int pos) {
		this.armacao[pos] = arm;
		if(pos == qtdarmacao) qtdarmacao++;
	}
	
	public void inserirEditarLente(Lente len, int pos) {
		this.lente[pos] = len;
		if(pos == qtdlente) qtdlente++;
	}
	
	public void inserirEditarLenteDeContato(LenteDeContato con, int pos) {
		this.contato[pos] = con;
		if(pos == qtdcontato) qtdcontato++;
	}
	
	public void inserirEditarDadosReceita(DadosReceita rec, int pos) {
		this.dadosReceita[pos] = rec;
		if(pos == qtddadosReceita) qtddadosReceita++;
	}
	
	public void inserirEditarCompra(Compra com, int pos) {
		this.compra[pos] = com;
		if(pos == qtdcompra) qtdcompra++;
	}
	
	public void inserirEditarOculos(Oculos a, int pos) {
		this.oculos[pos] = a;
		if(pos == qtdoculos) qtdoculos++;
	}
	
}