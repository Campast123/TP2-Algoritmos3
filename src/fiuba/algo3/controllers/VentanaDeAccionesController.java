package fiuba.algo3.controllers;

import java.io.IOException;

import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VentanaDeAccionesController {

	private Stage window;
	private Partida partida;

	public void clickBotonMovimiento()throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuMovimientoInicial.fxml"));
		loader.load();
		Parent menuDeMovVista = loader.getRoot();

		MenuMovimientoController menuDeMovController = loader.getController();
		menuDeMovController.setPartida(this.partida);
		menuDeMovController.setWindow(this.window);

		this.window.hide();
		this.window.setScene(new Scene(menuDeMovVista));
		this.window.show();
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
