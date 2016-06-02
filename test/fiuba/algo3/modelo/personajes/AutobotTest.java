package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

public class AutobotTest {

	private int PUNTOS_DE_VIDA_DESEPTICON_MEGATRON = 550;
	private int PUNTOS_DE_VIDA_DESEPTICON_MEGATRON_DESPUES_ATAQUE_OPTIMUS = 500;
	private int PUNTOS_DE_VIDA_AUTOBOT_RATCHET = 150;

	@Test
	public void atacarDesepticonTest(){
		Personaje autobot = new Optimus();
		Personaje desepticon = new Megatron();
		
		Assert.assertEquals(PUNTOS_DE_VIDA_DESEPTICON_MEGATRON , desepticon.getPuntosDeVida());
		autobot.atacar(desepticon);
		Assert.assertEquals(PUNTOS_DE_VIDA_DESEPTICON_MEGATRON_DESPUES_ATAQUE_OPTIMUS ,desepticon.getPuntosDeVida());
	}
	
	@Test
	public void noAtacarAutobotTest(){
		Personaje autobotOptimus = new Optimus();
		Personaje autobotRatchet = new Ratchet();
		
		Assert.assertEquals(PUNTOS_DE_VIDA_AUTOBOT_RATCHET , autobotRatchet.getPuntosDeVida());
		autobotOptimus.atacar(autobotRatchet);
		Assert.assertEquals(PUNTOS_DE_VIDA_AUTOBOT_RATCHET ,autobotRatchet.getPuntosDeVida());
	}
}
