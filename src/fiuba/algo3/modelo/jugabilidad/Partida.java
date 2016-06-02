package fiuba.algo3.modelo.jugabilidad;

import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.modelo.tablero.Tablero;

public class Partida {
	
	private Jugador player1;
	private Jugador player2;
	private Tablero juego;	
	
	public Partida(Jugador p1, Jugador p2){
		juego = new Tablero();	
		this.player1 = p1;
		this.player2 = p2;	
		
		juego.agregarAlgoformer(player1.getPersonaje1(), player1.getPersonaje1().getPosicion());
		juego.agregarAlgoformer(player1.getPersonaje2(), player1.getPersonaje2().getPosicion());
		juego.agregarAlgoformer(player1.getPersonaje3(), player1.getPersonaje3().getPosicion());
		
		juego.agregarAlgoformer(player2.getPersonaje1(), player2.getPersonaje1().getPosicion());
		juego.agregarAlgoformer(player2.getPersonaje2(), player2.getPersonaje2().getPosicion());
		juego.agregarAlgoformer(player2.getPersonaje3(), player2.getPersonaje3().getPosicion());
		
		//Setea la chispa y campo
		juego.inicializaCampoAleatoriamente();
	}	
	
	public Tablero getTablero(){
		return this.juego;
	}


}
