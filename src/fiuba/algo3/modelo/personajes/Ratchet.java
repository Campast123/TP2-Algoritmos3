package fiuba.algo3.modelo.personajes;

public class Ratchet extends Autobot {
	
	public Ratchet(){
		this.puntosDeVida = 150;
		this.ataque = 35;
		this.distanciaDeAtaque = 2;
		this.velocidad = 8;
		this.estado = EstadoAlgoformer.ALTERNO;
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.estado.equals(EstadoAlgoformer.HUMANOIDE)){
			this.ataque = 5;
			this.distanciaDeAtaque = 5;
			this.velocidad = 1;
			this.estado = EstadoAlgoformer.HUMANOIDE;
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.estado.equals(EstadoAlgoformer.ALTERNO)){
			this.ataque = 35;
			this.distanciaDeAtaque = 2;
			this.velocidad = 8;
			this.estado = EstadoAlgoformer.ALTERNO;
		}
	}
}
