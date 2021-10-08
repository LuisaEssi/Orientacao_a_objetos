package modelo;

public class Armacao {
	
	private String classificacao; 		// (feminino, masculino, infantil): String 
	private String corDaArmacao; 		//  
	private String materialDaArmacao;
	private String modelo; 				// (aviador, redondo, quadrado, …): String 
	private String marca;
	private double valorDaArmacao;
	
	private int estoqueArmacao;		//associacao
	
	
	// -------------Construtor --------------

	public Armacao(String classificacao, String corDaArmacao, String materialDaArmacao, String modelo, String marca,
			double valorDaArmacao, int estoqueArmacao) {  
		super();
		this.classificacao = classificacao;
		this.corDaArmacao = corDaArmacao;
		this.materialDaArmacao = materialDaArmacao;
		this.modelo = modelo;
		this.marca = marca;
		this.valorDaArmacao = valorDaArmacao;
		this.estoqueArmacao = estoqueArmacao;

	}

	
	
	//get and set
		public String getClassificacao() {
			return classificacao;
		}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getCorDaArmacao() {
		return corDaArmacao;
	}


	public void setCorDaArmacao(String corDaArmacao) {
		this.corDaArmacao = corDaArmacao;
	}

	public String getMaterialDaArmacao() {
		return materialDaArmacao;
	}

	public void setMaterialDaArmacao(String materialDaArmacao) {
		this.materialDaArmacao = materialDaArmacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorDaArmacao() {
		return valorDaArmacao;
	}

	public void setValorDaArmacao(double valorDaArmacao) {
		this.valorDaArmacao = valorDaArmacao;
	}
	
	public int getEstoqueArmacao() {
		return estoqueArmacao;
	}
	
	
	
	public void setEstoqueArmacao(int estoqueArmacao) {
		this.estoqueArmacao = estoqueArmacao;
	}

		
}
