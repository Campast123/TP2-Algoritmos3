package fiuba.algo3.modelo.personajes;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.tablero.Posicion;

public class PersonajeTest {

	@Test
	public void ubicarEnPosicionTest(){
		Personaje personaje = new Optimus();
		Posicion posicionFueraDelMapa = new Posicion(-1,-1);
		Assert.assertEquals(posicionFueraDelMapa, personaje.getPosicion());
		Posicion posicionDentroDelMapa = new Posicion(10,10);
		personaje.setPosicion(posicionDentroDelMapa);
		Assert.assertEquals(posicionDentroDelMapa, personaje.getPosicion());
	}
	
	@Test
	public void recibirAtaqueTest(){
		Personaje personaje = new Optimus();
		int ataqueRealizado = 200;
		Assert.assertEquals(500, personaje.getPuntosDeVida());
		personaje.recibirAtaque(ataqueRealizado);
		Assert.assertEquals(300, personaje.getPuntosDeVida());

	}
}
