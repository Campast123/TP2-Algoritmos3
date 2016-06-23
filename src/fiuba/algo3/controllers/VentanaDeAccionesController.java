package fiuba.algo3.controllers;

import java.io.IOException;

import fiuba.algo3.modelo.jugabilidad.Partida;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VentanaDeAccionesController {

	private Stage window;
	private Partida partida;

	public void clickBotonMovimiento(){
		System.out.print("Movimiento");
	}

	public void clickBotonAtaque() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuDeAtaqueInicial.fxml"));
		loader.load();
		Parent menuDeAtaqueVista = loader.getRoot();

		MenuDeAtaqueController menuDeAtaqueController = loader.getController();
		menuDeAtaqueController.setPartida(this.partida);
		menuDeAtaqueController.setWindow(this.window);

		this.window.hide();
		this.window.setScene(new Scene(menuDeAtaqueVista));
		this.window.show();

	}

	public void clickBotonTransformacion(){
		System.out.print("Transformarse");
	}

	public void clickBotonTransformacionModoUnico(){
		System.out.print("Trtansformar Modo Unico");
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
