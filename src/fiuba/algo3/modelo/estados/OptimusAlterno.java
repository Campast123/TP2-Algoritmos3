package fiuba.algo3.modelo.estados;

public class OptimusAlterno extends UnidadAlternaTerrestre{
	public OptimusAlterno(){
		this.ataque = 15;
		this.velocidad = 5;
		this.distanciaDeAtaque = 4;
	}

	@Override
	public boolean esUnidadTerrestre() {
		return true;
	}

	@Override
	public boolean esUnidadAerea() {
		return false;
	}

	@Override
	public void setInmunidad(boolean inmunidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVelocidad(int velocidad) {
		// TODO Auto-generated method stub
		
	}
}
