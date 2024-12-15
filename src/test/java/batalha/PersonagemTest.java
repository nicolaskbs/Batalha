package batalha;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonagemTest {

	@Test
	void testeChecarValorMinimo() {
		// Inicializar personagem
		Personagem p = new Personagem() {
			@Override
			void checarRegraDeClasse() {
				// Deixado em branco de propósito
			}
		};
		p.setAtaque(7);
		p.setDefesa(3);
		p.setResistencia(3);
		p.setVelocidade(7);

		assertThrows(IllegalStateException.class, ()->p.checarValorMinimo(3));
	}
	
	@Test
	void testeChecarTotalIgualA20_NaoLancaExcecao() {
		Personagem p = new Personagem() {
			@Override
			void checarRegraDeClasse() {
				// Deixado em branco de propósito
			}
		};
		
		Integer ataque = 7;
		Integer defesa = 6;
		Integer velocidade = 4;
		Integer resistencia = 3;
		
		p.setAtaque(ataque);
		p.setDefesa(defesa);
		p.setResistencia(resistencia);
		p.setVelocidade(velocidade);
		
		assertDoesNotThrow(()->p.checarTotal());
	}
	
	@Test
	void testeChecarTotalIgualA19_LancaExcecao() {
		Personagem p = new Personagem() {
			@Override
			void checarRegraDeClasse() {
				// Deixado em branco de propósito
			}
		};
		
		Integer ataque = 7;
		Integer defesa = 5;
		Integer velocidade = 4;
		Integer resistencia = 3;
		
		p.setAtaque(ataque);
		p.setDefesa(defesa);
		p.setResistencia(resistencia);
		p.setVelocidade(velocidade);
		
		assertThrows(IllegalStateException.class, ()->p.checarTotal());
	}
	
	@Test
	void testeChecarTotalIgualA21_LancaExcecao() {
		Personagem p = new Personagem() {
			@Override
			void checarRegraDeClasse() {
				// Deixado em branco de propósito
			}
		};
		
		Integer ataque = 9;
		Integer defesa = 5;
		Integer velocidade = 4;
		Integer resistencia = 3;
		
		p.setAtaque(ataque);
		p.setDefesa(defesa);
		p.setResistencia(resistencia);
		p.setVelocidade(velocidade);
		
		assertThrows(IllegalStateException.class, ()->p.checarTotal());
	}

	@Test
	void testeVerificarDanoCritico() {
		// Inicializar personagem atacante
		Personagem p1 = new Personagem() {
			@Override
			void checarRegraDeClasse() {
				// Deixado em branco de propósito
			}
		};
		p1.setAtaque(7);
		p1.setDefesa(3);
		p1.setResistencia(3);
		p1.setVelocidade(7);

		// Verificar dano
		int dano = p1.verificarDanoCritico(7);

		assertTrue(dano == 7 || dano == 10);
	}

	@Test
	void testeCalcularDanoBase() {
		// Inicializar personagem atacante
		Personagem p1 = new Personagem() {
			@Override
			void checarRegraDeClasse() {
				// Deixado em branco de propósito
			}
		};
		p1.setAtaque(7);
		p1.setDefesa(3);
		p1.setResistencia(3);
		p1.setVelocidade(7);

		// Verificar dano
		int dano = p1.calcularDanoBase();
		boolean danoCorreto = dano >= 5 && dano <= 8;

		assertTrue(danoCorreto);
	}

}
