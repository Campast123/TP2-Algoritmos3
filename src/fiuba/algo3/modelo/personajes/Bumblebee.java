package fiuba.algo3.modelo.personajes;

public class Bumblebee extends Autobot {

	public Bumblebee(){
		this.puntosDeVida = 350;
		this.ataque = 40;
		this.distanciaDeAtaque = 1;
		this.velocidad = 2;
		this.estado = EstadoAlgoformer.HUMANOIDE;
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.estado.equals(EstadoAlgoformer.HUMANOIDE)){
			this.ataque = 40;
			this.distanciaDeAtaque = 1;
			this.velocidad = 2;
			this.estado = EstadoAlgoformer.HUMANOIDE;
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.estado.equals(EstadoAlgoformer.ALTERNO)){
			this.ataque = 20;
			this.distanciaDeAtaque = 3;
			this.velocidad = 5;
			this.estado = EstadoAlgoformer.ALTERNO;
		}
	}
}
