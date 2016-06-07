package fiuba.algo3.modelo.estados;

public class BumblebeeAlterno extends ModoAlterno implements UnidadTerrestre {
	public BumblebeeAlterno(){
		this.ataque = 20;
		this.distanciaDeAtaque = 3;
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
}
