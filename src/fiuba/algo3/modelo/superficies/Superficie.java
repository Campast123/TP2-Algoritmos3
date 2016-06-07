package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.UnidadAerea;
import fiuba.algo3.modelo.estados.UnidadTerrestre;
import fiuba.algo3.modelo.personajes.Personaje;

public abstract class Superficie {

	protected abstract void producirEfecto(UnidadAerea algoformer);
	protected abstract void producirEfecto(UnidadTerrestre algoformer);
	protected abstract void reestablecerEfecto(Personaje algoformer); 

}
