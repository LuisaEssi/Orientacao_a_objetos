
public class Armacao {
	
	private String classificacao; 		// (feminino, masculino, infantil): String 
	private String corDaArmacao; 		//  
	private String materialDaArmacao;
	private String modelo; 							// (aviador, redondo, quadrado, …): String 
	private String marca;
	private double valorDaArmacao;
	
	private Estoque estoqueArmacao;	//associacao
	
	
	// -------------Construtor --------------
	
		
	//get and set
	public String getClassificacao() {
		return classificacao;
	}


	public Armacao(String classificacao, String corDaArmacao, String materialDaArmacao, String modelo, String marca,
			double valorDaArmacao) {  // Estoque estoqueArmacao
		super();
		this.classificacao = classificacao;
		this.corDaArmacao = corDaArmacao;
		this.materialDaArmacao = materialDaArmacao;
		this.modelo = modelo;
		this.marca = marca;
		this.valorDaArmacao = valorDaArmacao;
//		this.estoqueArmacao = estoqueArmacao;
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
	
	public Estoque getEstoqueArmacao() {
	return estoqueArmacao;
	}

	public void setEstoqueArmacao(Estoque estoqueArmacao) {
		this.estoqueArmacao = estoqueArmacao;
	}
	
	
	//-------------Metodos-----------------




		public void CadArm() {
			//cadastro de Armacao
		}
		public void EditArm() {
			
			//editar Armacao
		}
		public void DelArm () {
			
			//deletar Armacao
		}
		public void BuscArm() {
			// buscar Armacao
				
		}
		public void exibirArm () {
			// buscar pessoa (cliente)
			System.out.println();
			System.out.println("Classificação: " + this.getClassificacao());
			System.out.println("Cor: " + this.getCorDaArmacao());
			System.out.println("Material: "  + this.getMaterialDaArmacao());
			System.out.println("Modelo: " + this.getModelo());
			System.out.println("Marca: " + this.getMarca());
			System.out.println("Valor da Armação: " + this.getValorDaArmacao());
			
		}
	
		
}
