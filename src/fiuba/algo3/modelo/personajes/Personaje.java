package fiuba.algo3.modelo.personajes;

import fiuba.algo3.modelo.excepciones.PosicionInvalidaException;
import fiuba.algo3.modelo.tablero.Posicion;

public abstract class Personaje {
	
	protected Posicion posicion;
	protected int ataque;
	protected int velocidad;
	protected int distanciaDeAtaque;
	protected int puntosDeVida;
	
	public Personaje(){
		this.posicion  = new Posicion(-1,-1);
		this.ataque = 0;
		this.velocidad = 0;
		this.distanciaDeAtaque = 0;
		this.puntosDeVida = 0;
	}
	
	//Precondicion posicon != null, puede romper el mensaje del throw
	public void moverA (Posicion posicion) throws PosicionInvalidaException{
		if (this.posicionValida(posicion)){
			int distanciaX =  Math.abs(posicion.getCoordenadaX() - this.posicion.getCoordenadaX());
			int distanciaY =  Math.abs(posicion.getCoordenadaY() - this.posicion.getCoordenadaY());
			if ((distanciaX <= velocidad) && (distanciaY <= velocidad)){
				this.posicion = posicion;
			}			
		}
		throw new PosicionInvalidaException("La posicion en X:" + posicion.getCoordenadaX() + " e Y:" + posicion.getCoordenadaY() + " es invalida");
	}
	
	private boolean posicionValida(Posicion posicion){
		if (posicion != null){
			if (posicion.getCoordenadaX() >= 0 && posicion.getCoordenadaX() <= 50){
				return (posicion.getCoordenadaY() >= 0 && posicion.getCoordenadaY() <= 50);
			}
		}
		return false;
	}
	
	public abstract void atacarA (Personaje personaje);


}
