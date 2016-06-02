package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

public class DesepticonTest {

	private int PUNTOS_DE_VIDA_AUTOBOT_OPTIMUS = 500;
	private int PUNTOS_DE_VIDA_AUTOBOT_OPTIMUS_DESPUES_ATAQUE_MEGATRON = 490;
	private int PUNTOS_DE_VIDA_DESEPTICON_FRENZY = 400;

	@Test
	public void atacarAutobotTest(){
		Personaje desepticon = new Megatron();
		Personaje autobot = new Optimus();
		
		Assert.assertEquals(PUNTOS_DE_VIDA_AUTOBOT_OPTIMUS , autobot.getPuntosDeVida());
		desepticon.atacar(autobot);
		Assert.assertEquals(PUNTOS_DE_VIDA_AUTOBOT_OPTIMUS_DESPUES_ATAQUE_MEGATRON ,autobot.getPuntosDeVida());
	}
	
	@Test
	public void noAtacarDesepticonTest(){
		Personaje desepticonMegatron = new Megatron();
		Personaje desepticonFrenzy = new Frenzy();
		
		Assert.assertEquals(PUNTOS_DE_VIDA_DESEPTICON_FRENZY , desepticonFrenzy.getPuntosDeVida());
		desepticonMegatron.atacar(desepticonFrenzy);
		Assert.assertEquals(PUNTOS_DE_VIDA_DESEPTICON_FRENZY ,desepticonFrenzy.getPuntosDeVida());
	}
}
