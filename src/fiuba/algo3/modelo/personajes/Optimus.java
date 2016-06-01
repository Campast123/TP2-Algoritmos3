package fiuba.algo3.modelo.personajes;

public class Optimus extends Autobot {

	public Optimus(){
		this.setPuntosDeVida(500);
		this.setAtaque(50);
		this.setDistanciaDeAtaque(2);
		this.setVelocidad(2);
		this.setEstado(EstadoAlgoformer.HUMANOIDE);
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.getEstado().equals(EstadoAlgoformer.HUMANOIDE)){
			this.setAtaque(50);
			this.setDistanciaDeAtaque(2);
			this.setVelocidad(2);
			this.setEstado(EstadoAlgoformer.HUMANOIDE);
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.getEstado().equals(EstadoAlgoformer.ALTERNO)){
			this.setAtaque(15);
			this.setDistanciaDeAtaque(4);
			this.setVelocidad(5);
			this.setEstado(EstadoAlgoformer.ALTERNO);
		}
	}
	

}
