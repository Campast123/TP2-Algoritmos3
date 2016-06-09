package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.ModoAlterno;
import fiuba.algo3.modelo.estados.ModoHumanoide;
import fiuba.algo3.modelo.estados.UnidadAlternaAerea;
import fiuba.algo3.modelo.estados.UnidadAlternaTerrestre;
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
	public boolean reduccionExtraDeVelocidad(Personaje algoformer) {
		if (algoformer.getModoAlgoformer().esAlterno() && algoformer.getModoAlgoformer().esUnidadTerrestre()){
			return true;				
		}
		return false;
	}

}
