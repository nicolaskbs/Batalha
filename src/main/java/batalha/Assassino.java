package batalha;

public class Assassino extends Personagem {

	public Assassino(Integer ataque, Integer defesa, Integer velocidade, Integer resistencia) {
		super(ataque, defesa, velocidade, resistencia);
	}

	@Override
	final protected void checarRegraDeClasse() {
		if (this.getAtaque() <= this.getDefesa()) {
			throw new IllegalStateException("Defesa NÃO deve ser MAIOR OU IGUAL que ataque.");
		}
		if (this.getAtaque() <= this.getResistencia()) {
			throw new IllegalStateException("Resistência NÃO deve ser MAIOR OU IGUAL que Ataque.");
		}
		if (this.getVelocidade() <= this.getDefesa()) {
			throw new IllegalStateException("Defesa NÃO deve ser MAIOR OU IGUAL que Velocidade.");
		}
		if (this.getVelocidade() <= this.getResistencia()) {
			throw new IllegalStateException("Resistência NÃO deve ser MAIOR OU IGUAL que Velocidade.");
		}
	}
}
