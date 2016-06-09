package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.personajes.Personaje;

public abstract class Superficie {
	public void producirEfecto(Personaje algoformer){
		
	}
	
	protected void reestablecerEfecto(Personaje algoformer){
		
	}
	
	public boolean puedeAtravesarlo(Personaje algoformer){
		return true;
	}
	
	public boolean seReduceLaVelocidad (Personaje algoformer){
		return false;
	}

}
