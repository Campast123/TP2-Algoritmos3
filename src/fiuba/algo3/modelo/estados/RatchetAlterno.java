package fiuba.algo3.modelo.estados;

public class RatchetAlterno extends UnidadAlternaAerea{
	public RatchetAlterno(){
		this.ataque = 35;
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
