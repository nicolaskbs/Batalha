package batalha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BatalhaTest {

    @Test
	void testeEvadiu() {
		// Inicializar classe de batalha
        Personagem p1 = new Guerreiro(7, 3, 3, 7);
		Personagem p2 = new Assassino(7, 3, 7, 3);
		Batalha batalha = new Batalha(p1, p2);

		// Verificar se evadiu
		boolean evadiu = batalha.evadiu(50, 30);

		assertTrue(evadiu);
	}

    @Test
	void testeCalcularChanceEvasao() {
		// Inicializar classe de batalha
        Personagem p1 = new Guerreiro(7, 3, 3, 7);
		Personagem p2 = new Assassino(7, 3, 7, 3);
		Batalha batalha = new Batalha(p1, p2);

		// Verificar se evadiu
		int chance = batalha.calcularChanceEvasao(p1, p2);

		assertEquals(chance, 8);
	}
    
}
