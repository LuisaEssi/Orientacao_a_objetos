package controle;

import modelo.*;

public class ControleObjetos{
	private Dados d = new Dados();
	
	public ControleObjetos() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	
	public void setDados(Dados d) {
		this.d = d;
	}
	public Cliente[] getClientes() {
		return this.d.getClientes();
	}

	public int getQtdclientes() {
		return this.d.getQtdclientes();
	}
	
	public Funcionario[] getFuncionarios() {
		return this.d.getFuncionarios();
	}


	public int getQtdfuncionarios() {
		return this.d.getQtdfuncionarios();
	}

	public DadosReceita[] getDadosReceita() {
		return this.d.getDadosReceita();
	}

	public int getQtddadosReceita() {
		return this.d.getQtddadosReceita();
	}

	public Armacao[] getArmacao() {
		return this.d.getArmacao();
	}

	public int getQtdarmacao() {
		return this.d.getQtdarmacao();
	}

	public Lente[] getLente() {
		return this.d.getLente();
	}


	public int getQtdlente() {
		return this.d.getQtdlente();
	}

	public LenteDeContato[] getContato() {
		return this.d.getContato();
	}

	public int getQtdcontato() {
		return this.d.getQtdcontato();
	}

	public Compra[] getCompra() {
		return this.d.getCompra();
	}

	public int getQtdcompra() {
		return this.d.getQtdcompra();
	}

	public Oculos[] getOculos() {
		return this.d.getOculos();
	}
	
	
	// a posicao 0 do vetor dados indica onde os dados devem ser inseridos
	// os matches indicam as posições que devem conter apenas numeros
	
	public boolean inserirEditarFuncionario(String[] dadosFuncionario) {
		if(!dadosFuncionario[3].matches("[0-9]+") || !dadosFuncionario[4].matches("[0-9]+")) {
			return false;
		} else {
				Funcionario fun = new Funcionario(dadosFuncionario[1], dadosFuncionario[2], dadosFuncionario[3], dadosFuncionario[4],
						dadosFuncionario[5], dadosFuncionario[6], dadosFuncionario[7] );
				
				d.inserirEditarFuncionario(fun, Integer.parseInt(dadosFuncionario[0]));
				return true;
		}
	}

	public boolean inserirEditarCliente(String[] dadosCliente) {
		if(!dadosCliente[3].matches("[0-9]+") || !dadosCliente[4].matches("[0-9]+")) {
			return false;
		} else {
				Cliente cli = new Cliente(dadosCliente[1], dadosCliente[2], dadosCliente[3],dadosCliente[4], dadosCliente[5]);
				d.inserirEditarCliente(cli, Integer.parseInt(dadosCliente[0]));
				return true;
		}
	}
	
	public boolean inserirEditarArmacao(String[] dadosArmacao) {
		if(!dadosArmacao[6].matches("[0-9]+") || !dadosArmacao[7].matches("[0-9]+")) {
			return false;
		} else {
				Armacao arm = new Armacao(dadosArmacao[1], dadosArmacao[2], dadosArmacao[3],dadosArmacao[4], 
											dadosArmacao[5], Double.parseDouble(dadosArmacao[6]), Integer.parseInt(dadosArmacao[7]));
				d.inserirEditarArmacao(arm, Integer.parseInt(dadosArmacao[0]));
				return true;
		}
	}
	
	public boolean inserirEditarLente(String[] dadosLente) {
		if(!dadosLente[3].matches("[0-9]+") || !dadosLente[5].matches("[0-9]+") || !dadosLente[6].matches("[0-9]+") ) {
			return false;
		} else {
				Lente len = new Lente(dadosLente[1], dadosLente[2], Double.parseDouble(dadosLente[3]),dadosLente[4], 
						Integer.parseInt(dadosLente[5]), Integer.parseInt(dadosLente[6]));
				d.inserirEditarLente(len, Integer.parseInt(dadosLente[0]));
				return true;
		}
	}

	public boolean inserirEditarLenteDeContato(String[] dadosContato) {
		if(!dadosContato[6].matches("[0-9]+") || !dadosContato[7].matches("[0-9]+")) {
			return false;
		} else {
				LenteDeContato con = new LenteDeContato(dadosContato[1], dadosContato[2], dadosContato[3],dadosContato[4], 
											dadosContato[5], Integer.parseInt(dadosContato[6]), Double.parseDouble(dadosContato[7]));
				d.inserirEditarLenteDeContato(con, Integer.parseInt(dadosContato[0]));
				return true;
		}
	}
	
	public boolean inserirEditarDadosReceita(String[] dadosReceita) {
		if(!dadosReceita[2].matches("[0-9]+") || !dadosReceita[3].matches("[0-9]+") || !dadosReceita[4].matches("[0-9]+")) {
			return false;
		} else {
				DadosReceita rec = new DadosReceita(Boolean.parseBoolean(dadosReceita[1]), dadosReceita[2], dadosReceita[3],dadosReceita[4], 
											dadosReceita[5]);
				d.inserirEditarDadosReceita(rec, Integer.parseInt(dadosReceita[0]));
				return true;
		}
	}
	
	public boolean inserirEditarCompra(String[] dadosCompra) {
		if(!dadosCompra[2].matches("[0-9]+") || !dadosCompra[3].matches("[0-9]+") || !dadosCompra[8].matches("[0-9]+") || 
				!dadosCompra[9].matches("[0-9]+")) {
			return false;
		} else {
				Compra com = new Compra(dadosCompra[1], Integer.parseInt(dadosCompra[2]), Integer.parseInt(dadosCompra[3]),
						dadosCompra[4], dadosCompra[5], new Cliente(dadosCompra[6], dadosCompra[7], dadosCompra[8],
								dadosCompra[9], dadosCompra[10]));
				d.inserirEditarCompra(com, Integer.parseInt(dadosCompra[0]));
				return true;
		}
	}
	
	public boolean inserirEditarOculos(String[] dadosOculos) {
		if(!dadosOculos[2].matches("[0-9]+") || !dadosOculos[3].matches("[0-9]+") || !dadosOculos[8].matches("[0-9]+") || 
				!dadosOculos[9].matches("[0-9]+")) {
			return false;
		} else {
				Oculos ocu = new Oculos(new Lente(dadosOculos[1], dadosOculos[2], Integer.parseInt(dadosOculos[3]),
						dadosOculos[4], Integer.parseInt(dadosOculos[5]), Integer.parseInt(dadosOculos[6])),
						new Armacao(dadosOculos[7], dadosOculos[8], dadosOculos[9],
						dadosOculos[10], dadosOculos[11], Integer.parseInt(dadosOculos[12]), Integer.parseInt(dadosOculos[13])));
				d.inserirEditarOculos(ocu, Integer.parseInt(dadosOculos[0]));
				return true;
		}
		
	}

	public boolean removerCliente(int i) {
		String clienteRemovido = d.getClientes()[i].getNome();
				
		if(i == (d.getQtdclientes() - 1)) { // O Cliente a ser removido esta no final do array
			d.setQtdclientes(d.getQtdclientes() - 1);
			d.getClientes()[d.getQtdclientes()] = null;
			return true;
		} else { // o Cliente a ser removido esta no meio do array
			int cont = 0;
			while(d.getClientes()[cont].getNome().compareTo(clienteRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdclientes() - 1; j++) {
				d.getClientes()[j] = null;
				d.getClientes()[j] = d.getClientes()[j+1];
			}
			d.getClientes()[d.getQtdclientes()] = null;
			d.setQtdclientes(d.getQtdclientes() - 1);
			return true;
		}
	}
	
	public boolean removerFuncionario(int i) {
		String FuncionarioRemovido = d.getFuncionarios()[i].getNome();

		if(i == (d.getQtdfuncionarios() - 1)) { // O Funcionario a ser removido esta no final do array
			d.setQtdfuncionarios(d.getQtdfuncionarios() - 1);
			d.getFuncionarios()[d.getQtdfuncionarios()] = null;
			return true;
		} else { // o Funcionario a ser removido esta no meio do array
			int cont = 0;
			while(d.getFuncionarios()[cont].getNome().compareTo(FuncionarioRemovido) != 0)
				cont++;
			//Rotina swap
			for(int j = cont; j < d.getQtdfuncionarios() - 1; j++) {
				d.getFuncionarios()[j] = null;
				d.getFuncionarios()[j] = d.getFuncionarios()[j+1];
			}
			d.getFuncionarios()[d.getQtdfuncionarios()] = null;
			d.setQtdfuncionarios(d.getQtdfuncionarios() - 1);
			return true;
		}
		}
	
	
	
	public boolean removerArmacao(int i) {
		String ArmacaoRemovido = d.getArmacao()[i].getMaterialDaArmacao();

		if(i == (d.getQtdarmacao() - 1)) { // O Armacao a ser removida esta no final do array
			d.setQtdarmacao(d.getQtdarmacao() - 1);
			d.getArmacao()[d.getQtdarmacao()] = null;
			return true;
		} else { // o Armacao a ser removida esta no meio do array
			int cont = 0;
			while(d.getArmacao()[cont].getMaterialDaArmacao().compareTo(ArmacaoRemovido) != 0)
				cont++;
			//Rotina swap
			for(int j = cont; j < d.getQtdarmacao() - 1; j++) {
				d.getArmacao()[j] = null;
				d.getArmacao()[j] = d.getArmacao()[j+1];
			}
			d.getFuncionarios()[d.getQtdfuncionarios()] = null;
			d.setQtdfuncionarios(d.getQtdfuncionarios() - 1);
			return true;
		}
		}
	
	
	public boolean removerLente(int i) {
		String LenteRemovido = d.getLente()[i].getMaterialDaLente();

		if(i == (d.getQtdlente() - 1)) { // A Lente a ser removido esta no final do array
			d.setQtdlente(d.getQtdlente() - 1);
			d.getLente()[d.getQtdlente()] = null;
			return true;
		} else { // A Lente ser removido esta no meio do array
			int cont = 0;
			while(d.getLente()[cont].getMaterialDaLente().compareTo(LenteRemovido) != 0)
				cont++;
			//Rotina swap
			for(int j = cont; j < d.getQtdlente() - 1; j++) {
				d.getLente()[j] = null;
				d.getLente()[j] = d.getLente()[j+1];
			}
			d.getLente()[d.getQtdlente()] = null;
			d.setQtdlente(d.getQtdlente() - 1);
			return true;
		}
		}
	
	public boolean removerContato(int i) {
		String ContatoRemovido = d.getContato()[i].getMaterialDaLente();

		if(i == (d.getQtdcontato() - 1)) { // A lente de Contato a ser removido esta no final do array
			d.setQtdcontato(d.getQtdcontato() - 1);
			d.getContato()[d.getQtdcontato()] = null;
			return true;
		} else { // A lente de contato a ser removido esta no meio do array
			int cont = 0;
			while(d.getContato()[cont].getMaterialDaLente().compareTo(ContatoRemovido) != 0)
				cont++;
			//Rotina swap
			for(int j = cont; j < d.getQtdcontato() - 1; j++) {
				d.getContato()[j] = null;
				d.getContato()[j] = d.getContato()[j+1];
			}
			d.getContato()[d.getQtdcontato()] = null;
			d.setQtdcontato(d.getQtdcontato() - 1);
			return true;
		}
		}
}

