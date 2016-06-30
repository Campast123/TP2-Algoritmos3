package fiuba.algo3.controllers;

import fiuba.algo3.MainApp;
import fiuba.algo3.modelo.excepciones.JugadorGanoException;
import fiuba.algo3.modelo.jugabilidad.Direccion;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.vistas.CajaAlerta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MenuSeleccionMovimientoController {
	@FXML
	private Button botonVolverAtras;
	@FXML
	private Label ptosDeVida;
	@FXML
	private Label ataque;
	@FXML
	private Label distDeAtaque;
	@FXML
	private Label velocidad;

	private Partida partida;
	private Personaje personajeAMover;
	private MainApp mainApp;
	private int cantMov;
	private Direccion direccion = new Direccion();

	@FXML
	private void initialize(){
		this.botonVolverAtras.setDisable(false);
	}

	public void moverAPosicion(Posicion posicion){
		try{
			this.partida.moverAlgoformerA(this.personajeAMover, posicion);
			this.mainApp.getControladorTablero().actualizarPosicionesGenerales();
			this.mainApp.getControladorTablero().consumirBonus(this.personajeAMover.getPosicion());
			this.botonVolverAtras.setDisable(true);
			this.actualizarDatos();

		if (this.cantMov<=0) this.clickBotonTerminarTurno();

		} catch (JugadorGanoException e){
			this.mainApp.showPantallaDeVictoria(e.getJugadorGanador());
		} catch(Exception ex){
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

	public void clickBotonVolverAtras(){
		if (this.personajeAMover.esUnico()){
			this.mainApp.showMenuDeOpciones();
		}else{
			this.mainApp.showSeleccionPersonajeMovimiento();
		}
	}

	public void clickBotonTerminarTurno(){
		this.mainApp.terminarTurno();
	}

	public void setPersonajeAtacante(Personaje personajeAtacante) {
		this.personajeAMover = personajeAtacante;
		this.actualizarDatos();
	}

	private void actualizarDatos(){
		this.cantMov = this.personajeAMover.getVelocidad();

		this.ptosDeVida.setText(String.valueOf(this.personajeAMover.getPuntosDeVida()));
		this.ataque.setText(String.valueOf(this.personajeAMover.getAtaque()));
		this.distDeAtaque.setText(String.valueOf(this.personajeAMover.getDistanciaDeAtaque()));
		this.velocidad.setText(String.valueOf(this.cantMov));
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
}
