package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuTransformarController {
	
	@FXML
	private Label nombreJugador;
	@FXML
	private Label tipoDeAlgoformers;
	@FXML
	private Label ptosDeVidaPersonaje1;
	@FXML
	private Label ataquePersonaje1;
	@FXML
	private Label distDeAtaquePersonaje1;
	@FXML
	private Label velocidadPersonaje1;
	@FXML
	private Label modoPersonaje1;
	@FXML
	private Label tipoUnidadPersonaje1;
	
	@FXML
	private Label ptosDeVidaPersonaje2;
	@FXML
	private Label ataquePersonaje2;
	@FXML
	private Label distDeAtaquePersonaje2;
	@FXML
	private Label velocidadPersonaje2;
	@FXML
	private Label modoPersonaje2;
	@FXML
	private Label tipoUnidadPersonaje2;
	
	@FXML
	private Label ptosDeVidaPersonaje3;
	@FXML
	private Label ataquePersonaje3;
	@FXML
	private Label distDeAtaquePersonaje3;
	@FXML
	private Label velocidadPersonaje3;
	@FXML
	private Label modoPersonaje3;
	@FXML
	private Label tipoUnidadPersonaje3;


	private Partida partida;
	private MainApp mainApp;
	
	public void clickBotonTransformarPersonaje1(){	
		this.partida.transformarAlgoformer(this.partida.getJugadorActual().getPersonaje1());

		this.clickBotonTerminarTurno();

	}

	public void clickBotonTransformarPersonaje2(){
		this.partida.transformarAlgoformer(this.partida.getJugadorActual().getPersonaje2());

		this.clickBotonTerminarTurno();

	}

	public void clickBotonTransformarPersonaje3(){
		this.partida.transformarAlgoformer(this.partida.getJugadorActual().getPersonaje3());
		this.clickBotonTerminarTurno();
	}
	
	public void clickBotonVolverAtras(){
		this.mainApp.showMenuDeOpciones();
	}
	
	public void clickBotonTerminarTurno(){
		
		try{
			this.partida.finalizarTurno();
			this.mainApp.getControladorTablero().actualizarPosicionesGenerales();
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
	
	private void actualizarDatosIndividual(Personaje personaje, Label vida,Label ataque, Label alcance, Label velocidad, Label modo, Label unidad){
		vida.setText(String.valueOf(personaje.getPuntosDeVida()));
		ataque.setText(String.valueOf(personaje.getAtaque()));
		alcance.setText(String.valueOf(personaje.getDistanciaDeAtaque()));
		velocidad.setText(String.valueOf(personaje.getVelocidad()));
		modo.setText("Humanoide");
		unidad.setText("Terrestre");
			
		if(personaje.esAlterno()){
			modo.setText("Alterno");
			if (personaje.esUnidadAerea()){
				unidad.setText("Aerea");
			}
		}
	}
	
	private void actualizarDatos() {
		
		Personaje personaje1 = this.partida.getJugadorActual().getPersonaje1();
		this.actualizarDatosIndividual(personaje1, this.ptosDeVidaPersonaje1, this.ataquePersonaje1, this.distDeAtaquePersonaje1, this.velocidadPersonaje1,this.modoPersonaje1,this.tipoUnidadPersonaje1);
		Personaje personaje2 = this.partida.getJugadorActual().getPersonaje2();
		this.actualizarDatosIndividual(personaje2, this.ptosDeVidaPersonaje2, this.ataquePersonaje2, this.distDeAtaquePersonaje2, this.velocidadPersonaje2,this.modoPersonaje2,this.tipoUnidadPersonaje2);
		Personaje personaje3 = this.partida.getJugadorActual().getPersonaje3();
		this.actualizarDatosIndividual(personaje3, this.ptosDeVidaPersonaje3, this.ataquePersonaje3, this.distDeAtaquePersonaje3, this.velocidadPersonaje3,this.modoPersonaje3,this.tipoUnidadPersonaje3);
		
		this.nombreJugador.setText(this.partida.getJugadorActual().getNombre());
		if (this.partida.getJugadorActual() == this.partida.getPlayer1()){
			this.tipoDeAlgoformers.setText("Autobots");
		}else{
			this.tipoDeAlgoformers.setText("Decepticons");
		}
		
	}
	
	public void setPartida(Partida partida) {
		this.partida = partida;
		this.actualizarDatos();
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

}
