package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

public class OptimusTest {
	
	private int OPTIMUS_VIDA = 500;
	private int OPTIMUS_HUMANOIDE_ATAQUE = 50;
	private int OPTIMUS_HUMANOIDE_DISTANCIA_DE_ATAQUE = 2;
	private int OPTIMUS_HUMANOIDE_VELOCIDAD = 2;
	private EstadoAlgoformer OPTIMUS_HUMANOIDE_ESTADO = EstadoAlgoformer.HUMANOIDE;
	private int OPTIMUS_ALTERNO_ATAQUE = 15 ;
	private int OPTIMUS_ALTERNO_DISTANCIA_DE_ATAQUE = 4;
	private int OPTIMUS_ALTERNO_VELOCIDAD = 5;
	private EstadoAlgoformer OPTIMUS_ALTERNO_ESTADO = EstadoAlgoformer.ALTERNO;

	
	@Test
	public void crearOptimusHumanoideTest(){
		Personaje optimus = new Optimus();
		Assert.assertEquals(OPTIMUS_VIDA, optimus.getPuntosDeVida());
		Assert.assertEquals(OPTIMUS_HUMANOIDE_ATAQUE, optimus.getAtaque());
		Assert.assertEquals(OPTIMUS_HUMANOIDE_DISTANCIA_DE_ATAQUE, optimus.getDistanciaDeAtaque());
		Assert.assertEquals(OPTIMUS_HUMANOIDE_ESTADO, optimus.getEstado());
		Assert.assertEquals(OPTIMUS_HUMANOIDE_VELOCIDAD, optimus.getVelocidad());
	
	}
	
	@Test
	public void transformarOptimusAModoHumanoideTest(){
		Personaje optimus = new Optimus();
		optimus.transformacionModoHumanoide();
		Assert.assertEquals(OPTIMUS_VIDA, optimus.getPuntosDeVida());
		Assert.assertEquals(OPTIMUS_HUMANOIDE_ATAQUE, optimus.getAtaque());
		Assert.assertEquals(OPTIMUS_HUMANOIDE_DISTANCIA_DE_ATAQUE, optimus.getDistanciaDeAtaque());
		Assert.assertEquals(OPTIMUS_HUMANOIDE_ESTADO, optimus.getEstado());
		Assert.assertEquals(OPTIMUS_HUMANOIDE_VELOCIDAD, optimus.getVelocidad());
	
	}
	
	@Test
	public void transformarOptimusAModoAlternoTest(){
		Personaje optimus = new Optimus();
		optimus.transformacionModoAlterno();
		Assert.assertEquals(OPTIMUS_VIDA, optimus.getPuntosDeVida());
		Assert.assertEquals(OPTIMUS_ALTERNO_ATAQUE, optimus.getAtaque());
		Assert.assertEquals(OPTIMUS_ALTERNO_DISTANCIA_DE_ATAQUE, optimus.getDistanciaDeAtaque());
		Assert.assertEquals(OPTIMUS_ALTERNO_ESTADO, optimus.getEstado());
		Assert.assertEquals(OPTIMUS_ALTERNO_VELOCIDAD, optimus.getVelocidad());
	
	}
}
