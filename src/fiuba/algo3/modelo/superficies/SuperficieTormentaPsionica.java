package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.personajes.Personaje;

public class SuperficieTormentaPsionica extends SuperficieAerea {
	
	@Override
	public void producirEfecto(Personaje algoformer) {
		algoformer.reducirAtaque();
	}
}
