package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.vistas.CajaAlerta;

public class MenuSeleccionDeEnemigoAAtacarController {

	private Partida partida;
	private Personaje personajeAtacante;
	private MainApp mainApp;

	public void clickBotonAtacarAPersonaje1(){
		Jugador jugadorEnEspera = this.partida.getJugadorEnEspera();
		try{
			this.partida.atacarConAlgoformerA(this.personajeAtacante, jugadorEnEspera.getPersonaje1());
			System.out.print("Ataco "+this.partida.getJugadorActual().getNombre()+" a "+this.partida.getJugadorEnEspera().getNombre() );
			this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en ataque", "El oponente elegido es imposible de atacar. Elija otro.");
		}

	}

	public void clickBotonAtacarAPersonaje2(){
		Jugador jugadorEnEspera = this.partida.getJugadorEnEspera();
		try{
			this.partida.atacarConAlgoformerA(this.personajeAtacante, jugadorEnEspera.getPersonaje2());
			System.out.print("Ataco "+this.partida.getJugadorActual().getNombre()+" a "+this.partida.getJugadorEnEspera().getNombre() );
			this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en ataque", "El oponente elegido es imposible de atacar. Elija otro.");
		}
	}
	
	public void clickBotonAtacarAPersonaje3(){
		Jugador jugadorEnEspera = this.partida.getJugadorEnEspera();
		try{
			this.partida.atacarConAlgoformerA(this.personajeAtacante, jugadorEnEspera.getPersonaje3());
			System.out.print("Ataco "+this.partida.getJugadorActual().getNombre()+" a "+this.partida.getJugadorEnEspera().getNombre() );
			this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en ataque", "El oponente elegido es imposible de atacar. Elija otro.");
		}

	}
	
	public void clickBotonTerminarTurno(){
		
		try{
			this.partida.finalizarTurno();
			System.out.print("Termino turno ");
			System.out.print("Ahora juega "+this.partida.getJugadorActual().getNombre());
			this.mainApp.showMenuDeOpciones();
			
			if (this.partida.getJugadorActual() == this.partida.getPlayer1()){
				this.mainApp.showMenuAutobots();
			}
			else{
				this.mainApp.showMenuDecepticons();
			}
		}
		catch(Exception ex){
			CajaAlerta.mostrar("Error en finalizar turno", "");
		}
		
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setPersonajeAtacante(Personaje personajeAtacante) {
		this.personajeAtacante = personajeAtacante;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

}
