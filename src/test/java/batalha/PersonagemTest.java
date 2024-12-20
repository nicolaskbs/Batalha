package batalha;

//import batalha.Personagem;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PersonagemTest {

	@ParameterizedTest
	@CsvSource({
			"5, 5, 5, 4", // soma resulta em 19
			"5, 5, 5, 6" // soma resulta em 21
	})
	void testeSomaTotal_LancaExcecao(Integer ataque,
									 Integer defesa,
									 Integer velocidade,
									 Integer resistencia) {

		assertThrows(IllegalStateException.class, () ->
			new Personagem(ataque,defesa,velocidade,resistencia) {
				@Override
				protected void checarRegraDeClasse() {
					// Deixado em branco de propósito
				}
			}
		);
	}

	@Test
	void testeSomaTotal_NAOLancaExcecao() {

		assertDoesNotThrow( () -> {
			new Personagem(5,5,5,5) {
				@Override
				protected void checarRegraDeClasse() {
					// Deixado em branco de propósito
				}
			};
		});
	}

	@ParameterizedTest
	@CsvSource({
			"2, 6, 6, 6", // Ataque 2
			"6, 2, 6, 6", // Defesa 2
			"6, 6, 2, 6", // Velocidade 2
			"6, 6, 6, 2"  // Resistência 2
	})
	void testeValorMinimoAtributo_LancaExcecao(Integer ataque,
											   Integer defesa,
											   Integer velocidade,
											   Integer resistencia) {

		assertThrows(IllegalStateException.class, () ->
			new Personagem(ataque, defesa, velocidade, resistencia) {
				@Override
				protected void checarRegraDeClasse() {
					// Deixado em branco de propósito
				}
			}
		);
	}

	@ParameterizedTest
	@CsvSource({
			"3, 5, 6, 6",  // Ataque 3
			"4, 5, 6, 5",  // Ataque 4
			"6, 3, 5, 6",  // Defesa 3
			"6, 4, 5, 5",  // Defesa 4
			"6, 6, 3, 5",  // Velocidade 3
			"6, 5, 4, 5",  // Velocidade 4
			"6, 5, 6, 3",  // Resistência 3
			"5, 5, 6, 4"   // Resistência 4
	})
	void testeValorMinimoAtributo_NAOLancaExcecao(Integer ataque,
												  Integer defesa,
												  Integer velocidade,
												  Integer resistencia) {

		assertDoesNotThrow( () -> {
			new Personagem(ataque, defesa, velocidade, resistencia) {
				@Override
				protected void checarRegraDeClasse() {
					// Deixado em branco de propósito
				}
			};
		});
	}

	@ParameterizedTest
	@CsvSource({
			"4, 4, 3, 9",  // Ataque = Defesa
			"4, 3, 4, 9",  // Ataque = Velocidade
			"9, 4, 3, 4",  // Resistencia = Defesa
			"9, 3, 4, 4"  // Resistencia = Velocidade
	})
	void testeGuerreiro_LancaExcecao(Integer ataque,
									 Integer defesa,
									 Integer velocidade,
									 Integer resistencia) {

		assertThrows(IllegalStateException.class, () ->
				new Guerreiro(ataque, defesa, velocidade, resistencia)
		);
	}

	@ParameterizedTest
	@CsvSource({
			"4, 4, 3, 9",  // Ataque = Defesa
			"4, 3, 9, 4",  // Ataque = Resistencia
			"9, 4, 4, 3",  // Velocidade = Defesa
			"9, 3, 4, 4"  // Velocidade = Resistencia
	})
	void testeAssassino_LancaExcecao(Integer ataque,
									 Integer defesa,
									 Integer velocidade,
									 Integer resistencia) {

		assertThrows(IllegalStateException.class, () ->
				new Assassino(ataque, defesa, velocidade, resistencia)
		);
	}

	@Test
	void testeGuerreiro_NAOLancaExcecao() {

		assertDoesNotThrow( () ->
			new Guerreiro(7,3,4,6)
		);
	}

	@Test
	void testeAssassino_NAOLancaExcecao() {

		assertDoesNotThrow( () ->
				new Assassino(6,3,7,4)
		);
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
