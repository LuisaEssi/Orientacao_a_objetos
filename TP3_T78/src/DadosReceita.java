
public class DadosReceita {
	
	private boolean grau; 			 //(se tem grau ou não)
	private String grauEsferico; 
	private String grauCilindrico;
	private String eixo;				 // (ângulo);
	private String foco; 		 	 //(multifocal, perto, longe)
	
	// -------------construtor------------
	
	public DadosReceita(boolean grau, String grauEsferico, String grauCilindrico, String eixo, String foco) {
		super();
		this.grau = grau;
		this.grauEsferico = grauEsferico;
		this.grauCilindrico = grauCilindrico;
		this.eixo = eixo;
		this.foco = foco;
	}
	
	//get and set
	
	public boolean isGrau() {
		return grau;
	}

	public void setGrau(boolean grau) {
		this.grau = grau;
	}

	public String getGrauEsferico() {
		return grauEsferico;
	}

	public void setGrauEsferico(String grauEsferico) {
		this.grauEsferico = grauEsferico;
	}

	public String getGrauCilindrico() {
		return grauCilindrico;
	}

	public void setGrauCilindrico(String grauCilindrico) {
		this.grauCilindrico = grauCilindrico;
	}

	public String getEixo() {
		return eixo;
	}

	public void setEixo(String eixo) {
		this.eixo = eixo;
	}

	public String getFoco() {
		return foco;
	}

	public void setFoco(String foco) {
		this.foco = foco;
	}
	
	//-------------Metodos-----------------

	public void cadDados() {
		//cadastro de Dados				
	}	

	public void editDados() {
		
		//editar Dados
	}
	public void delDados () {
		
		//deletar Dados
	}
	public void euscarDados () {
		
		//deletar Dados
	}
	public void exibirDados() {
		// buscar Dados	
		System.out.println();
		System.out.println("O óculos tem grau?" + this.getGrauEsferico());
		System.out.println("Grau esférico " + this.getGrauEsferico());
		System.out.println("Grau Cilíndrico: " + this.getGrauCilindrico());
		System.out.println("Eixo: " + this.getEixo());
		System.out.println("Foco: " + this.getFoco());
		
	}		
	
}
