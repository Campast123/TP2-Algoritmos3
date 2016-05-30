package fiuba.algo3.modelo.tablero;

import fiuba.algo3.modelo.personajes.Posicionable;
import fiuba.algo3.modelo.tablero.Posicion;

public class ChispaSuprema extends Posicionable {
	private boolean capturada;	
	
	public ChispaSuprema(){
		this.capturada = false;
		this.posicion = new Posicion(25,25);
	}
	
	public Posicion getPosicion(){
		return posicion;
	}
	
	public void setEstado(){
		this.capturada = !(this.capturada);
	}
	
}
