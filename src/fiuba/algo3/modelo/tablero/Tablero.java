package fiuba.algo3.modelo.tablero;

import java.util.HashMap;
import java.util.Map;

import fiuba.algo3.modelo.personajes.*;
import fiuba.algo3.modelo.superficies.SuperficieDeCampo;

public class Tablero { 	
	public static final String config = "config.properties";

	public static final int alto = 50;
	public static final int largo = 50;
	
	private Map<Posicion,Casillero> tablero;
	
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
	
	public void ingresarCasillero(Casillero casillero){
		this.tablero.put(casillero.getPosicion(),casillero);
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
	
	public void agregarPersonaje(Personaje personaje , Posicion posicionInicial){
		if (this.posicionValida(posicionInicial) && !this.estaOcupado(posicionInicial)){			
			this.tablero.get(posicionInicial).agregarPosicionable(personaje);
		}
	}
	
	public Personaje obtenerPersonaje(Posicion posicionInicial){
		Personaje personaje = null;
		if (this.posicionValida(posicionInicial) && this.estaOcupado(posicionInicial)){
			personaje = this.tablero.get(posicionInicial).getPersonaje();
		}
		return personaje;
	}
	
	public ChispaSuprema obtenerChispaSuprema(Posicion posicion){
		ChispaSuprema chispa = null;
		if (this.posicionValida(posicion)){
			chispa = this.tablero.get(posicion).getChispaSuprema();
		}
		return chispa;
	}
	
	public void moverPersonaje(Personaje personaje, Posicion posicionDestino){
		if (this.posicionValida(posicionDestino) && !this.estaOcupado(posicionDestino)){			
			SuperficieDeCampo superficiesDestino = this.tablero.get(posicionDestino).getSuperficies();
			if(personaje.puedeMoverse(posicionDestino) && (superficiesDestino.puedeAtravesarlo(personaje))){
				Posicion posicionInicial = personaje.getPosicion();
				this.tablero.get(posicionInicial).retirarPersonaje();
				this.tablero.get(posicionDestino).agregarPosicionable(personaje);
				personaje.avanzaCasillero(superficiesDestino);
			}
		}
	}	
	
	public void atacarConAlgoformerA(Personaje algoformerAtacante, Personaje algoformerDestino){
		algoformerAtacante.atacar(algoformerDestino);

	}
	
	public void transformarAlgoformer(Personaje algoformer){
		algoformer.transformar();
		//Agregar efectos de el casillero donde se transforma
	}

}
