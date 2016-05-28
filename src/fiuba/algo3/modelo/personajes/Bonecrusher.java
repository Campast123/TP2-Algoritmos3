package fiuba.algo3.modelo.personajes;

public class Bonecrusher extends Desepticon {

	public Bonecrusher(){
		this.puntosDeVida = 200;
		this.ataque = 30;
		this.distanciaDeAtaque = 3;
		this.velocidad = 1;
		this.estado = EstadoAlgoformer.HUMANOIDE;
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.estado.equals(EstadoAlgoformer.HUMANOIDE)){
			this.ataque = 30;
			this.distanciaDeAtaque = 3;
			this.velocidad = 1;
			this.estado = EstadoAlgoformer.HUMANOIDE;
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.estado.equals(EstadoAlgoformer.ALTERNO)){
			this.ataque = 30;
			this.distanciaDeAtaque = 3;
			this.velocidad = 8;
			this.estado = EstadoAlgoformer.ALTERNO;
		}
	}
}
