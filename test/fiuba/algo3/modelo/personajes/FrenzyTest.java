package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

public class FrenzyTest {

	private int FRENZY_VIDA = 400;
	private int FRENZY_HUMANOIDE_ATAQUE = 10;
	private int FRENZY_HUMANOIDE_DISTANCIA_DE_ATAQUE = 5;
	private int FRENZY_HUMANOIDE_VELOCIDAD = 2;
	private EstadoAlgoformer FRENZY_HUMANOIDE_ESTADO = EstadoAlgoformer.HUMANOIDE;
	private int FRENZY_ALTERNO_ATAQUE = 25 ;
	private int FRENZY_ALTERNO_DISTANCIA_DE_ATAQUE = 2;
	private int FRENZY_ALTERNO_VELOCIDAD = 6;
	private EstadoAlgoformer FRENZY_ALTERNO_ESTADO = EstadoAlgoformer.ALTERNO;

	
	@Test
	public void crearFrenzyHumanoide(){
		Personaje frenzy = new Frenzy();
		Assert.assertEquals(FRENZY_VIDA, frenzy.getPuntosDeVida());
		Assert.assertEquals(FRENZY_HUMANOIDE_ATAQUE, frenzy.getAtaque());
		Assert.assertEquals(FRENZY_HUMANOIDE_DISTANCIA_DE_ATAQUE, frenzy.getDistanciaDeAtaque());
		Assert.assertEquals(FRENZY_HUMANOIDE_ESTADO, frenzy.getEstado());
		Assert.assertEquals(FRENZY_HUMANOIDE_VELOCIDAD, frenzy.getVelocidad());
	
	}
	
	@Test
	public void transformarFrenzyAModoHumanoide(){
		Personaje frenzy = new Frenzy();
		frenzy.transformacionModoHumanoide();
		Assert.assertEquals(FRENZY_VIDA, frenzy.getPuntosDeVida());
		Assert.assertEquals(FRENZY_HUMANOIDE_ATAQUE, frenzy.getAtaque());
		Assert.assertEquals(FRENZY_HUMANOIDE_DISTANCIA_DE_ATAQUE, frenzy.getDistanciaDeAtaque());
		Assert.assertEquals(FRENZY_HUMANOIDE_ESTADO, frenzy.getEstado());
		Assert.assertEquals(FRENZY_HUMANOIDE_VELOCIDAD, frenzy.getVelocidad());
	
	}
	
	@Test
	public void transformarFrenzyAModoAlterno(){
		Personaje frenzy = new Frenzy();
		frenzy.transformacionModoAlterno();
		Assert.assertEquals(FRENZY_VIDA, frenzy.getPuntosDeVida());
		Assert.assertEquals(FRENZY_ALTERNO_ATAQUE, frenzy.getAtaque());
		Assert.assertEquals(FRENZY_ALTERNO_DISTANCIA_DE_ATAQUE, frenzy.getDistanciaDeAtaque());
		Assert.assertEquals(FRENZY_ALTERNO_ESTADO, frenzy.getEstado());
		Assert.assertEquals(FRENZY_ALTERNO_VELOCIDAD, frenzy.getVelocidad());
	
	}
}
