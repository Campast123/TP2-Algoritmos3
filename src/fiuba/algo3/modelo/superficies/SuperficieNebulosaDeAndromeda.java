package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.ModoHumanoide;
import fiuba.algo3.modelo.estados.ModoUnico;
import fiuba.algo3.modelo.estados.UnidadAlternaAerea;
import fiuba.algo3.modelo.estados.UnidadAlternaTerrestre;

public class SuperficieNebulosaDeAndromeda extends SuperficieAerea {
	
	@Override
	public boolean puedeAtravesar(ModoHumanoide humanoide){
		return true;
	}
	
	@Override
	public boolean puedeAtravesar(UnidadAlternaAerea humanoide){
		return true;
	}
	
	@Override
	public boolean puedeAtravesar(UnidadAlternaTerrestre humanoide){
		return true;
	}

	@Override
	public boolean puedeAtravesar(ModoUnico unico) {
		return true;
	}
}
