package modelo;

public class Lente {
	

	private String tipoDeLente; 		//(antirreflexo, filtro azul): String
	private String materialDaLente; 	// (acrílico, trivex, policarbonato, ...): String 
	private double valorDaLente;
	private String corDaLente;
	
	private int estoqueLente;		//associacao
//	private DadosReceita receita;		//associação
	
	private int lenteID;
	
	
	//	----------construtor------------
	public Lente(String tipoDeLente, String materialDaLente, double valorDaLente, String corDaLente, 
			int lenteID, int estoqueLente) {
		super();
		this.tipoDeLente = tipoDeLente;
		this.materialDaLente = materialDaLente;
		this.valorDaLente = valorDaLente;
		this.corDaLente = corDaLente;
		this.lenteID = lenteID;
		this.estoqueLente = estoqueLente;
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
	
	public int getLenteID() {
		return lenteID;
	}
	public void setLenteID(int lenteID) {
		this.lenteID = lenteID;
	}
		
	public int getEstoqueLente() {
		return estoqueLente;
	}

	public void setEstoqueLente(int estoqueLente) {
		this.estoqueLente = estoqueLente;
	}
		
	
}
