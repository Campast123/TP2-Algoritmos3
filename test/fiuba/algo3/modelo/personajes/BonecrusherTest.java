package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

public class BonecrusherTest {

	private int BONECRUSHER_VIDA = 200;
	private int BONECRUSHER_HUMANOIDE_ATAQUE = 30;
	private int BONECRUSHER_HUMANOIDE_DISTANCIA_DE_ATAQUE = 3;
	private int BONECRUSHER_HUMANOIDE_VELOCIDAD = 1;
	private EstadoAlgoformer BONECRUSHER_HUMANOIDE_ESTADO = EstadoAlgoformer.HUMANOIDE;
	private int BONECRUSHER_ALTERNO_ATAQUE = 30 ;
	private int BONECRUSHER_ALTERNO_DISTANCIA_DE_ATAQUE = 3;
	private int BONECRUSHER_ALTERNO_VELOCIDAD = 8;
	private EstadoAlgoformer BONECRUSHER_ALTERNO_ESTADO = EstadoAlgoformer.ALTERNO;

	
	@Test
	public void crearBonecrusherHumanoide(){
		Personaje bonecrusher = new Bonecrusher();
		Assert.assertEquals(BONECRUSHER_VIDA, bonecrusher.getPuntosDeVida());
		Assert.assertEquals(BONECRUSHER_HUMANOIDE_ATAQUE, bonecrusher.getAtaque());
		Assert.assertEquals(BONECRUSHER_HUMANOIDE_DISTANCIA_DE_ATAQUE, bonecrusher.getDistanciaDeAtaque());
		Assert.assertEquals(BONECRUSHER_HUMANOIDE_ESTADO, bonecrusher.getEstado());
		Assert.assertEquals(BONECRUSHER_HUMANOIDE_VELOCIDAD, bonecrusher.getVelocidad());
	
	}
	
	@Test
	public void transformarBonecrusherAModoHumanoide(){
		Personaje bonecrusher = new Bonecrusher();
		bonecrusher.transformacionModoHumanoide();
		Assert.assertEquals(BONECRUSHER_VIDA, bonecrusher.getPuntosDeVida());
		Assert.assertEquals(BONECRUSHER_HUMANOIDE_ATAQUE, bonecrusher.getAtaque());
		Assert.assertEquals(BONECRUSHER_HUMANOIDE_DISTANCIA_DE_ATAQUE, bonecrusher.getDistanciaDeAtaque());
		Assert.assertEquals(BONECRUSHER_HUMANOIDE_ESTADO, bonecrusher.getEstado());
		Assert.assertEquals(BONECRUSHER_HUMANOIDE_VELOCIDAD, bonecrusher.getVelocidad());
	
	}
	
	@Test
	public void transformarBonecrusherAModoAlterno(){
		Personaje bonecrusher = new Bonecrusher();
		bonecrusher.transformacionModoAlterno();
		Assert.assertEquals(BONECRUSHER_VIDA, bonecrusher.getPuntosDeVida());
		Assert.assertEquals(BONECRUSHER_ALTERNO_ATAQUE, bonecrusher.getAtaque());
		Assert.assertEquals(BONECRUSHER_ALTERNO_DISTANCIA_DE_ATAQUE, bonecrusher.getDistanciaDeAtaque());
		Assert.assertEquals(BONECRUSHER_ALTERNO_ESTADO, bonecrusher.getEstado());
		Assert.assertEquals(BONECRUSHER_ALTERNO_VELOCIDAD, bonecrusher.getVelocidad());
	
	}
}
