package fiuba.algo3.modelo.tablero;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.personajes.Optimus;
import fiuba.algo3.modelo.personajes.Personaje;

public class TableroTest {

	@Test
	public void crearTablero50x50Test(){
		Tablero tablero = new Tablero();
		Assert.assertFalse(tablero.obtenerTablero().isEmpty());
		Assert.assertEquals(tablero.obtenerTablero().size(),2601);
	}
	

	@Test
	public void agregarAlgoformerATableroTest(){
		Tablero tablero = new Tablero();
		Personaje personaje = new Optimus();
		Posicion posicion = new Posicion(25,25);
		Assert.assertFalse(tablero.estaOcupado(posicion));
		
		tablero.agregarAlgoformer(personaje, posicion);
		Assert.assertTrue(tablero.estaOcupado(posicion));
		Assert.assertEquals(personaje.obtenerPosicion(),posicion);
		
	}
	
	@Test
	public void moverAlgoformerEnTableroTest(){
		Tablero tablero = new Tablero();
		Personaje personaje = new Optimus();
		Posicion posicionInicial = new Posicion(25,25);
		Assert.assertFalse(tablero.estaOcupado(posicionInicial));
		
		tablero.agregarAlgoformer(personaje, posicionInicial);
		Assert.assertTrue(tablero.estaOcupado(posicionInicial));
		Assert.assertEquals(personaje.obtenerPosicion(),posicionInicial);

		Posicion posicionDestino = new Posicion(27,27);
		tablero.moverAlgoformer(personaje, posicionDestino);
		
	}
	
	@Test
	public void obtenerAlgoformerDelTableroTest(){
		Tablero tablero = new Tablero();
		Personaje personaje = new Optimus();
		Posicion posicion = new Posicion(25,25);
		Assert.assertFalse(tablero.estaOcupado(posicion));
		
		tablero.agregarAlgoformer(personaje, posicion);
		Assert.assertTrue(tablero.estaOcupado(posicion));

		Personaje personajeObtenido = tablero.obtenerAlgoformer(posicion);
		Assert.assertEquals(personaje, personajeObtenido);
		
	}
	
	@Test
	public void posicionValidaTableroTest(){
		Tablero tablero = new Tablero();
		Posicion posicionInvalida = new Posicion(-1,-1);
		Posicion posicionValida = new Posicion(25,25);

		Assert.assertTrue(tablero.posicionValida(posicionValida));
		Assert.assertFalse(tablero.posicionValida(posicionInvalida));
		
	}
}
