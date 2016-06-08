package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.ModoAlgoformer;
import fiuba.algo3.modelo.superficies.SuperficieAerea;
import fiuba.algo3.modelo.superficies.SuperficieTerrestre;
import fiuba.algo3.modelo.tablero.Posicion;

abstract class Decepticon implements Personaje {
	int ptosDeVida;
	ModoAlgoformer modoAlgoformer;
	Posicion posicion;
	Stack<ModoAlgoformer> distintosModos;
	
	@Override
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
		
	}
	
	@Override
	public Posicion getPosicion() {
		return (this.posicion);
	}
	
	@Override
	public void atacar (Personaje personaje){
		if (this.puedeAtacar(personaje.getPosicion())){
			personaje.recibirAtaqueDe(this);
		}
	}
	
	@Override
	public void recibirAtaqueDe(Autobot autobot) {
		this.recibirAtaque(autobot.getAtaque());
	}
	
	@Override
	public void recibirAtaqueDe(Decepticon decepticon) {
	}
	
	@Override
	public void recibirAtaque(int ataque) {
		this.ptosDeVida = this.ptosDeVida - ataque;
	}
	
	@Override
	public boolean puedeAtacar(Posicion posicion) {
		int distanciaDePosiciones = this.posicion.distanciaA(posicion);
		return (distanciaDePosiciones <= this.getDistanciaDeAtaque());
	}
	
	@Override
	public boolean puedeMoverse(Posicion posicion){
		int distanciaDePosiciones = this.posicion.distanciaA(posicion);
		return (distanciaDePosiciones <= this.getVelocidad());
	}

	@Override
	public int getAtaque() {
		return (this.modoAlgoformer.getAtaque());
	}

	@Override
	public int getVelocidad() {
		return (this.modoAlgoformer.getVelocidad());
	}

	@Override
	public int getDistanciaDeAtaque() {
		return (this.modoAlgoformer.getDistanciaDeAtaque());
	}

	@Override
	public int getPuntosDeVida() {
		return (this.ptosDeVida) ;
	}
	@Override
	public boolean esHumanoide() {
		return (this.modoAlgoformer.esHumanoide());
	}

	@Override
	public boolean esAlterno() {
		return (this.modoAlgoformer.esAlterno());
	}
	
	@Override
	public void reducirVidaEspinas() {
		this.modoAlgoformer.quitarVidaEspinas(this);;
	}
	
	@Override
	public void reducirVida() {
		this.ptosDeVida = this.ptosDeVida - ((this.ptosDeVida*5)/100);
	}
	
	@Override
	public boolean puedeAtravesarSup(SuperficieAerea superficie){
		return this.modoAlgoformer.puedeAtravesar(superficie);
	}
	
	@Override
	public boolean puedeAtravesarSup(SuperficieTerrestre superficie){
		return this.modoAlgoformer.puedeAtravesar(superficie);
	}
	@Override
	public void transformar() {
		ModoAlgoformer nuevoModo = this.distintosModos.pop();
		distintosModos.push(this.modoAlgoformer);
		this.modoAlgoformer = nuevoModo;
	}
}
