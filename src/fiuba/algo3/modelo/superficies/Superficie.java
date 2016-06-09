package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.personajes.Personaje;

public abstract class Superficie {
	public abstract void producirEfecto(Personaje algoformer);
	protected abstract void reestablecerEfecto(Personaje algoformer);
	public abstract boolean puedeAtravesarlo(Personaje algoformer);
	public abstract boolean reduccionExtraDeVelocidad (Personaje algoformer);

}
