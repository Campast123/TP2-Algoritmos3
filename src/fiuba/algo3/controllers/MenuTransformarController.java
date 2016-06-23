package fiuba.algo3.controllers;

import java.io.IOException;

import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuTransformarController {

	private Partida partida;
	private Stage window;
	
	public void clickBotonTransformarPersonaje1() throws IOException{	
		this.partida.transformarAlgoformer(this.partida.getJugadorActual().getPersonaje1());
		System.out.print(" Se transformo "+this.partida.getJugadorActual().getNombre() );

		this.clickBotonTerminarTurno();

	}

	public void clickBotonTransformarPersonaje2()throws IOException{
		this.partida.transformarAlgoformer(this.partida.getJugadorActual().getPersonaje2());
		System.out.print(" Se transformo "+this.partida.getJugadorActual().getNombre() );

		this.clickBotonTerminarTurno();

	}

	public void clickBotonTransformarPersonaje3()throws IOException{
		this.partida.transformarAlgoformer(this.partida.getJugadorActual().getPersonaje3());
		System.out.print(" Se transformo "+this.partida.getJugadorActual().getNombre() );
		this.clickBotonTerminarTurno();
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
