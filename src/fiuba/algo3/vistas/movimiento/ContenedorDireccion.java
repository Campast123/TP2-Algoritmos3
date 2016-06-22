package fiuba.algo3.vistas.movimiento;

import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.vistas.movimiento.eventos.BotonDireccionAbajo;
import fiuba.algo3.vistas.movimiento.eventos.BotonDireccionArriba;
import fiuba.algo3.vistas.movimiento.eventos.BotonDireccionDerInf;
import fiuba.algo3.vistas.movimiento.eventos.BotonDireccionDerSup;
import fiuba.algo3.vistas.movimiento.eventos.BotonDireccionDerecha;
import fiuba.algo3.vistas.movimiento.eventos.BotonDireccionIzqInf;
import fiuba.algo3.vistas.movimiento.eventos.BotonDireccionIzqSup;
import fiuba.algo3.vistas.movimiento.eventos.BotonDireccionIzquierda;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public abstract class ContenedorDireccion extends BorderPane {
	Stage stage;
    BarraDeMenu menuBar;
    Partida partida;
	Personaje algoformer;


	public void setPersonaje() {
		// TODO Auto-generated method stub

	}

	protected void setMenu(Stage stage) {
	        this.menuBar = new BarraDeMenu(stage);
	        this.setTop(menuBar);
	}

	public void setPartida(Partida partida2) {
		this.partida=partida2;
		this.setPersonaje();
        this.setBotonera(this.partida);
	}

	private void setBotonera(Partida partida) {

        Button botonMoverArriba = new Button();
        botonMoverArriba.setText("Arriba");
        Button botonMoverAbajo = new Button();
        botonMoverAbajo.setText("Abajo");
        Button botonMoverDerecha = new Button();
        botonMoverDerecha.setText("Derecha");
        Button botonMoverIzquierda = new Button();
        botonMoverIzquierda.setText("Izquierda");
        Button botonMoverDiagonaIzqSup = new Button();
        botonMoverDiagonaIzqSup.setText("Diagonal Izq Sup");
        Button botonMoverDiagonaIzqInf = new Button();
        botonMoverDiagonaIzqInf.setText("Diagonal Izq Inf");
        Button botonMoverDiagonaDerSup = new Button();
        botonMoverDiagonaDerSup.setText("Diagonal Der Sup");
        Button botonMoverDiagonaDerInf = new Button();
        botonMoverDiagonaDerInf.setText("Diagonal Der Inf");

        BotonDireccionArriba botonMoverHandlerArriba = new BotonDireccionArriba(this.partida,this.algoformer);
        botonMoverArriba.setOnAction(botonMoverHandlerArriba);
        BotonDireccionAbajo botonMoverHandlerAbajo = new BotonDireccionAbajo(this.partida,this.algoformer);
        botonMoverAbajo.setOnAction(botonMoverHandlerAbajo);
        BotonDireccionDerecha botonMoverHandlerDerecha = new BotonDireccionDerecha(this.partida,this.algoformer);
        botonMoverDerecha.setOnAction(botonMoverHandlerDerecha);
        BotonDireccionIzquierda botonMoverHandlerIzquierda = new BotonDireccionIzquierda(this.partida,this.algoformer);
        botonMoverIzquierda.setOnAction(botonMoverHandlerIzquierda);
        BotonDireccionIzqSup botonMoverHandlerIzqSup = new BotonDireccionIzqSup(this.partida,this.algoformer);
        botonMoverDiagonaIzqSup.setOnAction(botonMoverHandlerIzqSup);
        BotonDireccionIzqInf botonMoverHandlerIzqInf = new BotonDireccionIzqInf(this.partida,this.algoformer);
        botonMoverDiagonaIzqInf.setOnAction(botonMoverHandlerIzqInf);
        BotonDireccionDerSup botonMoverHandlerDerSup = new BotonDireccionDerSup(this.partida,this.algoformer);
        botonMoverDiagonaDerSup.setOnAction(botonMoverHandlerDerSup);
        BotonDireccionDerInf botonMoverHandlerDerInf = new BotonDireccionDerInf(this.partida,this.algoformer);
        botonMoverDiagonaDerInf.setOnAction(botonMoverHandlerDerInf);

        VBox contenedorVertical = new VBox(botonMoverArriba,botonMoverAbajo,botonMoverDerecha,botonMoverIzquierda,botonMoverDiagonaIzqSup,botonMoverDiagonaIzqInf,botonMoverDiagonaDerSup,botonMoverDiagonaDerInf);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }
}
