package fiuba.algo3.modelo.personajes;

public class Optimus extends Autobots {

	public Optimus(){
		this.puntosDeVida = 500;
		this.ataque = 50;
		this.distanciaDeAtaque = 2;
		this.velocidad = 2;
		this.estado = EstadoAlgoformer.HUMANOIDE;
	}
	@Override
	public void atacarA(Personaje personaje) {
		
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.estado.equals(EstadoAlgoformer.HUMANOIDE)){
			this.ataque = 50;
			this.distanciaDeAtaque = 2;
			this.velocidad = 2;
			this.estado = EstadoAlgoformer.HUMANOIDE;
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.estado.equals(EstadoAlgoformer.ALTERNO)){
			this.ataque = 15;
			this.distanciaDeAtaque = 4;
			this.velocidad = 5;
			this.estado = EstadoAlgoformer.ALTERNO;
		}
	}

}
