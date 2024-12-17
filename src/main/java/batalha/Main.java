package batalha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		// Definições
		Personagem p1 = new Guerreiro(7, 3, 3, 7);
		Personagem p2 = new Assassino(7, 3, 7, 3);

		Batalha batalha = new Batalha(p1, p2);

		// Escolher personagem
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha uma classe (Guerreiro ou Assassino): ");

		String classe = scanner.nextLine();
		if (classe.equalsIgnoreCase("Guerreiro")) {
			p1 = new Guerreiro(7, 3, 3, 7);
			p2 = new Assassino(7, 3, 7, 3);
		} else if (classe.equalsIgnoreCase("Assassino")) {
			p1 = new Assassino(7, 3, 7, 3);
			p2 = new Guerreiro(7, 3, 3, 7);
		} else {
			System.out.println("Classe inválida");
			System.exit(0);
		}
		System.out.println("Personagem escolhido é: " + classe);

		// Jogar
		while (true) {
			batalha.realizarPrimeiroAtaque();

			if (batalha.temVencedor()) {
				break;
			}

			batalha.realizarSegundoAtaque();

			if (batalha.temVencedor()) {
				break;
			}
		}

		scanner.close();

	}
}
