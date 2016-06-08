package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.personajes.Personaje;

public class SuperficieDeCampo {

	private SuperficieAerea superficieAerea;
	private SuperficieTerrestre superficieTerrestre;
	
	public SuperficieDeCampo(SuperficieAerea supAerea, SuperficieTerrestre supTerrestre){
		this.superficieAerea = supAerea;
		this.superficieTerrestre = supTerrestre;
	}
	
	public void aplicarEfecto(Personaje algoformer){
		this.superficieAerea.producirEfecto(algoformer);
		this.superficieTerrestre.producirEfecto(algoformer);
	}
	
	public boolean puedeAtravesarlo(Personaje algoformer){
		boolean atraviesaAereo = algoformer.puedeAtravesarSup(this.superficieAerea);
		boolean atraviesaTerrestre = algoformer.puedeAtravesarSup(this.superficieTerrestre);
		
		return (atraviesaAereo & atraviesaTerrestre);
	}
	
}
