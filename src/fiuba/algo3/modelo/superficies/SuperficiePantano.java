package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.ModoHumanoide;
import fiuba.algo3.modelo.personajes.Personaje;

public class SuperficiePantano extends SuperficieTerrestre {
	
	@Override
	public boolean puedeAtravesar(ModoHumanoide humanoide){
		return false;
	}
	
	@Override
	public void producirEfecto(Personaje algoformer) {
		
	}
}
