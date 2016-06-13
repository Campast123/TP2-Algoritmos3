package fiuba.algo3.modelo.estados;

import fiuba.algo3.modelo.personajes.Personaje;

public abstract class ModoAlterno implements ModoAlgoformer {
	int ataque;
	int velocidad;
	int distanciaDeAtaque;
	boolean inmunidad;
	
	@Override
	public int getVelocidad() {
		return (this.velocidad);
		
	}
	@Override
	public int getDistanciaDeAtaque() {
		return (this.distanciaDeAtaque);
		
	}

	@Override
	public int getAtaque() {
		return (this.ataque);
	}
	
	@Override
	public void setAtaque(int attack) {
		this.ataque = attack;
	}
	
	@Override
	public void setInmunidad() {
		this.inmunidad = !(this.inmunidad);
	}		
	
	@Override
	public boolean esHumanoide() {
		return false;
	}

	@Override
	public boolean esAlterno() {
		return true;
	}
	@Override 
	public boolean esUnico(){
		return false;
	}
	@Override
	public void quitarVidaEspinas(Personaje algoformer){
		
	}
	@Override
	public void reducirAtaque(){
		
	}
	@Override
	public void reducirVelocidad(){
		this.velocidad = this.velocidad - 1;
	}
	

}
