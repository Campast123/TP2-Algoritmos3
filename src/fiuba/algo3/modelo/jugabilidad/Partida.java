package fiuba.algo3.modelo.jugabilidad;

import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Casillero;
import fiuba.algo3.modelo.tablero.ChispaSuprema;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.modelo.tablero.Tablero;

public class Partida {
	
	private Jugador player1;
	private Jugador player2;
	private Tablero juego;
	private Posicion posicionChispaSuprema;
	private Turno turno;
	
	public Partida(Jugador p1, Jugador p2){
		juego = new Tablero();	
		this.player1 = p1;
		this.player2 = p2;
		this.turno = new Turno(p1,p2);
		
		//Inicializo ChispaSuprema
		ChispaSuprema chispaSuprema = new ChispaSuprema();
		this.posicionChispaSuprema = new Posicion(25,25);
		Casillero casilleroChispaSuprema = new Casillero(posicionChispaSuprema);
		casilleroChispaSuprema.agregarPosicionable(chispaSuprema);
		
		//Posicion inicial de Autobots
		Posicion posicionDeOptimus = new Posicion(0,0);
		Posicion posicionDeBumblebee = new Posicion(0,1);
		Posicion posicionDeRatchet = new Posicion(1,0);
		
		//Posicion inicial de Decepticons
		Posicion posicionDeMegatron = new Posicion(50,50);
		Posicion posicionDeBonecrusher = new Posicion(49,50);
		Posicion posicionDeFrenzy = new Posicion(50,49);
		
		juego.agregarPersonaje(player1.getPersonaje1(),posicionDeOptimus);
		juego.agregarPersonaje(player1.getPersonaje2(),posicionDeBumblebee);
		juego.agregarPersonaje(player1.getPersonaje3(),posicionDeRatchet);
		
		juego.agregarPersonaje(player2.getPersonaje1(),posicionDeMegatron);
		juego.agregarPersonaje(player2.getPersonaje2(),posicionDeBonecrusher);
		juego.agregarPersonaje(player2.getPersonaje3(),posicionDeFrenzy);
		
		//Setea la chispa y campo
		juego.ingresarCasillero(casilleroChispaSuprema);
	}	
	
	public Tablero getTablero(){
		return this.juego;
	}
	public Posicion getPosicionChispaSuprema(){
		return (this.posicionChispaSuprema);
	}
	
	public void moverAlgoformerA(Personaje algoformer, Posicion direccion){
		Posicion posicion = algoformer.getPosicion().devolverSuma(direccion);
		juego.moverPersonaje(algoformer, posicion);
	}

	public Turno getTurno() {
		return turno;
	}
		
}
