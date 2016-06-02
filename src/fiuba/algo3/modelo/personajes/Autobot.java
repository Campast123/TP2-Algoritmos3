package fiuba.algo3.modelo.personajes;

public abstract class Autobot extends Personaje{
	
	@Override
	public void atacar (Personaje personaje){
		personaje.recibirAtaqueDe(this);
	}

	
	@Override
	public void recibirAtaqueDe(Decepticon decepticon) {
		if (decepticon.puedeAtacar(this.posicion)){
			this.recibirAtaque(decepticon.getAtaque());
		}
	}
	@Override
	public void recibirAtaqueDe(Autobot autobot) {
	}

}
