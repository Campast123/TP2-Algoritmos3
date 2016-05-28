package fiuba.algo3.modelo.personajes;

import fiuba.algo3.modelo.tablero.Posicion;

public abstract class Personaje {
	
	protected Posicion posicion;
	protected int ataque;
	protected int velocidad;
	protected int distanciaDeAtaque;
	protected int puntosDeVida;
	protected EstadoAlgoformer estado;
	
	public Personaje(){
		this.posicion  = new Posicion(-1,-1);
		this.ataque = 0;
		this.velocidad = 0;
		this.distanciaDeAtaque = 0;
		this.puntosDeVida = 0;
		this.estado = EstadoAlgoformer.HUMANOIDE;
	}
	
	public void ubicarEnPosicion (Posicion posicion){
		this.posicion = posicion;
	}
	
	public Posicion obtenerPosicion (){
		return this.posicion;
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

}
