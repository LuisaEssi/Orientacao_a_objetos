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
	
}
