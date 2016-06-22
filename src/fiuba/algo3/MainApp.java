package fiuba.algo3;

import java.io.IOException;

import fiuba.algo3.vistas.CajaAlerta;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
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

	Stage window;
	Scene scene1,scene2;

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
				// llamar a la escena de la partida y crear la partida
			}

		});

		grid.getChildren().addAll(autobotsLabel,autobotsInput,decepticonsLabel,decepticonsInput,botonInicioDePartida);

		return new Scene(grid, 350, 350);
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

// CODIGO DE PRUEBA
	//ESCENA BASICA CON BOTON
//	primaryStage.setTitle("Title of the Window");
//	button = new Button();
//	button.setText("Click me");
//	button.setOnAction(this);
//
//	StackPane layout = new StackPane();
//	layout.getChildren().add(button);
//
//	Scene scene = new Scene(layout,300,250);
//	primaryStage.setScene(scene);
//	primaryStage.show();

	// CAMBIO DE ESCENAS
//	window = primaryStage;
//	Label label1 = new Label("Welcome to first scene!");
//	Button button1 = new Button("Go to scene 2");
//	button1.setOnAction(e -> window.setScene(scene2));
//
//	//layout 1 (childrens in vertical column)
//	VBox layout1 = new VBox(20);
//	layout1.getChildren().addAll(label1, button1);
//	scene1 = new Scene(layout1, 200, 200);
//
//	//Button 2
//	Button button2 = new Button("Go back");
//	button2.setOnAction(e -> window.setScene(scene1));
//
//	//layout 2
//	StackPane layout2 = new StackPane();
//	layout2.getChildren().add(button2);
//	scene2 = new Scene (layout2,600,300);
//
//	window.setScene(scene1);
//	window.setTitle("Title Here");
//	window.show();

//	@Override
//	public void handle(ActionEvent event) {
//		if (event.getSource() ==  this.button){
//			System.out.println("Hola Mundo");
//		}
//	}
}
