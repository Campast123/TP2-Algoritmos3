package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.*;

public class SuperficiePantano extends SuperficieTerrestre {
	@Override
	public boolean puedeAtravesar(ModoHumanoide humanoide){
		return false;
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
