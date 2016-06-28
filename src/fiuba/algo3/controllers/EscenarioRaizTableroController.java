package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.superficies.*;
import fiuba.algo3.modelo.tablero.Casillero;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.modelo.tablero.Tablero;
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
	
	public void actualizarCampos(){
		SuperficieRocosa rocosa = new SuperficieRocosa();
		SuperficiePantano pantano = new SuperficiePantano();
		SuperficieEspinas espinas = new SuperficieEspinas();
		SuperficieNube nube = new SuperficieNube();
		SuperficieNebulosaDeAndromeda nebulosa = new SuperficieNebulosaDeAndromeda();
		SuperficieTormentaPsionica tormenta = new SuperficieTormentaPsionica();
		
		SuperficieDeCampo campoNubeRoca = new SuperficieDeCampo(nube,rocosa);
		SuperficieDeCampo campoNubePantano = new SuperficieDeCampo(nube,pantano);
		SuperficieDeCampo campoNubeEspinas = new SuperficieDeCampo(nube,espinas);
		SuperficieDeCampo campoNebulosaRoca = new SuperficieDeCampo(nebulosa,rocosa);
		SuperficieDeCampo campoNebulosaPantano = new SuperficieDeCampo(nebulosa,pantano);
		SuperficieDeCampo campoNebulosaEspinas = new SuperficieDeCampo(nebulosa,espinas);
		SuperficieDeCampo campoTormentaRoca = new SuperficieDeCampo(tormenta,rocosa);
		SuperficieDeCampo campoTormentaPantano = new SuperficieDeCampo(tormenta,pantano);
		SuperficieDeCampo campoTormentaEspinas = new SuperficieDeCampo(tormenta,espinas);
		
		
		for (int i= 1; i <= 22; i++){
			for (int j=1; j <=22; j++){
				Pane pane = new Pane();
				Posicion posicionActual = new Posicion(j,i);
				Tablero tablero = this.mainApp.getPartida().getTablero();
				Casillero casillero = tablero.obtenerCasillero(posicionActual);
				
				if (casillero.getSuperficies().equals(campoNubeRoca)){
					pane.setStyle("-fx-background-color: LIGHTGREEN;-fx-border-color: CORNFLOWERBLUE; -fx-border-width: 5");
				}
				if (casillero.getSuperficies().equals(campoNubePantano)){
					pane.setStyle("-fx-background-color: BURLYWOOD;-fx-border-color: CORNFLOWERBLUE; -fx-border-width: 5");
				}
				if (casillero.getSuperficies().equals(campoNubeEspinas)){
					pane.setStyle("-fx-background-color: CRIMSON;-fx-border-color: CORNFLOWERBLUE; -fx-border-width: 5");
				}
				if (casillero.getSuperficies().equals(campoNebulosaRoca)){
					pane.setStyle("-fx-background-color: LIGHTGREEN;-fx-border-color: VIOLET; -fx-border-width: 5");
				}
				if (casillero.getSuperficies().equals(campoNebulosaPantano)){
					pane.setStyle("-fx-background-color: BURLYWOOD;-fx-border-color: VIOLET; -fx-border-width: 5");
				}
				if (casillero.getSuperficies().equals(campoNebulosaEspinas)){
					pane.setStyle("-fx-background-color: CRIMSON;-fx-border-color: VIOLET; -fx-border-width: 5");
				}
				if (casillero.getSuperficies().equals(campoTormentaRoca)){
					pane.setStyle("-fx-background-color: LIGHTGREEN;-fx-border-color: GREY; -fx-border-width: 5");
				}
				if (casillero.getSuperficies().equals(campoTormentaPantano)){
					pane.setStyle("-fx-background-color: BURLYWOOD;-fx-border-color: GREY; -fx-border-width: 5");
				}
				if (casillero.getSuperficies().equals(campoTormentaEspinas)){
					pane.setStyle("-fx-background-color: CRIMSON;-fx-border-color: GREY; -fx-border-width: 5");
				}
				this.tablero.add(pane, i, j);
			}
		}
	}
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
		this.actualizarCampos();
	}
	
}