package fiuba.algo3.modelo.personajes;

public abstract class Autobot extends Personaje{
	
	public void atacarA(Decepticon decepticon) {
		if (this.puedeAtacar(decepticon.posicion)){
			decepticon.recibirAtaque(this.getAtaque());
		}
	}
	public void atacarA(Autobot autobot) {
	}

}
