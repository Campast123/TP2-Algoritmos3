package fiuba.algo3.modelo.personajes;

import fiuba.algo3.modelo.tablero.Posicion;

public class Bonecrusher extends Decepticon {

	public Bonecrusher(){
		this.posicion = new Posicion(1,1);
		this.setPuntosDeVida(200);
		this.setAtaque(30);
		this.setDistanciaDeAtaque(3);
		this.setVelocidad(1);
		this.setEstado(EstadoAlgoformer.HUMANOIDE);
	}
	
	@Override
	public void transformacionModoHumanoide() {		
		if (!this.getEstado().equals(EstadoAlgoformer.HUMANOIDE)){
			this.setAtaque(30);
			this.setDistanciaDeAtaque(3);
			this.setVelocidad(1);
			this.setEstado(EstadoAlgoformer.HUMANOIDE);
		}
	}
	@Override
	public void transformacionModoAlterno() {
		if (!this.getEstado().equals(EstadoAlgoformer.ALTERNO)){
			this.setAtaque(30);
			this.setDistanciaDeAtaque(3);
			this.setVelocidad(8);
			this.setEstado(EstadoAlgoformer.ALTERNO);
		}
	}


	/*
	 * private static final int vida = 200;
	private static final int ataque = 30;
	private static final int distancia = 3;
	private static final int velocidad_h = 1;
	private static final int velocidad_a = 8;
	
	
	public Bonecrusher(){
		this.setPuntosDeVida(vida);
		this.setAtaque(ataque);
		this.setDistanciaDeAtaque(distancia);
		this.setVelocidad(velocidad_h);
		this.setEstado(EstadoAlgoformer.HUMANOIDE);
	}
	
	@Override
	public void transformacionModoHumanoide() {
		super.transformacionModoHumanoide(ataque, distancia, velocidad_h);		
	}
	
	@Override
	public void transformacionModoAlterno() {
		super.transformacionModoHumanoide(ataque, distancia, velocidad_a);	
		}
*/
	
	
	

}
