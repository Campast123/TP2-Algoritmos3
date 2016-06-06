package fiuba.algo3.modelo.estados;

public class RatchetAlterno extends ModoAlterno {
	public RatchetAlterno(){
		this.ataque = 35;
		this.distanciaDeAtaque = 2;
		this.velocidad = 8;
	}

	@Override
	public boolean esUnidadTerrestre() {
		return false;
	}

	@Override
	public boolean esUnidadAerea() {
		return true;
	}
}