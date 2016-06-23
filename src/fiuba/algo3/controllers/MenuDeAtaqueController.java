package fiuba.algo3.controllers;

import java.io.IOException;

import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuDeAtaqueController {

	private Partida partida;
	private Stage window;

	public void clickBotonAtacarConPersonaje1() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuSeleccionDeEnemigoAAtacar.fxml"));
		loader.load();
		Parent menuSeleccionDeEnemigoAAtacarVista = loader.getRoot();

		MenuSeleccionDeEnemigoAAtacarController menuSeleccionDeEnemigoAAtacarController = loader.getController();
		menuSeleccionDeEnemigoAAtacarController.setPartida(this.partida);
		menuSeleccionDeEnemigoAAtacarController.setPersonajeAtacante(this.partida.getJugadorActual().getPersonaje1());
		menuSeleccionDeEnemigoAAtacarController.setWindow(this.window);

		this.window.hide();
		this.window.setScene(new Scene(menuSeleccionDeEnemigoAAtacarVista));
		this.window.show();
	}

	public void clickBotonAtacarConPersonaje2(){
		System.out.print("Atacar con personaje 2");
	}

	public void clickBotonAtacarConPersonaje3(){
		System.out.print("Atacar con personaje 3");
	}

	public void clickBotonTerminarTurno(){
		System.out.print("Terminar Turno");
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setWindow(Stage window) {
		this.window = window;
	}
}
