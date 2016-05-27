package fiuba.algo3.modelo.tablero;

import fiuba.algo3.modelo.personajes.Personaje;

public class Casillero {

	private boolean ocupado;
	private Posicion posicion;
	private Personaje personaje;
	
	public Casillero(Posicion posicion){
		this.ocupado = false;
		this.posicion = posicion;
		this.personaje = null;
	}
	
	public void agregarPersonaje(Personaje personaje){
		personaje.setPosicion(this.posicion);
		this.personaje = personaje;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
}
