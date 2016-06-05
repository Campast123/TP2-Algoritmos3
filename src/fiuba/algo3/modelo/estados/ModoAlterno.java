package fiuba.algo3.modelo.estados;

abstract class ModoAlterno implements ModoAlgoformer {
	int ataque;
	int velocidad;
	int distanciaDeAtaque;
	String superficie;

	@Override
	public int getVelocidad() {
		return (this.velocidad);
		
	}
	@Override
	public int getDistanciaDeAtaque() {
		return (this.distanciaDeAtaque);
		
	}
	@Override
	public String getSuperficie() {
		return (this.superficie);
		
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
	public boolean esAlterno() {
		return true;
	}
	@Override 
	public boolean esUnico(){
		return false;
	}
}
