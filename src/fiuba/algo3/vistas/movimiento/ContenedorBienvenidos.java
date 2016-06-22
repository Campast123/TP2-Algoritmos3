package fiuba.algo3.vistas.movimiento;

import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.jugabilidad.TipoTransformer;
import fiuba.algo3.vistas.movimiento.eventos.BotonEntrarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorBienvenidos extends VBox{

    Stage stage;
    Partida partida;
	public ContenedorBienvenidos(Stage stage, Scene escenaJuego) {
		 super();

	        this.stage = stage;

	        this.setAlignment(Pos.CENTER);
	        this.setSpacing(20);
	        this.setPadding(new Insets(25));

	        TextField texto1 = new TextField();
	        texto1.setPromptText("Nombre Equipo Autobots");
	        TextField texto2 = new TextField();
	        texto2.setPromptText("Nombre Equipo Decepticons");

	        String nombreJugador1 = texto1.getText();
	        String nombreJugador2 = texto2.getText();

	        Jugador jugador1 = new Jugador(nombreJugador1,TipoTransformer.AUTOBOT);
	        Jugador jugador2 = new Jugador(nombreJugador2,TipoTransformer.DECEPTICON);

	        Partida partida = new Partida(jugador1,jugador2);

	        this.partida = partida;

	        Button botonEntrar = new Button();
	        botonEntrar.setText("Iniciar Partida");

	        Label etiqueta = new Label();
	        etiqueta.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));

	        etiqueta.setText("Para iniciar una nueva partida haga click en Iniciar Partida");
	        etiqueta.setTextFill(Color.web("#66A7C5"));

	        BotonEntrarEventHandler botonEntrarHandler = new BotonEntrarEventHandler(stage, escenaJuego);
	        botonEntrar.setOnAction(botonEntrarHandler);

	        this.getChildren().addAll(etiqueta, botonEntrar,texto1,texto2);

	}
	public Partida DevolverPartida(){
		return this.partida;
	}
}
