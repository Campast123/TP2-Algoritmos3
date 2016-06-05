package fiuba.algo3.modelo.tablero;

import fiuba.algo3.modelo.personajes.Posicionable;
import fiuba.algo3.modelo.tablero.Posicion;

public class ChispaSuprema implements Posicionable {
	private boolean capturada;
	private Posicion posicion;
	
	public ChispaSuprema(){
		this.capturada = false;
		this.posicion = new Posicion(25,25);
	}	
		
	public void setEstado(){
		this.capturada = !(this.capturada);
	}
	
	public boolean getEstado(){
		return this.capturada;
	}
	
	@Override
	public Posicion getPosicion(){
		return (this.posicion);
	}
	
	@Override
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
		
	}
	
}
