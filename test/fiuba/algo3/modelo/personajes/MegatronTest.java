package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

public class MegatronTest {
	
	private int MEGATRON_VIDA = 550;
	private int MEGATRON_HUMANOIDE_ATAQUE = 10;
	private int MEGATRON_HUMANOIDE_DISTANCIA_DE_ATAQUE = 3;
	private int MEGATRON_HUMANOIDE_VELOCIDAD = 1;
	private EstadoAlgoformer MEGATRON_HUMANOIDE_ESTADO = EstadoAlgoformer.HUMANOIDE;
	private int MEGATRON_ALTERNO_ATAQUE = 55 ;
	private int MEGATRON_ALTERNO_DISTANCIA_DE_ATAQUE = 2;
	private int MEGATRON_ALTERNO_VELOCIDAD = 8;
	private EstadoAlgoformer MEGATRON_ALTERNO_ESTADO = EstadoAlgoformer.ALTERNO;

	
	@Test
	public void crearMegatronHumanoide(){
		Personaje megatron = new Megatron();
		Assert.assertEquals(MEGATRON_VIDA, megatron.getPuntosDeVida());
		Assert.assertEquals(MEGATRON_HUMANOIDE_ATAQUE, megatron.getAtaque());
		Assert.assertEquals(MEGATRON_HUMANOIDE_DISTANCIA_DE_ATAQUE, megatron.getDistanciaDeAtaque());
		Assert.assertEquals(MEGATRON_HUMANOIDE_ESTADO, megatron.getEstado());
		Assert.assertEquals(MEGATRON_HUMANOIDE_VELOCIDAD, megatron.getVelocidad());
	
	}
	
	@Test
	public void transformarMegatronAModoHumanoide(){
		Personaje megatron = new Megatron();
		megatron.transformacionModoHumanoide();
		Assert.assertEquals(MEGATRON_VIDA, megatron.getPuntosDeVida());
		Assert.assertEquals(MEGATRON_HUMANOIDE_ATAQUE, megatron.getAtaque());
		Assert.assertEquals(MEGATRON_HUMANOIDE_DISTANCIA_DE_ATAQUE, megatron.getDistanciaDeAtaque());
		Assert.assertEquals(MEGATRON_HUMANOIDE_ESTADO, megatron.getEstado());
		Assert.assertEquals(MEGATRON_HUMANOIDE_VELOCIDAD, megatron.getVelocidad());
	
	}
	
	@Test
	public void transformarMegatronAModoAlterno(){
		Personaje megatron = new Megatron();
		megatron.transformacionModoAlterno();
		Assert.assertEquals(MEGATRON_VIDA, megatron.getPuntosDeVida());
		Assert.assertEquals(MEGATRON_ALTERNO_ATAQUE, megatron.getAtaque());
		Assert.assertEquals(MEGATRON_ALTERNO_DISTANCIA_DE_ATAQUE, megatron.getDistanciaDeAtaque());
		Assert.assertEquals(MEGATRON_ALTERNO_ESTADO, megatron.getEstado());
		Assert.assertEquals(MEGATRON_ALTERNO_VELOCIDAD, megatron.getVelocidad());
	
	}
}
