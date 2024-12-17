package batalha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		// Definições
		Personagem p1 = new Guerreiro(7, 3, 3, 7);
		Personagem p2 = new Assassino(7, 3, 7, 3);

		Batalha batalha = new Batalha(p1, p2);

		Scanner scanner = new Scanner(System.in);

		// Escolher personagem
		System.out.println("Escolha uma classe (Guerreiro ou Assassino): ");
		String classe = scanner.nextLine();

		if (classe.equalsIgnoreCase("Guerreiro")) {
			// Distribuir pontos Guerreiro
			while (true) {
				try {
					System.out.println("Distribua 20 pontos de atributos do personagem (Ataque,Defesa,Velocidade,Resistência): ");
					String pontos = scanner.nextLine();
					String[] pontosArray = pontos.split(",");
					p1 = new Guerreiro(
						Integer.parseInt(pontosArray[0]), 
						Integer.parseInt(pontosArray[1]),
						Integer.parseInt(pontosArray[2]), 
						Integer.parseInt(pontosArray[3])
					);
					break;
				} catch (Exception e) {
					System.out.println("Valores inválidos. Por favor, tente novamente.");
				}
			}
			p2 = new Assassino(7, 3, 7, 3);
		} else if (classe.equalsIgnoreCase("Assassino")) {
			// Distribuir pontos Assassino
			while (true) {
				try {
					System.out.println("Distribua 20 pontos de atributos do personagem (Ataque,Defesa,Velocidade,Resistência): ");
					String pontos = scanner.nextLine();
					String[] pontosArray = pontos.split(",");
					p1 = new Assassino(
						Integer.parseInt(pontosArray[0]), 
						Integer.parseInt(pontosArray[1]),
						Integer.parseInt(pontosArray[2]), 
						Integer.parseInt(pontosArray[3])
					);
					break;
				} catch (Exception e) {
					System.out.println("Valores inválidos. Por favor, tente novamente.");
				}
			}
			p2 = new Guerreiro(7, 3, 3, 7);
		} else {
			System.out.println("Classe inválida");
			System.exit(0);
		}
		System.out.println("O personagem escolhido é: " + classe);
		System.out.println("Os atributos foram distribuidos da seguinte forma " +
			"\n Ataque: " + p1.getAtaque() +
			"\n Defesa: " + p1.getDefesa() +
			"\n Velocidade: " + p1.getVelocidade() +
			"\n Resistência: " + p1.getResistencia()
		);

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
