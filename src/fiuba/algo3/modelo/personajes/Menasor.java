package fiuba.algo3.modelo.personajes;

public class Menasor extends Decepticon {
	public Menasor(){
		
//		this.setpuntosDeVida = 500;
		this.setAtaque(115);
		this.setDistanciaDeAtaque(2);
		this.setVelocidad(2);
		this.setEstado(EstadoAlgoformer.MODO_UNICO);
	}
	
	@Override
	public void transformacionModoHumanoide() {

	}
	@Override
	public void transformacionModoAlterno() {
		
	}
	
}
