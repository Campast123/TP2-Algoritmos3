package fiuba.algo3.modelo.estados;

public class OptimusAlterno extends UnidadAlternaTerrestre{
	public OptimusAlterno(){
		this.ataque = 15;
		this.distanciaDeAtaque = 4;
		this.velocidad = 5;
	}

	@Override
	public boolean esUnidadTerrestre() {
		return true;
	}

	@Override
	public boolean esUnidadAerea() {
		return false;
	}

	public void setInmunidad(boolean inmunidad) {	
		
	}
	
	public void setVelocidad(int velocidad) {
		
	}

	@Override
	public void reestablecerVelocidad(){
		this.velocidad = 5;
	}
}

