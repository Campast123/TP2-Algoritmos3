package fiuba.algo3.modelo.tablero;

import java.util.HashMap;
import java.util.Map;

import fiuba.algo3.modelo.personajes.Personaje;

public class Tablero {

	private Map<Posicion,Casillero> tablero;
	
	// Crea un tablero de 50x50 donde el intervalo de x = [0,50] e y = [0,50]
	public Tablero(){
		this.tablero = new HashMap<Posicion,Casillero>();
		for (int x = 0 ; x <= 50 ; x++){
			for (int y = 0; y <= 50; y++){
				Posicion coordenada = new Posicion(x,y);
				Casillero casillero = new Casillero(coordenada);
				this.tablero.put(coordenada, casillero);
			}
		}
	}
	
	public boolean estaOcupado(Posicion posicion){
		if (this.posicionValida(posicion)){
			Casillero casillero = this.tablero.get(posicion);
			return casillero.estaOcupado();
		}
		return false;
	}
	
	public boolean posicionValida(Posicion posicion) {
		return (this.tablero.containsKey(posicion));
//		throw new PosicionInvalidaException("La posicion en X:" + posicion.getCoordenadaX() + " e Y:" + posicion.getCoordenadaY() + " es invalida");
	}
	
	public void agregarAlgoformer(Personaje algoformer , Posicion posicionInicial){
		if (this.posicionValida(posicionInicial) && !this.estaOcupado(posicionInicial)){
			this.tablero.get(posicionInicial).agregarPersonaje(algoformer);
		}
	}
	
	public Personaje obtenerAlgoformer(Posicion posicionInicial){
		Personaje algoformer = null;
		if (this.posicionValida(posicionInicial) && this.estaOcupado(posicionInicial)){
			algoformer = this.tablero.get(posicionInicial).obtenerPersonaje();
		}
		return algoformer;
	}
	
	public void moverAlgoformer(Personaje algoformer, Posicion posicionDestino){
		if (this.posicionValida(posicionDestino) && !this.estaOcupado(posicionDestino)){
		
			Posicion posicionInicial = algoformer.obtenerPosicion();
			algoformer.moverA(posicionDestino);
			this.tablero.get(posicionInicial).retirarPersonaje();
			this.tablero.get(posicionDestino).agregarPersonaje(algoformer);
		}
	}
	
	public Map<Posicion,Casillero> obtenerTablero(){
		return this.tablero;
	}
	
}
