package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VentanaDeAccionesController {

	@FXML
	private Label nombreJugador;

	private Partida partida;
	private MainApp mainApp;

	public void clickBotonMovimiento(){
		if (this.esUnico()){
			Personaje personaje = this.partida.getJugadorActual().getPersonajeModoUnico();
			this.mainApp.showMovimientoDePersonaje(personaje);
		}else{
			this.mainApp.showSeleccionPersonajeMovimiento();
		}
	}

	public void clickBotonAtaque(){
		if (this.esUnico()){
			Personaje personaje = this.partida.getJugadorActual().getPersonajeModoUnico();
			this.mainApp.showAtaqueDePersonaje(personaje);
		}else{
			this.mainApp.showSeleccionPersonajeAtaque();
		}
	}

	public void clickBotonTransformacion(){
		if (this.esUnico()){
		}else{
			this.mainApp.showSeleccionPersonajeTransformacion();
		}
	}

	public void clickBotonTransformacionModoUnico(){
		Jugador jugadorActual = this.partida.getJugadorActual();
		try{
			this.partida.transformarAlgoformerAModoUnico(jugadorActual);

			this.mainApp.getControladorTablero().fusionarPersonajes(jugadorActual);

			this.clickBotonTerminarTurno();
		}catch(Exception e){
			CajaAlerta.mostrar("Error", "Error en transformacion");
		}
	}

	public void clickBotonTerminarTurno(){
		this.mainApp.terminarTurno();
	}

	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}

	private boolean esUnico(){
		Jugador jugador = this.partida.getJugadorActual();
		return jugador.getPersonajeModoUnico() != null;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
		this.esUnico();

	}

	public void setNombreJugador(String nombre){
		this.nombreJugador.setText(nombre);
	}
}
