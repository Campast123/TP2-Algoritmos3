package fiuba.algo3.modelo.estados;

public class MegatronAlterno extends ModoAlterno{
	public MegatronAlterno(){
		this.ataque = 55;
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
