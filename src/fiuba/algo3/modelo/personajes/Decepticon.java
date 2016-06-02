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

}
