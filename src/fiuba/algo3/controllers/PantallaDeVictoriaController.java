package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PantallaDeVictoriaController {

	@FXML
	private Label nombreGanador;

	private MainApp mainApp;

	public void clickBotonCerrar(){
		this.mainApp.cerrarAplicacion();
	}

	public void setNombreGanador(String nombre){
		this.nombreGanador.setText(nombre);
	}

	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}
}