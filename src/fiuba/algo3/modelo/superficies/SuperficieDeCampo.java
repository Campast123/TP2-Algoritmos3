package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.UnidadAerea;
import fiuba.algo3.modelo.estados.UnidadTerrestre;
import fiuba.algo3.modelo.personajes.Personaje;

public class SuperficieDeCampo {

	private SuperficieAerea superficieAerea;
	private SuperficieTerrestre superficieTerrestre;
	
	public void aplicarEfecto(UnidadAerea algoformer){
		this.superficieAerea.producirEfecto(algoformer);
	}
	
	public void aplicarEfecto(UnidadTerrestre algoformer){
		this.superficieTerrestre.producirEfecto(algoformer);
	}
}
