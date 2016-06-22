package fiuba.algo3.vistas.movimiento.eventos;

import fiuba.algo3.modelo.jugabilidad.Direccion;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonDireccionIzqInf implements EventHandler<ActionEvent> {
	Partida partida;
	Personaje algoformer;

    public BotonDireccionIzqInf(Partida partida,Personaje algoformer) {
    	this.partida=partida;
    	this.algoformer=algoformer;
    }

	@Override
    public void handle(ActionEvent actionEvent) {
		Direccion direccion = new Direccion();
	    System.out.println(this.algoformer.getPosicion());
		this.partida.moverAlgoformerA(this.algoformer, direccion.getDiagonalIzqInferior());
	    System.out.println(this.algoformer.getPosicion());
	}
}
