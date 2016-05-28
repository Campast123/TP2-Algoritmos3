package fiuba.algo3.modelo.personajes;

public class Frenzy extends Desepticon {

	public Frenzy(){
		this.puntosDeVida = 400;
		this.ataque = 10;
		this.distanciaDeAtaque = 5;
		this.velocidad = 2;
		this.estado = EstadoAlgoformer.HUMANOIDE;
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.estado.equals(EstadoAlgoformer.HUMANOIDE)){
			this.ataque = 10;
			this.distanciaDeAtaque = 5;
			this.velocidad = 2;
			this.estado = EstadoAlgoformer.HUMANOIDE;
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.estado.equals(EstadoAlgoformer.ALTERNO)){
			this.ataque = 25;
			this.distanciaDeAtaque = 2;
			this.velocidad = 6;
			this.estado = EstadoAlgoformer.ALTERNO;
		}
	}
}
