package fiuba.algo3.modelo.tablero;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.personajes.Optimus;
import fiuba.algo3.modelo.personajes.Personaje;


public class CasilleroTest {

	@Test
	public void casilleroAgregarPersonajeTest(){
		Posicion posicion = new Posicion(2,8);
		Casillero casillero = new Casillero(posicion);
		Assert.assertEquals(casillero.getPosicion(), posicion);

		Personaje personaje = new Optimus();
		Assert.assertEquals(personaje.getPosicion(), new Posicion(-1,-1));
		Assert.assertNull(casillero.getPersonaje());
		Assert.assertFalse(casillero.estaOcupado());
		
		casillero.agregarPersonaje(personaje);
		Assert.assertEquals(personaje.getPosicion(), posicion);
		Assert.assertEquals(casillero.getPersonaje(),personaje);
		Assert.assertTrue(casillero.estaOcupado());
	}
	
	@Test
	public void casilleroRemoverPersonajeTest(){
		Posicion posicion = new Posicion(10,8);
		Casillero casillero = new Casillero(posicion);
		Assert.assertEquals(casillero.getPosicion(), posicion);

		Personaje personaje = new Optimus();
		Assert.assertEquals(personaje.getPosicion(), new Posicion(-1,-1));
		Assert.assertNull(casillero.getPersonaje());
		Assert.assertFalse(casillero.estaOcupado());
		
		casillero.agregarPersonaje(personaje);
		Assert.assertEquals(personaje.getPosicion(), posicion);
		Assert.assertEquals(casillero.getPersonaje(),personaje);
		Assert.assertTrue(casillero.estaOcupado());
		
		casillero.retirarPersonaje();
		Assert.assertNull(casillero.getPersonaje());
		Assert.assertFalse(casillero.estaOcupado());
	}
	
	
}
