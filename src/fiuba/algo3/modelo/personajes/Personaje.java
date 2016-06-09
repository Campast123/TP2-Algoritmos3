package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.ModoAlgoformer;
import fiuba.algo3.modelo.superficies.SuperficieAerea;
import fiuba.algo3.modelo.superficies.SuperficieDeCampo;
import fiuba.algo3.modelo.superficies.SuperficieTerrestre;
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
	public abstract boolean puedeAtacar(Posicion posicion);
	public abstract boolean puedeMoverse(Posicion posicion);
	public abstract void recibirAtaque(int ataque);
	public abstract void transformar();
	public abstract int getAtaque();
	public abstract int getVelocidad();
	public abstract int getDistanciaDeAtaque();
	public abstract int getPuntosDeVida();
	public abstract boolean esAlterno();
	public abstract boolean esHumanoide();
	public abstract boolean puedeAtravesarPantano();
	public abstract void reducirVidaEspinas();
	public abstract void reducirVida();
	public abstract void reducirAtaque();
	public abstract void reducirVelocidad();
	public abstract void avanzaCasillero(SuperficieDeCampo superficieDeCampo);
	
	public void reestablecerEfectos(){
		if (this.turnosInmovilizado > 0){
			this.turnosInmovilizado = this.turnosInmovilizado -1;
		}
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
}
