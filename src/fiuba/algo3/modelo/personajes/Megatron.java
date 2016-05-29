package fiuba.algo3.modelo.personajes;

public class Megatron extends Desepticon {

	public Megatron(){
		this.setPuntosDeVida(550);
		this.setAtaque(10);
		this.setDistanciaDeAtaque(3);
		this.setVelocidad(1);
		this.setEstado(EstadoAlgoformer.HUMANOIDE);
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.getEstado().equals(EstadoAlgoformer.HUMANOIDE)){
			this.setAtaque(10);
			this.setDistanciaDeAtaque(3);
			this.setVelocidad(1);
			this.setEstado(EstadoAlgoformer.HUMANOIDE);
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.getEstado().equals(EstadoAlgoformer.ALTERNO)){
			this.setAtaque(55);
			this.setDistanciaDeAtaque(2);
			this.setVelocidad(8);
			this.setEstado(EstadoAlgoformer.ALTERNO);
		}
	}
}
