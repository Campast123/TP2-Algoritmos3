package fiuba.algo3.modelo.personajes;

public class Frenzy extends Desepticon {

	public Frenzy(){
		this.setPuntosDeVida(400);
		this.setAtaque(10);
		this.setDistanciaDeAtaque(5);
		this.setVelocidad(2);
		this.setEstado(EstadoAlgoformer.HUMANOIDE);
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.getEstado().equals(EstadoAlgoformer.HUMANOIDE)){
			this.setAtaque(10);
			this.setDistanciaDeAtaque(5);
			this.setVelocidad(2);
			this.setEstado(EstadoAlgoformer.HUMANOIDE);
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.getEstado().equals(EstadoAlgoformer.ALTERNO)){
			this.setAtaque(25);
			this.setDistanciaDeAtaque(2);
			this.setVelocidad(6);
			this.setEstado(EstadoAlgoformer.ALTERNO);
		}
	}
}
