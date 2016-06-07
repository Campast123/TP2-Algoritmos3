package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.*;
import fiuba.algo3.modelo.personajes.Personaje;

public abstract class Superficie {

	protected abstract void producirEfecto(UnidadAlternaAerea algoformer);
	protected abstract void producirEfecto(UnidadAlternaTerrestre algoformer);
	protected abstract void reestablecerEfecto(Personaje algoformer);
	public abstract boolean puedeAtravesar(ModoHumanoide humanoide);
	public abstract boolean puedeAtravesar(ModoUnico unico);
	public abstract boolean puedeAtravesar(UnidadAlternaAerea aereo);
	public abstract boolean puedeAtravesar(UnidadAlternaTerrestre terrestre);

}
