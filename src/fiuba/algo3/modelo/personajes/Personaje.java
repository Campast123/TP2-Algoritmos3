package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.ModoAlgoformer;
import fiuba.algo3.modelo.superficies.SuperficieDeCampo;
import fiuba.algo3.modelo.tablero.Posicion;

public abstract class Personaje implements Posicionable {
	protected int ptosDeVida;
	protected ModoAlgoformer modoAlgoformer;
	protected Posicion posicion;
	protected Stack<ModoAlgoformer> distintosModos;
	protected int turnosInmovilizado = 0;
	
	public abstract void atacar(Personaje personaje);
	public abstract void recibirAtaqueDe(Decepticon decepticon);
	public abstract void recibirAtaqueDe(Autobot autobot);
	public abstract void reducirVida();
	public abstract void reducirAtaque();
	public abstract void reducirVelocidad();
	public abstract void avanzaCasillero(SuperficieDeCampo superficieDeCampo);
	
	public void reestablecerEfectos(){
		if (this.turnosInmovilizado > 0){
			this.turnosInmovilizado = this.turnosInmovilizado -1;
		}
	}
	
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
		
	}
	
	public Posicion getPosicion() {
		return (this.posicion);
	}
	
	public ModoAlgoformer getModoAlgoformer() {
		return modoAlgoformer;
	}
	public void setModoAlgoformer(ModoAlgoformer modoAlgoformer) {
		this.modoAlgoformer = modoAlgoformer;
	}
	public int getTurnosInmovilizado() {
		return turnosInmovilizado;
	}
	public void setTurnosInmovilizado(int turnosInmovilizado) {
		this.turnosInmovilizado = turnosInmovilizado;
	}
	
	public boolean puedeMoverse(Posicion posicion){
		int distanciaDePosiciones = this.posicion.distanciaA(posicion);
		return (distanciaDePosiciones <= this.getVelocidad());
	}
	
	public boolean puedeAtacar(Posicion posicion) {
		int distanciaDePosiciones = this.posicion.distanciaA(posicion);
		return (distanciaDePosiciones <= this.getDistanciaDeAtaque());
	}
	
	public int getAtaque() {
		return (this.modoAlgoformer.getAtaque());
	}

	public int getVelocidad() {
		return (this.modoAlgoformer.getVelocidad());
	}

	public int getDistanciaDeAtaque() {
		return (this.modoAlgoformer.getDistanciaDeAtaque());
	}

	public int getPuntosDeVida() {
		return (this.ptosDeVida) ;
	}
	
	public boolean esHumanoide() {
		return (this.modoAlgoformer.esHumanoide());
	}

	public boolean esAlterno() {
		return (this.modoAlgoformer.esAlterno());
	}
	
	public void reducirVidaEspinas() {
		this.modoAlgoformer.quitarVidaEspinas(this);
	}

	public void transformar() {
		ModoAlgoformer nuevoModo = this.distintosModos.pop();
		distintosModos.push(this.modoAlgoformer);
		this.modoAlgoformer = nuevoModo;
	}
	public boolean rocosaReduceVelocidad(){
		return false;
	}
	
	public boolean pantanoReduceVelocidad(){
		return (this.modoAlgoformer.pantanoReduceVelocidad());
	}
	
	public boolean espinasReduceVelocidad(){
		return false;
	}
	
	public boolean nubeReduceVelocidad(){
		return false;
	}
	
	public boolean tormentaReduceVelocidad(){
		return false;
	}
	
	public boolean nebulosaReduceVelocidad(){
		return false;
	}
	
	public boolean puedeAtravesarRocosa(){
		return true;
	}
	
	public boolean puedeAtravesarPantano(){
		return (this.modoAlgoformer.puedeAtravesarPantano());
	}
	
	public boolean puedeAtravesarEspinas(){
		return true;
	}
	
	public boolean puedeAtravesarNube(){
		return true;
	}
	
	public boolean puedeAtravesarTormenta(){
		return true;
	}
	
	public boolean puedeAtravesarNebulosa(){
		return true;
	}
	
}
