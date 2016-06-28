package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Posicion;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class EscenarioRaizTableroController {
	
	@FXML
	private GridPane tablero;
	@FXML
	private ImageView optimus;
	@FXML
	private ImageView bumblebee;
	@FXML
	private ImageView ratchet;
	@FXML
	private ImageView megatron;
	@FXML
	private ImageView bonecrusher;
	@FXML
	private ImageView frenzy;
	
	private MainApp mainApp;
	
	public EscenarioRaizTableroController(){

	}
	
	@FXML
	private void initialize(){
		for (int i = 2; i <= 23; i++){
			Pane pane1 = new Pane();
			Pane pane2 = new Pane();
			pane1.setStyle("-fx-background-color: lightgreen;-fx-border-color: CORNFLOWERBLUE; -fx-border-width: 5");
			pane2.setStyle("-fx-background-color: lightgreen;-fx-border-color: CORNFLOWERBLUE; -fx-border-width: 5");
			this.tablero.add(pane1, i, 0);
			this.tablero.add(pane2, 0, i);
		}
		for (int i = 0; i <= 21; i++){
			Pane pane1 = new Pane();
			Pane pane2 = new Pane();
			pane1.setStyle("-fx-background-color: lightgreen;-fx-border-color: CORNFLOWERBLUE; -fx-border-width: 5");
			pane2.setStyle("-fx-background-color: lightgreen;-fx-border-color: CORNFLOWERBLUE; -fx-border-width: 5");
			this.tablero.add(pane1, i, 23);
			this.tablero.add(pane2, 23, i);
		}
	}
	
	public void actualizarPosicionesIndividualmente(Personaje personaje, ImageView autobotVisual){
		Posicion posicion = personaje.getPosicion();
		this.tablero.getChildren().remove(autobotVisual);
		this.tablero.add(autobotVisual, posicion.getCoordenadaY(), posicion.getCoordenadaX());
	}
	
	public void actualizarPosicionesGenerales(){
		Jugador jugador1 = this.mainApp.getPartida().getPlayer1();
		Jugador jugador2 = this.mainApp.getPartida().getPlayer2();
		
		this.actualizarPosicionesIndividualmente(jugador1.getPersonaje1(), this.optimus);
		this.actualizarPosicionesIndividualmente(jugador1.getPersonaje2(), this.bumblebee);
		this.actualizarPosicionesIndividualmente(jugador1.getPersonaje3(), this.ratchet);
		
		this.actualizarPosicionesIndividualmente(jugador2.getPersonaje1(), this.megatron);
		this.actualizarPosicionesIndividualmente(jugador2.getPersonaje2(), this.bonecrusher);
		this.actualizarPosicionesIndividualmente(jugador2.getPersonaje3(), this.frenzy);
		
	}
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}
	
}
