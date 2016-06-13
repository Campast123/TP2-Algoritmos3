package fiuba.algo3.modelo.tablero;

import java.util.HashMap;
import java.util.Map;

import fiuba.algo3.modelo.bonus.Bonus;
import fiuba.algo3.modelo.bonus.BurbujaInmaculada;
import fiuba.algo3.modelo.bonus.DobleCanion;
import fiuba.algo3.modelo.bonus.Flash;
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
	
	public void inicializarBonus(){
		for (int i = 0; i < generaNumeroAleatorio(0,20); i++) {
			Bonus bonus;
			int value = generaNumeroAleatorio(1,3);
			
			switch(value){
				case 1: bonus = new BurbujaInmaculada();
						break;
				case 2: bonus = new DobleCanion();
						break;
				case 3: bonus = new Flash();
						break;
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
	
	public static int generaNumeroAleatorio(int minimo, int maximo){        
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
}
