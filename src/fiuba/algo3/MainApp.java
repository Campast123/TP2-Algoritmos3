package fiuba.algo3;

import java.io.IOException;

import fiuba.algo3.controllers.VentanaDeAccionesController;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.jugabilidad.TipoTransformer;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage window;
	private Scene scene1,scene2;
	private Partida partida;


    public static void main(String[] args) {
    	launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		window.setScene(this.getEscenaDeMenuInicial());

		window.show();
	}

	private Scene getEscenaDeMenuInicial(){
		window.setTitle("Iniciar Partida Battle Algoformers");

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);

		//name label
		Label autobotsLabel = new Label("Autobots");
		GridPane.setConstraints(autobotsLabel, 0, 0);

		TextField autobotsInput = new TextField();
		autobotsInput.setPromptText("Jugador Autobot");
		GridPane.setConstraints(autobotsInput, 1, 0);

		Label decepticonsLabel = new Label("Decepticons");
		GridPane.setConstraints(decepticonsLabel, 0, 1);

		TextField decepticonsInput = new TextField();
		decepticonsInput.setPromptText("Jugador Decepticon");
		GridPane.setConstraints(decepticonsInput, 1, 1);

		Button botonInicioDePartida = new Button("Iniciar Partida");
		GridPane.setConstraints(botonInicioDePartida, 1, 2);

		botonInicioDePartida.setOnAction( e -> {
			if(this.estanCompletosLosCampos(autobotsInput,decepticonsInput)){
				Jugador jugadorAutobot = new Jugador(autobotsInput.getText(), TipoTransformer.AUTOBOT);
				Jugador jugadorDecepticon = new Jugador(decepticonsInput.getText(), TipoTransformer.DECEPTICON);
				this.partida = new Partida(jugadorAutobot,jugadorDecepticon);
				window.hide();
				try {
					window.setScene(this.getMenuSceneField());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				window.show();
			}

		});

		grid.getChildren().addAll(autobotsLabel,autobotsInput,decepticonsLabel,decepticonsInput,botonInicioDePartida);

		return new Scene(grid, 350, 350);
	}

	private Scene getMenuSceneField() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("vistas/recursos/MenuDeOpciones.fxml"));
		loader.load();
		Parent vistaDeAcciones = loader.getRoot();

		VentanaDeAccionesController ventanaDeAccionesController = loader.getController();
		ventanaDeAccionesController.setPartida(this.partida);
		ventanaDeAccionesController.setWindow(this.window);
		return new Scene(vistaDeAcciones);
	}


	private boolean estanCompletosLosCampos(TextField autobotsInput, TextField decepticonsInput){
		if (autobotsInput.getText().isEmpty()){
			CajaAlerta.mostrar("Datos Invalidos", "El casillero de los autobots esta vacio. Completar para jugar...");
			return false;
		}
		if (decepticonsInput.getText().isEmpty()){
			CajaAlerta.mostrar("Datos Invalidos", "El casillero de los decepticons esta vacio. Completar para jugar...");
			return false;
		}
		return true;

	}
}
