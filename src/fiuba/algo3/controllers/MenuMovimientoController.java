package fiuba.algo3.controllers;

import java.io.IOException;

import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuMovimientoController {

	private Partida partida;
	private Stage window;
	
	public void clickBotonMoverPersonaje1() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuSeleccionMovimiento.fxml"));
		loader.load();
		Parent menuSeleccionMovVista = loader.getRoot();

		MenuSeleccionMovimientoController menuSeleccionMovController = loader.getController();
		menuSeleccionMovController.setPartida(this.partida);
		menuSeleccionMovController.setPersonajeAtacante(this.partida.getJugadorActual().getPersonaje1());
		menuSeleccionMovController.setWindow(this.window);

		this.window.hide();
		this.window.setScene(new Scene(menuSeleccionMovVista));
		this.window.show();
	}

	public void clickBotonMoverPersonaje2()throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuSeleccionMovimiento.fxml"));
		loader.load();
		Parent menuSeleccionMovVista = loader.getRoot();

		MenuSeleccionMovimientoController menuSeleccionMovController = loader.getController();
		menuSeleccionMovController.setPartida(this.partida);
		menuSeleccionMovController.setPersonajeAtacante(this.partida.getJugadorActual().getPersonaje2());
		menuSeleccionMovController.setWindow(this.window);

		this.window.hide();
		this.window.setScene(new Scene(menuSeleccionMovVista));
		this.window.show();	}

	public void clickBotonMoverPersonaje3()throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuSeleccionMovimiento.fxml"));
		loader.load();
		Parent menuSeleccionMovVista = loader.getRoot();

		MenuSeleccionMovimientoController menuSeleccionMovController = loader.getController();
		menuSeleccionMovController.setPartida(this.partida);
		menuSeleccionMovController.setPersonajeAtacante(this.partida.getJugadorActual().getPersonaje3());
		menuSeleccionMovController.setWindow(this.window);

		this.window.hide();
		this.window.setScene(new Scene(menuSeleccionMovVista));
		this.window.show();	}

	public void clickBotonTerminarTurno(){
		
		try{
			this.partida.finalizarTurno();
			System.out.print("Termino turno ");
			System.out.print("Ahora juega "+this.partida.getJugadorActual().getNombre());
			FXMLLoader loader = new FXMLLoader();
		
			loader.setLocation(getClass().getResource("/fiuba/algo3/vistas/recursos/MenuDeOpciones.fxml"));
			loader.load();
			Parent menuDeOpciones = loader.getRoot();

			VentanaDeAccionesController menuVentanaDeAccionesController = loader.getController();
			menuVentanaDeAccionesController.setPartida(this.partida);
			menuVentanaDeAccionesController.setWindow(this.window);

			this.window.hide();
			this.window.setScene(new Scene(menuDeOpciones));
			this.window.show();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en finalizar turno", "");
		}	
		}
	
	
	
	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setWindow(Stage window) {
		this.window = window;
	}
}
