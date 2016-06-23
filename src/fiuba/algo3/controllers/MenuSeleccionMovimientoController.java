package fiuba.algo3.controllers;

import java.io.IOException;

import fiuba.algo3.modelo.jugabilidad.Direccion;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuSeleccionMovimientoController {
	private Partida partida;
	private Personaje personajeAMover;
	private Stage window;
	private int cantMov;
	public void clickBotonMoverArriba() throws IOException{
		try{
			Direccion direccion=new Direccion();
			this.partida.moverAlgoformerA(this.personajeAMover, direccion.getArriba());
			System.out.print(" Ahora "+this.partida.getJugadorActual().getNombre()+"  se movio hacia arriba ");
			if (this.cantMov==0) this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede mover hacia arriba");
		}
	}
	public void clickBotonMoverAbajo() throws IOException{
		try{
			Direccion direccion=new Direccion();
			this.partida.moverAlgoformerA(this.personajeAMover, direccion.getAbajo());
			System.out.print(" Ahora "+this.partida.getJugadorActual().getNombre()+"  se movio hacia abajo ");
			if (this.cantMov==0) this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede mover hacia abajo");
		}
	}
	public void clickBotonMoverDerecha() throws IOException{
		try{
			Direccion direccion=new Direccion();
			this.partida.moverAlgoformerA(this.personajeAMover, direccion.getDerecha());
			System.out.print(" Ahora "+this.partida.getJugadorActual().getNombre()+"  se movio hacia derecha ");
			if (this.cantMov==0) this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede mover hacia derecha");
		}
	}
	public void clickBotonMoverIzquierda() throws IOException{
		try{
			Direccion direccion=new Direccion();
			this.partida.moverAlgoformerA(this.personajeAMover, direccion.getIzquierda());
			System.out.print(" Ahora "+this.partida.getJugadorActual().getNombre()+"  se movio hacia izquierda ");
			if (this.cantMov==0) this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede mover hacia izquierda");
		}
	}
	public void clickBotonMoverDiagDerInf() throws IOException{
		try{
			Direccion direccion=new Direccion();
			this.partida.moverAlgoformerA(this.personajeAMover, direccion.getDiagonalDerInferior());
			System.out.print(" Ahora "+this.partida.getJugadorActual().getNombre()+"  se movio hacia diagonal derecha inferior ");
			if (this.cantMov==0) this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede mover hacia diagonal derecha inferior");
		}
	}
	public void clickBotonMoverDiagDerSup() throws IOException{
		try{
			Direccion direccion=new Direccion();
			this.partida.moverAlgoformerA(this.personajeAMover, direccion.getDiagonalDerSuperior());
			System.out.print(" Ahora "+this.partida.getJugadorActual().getNombre()+"  se movio hacia diagonal derecha superior ");
			if (this.cantMov==0) this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede mover hacia diagonal derecha superior");
		}
	}
	public void clickBotonMoverDiagIzqSup() throws IOException{
		try{
			Direccion direccion=new Direccion();
			this.partida.moverAlgoformerA(this.personajeAMover, direccion.getDiagonalIzqSuperior());
			System.out.print(" Ahora "+this.partida.getJugadorActual().getNombre()+"  se movio hacia diagonal izquierda superior ");
			if (this.cantMov==0) this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede mover hacia diagonal izquierda superior ");
		}
	}
	public void clickBotonMoverDiagIzqInf() throws IOException{
		try{
			Direccion direccion=new Direccion();
			this.partida.moverAlgoformerA(this.personajeAMover, direccion.getDiagonalDerSuperior());
			System.out.print(" Ahora "+this.partida.getJugadorActual().getNombre()+"  se movio hacia diagonal izquierda inferior ");
			if (this.cantMov==0) this.clickBotonTerminarTurno();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede mover hacia diagonal izquierda inferior");
		}
	}

	public void clickBotonTerminarTurno(){
		
		try{
			this.partida.finalizarTurno();
			System.out.print("Termino turno ");
			System.out.print("Ahora juega "+this.partida.getJugadorActual().getNombre());
			FXMLLoader loader = new FXMLLoader();
		
			loader.setLocation(getClass().getResource("/fiuba/algo3/vistas/recursos/MenuDeOpciones.fxml"));
			loader.load();
			Parent menuDeOpciones = loader.getRoot();

			VentanaDeAccionesController menuVentanaDeAccionesController = loader.getController();
			menuVentanaDeAccionesController.setPartida(this.partida);
			menuVentanaDeAccionesController.setWindow(this.window);

			this.window.hide();
			this.window.setScene(new Scene(menuDeOpciones));
			this.window.show();

		}catch(Exception ex){
			CajaAlerta.mostrar("Error en finalizar turno", "");
		}	
		}
	
	public void setPersonajeAtacante(Personaje personajeAtacante) {
		this.personajeAMover = personajeAtacante;
		this.cantMov = this.personajeAMover.getVelocidad();
	}
	
	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setWindow(Stage window) {
		this.window = window;
	}
}
