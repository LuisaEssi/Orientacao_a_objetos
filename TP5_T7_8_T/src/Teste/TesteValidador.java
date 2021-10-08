package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import controle.*;

class TesteValidador {

	@Test
	void nome() {
		assertFalse(Validador.nome("Cliente 2"));
		assertFalse(Validador.nome(""));
		assertTrue(Validador.nome("Cliente"));
	}

	@Test
	void email() {
		assertFalse(Validador.email("email"));
		assertFalse(Validador.email("@email.com"));
		assertFalse(Validador.email(""));
		assertTrue(Validador.email("email@gmail.com"));
	}

	@Test
	void cpf() {
		assertFalse(Validador.cpf("123456"));
		assertFalse(Validador.cpf(""));
		assertTrue(Validador.cpf("12345678910"));
	}

	@Test
	void telefone() {
		assertFalse(Validador.telefone("12345678"));
		assertFalse(Validador.telefone(""));
		assertTrue(Validador.telefone("0012345678"));
		assertTrue(Validador.telefone("00123456789"));
	}

	@Test
	void valorDoProduto() {
		assertFalse(Validador.valorDoProduto("valor 123"));
		assertFalse(Validador.valorDoProduto(""));
		assertTrue(Validador.valorDoProduto("123"));
	}
	
	@Test
	void estoqueDoProduto() {
		assertFalse(Validador.estoqueDoProduto("est 123"));
		assertFalse(Validador.estoqueDoProduto(""));
		assertTrue(Validador.estoqueDoProduto("123"));
	}

	@Test
	void idDoProduto() {
		assertFalse(Validador.idDoProduto("ID 123"));
		assertFalse(Validador.idDoProduto(""));
		assertTrue(Validador.idDoProduto("123"));
	}


}
