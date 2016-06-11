package fiuba.algo3.modelo.jugabilidad;


import org.apache.log4j.Logger;

import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Casillero;
import fiuba.algo3.modelo.tablero.ChispaSuprema;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.modelo.tablero.Tablero;

public class Partida {
	private static Logger LOG = Logger.getLogger(Partida.class);
	
	private Jugador player1;
	private Jugador player2;
	private Tablero juego;
	private Posicion posicionChispaSuprema;
	private Turno turno;
	
	public Partida(Jugador p1, Jugador p2){
		LOG.info("Se crea la partida");
		juego = new Tablero();	
		this.player1 = p1;
		this.player2 = p2;
		this.turno = new Turno(p1,p2);
		LOG.debug("[partida] Crea la chispaSuprema y la posiciona");
		ChispaSuprema chispaSuprema = new ChispaSuprema();
		this.posicionChispaSuprema = new Posicion(25,25);
		Casillero casilleroChispaSuprema = new Casillero(posicionChispaSuprema);
		casilleroChispaSuprema.agregarPosicionable(chispaSuprema);
		
		LOG.debug("[Partida] posiciona inicialmente a los Autobots");
		Posicion posicionDeOptimus = new Posicion(0,0);
		Posicion posicionDeBumblebee = new Posicion(0,1);
		Posicion posicionDeRatchet = new Posicion(1,0);
		
		LOG.debug("[Partida] posiciona inicialmente a los Decepticons");
		Posicion posicionDeMegatron = new Posicion(50,50);
		Posicion posicionDeBonecrusher = new Posicion(49,50);
		Posicion posicionDeFrenzy = new Posicion(50,49);
		
		LOG.debug("[Partida] agrega personajes al tablero");
		juego.agregarPersonaje(player1.getPersonaje1(),posicionDeOptimus);
		juego.agregarPersonaje(player1.getPersonaje2(),posicionDeBumblebee);
		juego.agregarPersonaje(player1.getPersonaje3(),posicionDeRatchet);
		
		juego.agregarPersonaje(player2.getPersonaje1(),posicionDeMegatron);
		juego.agregarPersonaje(player2.getPersonaje2(),posicionDeBonecrusher);
		juego.agregarPersonaje(player2.getPersonaje3(),posicionDeFrenzy);
		
		LOG.debug("[Partida] agrega chispa al tablero");
		juego.ingresarCasillero(casilleroChispaSuprema);
	}	
	
	public Tablero getTablero(){
		return this.juego;
	}
	public Posicion getPosicionChispaSuprema(){
		return (this.posicionChispaSuprema);
	}
	
	public void moverAlgoformerA(Personaje algoformer, DireccionDeMovimiento direccion){
		LOG.debug("[Partida] mover al algoformer seleccionado en direccion: " + direccion.name());
		Posicion posicion = algoformer.getPosicion().obtenerPosicionEnDireccion(direccion);
		juego.moverPersonajeA(algoformer, posicion);
		LOG.debug("[Partida] se movio al algoformer seleccionado a la posicion: " + posicion.toString());
	}

	public Turno getTurno() {
		return turno;
	}
		
}
