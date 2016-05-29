package fiuba.algo3.modelo.personajes;

public class Bumblebee extends Autobot {

	public Bumblebee(){
		this.setPuntosDeVida(350);
		this.setAtaque(40);
		this.setDistanciaDeAtaque(1);
		this.setVelocidad(2);
		this.setEstado(EstadoAlgoformer.HUMANOIDE);
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.getEstado().equals(EstadoAlgoformer.HUMANOIDE)){
			this.setAtaque(40);
			this.setDistanciaDeAtaque(1);
			this.setVelocidad(2);
			this.setEstado(EstadoAlgoformer.HUMANOIDE);
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.getEstado().equals(EstadoAlgoformer.ALTERNO)){
			this.setAtaque(20);
			this.setDistanciaDeAtaque(3);
			this.setVelocidad(5);
			this.setEstado(EstadoAlgoformer.ALTERNO);
		}
	}
}
