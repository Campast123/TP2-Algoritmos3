package fiuba.algo3.vistas.movimiento;

import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.vistas.movimiento.eventos.BotonEntrarEventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
    Stage stage;
    Partida partida;
    BarraDeMenu menuBar;
    Scene escenaMover;

	public ContenedorPrincipal(Stage stage,Scene escenaMover) {
		this.stage=stage;
		this.setMenu(stage);
		this.escenaMover=escenaMover;
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

	        Button botonMover = new Button();
	        botonMover.setText("Mover");
	        BotonEntrarEventHandler botonMoverHandler = new BotonEntrarEventHandler(stage, escenaMover);
	        botonMover.setOnAction(botonMoverHandler);

	        Button botonDireccion = new Button();
	        botonDireccion.setText("Cambiar direccion");


	        VBox contenedorVertical = new VBox(botonMover, botonDireccion);
	        contenedorVertical.setSpacing(10);
	        contenedorVertical.setPadding(new Insets(15));

	        this.setLeft(contenedorVertical);

	    }
}
