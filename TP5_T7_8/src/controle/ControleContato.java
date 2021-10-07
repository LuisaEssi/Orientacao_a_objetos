package controle;
import modelo.*;

public class ControleContato {
	private LenteDeContato[] con;
	private int qtdContato;
	
	public ControleContato(ControleObjetos d) {
		con = d.getContato();
		qtdContato = d.getQtdcontato();
		
	}
	
	public String[] getDadosContato() {
		String[] s = new String[qtdContato];
		for(int i = 0; i < qtdContato; i++) {
			s[i] = "Lente "+ con[i].getMaterialDaLente()+" com descarte "+con[i].getTipoDeDescarte();
		}
		
		return s;
	}
	
	public int getQtdcontato() {
		return qtdContato;
	}

	
	public void setQtdcontato(int qtdContato) {
		this.qtdContato= qtdContato;
	}
	public String getMaterialDaLente(int i) {		
		return con[i].getMaterialDaLente();
	}
	
	public String getTipoDeDescarte(int i) {		
		return con[i].getTipoDeDescarte();
	}
	public String getMarca(int i) {		
		return con[i].getMarca();
	}
	
	public String getCor(int i) {		
		return con[i].getCor();
	}
	
	public String getValorContato(int i) {
		String valorContato = String.valueOf(con[i].getValorContato());
		return valorContato;
	}
	
	public String getProdutosDeHig(int i) {		
		return con[i].getProdutosDeHig();
	}

	public String getEstoqueContato(int i) {	
		String numEstoque = String.valueOf(con[i].getEstoqueContato());
		return numEstoque;
	}
	

	
}
