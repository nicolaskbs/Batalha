package batalha;

public class Assassino extends Personagem {

	public Assassino(Integer ataque, Integer defesa, Integer velocidade, Integer resistencia) {
		super(ataque, defesa, velocidade, resistencia);
	}

	@Override
	final protected void checarRegraDeClasse() {
		if (this.getAtaque() != this.getVelocidade()) {
			throw new IllegalStateException("Ataque e Velocidade devem ser iguais.");
		}
		if (this.getDefesa() > this.getAtaque()) {
			throw new IllegalStateException("Defesa não pode ser maior que Ataque.");
		}
		if (this.getResistencia() > this.getAtaque()) {
			throw new IllegalStateException("Resistencia não pode ser maior que Ataque.");
		}
	}
}
