package fiuba.algo3.modelo.personajes;

public class Superion extends Autobot{
	
	public Superion(){
//		this.puntosDeVida = 500;
		this.ataque = 100;
		this.distanciaDeAtaque = 2;
		this.velocidad = 3;
		this.estado = EstadoAlgoformer.MODO_UNICO;
	}
	
	@Override
	public void transformacionModoHumanoide() {

	}
	@Override
	public void transformacionModoAlterno() {
		
	}
}
