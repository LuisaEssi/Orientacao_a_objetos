package controle;

import modelo.*;
/**
* Carrega os dados pré cadastrados, e requisita seus valores nos gets. Faz a verificação dos dados casdatrados e editados e faz a remoção dos dados. 
* @author Luisa Caroline
* @version Out 2021
 */

public class ControleObjetos{
	private Dados d = new Dados();
	
	/**
	 * Método que carrega os dados gerados
	 */
	public ControleObjetos() {
		d.fillWithSomeData();
	}
	/**
	 * Adquire o dado solicitado 
	 * @return retorna o dado d solicitado
	 */
	public Dados getDados() {
		return d;
	}
	
	/**
	 * Seta novos valores nos dados
	 * @param d novos dados inseridos
	 */
	public void setDados(Dados d) {
		this.d = d;
	}
	/**
	 * Adquire cliente e seus dados
	 * @return dados do cliente
	 */
	public Cliente[] getClientes() {
		return this.d.getClientes();
	}
	/**
	 * Adquire quantidade de clientes cadastrados
	 * @return quantidade de clientes cadastrados
	 */
	public int getQtdclientes() {
		return this.d.getQtdclientes();
	}
	/**
	 * Adquire funcionarios e seus dados
	 * @return dados do funcionario
	 */
	public Funcionario[] getFuncionarios() {
		return this.d.getFuncionarios();
	}
	/**
	 * Adquire quantidade de funcionarios cadastrados
	 * @return quantidade de funcionarios cadastrados
	 */

	public int getQtdfuncionarios() {
		return this.d.getQtdfuncionarios();
	}
	/**
	 * Adquire dados da receita e seus detalhes
	 * @return detalhes da receita
	 */
	public DadosReceita[] getDadosReceita() {
		return this.d.getDadosReceita();
	}
	/**
	 * Adquire quantidade de receitas cadastradas
	 * @return quantidade de receitas cadastradas
	 */
	public int getQtddadosReceita() {
		return this.d.getQtddadosReceita();
	}
	/**
	 * Adquire armação e seus dados
	 * @return dados da armacao
	 */
	public Armacao[] getArmacao() {
		return this.d.getArmacao();
	}
	/**
	 * Adquire quantidade de armacoes cadastradas
	 * @return quantidade de armacoes cadastradas
	 */
	public int getQtdarmacao() {
		return this.d.getQtdarmacao();
	}
	/**
	 * Adquire lentes e seus dados
	 * @return dados da lente
	 */
	public Lente[] getLente() {
		return this.d.getLente();
	}
	/**
	 * Adquire quantidade de lentes cadastradas
	 * @return quantidade de lente cadastradas
	 */

	public int getQtdlente() {
		return this.d.getQtdlente();
	}
	/**
	 * Adquire lentes de contatos e seus dados
	 * @return dados da lente de contato
	 */
	public LenteDeContato[] getContato() {
		return this.d.getContato();
	}
	/**
	 * Adquire quantidade de lentes de contato cadastradas
	 * @return quantidade de lentes de contato cadastradas
	 */
	public int getQtdcontato() {
		return this.d.getQtdcontato();
	}
	/**
	 * Adquire a compra e seus dados
	 * @return dados da compra
	 */
	public Compra[] getCompra() {
		return this.d.getCompra();
	}
	/**
	 * Adquire quantidade de compras 
	 * @return quantidade de compras
	 */
	public int getQtdcompra() {
		return this.d.getQtdcompra();
	}
	/**
	 * Adquire oculos e seus dados
	 * @return dados do oculos
	 */
	public Oculos[] getOculos() {
		return this.d.getOculos();
	}
	/**
	 * Adquire quantidade de oculos
	 * @return quantidade de oculos
	 */
	public int getQtdOculos() {
		return this.d.getQtdOculos();
	}
	// a posicao 0 do vetor dados indica onde os dados devem ser inseridos
	// os matches indicam as posições que devem conter apenas numeros
	
	/** 
	 * Insere um novo funcionario ou edita um existente. 
	 * Validando os novos dados inseridos com o método Validador 
	 * @param dadosFuncionario um array de strings a ser verificado que armazena dados
	 * @return verdadeiro ou falso, verifica se os dados do funcionario inseridos estão corretos
	 */
	
	public boolean inserirEditarFuncionario(String[] dadosFuncionario) {	
		if((Validador.nome(dadosFuncionario[1]) && Validador.email(dadosFuncionario[2]) && 
				Validador.telefone(dadosFuncionario[3])  && Validador.cpf(dadosFuncionario[4]) && 
				Validador.todos(dadosFuncionario[5]) &&  Validador.todos(dadosFuncionario[6]) && 
				Validador.todos(dadosFuncionario[7])) == false ) {
			
			return false;
		} else {
				Funcionario fun = new Funcionario(dadosFuncionario[1], dadosFuncionario[2], dadosFuncionario[3], dadosFuncionario[4],
						dadosFuncionario[5], dadosFuncionario[6], dadosFuncionario[7] );
				
				d.inserirEditarFuncionario(fun, Integer.parseInt(dadosFuncionario[0]));
				return true;
		}
	}
	
	/** 
	 * Insere um novo cliente ou edita um existente. 
	 * Validando os novos dados inseridos com o método Validador 
	 * @param dadosCliente um array de strings a ser verificado que armazena dados
	 * @return verdadeiro ou falso, verifica se os dados do cliente inseridos estão corretos
	 */

	public boolean inserirEditarCliente(String[] dadosCliente) {
		if((Validador.nome(dadosCliente[1]) && Validador.email(dadosCliente[2]) && Validador.telefone(dadosCliente[3]) &&
				Validador.cpf(dadosCliente[4]) && Validador.todos(dadosCliente[5])) == false ) {
				return false;
				
		} else {
				Cliente cli = new Cliente(dadosCliente[1], dadosCliente[2], dadosCliente[3],dadosCliente[4], dadosCliente[5]);
				d.inserirEditarCliente(cli, Integer.parseInt(dadosCliente[0]));
				return true;
		}
	}
	
	/** 
	 * Insere uma nova armacao ou edita uma existente. 
	 * Validando os novos dados inseridos com o método Validador 
	 * @param dadosArmacao um array de strings a ser verificado que armazena dados
	 * @return verdadeiro ou falso, verifica se os dados da armacao inseridos estão corretos
	 */
	
	public boolean inserirEditarArmacao(String[] dadosArmacao) {
		if((Validador.todos(dadosArmacao[1]) && Validador.todos(dadosArmacao[2]) && Validador.todos(dadosArmacao[3]) &&  
				Validador.todos(dadosArmacao[4]) && Validador.todos(dadosArmacao[5]) &&  Validador.valorDoProduto(dadosArmacao[6]) &&
				 Validador.numero(dadosArmacao[7])) == false) {
			return false;
		} else {
				Armacao arm = new Armacao(dadosArmacao[1], dadosArmacao[2], dadosArmacao[3],dadosArmacao[4], 
											dadosArmacao[5], Double.parseDouble(dadosArmacao[6]), Integer.parseInt(dadosArmacao[7]));
				d.inserirEditarArmacao(arm, Integer.parseInt(dadosArmacao[0]));
				return true;
		}
	}
	
	/** 
	 * Insere uma nova lente ou edita uma existente. 
	 * Validando os novos dados inseridos com o método Validador 
	 * @param dadosLente um array de strings a ser verificado que armazena dados
	 * @return verdadeiro ou falso, verifica se os dados da lente inseridos estão corretos
	 */
		
	public boolean inserirEditarLente(String[] dadosLente) {
		if((Validador.todos(dadosLente[1]) && Validador.todos(dadosLente[2]) && Validador.valorDoProduto(dadosLente[3]) &&
				Validador.todos(dadosLente[4]) && Validador.numero(dadosLente[5]) && 
				Validador.numero(dadosLente[6])) == false) {
			return false;
		} else {
				Lente len = new Lente(dadosLente[1], dadosLente[2], Double.parseDouble(dadosLente[3]),dadosLente[4], 
						Integer.parseInt(dadosLente[5]), Integer.parseInt(dadosLente[6]));
				d.inserirEditarLente(len, Integer.parseInt(dadosLente[0]));
				return true;
		}
	}
	
	/** 
	 * Insere uma nova lente de contato ou edita uma existente. 
	 * Validando os novos dados inseridos com o método Validador 
	 * @param dadosContato um array de strings a ser verificado que armazena dados
	 * @return verdadeiro ou falso, verifica se os dados da lente de contato inseridos estão corretos
	 */

	public boolean inserirEditarLenteDeContato(String[] dadosContato) {
		if((Validador.todos(dadosContato[1]) && Validador.todos(dadosContato[2]) && Validador.todos(dadosContato[3]) && 
				Validador.todos(dadosContato[4])&& Validador.todos(dadosContato[5]) && 
				Validador.numero(dadosContato[6]) && Validador.valorDoProduto(dadosContato[7])) == false) {
			return false;
		} else {
				LenteDeContato con = new LenteDeContato(dadosContato[1], dadosContato[2], dadosContato[3],dadosContato[4], 
											dadosContato[5], Integer.parseInt(dadosContato[6]), Double.parseDouble(dadosContato[7]));
				d.inserirEditarLenteDeContato(con, Integer.parseInt(dadosContato[0]));
				return true;
		}
	}
	
	/** 
	 * Insere uma nova receita ou edita uma existente. 
	 * Validando os novos dados inseridos com o método Validador 
	 * @param dadosReceita um array de strings a ser verificado que armazena dados
	 * @return verdadeiro ou falso, verifica se os dados da receita inseridos estão corretos
	 */
	
	public boolean inserirEditarDadosReceita(String[] dadosReceita) {
		if((Validador.todos(dadosReceita[1]) && Validador.numero(dadosReceita[2]) &&
				Validador.todos(dadosReceita[3]) && Validador.todos(dadosReceita[4]) &&
				Validador.numero(dadosReceita[4]) && Validador.todos(dadosReceita[5])) == false) {
			return false;
		} else {
				DadosReceita rec = new DadosReceita(Boolean.parseBoolean(dadosReceita[1]), dadosReceita[2], dadosReceita[3],dadosReceita[4], 
											dadosReceita[5]);
				d.inserirEditarDadosReceita(rec, Integer.parseInt(dadosReceita[0]));
				return true;
		}
	}
	
	/** 
	 * Insere uma nova compra ou edita uma existente. 
	 * Validando os novos dados inseridos com o método Validador 
	 * @param dadosCompra um array de strings a ser verificado que armazena dados
	 * @return verdadeiro ou falso, verifica se os dados da compra inseridos estão corretos
	 */
	
	
	public boolean inserirEditarCompra(String[] dadosCompra) {
		if((Validador.todos(dadosCompra[1]) && Validador.numero(dadosCompra[2]) && 
				Validador.numero(dadosCompra[3]) && Validador.todos(dadosCompra[4]) && 
				Validador.todos(dadosCompra[5]) && Validador.todos(dadosCompra[6]) && Validador.todos(dadosCompra[7]) && 
				Validador.numero(dadosCompra[8]) && Validador.numero(dadosCompra[9]) &&
				Validador.todos(dadosCompra[10])) == false ) {
			return false;
		} else {
				Compra com = new Compra(dadosCompra[1], Integer.parseInt(dadosCompra[2]), Integer.parseInt(dadosCompra[3]),
						dadosCompra[4], dadosCompra[5], new Cliente(dadosCompra[6], dadosCompra[7], dadosCompra[8],
								dadosCompra[9], dadosCompra[10]));
				d.inserirEditarCompra(com, Integer.parseInt(dadosCompra[0]));
				return true;
		}
	}
	
	/** 
	 * Insere um novo oculos 
	 * Validando os inseridos com o método Validador 
	 * @param dadosOculos um array de strings a ser verificado que armazena dados
	 * @return verdadeiro ou falso, verifica se os dados da receita inseridos estão corretos
	 */
	
	
	public boolean inserirOculos(String[] dadosOculos) {
		if((Validador.todos(dadosOculos[1]) && Validador.numero(dadosOculos[2]) && Validador.valorDoProduto(dadosOculos[3]) &&
				Validador.todos(dadosOculos[4]) && Validador.numero(dadosOculos[5]) && Validador.numero(dadosOculos[6]) &&
				Validador.todos(dadosOculos[7]) && Validador.todos(dadosOculos[8]) && Validador.todos(dadosOculos[9]) && 
				Validador.todos(dadosOculos[10]) && Validador.todos(dadosOculos[11]) && Validador.valorDoProduto(dadosOculos[12]) && 
				Validador.numero(dadosOculos[13])) == false) {
			return false;
		} else {
				Oculos ocu = new Oculos(new Lente(dadosOculos[1], dadosOculos[2], Integer.parseInt(dadosOculos[3]),
						dadosOculos[4], Integer.parseInt(dadosOculos[5]), Integer.parseInt(dadosOculos[6])),
						new Armacao(dadosOculos[7], dadosOculos[8], dadosOculos[9],
						dadosOculos[10], dadosOculos[11], Integer.parseInt(dadosOculos[12]), Integer.parseInt(dadosOculos[13])));
				d.inserirOculos(ocu, Integer.parseInt(dadosOculos[0]));
				return true;
		}
		
	}

	/**
	 * Remove um cliente da lista de clientes
	 * Confere se o cliente a ser removido está no array 
	 * e subtrai a quantidade de clientes ao encontra-lo e remove-lo
	 * São verificados se: 
	 * (1) o cliente a ser removido está no fim do array
	 * (2) o cliente a ser removido está em alguma posição do array 
	 * E realoca as posições removendo a posicao do cliente removido
	 * @param i indice do cliente a ser removido
	 * @return verdadeiro quando o cliente é removido
	 */
	
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
	
	/**
	 * Remove um funcionario da lista de funcionarios
	 * Confere se o funcionario a ser removido está no array 
	 * e subtrai a quantidade de funcionarios ao encontra-lo e remove-lo
	 * São verificados se: 
	 * (1) o funcionario a ser removido está no fim do array
	 * (2) o funcionario a ser removido está em alguma posição do array 
	 * E realoca as posições removendo a posicao do funcionario removido
	 * @param i indice do funcionario a ser removido
	 * @return verdadeiro quando o funcionario é removido
	 */
	
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
	
	/**
	 * Remove uma armacao da lista de armacoes
	 * Confere se a armacao a ser removido está no array 
	 * e subtrai a quantidade de armacoes ao encontra-la e remove-la
	 * São verificados se : 
	 * (1) a armacao a ser removido está no fim do array
	 * (2) a armacao a ser removido está em alguma posição do array 
	 * E realoca as posições removendo a posicao da armacao removido
	 * @param i indice da armacao a ser removido
	 * @return verdadeiro quando a armacao é removido
	 */
	
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
			d.getArmacao()[d.getQtdarmacao()] = null;
			d.setQtdarmacao(d.getQtdarmacao() - 1);
			return true;
		}
		}
	
	/**
	 * Remove uma lente da lista de lentes
	 * Confere se a lente a ser removido está no array 
	 * e subtrai a quantidade de lentes ao encontra-la e remove-la
	 * São verificados se: 
	 * (1) a lente a ser removido está no fim do array
	 * (2) a lente a ser removido está em alguma posição do array 
	 * E realoca as posições removendo a posicao da lente removido
	 * @param i indice da lente a ser removido
	 * @return verdadeiro quando a lente é removido
	 */
	
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
	/**
	 * Remove uma lente de contato da lista de lente de contatos
	 * Confere se a lente de contato a ser removido está no array 
	 * e subtrai a quantidade de lente de contatos ao encontra-la e remove-la
	 * São verificados se: 
	 * (1) o lente de contato a ser removido está no fim do array
	 * (2) o lente de contato a ser removido está em alguma posição do array 
	 * E realoca as posições removendo a posicao do lente de contato removido
	 * @param i indice do lente de contato a ser removido
	 * @return verdadeiro quando a lente de contato é removido
	 */
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

