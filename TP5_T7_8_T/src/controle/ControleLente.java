package controle;
import modelo.*;

public class ControleLente {
	private Lente[] len;
	private int qtdLente;
	
	public ControleLente(ControleObjetos d) {
		len = d.getLente();
		qtdLente = d.getQtdlente();
		
	}
	
	public String[] getDadosLente() {
		String[] s = new String[qtdLente];
		for(int i = 0; i < qtdLente; i++) {
			s[i] = "Lente "+ len[i].getMaterialDaLente()+" "+len[i].getCorDaLente();
		}
		
		return s;
	}
	
	
	public String[] getPesquisaLente(String pesLen) {
		String[] s = new String[qtdLente];
		for(int i = 0; i < qtdLente; i++) {
			if ((len[i].getMaterialDaLente()).contains(pesLen)) {
				s[i] = "Lente "+ len[i].getMaterialDaLente()+" "+len[i].getCorDaLente();
			}
		} 
		return s;
	}
	
	
	
	public int getQtdlente() {
		return qtdLente;
	}

	
	public void setQtdlente(int qtdLente) {
		this.qtdLente= qtdLente;
	}
	public String getMaterialDaLente(int i) {		
		return len[i].getMaterialDaLente();
	}
	
	public String getTipoDeLente(int i) {		
		return len[i].getTipoDeLente();
	}
	
	public String getCorDaLente(int i) {		
		return len[i].getCorDaLente();
	}
	
	public String getValorDaLente(int i) {
		String valorLente= String.valueOf(len[i].getValorDaLente());
		return valorLente;
	}
	
	public String getLenteID(int i) {	
		String lenteID = String.valueOf(len[i].getLenteID());
		return lenteID;
	}
	
	public String getEstoqueLente(int i) {	
		String estoqueLente = String.valueOf(len[i].getEstoqueLente());
		return estoqueLente;
	}
	
	
	

	
}


