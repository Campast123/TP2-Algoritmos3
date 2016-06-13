package fiuba.algo3.modelo.estados;

public class BonecrusherAlterno extends UnidadAlternaTerrestre{
	public BonecrusherAlterno(){
		this.ataque = 30;
		this.distanciaDeAtaque = 3;
		this.velocidad = 8;		
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
