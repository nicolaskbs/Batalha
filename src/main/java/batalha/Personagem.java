package batalha;

import java.security.SecureRandom;

public abstract class Personagem {
	private Integer ataque;

	private Integer defesa;

	private Integer velocidade;

	private Integer resistencia;

	private Integer vida;

	Personagem() {
	}

	public Personagem(Integer ataque, Integer defesa, Integer velocidade, Integer resistencia) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.velocidade = velocidade;
		this.resistencia = resistencia;

		checarTotal();
		checarValorMinimo();
		checarRegraDeClasse();

		this.vida = 5 * this.resistencia;
	}

	abstract void checarRegraDeClasse();

	private void checarValorMinimo() {
		checarValorMinimo(ataque);
		checarValorMinimo(defesa);
		checarValorMinimo(velocidade);
		checarValorMinimo(resistencia);
	}

	final void checarValorMinimo(Integer atributo) {
		if (atributo < 3){
			throw new IllegalStateException("Atributo não pode ser menor que 3.");
		}
	}

	final void checarTotal() {
		if (this.ataque + this.defesa + this.velocidade + this.resistencia != 20) {
			throw new IllegalStateException("Somatório dos atributos deve ser igual a 20.");
		}
	}

	public void atacar(Personagem defensor) {
		int dano = this.calcularDano(defensor.getDefesa());
		defensor.receberDano(dano);
	}

	int calcularDano(int defesa) {
		int danoBase = this.calcularDanoBase();
		int dano = danoBase + this.getAtaque() - defesa;

		// Aplicar dano critico
		dano = verificarDanoCritico(dano);

		// Verificar menor que 1
		if (dano < 1) {
			dano = 1;
		}

		return dano;
	}

	int verificarDanoCritico(int dano){
		final SecureRandom random = new SecureRandom();
		boolean eGolpeCritico = random.nextInt(1, 101) <= 10;
		if (eGolpeCritico) {
			dano *= 1.5;
		}

		return dano;
	}

	private void receberDano(int dano) {
		this.vida -= dano;
	}

	public int calcularDanoBase() {
		final SecureRandom random = new SecureRandom();

		int danoBaseMin = (int) Math.round(0.8d * this.ataque);
		int danoBaseMax = (int) Math.round(1.2d * this.ataque);

		int danoBase = new SecureRandom().nextInt(danoBaseMin, 1 + danoBaseMax);

		return danoBase;
	}
	
	public Integer getAtaque() {
		return ataque;
	}

	void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

	public Integer getResistencia() {
		return resistencia;
	}

	void setResistencia(Integer resistencia) {
		this.resistencia = resistencia;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}
}
