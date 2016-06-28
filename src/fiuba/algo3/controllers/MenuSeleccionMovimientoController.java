package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.jugabilidad.Direccion;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuSeleccionMovimientoController {
	@FXML
	private Label velocidadRestante;
	
	private Partida partida;
	private Personaje personajeAMover;
	private MainApp mainApp;
	private int cantMov;
	private Direccion direccion = new Direccion();
	
	
	public void moverAPosicion(Posicion posicion){
		try{
			this.partida.moverAlgoformerA(this.personajeAMover, posicion);
			this.mainApp.getControladorTablero().actualizarPosicionesGenerales();
			this.actualizarVelocidad();
		
		if (this.cantMov<=0) this.clickBotonTerminarTurno();
		
		}catch(Exception ex){
			CajaAlerta.mostrar("Error en movimiento", "El personaje no se puede moverse en esa posicion" + "\n");
		}
	}
	
	public void clickBotonMoverArriba(){
		this.moverAPosicion(this.direccion.getArriba());
	}
	
	public void clickBotonMoverAbajo(){
		this.moverAPosicion(this.direccion.getAbajo());
	}
	
	public void clickBotonMoverDerecha(){
		this.moverAPosicion(this.direccion.getDerecha());
	}
	
	public void clickBotonMoverIzquierda(){
		this.moverAPosicion(this.direccion.getIzquierda());
	}
	
	public void clickBotonMoverDiagDerInf(){
		this.moverAPosicion(this.direccion.getDiagonalDerInferior());
	}
	
	public void clickBotonMoverDiagDerSup(){
			this.moverAPosicion(this.direccion.getDiagonalDerSuperior());
	}
	
	public void clickBotonMoverDiagIzqSup(){
		this.moverAPosicion(this.direccion.getDiagonalIzqSuperior());
	}
	
	public void clickBotonMoverDiagIzqInf(){
		this.moverAPosicion(this.direccion.getDiagonalIzqInferior());
	}

	public void clickBotonTerminarTurno(){
		
		try{
			this.partida.finalizarTurno();
			this.mainApp.showMenuDeOpciones();
			
			if (this.partida.getJugadorActual() == this.partida.getPlayer1()){
				this.mainApp.showMenuAutobots();
			}
			else{
				this.mainApp.showMenuDecepticons();
			}
		}
		catch(Exception ex){
			CajaAlerta.mostrar("Error en finalizar turno", "");
		}
		
	}
	
	public void setPersonajeAtacante(Personaje personajeAtacante) {
		this.personajeAMover = personajeAtacante;
		this.actualizarVelocidad();
	}
	
	private void actualizarVelocidad(){
		this.cantMov = this.personajeAMover.getVelocidad();
		this.velocidadRestante.setText(String.valueOf(this.cantMov));
	}
	
	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
}
