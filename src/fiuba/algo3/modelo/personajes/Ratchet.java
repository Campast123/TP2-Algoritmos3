package fiuba.algo3.modelo.personajes;

public class Ratchet extends Autobot {
	
	public Ratchet(){
		this.setPuntosDeVida(150);
		this.setAtaque(5);
		this.setDistanciaDeAtaque(5);
		this.setVelocidad(1);
		this.setEstado(EstadoAlgoformer.HUMANOIDE);
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.getEstado().equals(EstadoAlgoformer.HUMANOIDE)){
			this.setAtaque(5);
			this.setDistanciaDeAtaque(5);
			this.setVelocidad(1);
			this.setEstado(EstadoAlgoformer.HUMANOIDE);
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.getEstado().equals(EstadoAlgoformer.ALTERNO)){
			this.setAtaque(35);
			this.setDistanciaDeAtaque(2);
			this.setVelocidad(8);
			this.setEstado(EstadoAlgoformer.ALTERNO);
		}
	}
}
