package fiuba.algo3.modelo.personajes;

public class Bonecrusher extends Decepticon {

	public Bonecrusher(){
		this.setPuntosDeVida(200);
		this.setAtaque(30);
		this.setDistanciaDeAtaque(3);
		this.setVelocidad(1);
		this.setEstado(EstadoAlgoformer.HUMANOIDE);
	}
	
	@Override
	public void transformacionModoHumanoide() {
		if (!this.getEstado().equals(EstadoAlgoformer.HUMANOIDE)){
			this.setAtaque(30);
			this.setDistanciaDeAtaque(3);
			this.setVelocidad(1);
			this.setEstado(EstadoAlgoformer.HUMANOIDE);
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.getEstado().equals(EstadoAlgoformer.ALTERNO)){
			this.setAtaque(30);
			this.setDistanciaDeAtaque(3);
			this.setVelocidad(8);
			this.setEstado(EstadoAlgoformer.ALTERNO);
		}
	}



	}
