package fiuba.algo3.modelo.estados;

public class BonecrusherAlterno extends ModoAlterno implements UnidadTerrestre{
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
}
