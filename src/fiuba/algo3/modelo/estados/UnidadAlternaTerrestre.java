package fiuba.algo3.modelo.estados;

import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.superficies.*;

public abstract class UnidadAlternaTerrestre extends ModoAlterno {
	@Override
	public boolean puedeAtravesar(SuperficieAerea superficie) {
		return true;
	}

	@Override
	public boolean puedeAtravesar(SuperficieTerrestre superficie) {
		return (superficie.puedeAtravesar(this));
	}
	
	@Override
	public void quitarVidaEspinas(Personaje algoformer){
		algoformer.reducirVida();
	}
	@Override
	public void reducirAtaque(){
		
	}
}
