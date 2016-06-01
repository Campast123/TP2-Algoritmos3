package fiuba.algo3.modelo.personajes;

public abstract class Decepticon extends Personaje{

	public void atacarA(Decepticon decepticon) {
	}
	public void atacarA(Autobot autobot) {
		if (this.puedeAtacar(autobot.posicion)){
			autobot.recibirAtaque(this.getAtaque());
		}
	}
}
