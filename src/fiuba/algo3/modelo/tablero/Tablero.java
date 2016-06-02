package fiuba.algo3.modelo.tablero;

import java.util.HashMap;
import java.util.Map;

import fiuba.algo3.modelo.personajes.*;

public class Tablero { 	
	public static final String config = "config.properties";

	public static final int alto = 50;
	public static final int largo = 50;
	
	private Map<Posicion,Casillero> tablero;
	Posicion posDeChispa;
	
	public Tablero(){
		this.tablero = new HashMap<Posicion,Casillero>();
		
		for (int x = 0 ; x <= alto ; x++){
			for (int y = 0; y <= largo; y++){
				Posicion coordenada = new Posicion(x,y);
				Casillero casillero = new Casillero(coordenada);
				this.tablero.put(coordenada, casillero);
			}
		}
	}
	
	//Configura el mapa con: Bonus, trampas y chispa suprema	
	public void inicializaCampoAleatoriamente(){
		ChispaSuprema posicionable = new ChispaSuprema();
		
		Casillero casillero = this.tablero.get(posicionable.getPosicion());
		
		casillero.agregarPosicionable(posicionable);		
						
		this.tablero.put(casillero.getPosicion(), casillero);
		this.posDeChispa = casillero.getPosicion();
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
			this.tablero.get(posicionInicial).agregarPosicionable(algoformer);
		}
	}
	
	public Personaje obtenerAlgoformer(Posicion posicionInicial){
		Personaje algoformer = null;
		if (this.posicionValida(posicionInicial) && this.estaOcupado(posicionInicial)){
			algoformer = this.tablero.get(posicionInicial).getPersonaje();
		}
		return algoformer;
	}
	
	public void moverAlgoformer(Personaje algoformer, Posicion posicionDestino){
		if (this.posicionValida(posicionDestino) && !this.estaOcupado(posicionDestino)){
			Posicion posicionInicial = algoformer.getPosicion();
			this.tablero.get(posicionInicial).retirarPersonaje();
			this.tablero.get(posicionDestino).agregarPosicionable(algoformer);
		}
	}
	public Posicion getPosicionChispa(){
		return (this.posDeChispa);
	}
			
}
