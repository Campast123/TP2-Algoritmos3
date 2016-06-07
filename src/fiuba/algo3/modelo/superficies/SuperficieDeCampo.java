package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.UnidadAlternaAerea;
import fiuba.algo3.modelo.estados.UnidadAlternaTerrestre;
import fiuba.algo3.modelo.personajes.Personaje;

public class SuperficieDeCampo {

	private SuperficieAerea superficieAerea;
	private SuperficieTerrestre superficieTerrestre;
	
	public void aplicarEfecto(UnidadAlternaAerea algoformer){
		this.superficieAerea.producirEfecto(algoformer);
	}
	
	public void aplicarEfecto(UnidadAlternaTerrestre algoformer){
		this.superficieTerrestre.producirEfecto(algoformer);
	}
}
