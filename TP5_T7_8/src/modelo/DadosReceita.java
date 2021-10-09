package modelo;

/**Classe para a construção do objeto com dados da receita
 * @author Luisa Caroline
 * @version Out 2021
 */
public class DadosReceita {
	
	private boolean grau; 			 //(se tem grau ou não)
	private String grauEsferico; 
	private String grauCilindrico;
	private String eixo;				 // (ângulo);
	private String foco; 		 	 //(multifocal, perto, longe)
	
	// -------------construtor------------
	
	/**
	 * @param grau boolean verdadeiro ou falso
	 * @param grauEsferico string grau esferico(2.5)
	 * @param grauCilindrico string grau cilindrico (3.5)
	 * @param eixo string com angulo
	 * @param foco string com foco(multifocal, perto, longe)
	 */
	public DadosReceita(boolean grau, String grauEsferico, String grauCilindrico, String eixo, String foco) {
		super();
		this.grau = grau;
		this.grauEsferico = grauEsferico;
		this.grauCilindrico = grauCilindrico;
		this.eixo = eixo;
		this.foco = foco;
	}
	
	//get and set
	
	/**
	 * valida se tem grau
	 * @return verdadeiro ou falso 
	 */
	public boolean isGrau() {
		return grau;
	}

	/**
	 * set grau
	 * @param grau boleano verdadeiro ou falso
	 */
	public void setGrau(boolean grau) {
		this.grau = grau;
	}

	/**
	 * ger Grau esferico
	 * @return grau esferico
	 */
	public String getGrauEsferico() {
		return grauEsferico;
	}

	/**
	 * set grau esferico
	 * @param grauEsferico string do grau esferico
	 */
	public void setGrauEsferico(String grauEsferico) {
		this.grauEsferico = grauEsferico;
	}

	/**
	 * get grau cilindrico
	 * @return grau cilindrico 
	 */
	public String getGrauCilindrico() {
		return grauCilindrico;
	}

	/**
	 * set grau cilindrico
	 * @param grauCilindrico string do grau cilindrico
	 */
	public void setGrauCilindrico(String grauCilindrico) {
		this.grauCilindrico = grauCilindrico;
	}

	/**
	 * get eixo
	 * @return eixo
	 */
	public String getEixo() {
		return eixo;
	}

	/** set eixo
	 * @param eixo string com o eixo
	 */
	public void setEixo(String eixo) {
		this.eixo = eixo;
	}

	/**
	 * get foco
	 * @return foco
	 */
	public String getFoco() {
		return foco;
	}

	/**set foco
	 * @param foco string com foco
	 */
	public void setFoco(String foco) {
		this.foco = foco;
	}
	
}
