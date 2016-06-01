package fiuba.algo3.modelo.personajes;

public class Superion extends Autobot{
	
	public Superion(){
//		this.setpuntosDeVida = 500;
		this.setAtaque(100);
		this.setDistanciaDeAtaque(2);
		this.setVelocidad(3);
		this.setEstado(EstadoAlgoformer.MODO_UNICO);
	}
	
	@Override
	public void transformacionModoHumanoide() {

	}
	@Override
	public void transformacionModoAlterno() {
		
	}
	@Override
	public void atacarA(Personaje personaje) {
		// TODO Auto-generated method stub
		
	}
}
