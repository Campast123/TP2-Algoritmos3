package fiuba.algo3.jugabilidad;


import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.jugabilidad.DireccionDeMovimiento;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.jugabilidad.TipoTransformer;
import fiuba.algo3.modelo.tablero.Posicion;

public class UnitTestsPartida {

	private Jugador jugador1;
	private Jugador jugador2;

		
	@Test 
	public void moverAlgoformerTest(){
		this.jugador1 = new Jugador("Pepe", TipoTransformer.AUTOBOT);
		this.jugador2 = new Jugador("Beto", TipoTransformer.DECEPTICON);
		Partida partida = new Partida(this.jugador1, this.jugador2);
		Posicion posicionInicial = new Posicion(0,1);
		Assert.assertEquals(this.jugador1.getPersonaje2().getPosicion(),posicionInicial);
		Assert.assertEquals(partida.getTurno().getJugadorActual(),this.jugador1);
		
		partida.moverAlgoformerA(this.jugador1.getPersonaje2(), DireccionDeMovimiento.DERECHA);
		Posicion posicionEsperada = new Posicion(1,1);
		Assert.assertEquals(this.jugador1.getPersonaje2().getPosicion(),posicionEsperada);

	}
}
