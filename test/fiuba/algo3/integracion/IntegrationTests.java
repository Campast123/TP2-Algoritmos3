package fiuba.algo3.integracion;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.jugabilidad.*;
import fiuba.algo3.modelo.personajes.Megatron;
import fiuba.algo3.modelo.personajes.Optimus;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Casillero;
import fiuba.algo3.modelo.tablero.ChispaSuprema;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.modelo.tablero.Tablero;


public class IntegrationTests {

	@Test
	public void test01AlgoformerEnTableroSeMueve() {
			
		Personaje algoformerHumanoide = new Optimus();
		Assert.assertTrue(algoformerHumanoide.esHumanoide());
		
		Tablero tablero = new Tablero(); 
		Posicion posicionInicial = new Posicion(10,2);
		Assert.assertFalse(tablero.estaOcupado(posicionInicial));
		tablero.agregarAlgoformer(algoformerHumanoide,posicionInicial);
		Assert.assertTrue(tablero.estaOcupado(posicionInicial));
		Assert.assertEquals(algoformerHumanoide.getPosicion(),posicionInicial);

		Posicion posicionFinal = new Posicion(8,4);
		Assert.assertFalse(tablero.estaOcupado(posicionFinal));
		tablero.moverAlgoformer(algoformerHumanoide,posicionFinal);
		Assert.assertTrue(tablero.estaOcupado(posicionFinal));
		Assert.assertEquals(algoformerHumanoide.getPosicion(),posicionFinal);

	}
	
	@Test
	public void test02AlgoformerHumanoideSeTransformaEnAmbosSentidos() {
		Personaje algoformer = new Optimus();
		Assert.assertTrue(algoformer.esHumanoide());
		Tablero tablero = new Tablero(); 
		Posicion posicionInicial = new Posicion(10,2);
		
		tablero.agregarAlgoformer(algoformer,posicionInicial);
		
		Personaje algoformerEnTablero = tablero.obtenerAlgoformer(posicionInicial);
		Assert.assertEquals(algoformer, algoformerEnTablero);
		Assert.assertTrue(algoformer.esHumanoide());
		
		algoformerEnTablero.transformacionModoAlterno();
		Assert.assertTrue(algoformer.esAlterno());
		
		algoformerEnTablero.transformacionModoHumanoide();
		Assert.assertTrue(algoformer.esHumanoide());


	}
	@Test
	public void test03AlgoformerAlternoSeUbicaEnTableroYSeMueve(){
		Personaje algoformer = new Optimus();
		Assert.assertTrue(algoformer.esHumanoide());
		algoformer.transformacionModoAlterno();
		Assert.assertTrue(algoformer.esAlterno());
		
		Tablero tablero = new Tablero();
		Posicion posicionInicial = new Posicion(1,1);
		Assert.assertFalse(tablero.estaOcupado(posicionInicial));
		
		tablero.agregarAlgoformer(algoformer, posicionInicial);
		Assert.assertTrue(tablero.estaOcupado(posicionInicial));
		Assert.assertEquals(algoformer.getPosicion(),posicionInicial);	
		
		Posicion posicionDestino = new Posicion(2,2);
		Assert.assertFalse(tablero.estaOcupado(posicionDestino));
		
		tablero.moverAlgoformer(algoformer, posicionDestino);
		Assert.assertFalse(tablero.estaOcupado(posicionInicial));
		
		Assert.assertTrue(tablero.estaOcupado(posicionDestino));		
		Assert.assertEquals(algoformer.getPosicion(),posicionDestino);		
		
	}
	
	//Crear una prueba de integraci�n en la cual se pueda crear un juego,
	//con 2 jugadores cada uno de ellos con sus 3 algoformers distribuidos
	//en el tablero seg�n el enunciado y la chispa suprema por el centro del tablero.
	@Test
	public void test04AlgoformerCreoJuegoConDosJugadoresValidoEstadoGeneral(){		
		
		//La posicion inicial de Chispa es el centro
		Posicion posicion = new Posicion(25,25);		
		
		Jugador j1 = new Jugador("Juan", TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("Pedro", TipoTransformer.DECEPTICON);		
		
		//Nombres de los jugadores
		Assert.assertFalse(j1.getNombre() == "Pepe");
		Assert.assertFalse(j2.getNombre() == "Ana");		
				
		Partida partida = new Partida(j1, j2);
		
		//No hay ganadores al iniciar la partida.
		Assert.assertTrue(j1.getGanador() == false);
		Assert.assertTrue(j2.getGanador() == false);
		
		
		Assert.assertFalse(partida.getTablero().estaOcupado(posicion));				
		
		//La Chispa no "ocupa", permite desplazar un personaje
		Assert.assertFalse(partida.getTablero().estaOcupado(posicion));		
				
	}
	
	//Combinaciones en modos de: Ubicar un autobot,
	//ubicar un decepticon, pedir que se ataquen respetando ( y no ) 
	//las distancias verificando los da�os ( o no da�os ).
	@Test
	public void test05AtaqueEntreAutobotYDecepticon(){	
		
		Personaje autobot = new Optimus();
		Personaje decepticon = new Megatron();
		
		
		Assert.assertTrue(decepticon.getPuntosDeVida() == 550);
		Assert.assertTrue(autobot.getPuntosDeVida() == 500);

		
		Tablero tablero = new Tablero();
		Posicion posicionInicialAutobot = new Posicion(12,12);
		Posicion posicionInicialDecepticon = new Posicion(13,12);
		
		tablero.agregarAlgoformer(autobot, posicionInicialAutobot);
		tablero.agregarAlgoformer(decepticon, posicionInicialDecepticon);
		
		Personaje autobot2 = new Optimus();
		Posicion posicionInicialAutobot2 = new Posicion(14,12);
		tablero.agregarAlgoformer(autobot, posicionInicialAutobot2);
		
		//optimus no ataca optimus2 (entre autobots no se atacan)
		autobot.atacar(autobot2);
		Assert.assertTrue(autobot2.getPuntosDeVida() == 500);

		//optimus ataca megatron
		autobot.atacar(decepticon);
		Assert.assertTrue(decepticon.getPuntosDeVida() == 500);
		
		//megatron ataca optimus
		decepticon.atacar(autobot);
		Assert.assertTrue(autobot.getPuntosDeVida() == 490);
		

		Posicion posicionDestinoAutobot = new Posicion(2,2);
		Assert.assertFalse(tablero.estaOcupado(posicionDestinoAutobot));
		tablero.moverAlgoformer(autobot, posicionDestinoAutobot);
		Assert.assertTrue(tablero.estaOcupado(posicionDestinoAutobot));

		
		//optimus no ataca megatron (no tiene alcance)
		autobot.atacar(decepticon);
		Assert.assertTrue(decepticon.getPuntosDeVida() == 500);
		
		//megatron no ataca optimus (no tiene alcance)
		decepticon.atacar(autobot);
		Assert.assertTrue(autobot.getPuntosDeVida() == 490);
				
	}
}
