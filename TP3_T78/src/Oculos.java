
public class Oculos {
	
	private Armacao armacao; 	//composicao
	private Lente lente;		//composicao
		
	
	// ----------construtor-------------
	
	
	public Oculos(Armacao armacao, Lente lente) {
		super();
		this.armacao = armacao;
		this.lente = lente;
	}
	
	//get and set
	
	public Armacao getArmacao() {
		return armacao;
	}

	public void setArmacao(Armacao armacao) {
		this.armacao = armacao;
	}


	public Lente getLente() {
		return lente;
	}


	public void setLente(Lente lente) {
		this.lente = lente;
	}
	
	//get and set
	
		
	//-------------Metodos-----------------
	
	public void somaValor() {
		//cadastro soma valor lente + armacao
	}
	
	public void exibirOculos() {
		//cadastro soma valor lente + armacao
		System.out.println();
		System.out.println("Oculos" + this.getArmacao()+this.getLente());
		
	}

}
