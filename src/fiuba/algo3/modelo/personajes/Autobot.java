package fiuba.algo3.modelo.personajes;


import fiuba.algo3.modelo.superficies.SuperficieDeCampo;
import fiuba.algo3.modelo.tablero.Posicion;

public abstract class Autobot extends Personaje{
	
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
	public void recibirAtaqueDe(Decepticon decepticon) {
		this.recibirAtaque(decepticon.getAtaque());
	}
	
	@Override
	public void recibirAtaqueDe(Autobot autobot) {
	}
	
	@Override
	public void reducirVida() {
		this.ptosDeVida = this.ptosDeVida - ((this.ptosDeVida*5)/100);
	}
	
	@Override
	public void reducirAtaque(){
		this.modoAlgoformer.reducirAtaque();
	}
	
	@Override
	public void reducirVelocidad(){
		this.modoAlgoformer.reducirVelocidad();
	}
	
	@Override
	public void avanzaCasillero(SuperficieDeCampo superficieDeCampo){
		superficieDeCampo.reducirVelocidad(this);
	}

}
