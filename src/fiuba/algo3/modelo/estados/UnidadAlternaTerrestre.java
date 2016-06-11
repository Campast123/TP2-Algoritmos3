package fiuba.algo3.modelo.estados;

import fiuba.algo3.modelo.personajes.Personaje;

public abstract class UnidadAlternaTerrestre extends ModoAlterno {
	
	@Override
	public boolean puedeAtravesarPantano(){
		return true;
	}
	
	@Override
	public void quitarVidaEspinas(Personaje algoformer){
		algoformer.reducirVida();
	}
	@Override
	public void reducirAtaque(){
		
	}
	@Override
	public void reducirVelocidad(){
		 this.velocidad = this.velocidad - 1;
	}
	
	@Override
	public boolean pantanoReduceVelocidad(){
		return true;
	}
}
