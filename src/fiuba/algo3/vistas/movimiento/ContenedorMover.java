package fiuba.algo3.vistas.movimiento;

import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.vistas.movimiento.eventos.BotonEntrarEventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorMover extends BorderPane{
    Stage stage;
    Partida partida;
    BarraDeMenu menuBar;
    Scene escenaMoverOptimus;
    Scene escenaMoverBumblebee;
    Scene escenaMoverRatchet;

	public ContenedorMover(Stage stage,Scene escenaMoverOptimus,Scene escenaMoverBumblebee,Scene escenaMoverRatchet ){
		this.stage=stage;
		this.setMenu(stage);
		this.escenaMoverRatchet=escenaMoverRatchet;
		this.escenaMoverOptimus=escenaMoverOptimus;
		this.escenaMoverBumblebee=escenaMoverBumblebee;
	}

	public void setPartida(Partida partida2) {
		this.partida=partida2;
        this.setBotonera(this.partida);
	}

	private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
	}

	private void setBotonera(Partida partida) {

        Button botonMoverOptimus = new Button();
        botonMoverOptimus.setText("Optimus");
        BotonEntrarEventHandler botonMoverOptimusHandler = new BotonEntrarEventHandler(stage,this.escenaMoverOptimus);
        botonMoverOptimus.setOnAction(botonMoverOptimusHandler);

        Button botonMoverBumblebee = new Button();
        botonMoverBumblebee.setText("Bumblebee");
        BotonEntrarEventHandler botonMoverBumblebeeHandler = new BotonEntrarEventHandler(stage,this.escenaMoverBumblebee);
        botonMoverBumblebee.setOnAction(botonMoverBumblebeeHandler);

        Button botonMoverRatchet = new Button();
        botonMoverRatchet.setText("Ratchet");
        BotonEntrarEventHandler botonMoverRatchetHandler = new BotonEntrarEventHandler(stage,this.escenaMoverRatchet);
        botonMoverRatchet.setOnAction(botonMoverRatchetHandler);


        VBox contenedorVertical = new VBox(botonMoverOptimus, botonMoverBumblebee,botonMoverRatchet);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }
}
