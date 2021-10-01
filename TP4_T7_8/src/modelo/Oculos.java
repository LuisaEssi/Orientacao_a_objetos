package modelo;

public class Oculos {
	
	private Lente lente;// composicao
	private Armacao armacao;

	
	// ----------construtor-------------
	public Oculos(Lente lente, Armacao armacao) {
		super();
		this.lente = lente;
		this.armacao = armacao;
	}

	//get and set
	public double getValorOculos(){
		double valorOculos;
		valorOculos = lente.getValorDaLente()+armacao.getValorDaArmacao();
		return valorOculos;
	}
	
	
	public void exibirOculos() {
		//cadastro soma valor lente + armacao
		System.out.println();
		System.out.println("Óculos: Armação " + armacao.getCorDaArmacao() + " com lente "+ lente.getTipoDeLente());
		System.out.println("Valor do Óculos: " + this.getValorOculos());
	}

	public String getTipoDeLente() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
