package batalha;

public class Guerreiro extends Personagem {

	public Guerreiro(Integer ataque, Integer defesa, Integer velocidade, Integer resistencia) {
		super(ataque, defesa, velocidade, resistencia);
	}

	@Override
	final protected void checarRegraDeClasse() {
		if (this.getAtaque() <= this.getDefesa()) {
			throw new IllegalStateException("Defesa NÃO deve ser MAIOR OU IGUAL que ataque.");
		}
		if (this.getAtaque() <= this.getVelocidade()) {
			throw new IllegalStateException("Velocidade NÃO deve ser MAIOR OU IGUAL que Ataque.");
		}
		if (this.getResistencia() <= this.getDefesa()) {
			throw new IllegalStateException("Defesa NÃO deve ser MAIOR OU IGUAL que Resistência.");
		}
		if (this.getResistencia() <= this.getVelocidade()) {
			throw new IllegalStateException("Velocidade NÃO deve ser MAIOR OU IGUAL que Resistência.");
		}
	}

}
