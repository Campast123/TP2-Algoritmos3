package fiuba.algo3.modelo.estados;

import fiuba.algo3.modelo.personajes.Personaje;

public abstract class ModoUnico implements ModoAlgoformer {
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
	public boolean esHumanoide() {
		return false;
	}
	
	@Override
	public void setAtaque(int attack) {
		this.ataque = attack;
	}
	
	@Override
	public void setInmunidad(boolean inmunity) {
		this.inmunidad = inmunity;
	}

	@Override
	public boolean esAlterno() {
		return false;
	}
	
	@Override 
	public boolean esUnico(){
		return true;
	}
	
	@Override
	public boolean esUnidadTerrestre(){
		return true;
	}
	
	@Override
	public boolean esUnidadAerea(){
		return false;
	}
	@Override
	public boolean puedeAtravesarPantano(){
		return true;
	}
	
	@Override
	public void quitarVidaEspinas(Personaje algoformer){
		algoformer.reducirVida();
	}
	@Override
	public void reducirAtaque(){
		
	}
	@Override
	public void reducirVelocidad(){
		this.velocidad = this.velocidad - 1;
	}
	
	@Override
	public boolean pantanoReduceVelocidad(){
		return false;
	}
	
}
