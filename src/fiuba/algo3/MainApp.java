package fiuba.algo3;

import java.io.IOException;

import fiuba.algo3.controllers.EscenarioRaizTableroController;
import fiuba.algo3.controllers.MenuDeAtacarAModoUnicoController;
import fiuba.algo3.controllers.MenuDeAtaqueController;
import fiuba.algo3.controllers.MenuMovimientoController;
import fiuba.algo3.controllers.MenuSeleccionDeEnemigoAAtacarController;
import fiuba.algo3.controllers.MenuSeleccionMovimientoController;
import fiuba.algo3.controllers.MenuTransformarController;
import fiuba.algo3.controllers.PantallaDeInicioController;
import fiuba.algo3.controllers.VentanaDeAccionesController;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.jugabilidad.TipoTransformer;
import fiuba.algo3.modelo.personajes.Personaje;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage window;
	private Partida partida;
	private BorderPane escenarioRaiz;
	private EscenarioRaizTableroController controladorTablero;
	
	private static int alto = 23;
	private static int largo = 23;

    public static void main(String[] args) {
    	launch(args);
    }
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		this.showPantallaDeInicio();
		
	}

	private void showPantallaDeInicio(){
		try{
			window.setTitle("Iniciar Partida Battle Algoformers");
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("controllers/PantallaDeInicio.fxml"));
			AnchorPane inicio = (AnchorPane) loader.load();
			
            Scene scene = new Scene(inicio);
            window.setScene(scene);
            window.sizeToScene();
            window.show();
            
            PantallaDeInicioController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public void showTableroRaiz(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("controllers/EscenarioRaizTablero.fxml"));
			this.escenarioRaiz = (BorderPane) loader.load();

			this.controladorTablero = loader.getController();
			this.controladorTablero.setMainApp(this);
			
			Scene escenaTablero =  new Scene(this.escenarioRaiz);
			window.setTitle("Algoformers");
			window.setScene(escenaTablero);
			window.show();
			
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public void showMenuDeOpciones(){
		try{
			String nombreJugador = this.partida.getJugadorActual().getNombre();
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("vistas/recursos/MenuDeOpciones.fxml"));
			VBox menuOpciones = (VBox) loader.load();
			
			VentanaDeAccionesController controladorDeAcciones = loader.getController();
			controladorDeAcciones.setMainApp(this);
			controladorDeAcciones.setPartida(this.partida);
			controladorDeAcciones.setNombreJugador(nombreJugador);
			
			this.escenarioRaiz.setLeft(menuOpciones);
			
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void showMenuAutobots(){
		try{
			Jugador jugadorAutobots = this.partida.getPlayer1();
			Boolean esModoUnico = jugadorAutobots.getPersonajeModoUnico()!=null;
			FXMLLoader loader = new FXMLLoader();
			
			if (esModoUnico){
				loader.setLocation(getClass().getResource("controllers/MenuAutobotsModoUnico.fxml"));
			}else{
				
				loader.setLocation(getClass().getResource("controllers/MenuAutobots.fxml"));
			}
			
			AnchorPane menuAutobots = (AnchorPane) loader.load();
			this.escenarioRaiz.setRight(menuAutobots);
			
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void showMenuDecepticons(){
		try{
			Jugador jugadorDecepticons = this.partida.getPlayer2();
			Boolean esModoUnico = jugadorDecepticons.getPersonajeModoUnico() != null;
			FXMLLoader loader = new FXMLLoader();
			
			if (esModoUnico){
				loader.setLocation(getClass().getResource("controllers/MenuDecepticonsModoUnico.fxml"));
			}else{
				loader.setLocation(getClass().getResource("controllers/MenuDecepticons.fxml"));
			}
			
			AnchorPane menuDecepticons = (AnchorPane) loader.load();
			this.escenarioRaiz.setRight(menuDecepticons);
			
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void showSeleccionPersonajeMovimiento(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("controllers/MenuMovimientoInicial.fxml"));
			VBox seleccPersonajeAMover = (VBox) loader.load();

			MenuMovimientoController menuDeMovController = loader.getController();
			menuDeMovController.setMainApp(this);
			menuDeMovController.setPartida(this.partida);
			
			this.escenarioRaiz.setLeft(seleccPersonajeAMover);
			
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void showMovimientoDePersonaje(Personaje personaje){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("controllers/MenuSeleccionMovimiento.fxml"));
			VBox movimientoPersonaje = (VBox) loader.load();

			MenuSeleccionMovimientoController menuSeleccionMovController = loader.getController();
			menuSeleccionMovController.setMainApp(this);
			menuSeleccionMovController.setPartida(this.partida);
			menuSeleccionMovController.setPersonajeAtacante(personaje);

			this.escenarioRaiz.setLeft(movimientoPersonaje);
			
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public void showSeleccionPersonajeAtaque(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("controllers/MenuDeAtaqueInicial.fxml"));
			VBox seleccPersonajeAtacante = (VBox) loader.load();

			MenuDeAtaqueController menuDeAtaqueController = loader.getController();
			menuDeAtaqueController.setMainApp(this);
			menuDeAtaqueController.setPartida(this.partida);
			
			this.escenarioRaiz.setLeft(seleccPersonajeAtacante);
			
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void showAtaqueDePersonaje(Personaje personaje){
		try{
			FXMLLoader loader = new FXMLLoader();
			VBox ataqueDePersonaje;
			if (this.partida.getJugadorEnEspera().getPersonajeModoUnico() != null){
				loader.setLocation(getClass().getResource("controllers/MenuDeAtacarAModoUnico.fxml"));
				ataqueDePersonaje = (VBox) loader.load();
				MenuDeAtacarAModoUnicoController menuSeleccionMovController = loader.getController();
				menuSeleccionMovController.setMainApp(this);
				menuSeleccionMovController.setPartida(this.partida);
				menuSeleccionMovController.setPersonajeAtacante(personaje);
			}else{
				loader.setLocation(getClass().getResource("controllers/MenuSeleccionDeEnemigoAAtacar.fxml"));
				ataqueDePersonaje = (VBox) loader.load();
				MenuSeleccionDeEnemigoAAtacarController menuSeleccionMovController = loader.getController();
				menuSeleccionMovController.setMainApp(this);
				menuSeleccionMovController.setPartida(this.partida);
				menuSeleccionMovController.setPersonajeAtacante(personaje);
			}
			
			if (this.partida.getJugadorEnEspera() == this.partida.getPlayer1()){
				this.showMenuAutobots();
			}else{
				this.showMenuDecepticons();
			}

			this.escenarioRaiz.setLeft(ataqueDePersonaje);
		
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public void showSeleccionPersonajeTransformacion(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("controllers/MenuTransformar.fxml"));
			VBox menuTransformar = (VBox) loader.load();

			MenuTransformarController menuTransformarController = loader.getController();
			menuTransformarController.setPartida(this.partida);
			menuTransformarController.setMainApp(this);
			
			this.escenarioRaiz.setLeft(menuTransformar);
			
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	public void comenzarPartida(String jugador1, String jugador2){
		Jugador jugadorAutobot = new Jugador(jugador1, TipoTransformer.AUTOBOT);
		Jugador jugadorDecepticon = new Jugador(jugador2, TipoTransformer.DECEPTICON);
		this.partida = new Partida(jugadorAutobot,jugadorDecepticon,alto,largo);
	}
	
	public Partida getPartida(){
		return (this.partida);
	}
	
	public EscenarioRaizTableroController getControladorTablero(){
		return (this.controladorTablero);
	}
}
