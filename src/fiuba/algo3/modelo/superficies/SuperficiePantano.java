package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.personajes.Personaje;

public class SuperficiePantano extends SuperficieTerrestre {
	
	@Override
	public boolean puedeAtravesarlo(Personaje algoformer){
		return (algoformer.puedeAtravesarPantano());
	}
	
	@Override
	public void producirEfecto(Personaje algoformer) {
		this.reducirVelocidad(algoformer);
	}
	
	public void reducirVelocidad(Personaje alterno){
		alterno.reducirVelocidad();
	}
	
	@Override
	public boolean seReduceLaVelocidad(Personaje algoformer) {
		return (algoformer.pantanoReduceVelocidad());
	}

}
