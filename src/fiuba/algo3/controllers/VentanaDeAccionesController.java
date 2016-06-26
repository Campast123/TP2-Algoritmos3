package fiuba.algo3.controllers;

import java.io.IOException;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class VentanaDeAccionesController {
	
	@FXML
	private Label nombreJugador;

	private Stage window;
	private Partida partida;
	private MainApp mainApp;

	public void clickBotonMovimiento(){
		this.mainApp.showSeleccionPersonajeMovimiento();	
	}

	public void clickBotonAtaque(){
		this.mainApp.showSeleccionPersonajeAtaque();

	}

	public void clickBotonTransformacion()throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuTransformar.fxml"));
		loader.load();
		Parent menuTransformar = loader.getRoot();

		MenuTransformarController menuTransformarController = loader.getController();
		menuTransformarController.setPartida(this.partida);
		menuTransformarController.setWindow(this.window);

		this.window.hide();
		this.window.setScene(new Scene(menuTransformar));
		this.window.show();
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

	public void setWindow(Stage window) {
		this.window = window;
	}
	
	public void setNombreJugador(String nombre){
		this.nombreJugador.setText(nombre);
	}
}
