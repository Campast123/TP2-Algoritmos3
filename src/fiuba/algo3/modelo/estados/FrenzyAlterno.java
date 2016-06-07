package fiuba.algo3.modelo.estados;

public class FrenzyAlterno extends ModoAlterno implements UnidadTerrestre{
	public FrenzyAlterno(){
		this.ataque = 25;
		this.distanciaDeAtaque = 2;
		this.velocidad = 6;
	}
	
	@Override
	public boolean esUnidadTerrestre(){
		return true;
	}
	
	@Override
	public boolean esUnidadAerea(){
		return false;
	}
}
