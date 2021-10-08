package controle;

import modelo.*;

public class ControleOculos {

	//get and set
	public static double getValorOculos(Lente lente, Armacao armacao){
		double valorOculos;
		valorOculos = lente.getValorDaLente()+armacao.getValorDaArmacao();
		return valorOculos;
	}
	
	
}
