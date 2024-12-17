package batalha;

public class Guerreiro extends Personagem {

	public Guerreiro(Integer ataque, Integer defesa, Integer velocidade, Integer resistencia) {
		super(ataque, defesa, velocidade, resistencia);
	}

	@Override
	final protected void checarRegraDeClasse() {
		if (this.getAtaque() != this.getResistencia()) {
			throw new IllegalStateException("Ataque e Resistencia devem ser iguais.");
		}
		if (this.getDefesa() > this.getAtaque()) {
			throw new IllegalStateException("Defesa não pode ser maior que Ataque.");
		}
		if (this.getVelocidade() > this.getAtaque()) {
			throw new IllegalStateException("Velocidade não pode ser maior que Ataque.");
		}
	}

}
