package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VentanaDeAccionesController {
	
	@FXML
	private Label nombreJugador;

	private Partida partida;
	private MainApp mainApp;

	public void clickBotonMovimiento(){
		this.mainApp.showSeleccionPersonajeMovimiento();	
	}

	public void clickBotonAtaque(){
		this.mainApp.showSeleccionPersonajeAtaque();

	}

	public void clickBotonTransformacion(){
		this.mainApp.showSeleccionPersonajeTransformacion();
	}

	public void clickBotonTransformacionModoUnico(){
		System.out.print("Trtansformar Modo Unico");
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
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setNombreJugador(String nombre){
		this.nombreJugador.setText(nombre);
	}
}
