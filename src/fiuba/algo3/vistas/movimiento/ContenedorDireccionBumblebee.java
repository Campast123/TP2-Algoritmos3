package fiuba.algo3.vistas.movimiento;

import javafx.stage.Stage;

public class ContenedorDireccionBumblebee extends ContenedorDireccion{
	public ContenedorDireccionBumblebee(Stage stage) {
		this.stage=stage;
		this.setMenu(stage);
	}

	@Override
	public void setPersonaje() {
		this.algoformer = this.partida.obtenerJugadorDelTurno().getPersonaje2();
	}

}
