package fiuba.algo3.modelo.personajes;

import fiuba.algo3.modelo.tablero.Posicion;

public abstract class Posicionable {
	protected Posicion posicion;
	
	
	public Posicion getPosicion (){
		return this.posicion;
	}
	
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

}
