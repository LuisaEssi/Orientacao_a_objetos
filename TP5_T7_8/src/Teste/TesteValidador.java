package Teste;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import controle.*;

/**
 * Faz o teste da classe validador. 
 * @author Luisa Caroline
 * @version Out 2021
 */
class TesteValidador {

	/**
	 * Teste de Nome com 3 entradas
	 * (1) "Cliente 2"
	 * (2) ““
	 * (3) "Cliente"
	 */
	@Test
	
	void nome() {
		
		assertFalse(Validador.nome("Cliente 2"));
		assertFalse(Validador.nome(""));
		assertTrue(Validador.nome("Cliente"));
	}

	/**
	 * Teste de email com 4 entradas
	 * (1) "email"
	 * (2) "@email.com"
	 * (3) ""
	 * (4) "email@gmail.com"
	 */
	@Test
	void email() {
		assertFalse(Validador.email("email"));
		assertFalse(Validador.email("@email.com"));
		assertFalse(Validador.email(""));
		assertTrue(Validador.email("email@gmail.com"));
	}

	/**
	 * Teste de cpf com 3 entradas
	 * (1) "123456"
	 * (2) ""
	 * (3) "12345678910"
	 */
	@Test
	void cpf() {
		assertFalse(Validador.cpf("123456"));
		assertFalse(Validador.cpf(""));
		assertTrue(Validador.cpf("12345678910"));
	}
	/**
	 * Teste de telfone com 4 entradas
	 * (1) "12345678"
	 * (2) ""
	 * (3) "0012345678"
	 * (4) "00123456789"
	 */

	@Test
	void telefone() {
		assertFalse(Validador.telefone("12345678"));
		assertFalse(Validador.telefone(""));
		assertTrue(Validador.telefone("0012345678"));
		assertTrue(Validador.telefone("00123456789"));
	}

	/**
	 * Teste do valor do produto com 4 entradas
	 * (1) "valor 123"
	 * (2) ""
	 * (3) "123"
	 * (4) "123.4"
	 */
	@Test
	void valorDoProduto() {
		assertFalse(Validador.valorDoProduto("valor 123"));
		assertFalse(Validador.valorDoProduto(""));
		assertTrue(Validador.valorDoProduto("123"));
		assertTrue(Validador.valorDoProduto("123.4"));
	}
	
	/**
	 * Teste de numero com 3 entradas
	 * (1) "est 123"
	 * (2) ""
	 * (3) "123"
	 */
	@Test
	void numero() {
		assertFalse(Validador.numero("est 123"));
		assertFalse(Validador.numero(""));
		assertTrue(Validador.numero("123"));
	}
	
	/**
	 * Teste de todos os dados com 2 entradas
	 * (1) "Qualquer dado"
	 * (2) ""
	 */
	@Test
	void todos() {
		assertTrue(Validador.todos("Qualquer dado"));
		assertFalse(Validador.todos(""));
	}


}
