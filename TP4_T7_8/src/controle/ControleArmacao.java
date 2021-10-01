package controle;
import modelo.*;

public class ControleArmacao {
	private Armacao[] arm;
	private int qtdArmacao;
	
	public ControleArmacao(ControleObjetos d) {
		arm = d.getArmacao();
		qtdArmacao = d.getQtdarmacao();
		
	}
	
	public String[] getDadosArmacao() {
		String[] s = new String[qtdArmacao];
		for(int i = 0; i < qtdArmacao; i++) {
			s[i] = "Armação "+ arm[i].getMaterialDaArmacao()+" "+arm[i].getCorDaArmacao();
		}
		return s;
	}
	
	public int getQtdarmacao() {
		return qtdArmacao;
	}

	
	public void setQtdarmacao(int qtdArmacao) {
		this.qtdArmacao= qtdArmacao;
	}
	public String getMaterialDaArmacao(int i) {		
		return arm[i].getMaterialDaArmacao();
	}
	
	public String getClassificacao(int i) {		
		return arm[i].getClassificacao();
	}
	
	public String getCorDaArmacao(int i) {		
		return arm[i].getCorDaArmacao();
	}
	
	public String getValorDaArmacao(int i) {
		String valorArm= String.valueOf(arm[i].getValorDaArmacao());
		return valorArm;
	}
	
	public String getModelo(int i) {		
		return arm[i].getModelo();
	}
	
	public String getMarca(int i) {		
		return arm[i].getMarca();
	}
	
	public String getEstoqueArmacao(int i) {	
		String estoArm= String.valueOf(arm[i].getEstoqueArmacao());
		return estoArm;
	}
		
}


