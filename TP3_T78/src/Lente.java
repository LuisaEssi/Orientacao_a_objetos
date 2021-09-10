
public class Lente {
	

	private String tipoDeLente; 		//(antirreflexo, filtro azul): String
	private String materialDaLente; 	// (acrílico, trivex, policarbonato, ...): String 
	private double valorDaLente;
	private String corDaLente;
	

	private Estoque estoqueLente;	//associacao
	private DadosReceita receita;	//associação
	
	//	----------construtor------------
	public Lente(String tipoDeLente, String materialDaLente, double valorDaLente, String corDaLente) {
		super();
		this.tipoDeLente = tipoDeLente;
		this.materialDaLente = materialDaLente;
		this.valorDaLente = valorDaLente;
		this.corDaLente = corDaLente;
	//	this.estoqueLente = estoqueLente;
	//	this.receita = receita;
	}
	
	// get and set 
	
	public String getTipoDeLente() {
		return tipoDeLente;
	}
	public void setTipoDeLente(String tipoDeLente) {
		this.tipoDeLente = tipoDeLente;
	}
	public String getMaterialDaLente() {
		return materialDaLente;
	}
	public void setMaterialDaLente(String materialDaLente) {
		this.materialDaLente = materialDaLente;
	}
	public double getValorDaLente() {
		return valorDaLente;
	}
	public void setValorDaLente(double valorDaLente) {
		this.valorDaLente = valorDaLente;
	}
	public String getCorDaLente() {
		return corDaLente;
	}
	public void setCorDaLente(String corDaLente) {
		this.corDaLente = corDaLente;
	}
	
	public void CadLente() {
		//cadastro de Lente
	}
	public void EditLente() {
		
		//editar Lente
	}
	public void DelLente () {
		
		//deletar Lente
	}
	public void BuscLente() {
		// buscar Lente
	}
	public void exibirLente () {
		// buscar pessoa (cliente)
		System.out.println();
		System.out.println("Tipo de lente: " + this.getTipoDeLente());
		System.out.println("Material: " + this.getMaterialDaLente());
		System.out.println("Valor da Lente: "  + this.getValorDaLente());
		System.out.println("Cor da Lente: " + this.getCorDaLente());
		
	}
	
	
	
}
