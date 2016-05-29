package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

public class BumblebeeTest {

	private int BUMBLEBEE_VIDA = 350;
	private int BUMBLEBEE_HUMANOIDE_ATAQUE = 40;
	private int BUMBLEBEE_HUMANOIDE_DISTANCIA_DE_ATAQUE = 1;
	private int BUMBLEBEE_HUMANOIDE_VELOCIDAD = 2;
	private EstadoAlgoformer BUMBLEBEE_HUMANOIDE_ESTADO = EstadoAlgoformer.HUMANOIDE;
	private int BUMBLEBEE_ALTERNO_ATAQUE = 20 ;
	private int BUMBLEBEE_ALTERNO_DISTANCIA_DE_ATAQUE = 3;
	private int BUMBLEBEE_ALTERNO_VELOCIDAD = 5;
	private EstadoAlgoformer BUMBLEBEE_ALTERNO_ESTADO = EstadoAlgoformer.ALTERNO;

	
	@Test
	public void crearBumblebeeHumanoide(){
		Personaje bumblebee = new Bumblebee();
		Assert.assertEquals(BUMBLEBEE_VIDA, bumblebee.getPuntosDeVida());
		Assert.assertEquals(BUMBLEBEE_HUMANOIDE_ATAQUE, bumblebee.getAtaque());
		Assert.assertEquals(BUMBLEBEE_HUMANOIDE_DISTANCIA_DE_ATAQUE, bumblebee.getDistanciaDeAtaque());
		Assert.assertEquals(BUMBLEBEE_HUMANOIDE_ESTADO, bumblebee.getEstado());
		Assert.assertEquals(BUMBLEBEE_HUMANOIDE_VELOCIDAD, bumblebee.getVelocidad());
	
	}
	
	@Test
	public void transformarBumblebeeAModoHumanoide(){
		Personaje bumblebee = new Bumblebee();
		bumblebee.transformacionModoHumanoide();
		Assert.assertEquals(BUMBLEBEE_VIDA, bumblebee.getPuntosDeVida());
		Assert.assertEquals(BUMBLEBEE_HUMANOIDE_ATAQUE, bumblebee.getAtaque());
		Assert.assertEquals(BUMBLEBEE_HUMANOIDE_DISTANCIA_DE_ATAQUE, bumblebee.getDistanciaDeAtaque());
		Assert.assertEquals(BUMBLEBEE_HUMANOIDE_ESTADO, bumblebee.getEstado());
		Assert.assertEquals(BUMBLEBEE_HUMANOIDE_VELOCIDAD, bumblebee.getVelocidad());
	
	}
	
	@Test
	public void transformarBumblebeeAModoAlterno(){
		Personaje bumblebee = new Bumblebee();
		bumblebee.transformacionModoAlterno();
		Assert.assertEquals(BUMBLEBEE_VIDA, bumblebee.getPuntosDeVida());
		Assert.assertEquals(BUMBLEBEE_ALTERNO_ATAQUE, bumblebee.getAtaque());
		Assert.assertEquals(BUMBLEBEE_ALTERNO_DISTANCIA_DE_ATAQUE, bumblebee.getDistanciaDeAtaque());
		Assert.assertEquals(BUMBLEBEE_ALTERNO_ESTADO, bumblebee.getEstado());
		Assert.assertEquals(BUMBLEBEE_ALTERNO_VELOCIDAD, bumblebee.getVelocidad());
	
	}
}
