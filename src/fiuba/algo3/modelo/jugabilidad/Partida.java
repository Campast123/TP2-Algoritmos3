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
		
		this.ubicarPersonajesA(this.player1);
		this.ubicarPersonajesD(this.player2);
		this.ubicarChispa();
		//Seteo y asignacion de turno
	}
	
	private void ubicarChispa() {
		// TODO Auto-generated method stub
		this.juego.inicializaCampoAleatoriamente();
	}

	private void ubicarPersonajesD(Jugador jug) {
		for(int i=0;i<3;i++){
			Posicion posicionInicial= new Posicion(50,50-i);
			this.juego.agregarAlgoformer((Personaje)jug.getPersonajes().get(i), posicionInicial);
		}
	}

	public void ubicarPersonajesA(Jugador jug){
		for(int i=0;i<3;i++){
			Posicion posicionInicial= new Posicion(0,i);
			this.juego.agregarAlgoformer((Personaje)jug.getPersonajes().get(i), posicionInicial);
		}
	}
	
	public Tablero getTablero(){
		return this.juego;
	}


}
