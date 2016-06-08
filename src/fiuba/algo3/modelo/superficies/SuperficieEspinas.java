package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.estados.ModoHumanoide;
import fiuba.algo3.modelo.estados.ModoUnico;
import fiuba.algo3.modelo.estados.UnidadAlternaAerea;
import fiuba.algo3.modelo.estados.UnidadAlternaTerrestre;
import fiuba.algo3.modelo.personajes.Personaje;

public class SuperficieEspinas extends SuperficieTerrestre{
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
	
	@Override
	protected void producirEfecto(UnidadAlternaAerea algoformer) {
	}
	
	@Override
	public void producirEfecto(Personaje algoformer) {
		algoformer.reducirVidaEspinas();
	}
}
