package fiuba.algo3.modelo.estados;

import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.superficies.SuperficieAerea;
import fiuba.algo3.modelo.superficies.SuperficieTerrestre;

public abstract class UnidadAlternaAerea extends ModoAlterno{
	@Override
	public boolean puedeAtravesar(SuperficieAerea superficie) {
		return (superficie.puedeAtravesar(this));
	}

	@Override
	public boolean puedeAtravesar(SuperficieTerrestre superficie) {
		return true;
	}
	
	@Override
	public void quitarVidaEspinas(Personaje algoformer){
		
	}
}
