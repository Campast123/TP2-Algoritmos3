package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.ModoHumanoide;
import fiuba.algo3.modelo.estados.ModoUnico;
import fiuba.algo3.modelo.estados.UnidadAlternaAerea;
import fiuba.algo3.modelo.estados.UnidadAlternaTerrestre;
import fiuba.algo3.modelo.personajes.Personaje;

public abstract class SuperficieAerea extends Superficie {
	
	@Override
	public boolean puedeAtravesarlo(Personaje algoformer){
		return true;
	}
	
	@Override
	public void producirEfecto(Personaje algoformer){
		
	}
	@Override
	protected void reestablecerEfecto(Personaje algoformer) {
		
	}
	@Override
	public boolean reduccionExtraDeVelocidad(Personaje algoformer) {
		return false;	
	}
}
