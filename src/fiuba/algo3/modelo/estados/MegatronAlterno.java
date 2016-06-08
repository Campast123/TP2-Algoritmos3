package fiuba.algo3.modelo.estados;

public class MegatronAlterno extends UnidadAlternaAerea{
	public MegatronAlterno(){
		this.ataque = 55;
		this.distanciaDeAtaque = 2;
		this.velocidad = 8;
		this.tormentaPsionica = 0;
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
