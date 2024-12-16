package test.java.batalha;

import main.java.batalha.Personagem;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonagemTest {

	@Test
	void testeChecarValorMinimo() {

		assertThrows(IllegalStateException.class, () -> {
			new Personagem(7, 3, 3, 7) {
				@Override
				protected void checarRegraDeClasse() {
					// Deixado em branco de propósito
				}
			};
		});
	}
	
	@Test
	void testeChecarTotalIgualA20_NaoLancaExcecao() {

		assertDoesNotThrow( () -> {
			new Personagem(7,6,4,3) {
				@Override
				protected void checarRegraDeClasse() {
					// Deixado em branco de propósito
				}
			};
		});
	}
	
	@Test
	void testeChecarTotalIgualA19_LancaExcecao() {

		assertThrows(IllegalStateException.class, () -> {
			new Personagem(7,5,4,3) {
				@Override
				protected void checarRegraDeClasse() {
					// Deixado em branco de propósito
				}
			};
		});
	}
	
	@Test
	void testeChecarTotalIgualA21_LancaExcecao() {
		
		assertThrows(IllegalStateException.class, () -> {
			new Personagem(9, 5, 4, 3) {
				@Override
				protected void checarRegraDeClasse() {
					// Deixado em branco de propósito
				}
			};
		});
	}

	@Test
	void testeVerificarDanoCritico() {
		// Inicializar personagem atacante
		Personagem p1 = new Personagem(7, 3, 3, 7) {
			@Override
			protected void checarRegraDeClasse() {
				// Deixado em branco de propósito
			}
		};

		// Verificar dano
		int dano = p1.verificarDanoCritico(7);

		assertTrue(dano == 7 || dano == 10);
	}

	@Test
	void testeCalcularDanoBase() {
		// Inicializar personagem atacante
		Personagem p1 = new Personagem(7, 3, 3, 7) {
			@Override
			protected void checarRegraDeClasse() {
				// Deixado em branco de propósito
			}

		};

		// Verificar dano
		int dano = p1.calcularDanoBase();
		boolean danoCorreto = dano >= 5 && dano <= 8;

		assertTrue(danoCorreto);
	}

}
