package fiuba.algo3.modelo.personajes;

public abstract class Decepticon extends Personaje{
	
	@Override
	public void atacar (Personaje personaje){
		personaje.recibirAtaqueDe(this);
	}
	
	@Override
	public void recibirAtaqueDe(Decepticon decepticon) {

	}
	@Override
	public void recibirAtaqueDe(Autobot autobot) {
		if (autobot.puedeAtacar(this.posicion)){
			this.recibirAtaque(autobot.getAtaque());
		}
	}
	
	public void transformacionModoHumanoide(int ataque, int distancia, int vel){		
		this.setAtaque(ataque);
		this.setDistanciaDeAtaque(distancia);
		this.setVelocidad(vel);
	    this.setEstado(EstadoAlgoformer.HUMANOIDE);		
	}
	
	public void transformacionModoAlterno(int ataque, int distancia, int vel){		
		this.setAtaque(ataque);
		this.setDistanciaDeAtaque(distancia);
		this.setVelocidad(vel);
	    this.setEstado(EstadoAlgoformer.ALTERNO);
	}
}
