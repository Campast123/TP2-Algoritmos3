package fiuba.algo3.modelo.tablero;

import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.personajes.Posicionable;

public class Casillero extends Posicionable {

	private boolean ocupado;
	private Personaje personaje;
	private ChispaSuprema chispa;
	
	public Casillero(Posicion posicion){
		this.ocupado = false;
		this.posicion = posicion;
		this.personaje = null;
		this.chispa = null;
	}
	
	public void agregarPosicionable(Personaje personaje){
		personaje.setPosicion(this.posicion);
		this.personaje = personaje;
		this.ocupado = true;
		this.chispa = null;
	}	
		
	public void agregarPosicionable(ChispaSuprema chispa){		
		this.personaje = null;		
		this.chispa = chispa;
		this.ocupado = false;
	}
	
	public void retirarPersonaje(){
		this.personaje = null;
		this.ocupado = false;
	}

	public boolean estaOcupado() {
		return ocupado;
	}
	
	public Personaje getPersonaje() {
		return this.personaje;
	}	
	
}
