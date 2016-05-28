package fiuba.algo3.modelo.personajes;

public class Menasor extends Desepticon {
	public Menasor(){
//		this.puntosDeVida = 500;
		this.ataque = 115;
		this.distanciaDeAtaque = 2;
		this.velocidad = 2;
		this.estado = EstadoAlgoformer.MODO_UNICO;
	}
	
	@Override
	public void transformacionModoHumanoide() {

	}
	@Override
	public void transformacionModoAlterno() {
		
	}
}
