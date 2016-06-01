package fiuba.algo3.modelo.personajes;

import fiuba.algo3.modelo.tablero.Posicion;

public abstract class Personaje extends Posicionable {
	
	private int ataque;
	private int velocidad;
	private int distanciaDeAtaque;
	private int puntosDeVida;
	private EstadoAlgoformer estado;
	
	public Personaje(){
		this.posicion  = new Posicion(-1,-1);
		this.ataque = 0;
		this.velocidad = 0;
		this.distanciaDeAtaque = 0;
		this.puntosDeVida = 0;
		this.estado = EstadoAlgoformer.HUMANOIDE;
	}
	
		
	public boolean esHumanoide(){
		return this.estado.equals(EstadoAlgoformer.HUMANOIDE);
	}
	
	public boolean esAlterno(){
		return this.estado.equals(EstadoAlgoformer.ALTERNO);
	}
	
	public boolean esModoUnico(){
		return this.estado.equals(EstadoAlgoformer.MODO_UNICO);
	}
	
	public void recibirAtaque(int ataqueRecibido){
		this.puntosDeVida = this.puntosDeVida - ataqueRecibido;
	}
	

	public abstract void atacarA (Personaje personaje);

	public abstract void transformacionModoHumanoide();
	public abstract void transformacionModoAlterno();

	public abstract boolean esAutobot();
	public abstract boolean esDecepticon();

	
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getDistanciaDeAtaque() {
		return distanciaDeAtaque;
	}

	public void setDistanciaDeAtaque(int distanciaDeAtaque) {
		this.distanciaDeAtaque = distanciaDeAtaque;
	}

	public int getPuntosDeVida() {
		return puntosDeVida;
	}

	public void setPuntosDeVida(int puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}

	public EstadoAlgoformer getEstado() {
		return estado;
	}

	public void setEstado(EstadoAlgoformer estado) {
		this.estado = estado;
	}


	public boolean puedeAtacar(Posicion posicion) {
		if((posicion.distanciaCoordX (this.posicion) <= this.distanciaDeAtaque) && (posicion.distanciaCoordY(this.posicion) <= this.distanciaDeAtaque)){
			return true;
		}
		return false;
	}	

}
