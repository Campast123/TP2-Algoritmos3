package fiuba.algo3.modelo.jugabilidad;

import fiuba.algo3.modelo.tablero.Tablero;

public class Partida {
	
	private Jugador player1;
	private Jugador player2;
	private Tablero juego;
	
	public Partida(Jugador p1, Jugador p2){
		juego = new Tablero();	
		this.player1 = p1;
		this.player2 = p2;
		
		//Seteo y asignacion de turno
	}
	
	public Tablero getTablero(){
		return this.juego;
	}
	

}
