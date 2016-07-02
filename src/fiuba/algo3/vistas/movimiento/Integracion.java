package fiuba.algo3.vistas.movimiento;

import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Optimus;
import fiuba.algo3.modelo.tablero.Posicion;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//import fiuba.algo3.javafx.eventos.manejadores.BotonEnviarEventHandler;
//import fiuba.algo3.javafx.eventos.manejadores.BotonLimpiarEventHandler;
//import fiuba.algo3.javafx.eventos.manejadores.TextoEventHandler;

public class Integracion extends Application {

	  public static void main(String[] args) {
	        launch(args);

	    }
	   @Override
	    public void start(final Stage stage) throws Exception {

	        stage.setTitle("ALGOFORMERS");
	        ContenedorDireccionOptimus contenedorDireccionOptimus=new ContenedorDireccionOptimus(stage);
	        ContenedorDireccionBumblebee contenedorDireccionBumblebee=new ContenedorDireccionBumblebee(stage);
	        ContenedorDireccionRatchet contenedorDireccionRatchet=new ContenedorDireccionRatchet(stage);
	        Scene escenaMoverOptimus = new Scene(contenedorDireccionOptimus, 640, 480);
	        Scene escenaMoverBumblebee = new Scene(contenedorDireccionBumblebee, 640, 480);
	        Scene escenaMoverRatchet = new Scene(contenedorDireccionRatchet, 640, 480);

	        ContenedorMover contenedorMover = new ContenedorMover(stage,escenaMoverOptimus,escenaMoverBumblebee,escenaMoverRatchet);
	        Scene escenaMover = new Scene(contenedorMover, 640, 480);

	        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, escenaMover);
	        Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);

	        ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage, escenaJuego);
	        Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 640, 480);

	        Partida partida = contenedorBienvenidos.DevolverPartida();
	        contenedorPrincipal.setPartida(partida);
	        contenedorMover.setPartida(partida);
	        contenedorDireccionOptimus.setPartida(partida);
	        contenedorDireccionBumblebee.setPartida(partida);
	        contenedorDireccionRatchet.setPartida(partida);
	        Optimus bum= new Optimus();
	        for (int x = 0 ; x <= 50 ; x++){
				for (int y = 0; y <= 50; y++){

					Posicion posicion = new Posicion(x,y);
			        System.out.println(partida.getTablero().obtenerCasillero(posicion).getSuperficies().puedeAtravesarlo(bum));
			        System.out.println(partida.getTablero().obtenerCasillero(posicion).getBonus());
				}
	        }

	        stage.setScene(escenaBienvenidos);
	        stage.setFullScreen(false);

	        stage.show();

	    }
}
