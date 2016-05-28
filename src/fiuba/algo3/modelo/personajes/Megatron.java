package fiuba.algo3.modelo.personajes;

public class Megatron extends Desepticon {

	public Megatron(){
		this.puntosDeVida = 550;
		this.ataque = 55;
		this.distanciaDeAtaque = 2;
		this.velocidad = 8;
		this.estado = EstadoAlgoformer.ALTERNO;
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.estado.equals(EstadoAlgoformer.HUMANOIDE)){
			this.ataque = 10;
			this.distanciaDeAtaque = 3;
			this.velocidad = 1;
			this.estado = EstadoAlgoformer.HUMANOIDE;
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.estado.equals(EstadoAlgoformer.ALTERNO)){
			this.ataque = 55;
			this.distanciaDeAtaque = 2;
			this.velocidad = 8;
			this.estado = EstadoAlgoformer.ALTERNO;
		}
	}
}
