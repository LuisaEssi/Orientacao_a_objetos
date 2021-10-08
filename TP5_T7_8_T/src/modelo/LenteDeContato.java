package modelo;
public class LenteDeContato {
	
	private String materialDaLente; 			// (gelatinosa, higrogel, ...): String 
	private String tipoDeDescarte; 				// (diario, quinzenal, mensal, ): String 
	private String marca; 
	private String cor;
	private String produtosDeHig; 				// (soluções, colírios, estojos, ….): String
	private double valorContato;				//valor da lente de contato
	
	private int estoqueContato; 				//associacao
//	private DadosReceita receita;				//associação
	
	//---------construtor----------
	public LenteDeContato(String materialDaLente, String tipoDeDescarte, String marca, String cor, String produtosDeHig, int estoqueContato,
			double valorContato) {
		super();
		this.materialDaLente = materialDaLente;
		this.tipoDeDescarte = tipoDeDescarte;
		this.marca = marca;
		this.cor = cor;
		this.produtosDeHig = produtosDeHig;
		this.estoqueContato = estoqueContato;
		this.valorContato = valorContato;
//		this.receita = receita;
	}

	
	// get and set
	public String getMaterialDaLente() {
		return materialDaLente;
	}

	public void setMaterialDaLente(String materialDaLente) {
		this.materialDaLente = materialDaLente;
	}
	public String getTipoDeDescarte() {
		return tipoDeDescarte;
	}
	public void setTipoDeDescarte(String tipoDeDescarte) {
		this.tipoDeDescarte = tipoDeDescarte;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getProdutosDeHig() {
		return produtosDeHig;
	}

	public void setProdutosDeHig(String produtosDeHig) {
		this.produtosDeHig = produtosDeHig;
	}
	
	public int getEstoqueContato() {
		return estoqueContato;
	}

	public void setEstoqueContato(int estoqueContato) {
		this.estoqueContato = estoqueContato;
	}
	
	public double getValorContato() {
		return valorContato;
	}


	public void setValorContato(double valorContato) {
		this.valorContato = valorContato;
	}
	
	
}
