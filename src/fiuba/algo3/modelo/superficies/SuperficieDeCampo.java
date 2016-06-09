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
		boolean atraviesaAereo = this.superficieAerea.puedeAtravesarlo(algoformer);
		boolean atraviesaTerrestre = this.superficieTerrestre.puedeAtravesarlo(algoformer);
		
		return (atraviesaAereo & atraviesaTerrestre);
	}
	
	public void reducirVelocidad(Personaje algoformer){
		algoformer.reducirVelocidad();
		if(this.superficieTerrestre.reduccionExtraDeVelocidad(algoformer)){
			algoformer.reducirVelocidad();
		}
	}
	
}
