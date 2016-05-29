package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

public class RatchetTest {

	private int RATCHET_VIDA = 150;
	private int RATCHET_HUMANOIDE_ATAQUE = 5;
	private int RATCHET_HUMANOIDE_DISTANCIA_DE_ATAQUE = 5;
	private int RATCHET_HUMANOIDE_VELOCIDAD = 1;
	private EstadoAlgoformer RATCHET_HUMANOIDE_ESTADO = EstadoAlgoformer.HUMANOIDE;
	private int RATCHET_ALTERNO_ATAQUE = 35;
	private int RATCHET_ALTERNO_DISTANCIA_DE_ATAQUE = 2;
	private int RATCHET_ALTERNO_VELOCIDAD = 8;
	private EstadoAlgoformer RATCHET_ALTERNO_ESTADO = EstadoAlgoformer.ALTERNO;

	
	@Test
	public void crearRatchetHumanoideTest(){
		Personaje ratchet = new Ratchet();
		Assert.assertEquals(RATCHET_VIDA, ratchet.getPuntosDeVida());
		Assert.assertEquals(RATCHET_HUMANOIDE_ATAQUE, ratchet.getAtaque());
		Assert.assertEquals(RATCHET_HUMANOIDE_DISTANCIA_DE_ATAQUE, ratchet.getDistanciaDeAtaque());
		Assert.assertEquals(RATCHET_HUMANOIDE_ESTADO, ratchet.getEstado());
		Assert.assertEquals(RATCHET_HUMANOIDE_VELOCIDAD, ratchet.getVelocidad());
	
	}
	
	@Test
	public void transformarRatchetAModoHumanoideTest(){
		Personaje ratchet = new Ratchet();
		ratchet.transformacionModoHumanoide();
		Assert.assertEquals(RATCHET_VIDA, ratchet.getPuntosDeVida());
		Assert.assertEquals(RATCHET_HUMANOIDE_ATAQUE, ratchet.getAtaque());
		Assert.assertEquals(RATCHET_HUMANOIDE_DISTANCIA_DE_ATAQUE, ratchet.getDistanciaDeAtaque());
		Assert.assertEquals(RATCHET_HUMANOIDE_ESTADO, ratchet.getEstado());
		Assert.assertEquals(RATCHET_HUMANOIDE_VELOCIDAD, ratchet.getVelocidad());
	
	}
	
	@Test
	public void transformarRatchetAModoAlternoTest(){
		Personaje ratchet = new Ratchet();
		ratchet.transformacionModoAlterno();
		Assert.assertEquals(RATCHET_VIDA, ratchet.getPuntosDeVida());
		Assert.assertEquals(RATCHET_ALTERNO_ATAQUE, ratchet.getAtaque());
		Assert.assertEquals(RATCHET_ALTERNO_DISTANCIA_DE_ATAQUE, ratchet.getDistanciaDeAtaque());
		Assert.assertEquals(RATCHET_ALTERNO_ESTADO, ratchet.getEstado());
		Assert.assertEquals(RATCHET_ALTERNO_VELOCIDAD, ratchet.getVelocidad());
	
	}
}
