package fiuba.algo3.integracion;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.jugabilidad.*;
import fiuba.algo3.modelo.personajes.Megatron;
import fiuba.algo3.modelo.personajes.Optimus;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.ChispaSuprema;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.modelo.tablero.Tablero;


public class IntegrationTests {

	@Test
	public void test01AlgoformerEnTableroSeMueve() {
		// La estructura seria:
		// 						Interfaz Personaje -->
		//							Objeto Autobot
		//								Objeto Los 4 tipos de autobots			
		//							Objeto Decepticon
		//								Objeto Los 4 tipos de decepticons
		// Donde con esta estructura se pueden diferenciar unos a otros para no atacarse entre si
		//
		// O tambien podria ser una eestructura asi:
		// 						Interfaz Personaje -->
		//							Objeto Los 4 tipos de autobots			
		//							Objeto Los 4 tipos de decepticons
		// Donde cada uno implementa un metodo "esAutobot" y "esDecepticon" y donde cada uno sabe lo que es				
		Personaje algoformerHumanoide = new Optimus();
		Assert.assertTrue(algoformerHumanoide.esHumanoide());
		
		// Tablero es una matriz de Posiciones ( casilleros ), donde cada casillero/posicion es un objeto que 
		// sabe si esta ocupado ( SOLO PUEDE TENER UN PERSONAJE tanto en aire como en tierra, es indiferente )
		// tiene una referencia al personaje porque el casillero sabe a quien tiene si esta ocupado
		// y primeramente el objeto casillero/posicion tendria la misma posicion "X,Y" que tiene el mapa como clave
		Tablero tablero = new Tablero(); 
		Posicion posicionInicial = new Posicion(10,2);
		Assert.assertFalse(tablero.estaOcupado(posicionInicial));
		tablero.agregarAlgoformer(algoformerHumanoide,posicionInicial);
		Assert.assertTrue(tablero.estaOcupado(posicionInicial));
		Assert.assertEquals(algoformerHumanoide.getPosicion(),posicionInicial);

		// Se considera que el algoformer sabe como moverse y es el que puede moverse, luego
		// se comunica con el tablero para indicar el cambio de posicion
		
		// el movimiento valida que en el eje x se mueva < = a la distancia maxima y tambien 
		// que ne el eje y se mueva < = a la distancia maxima
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
	
	//Crear una prueba de integración en la cual se pueda crear un juego,
	//con 2 jugadores cada uno de ellos con sus 3 algoformers distribuidos
	//en el tablero según el enunciado y la chispa suprema por el centro del tablero.
	@Test
	public void test04AlgoformerCreoJuegoConDosJugadoresValidoEstadoGeneral(){
		
		Jugador j1 = new Jugador("Juan", TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("Pedro", TipoTransformer.DECEPTICON);
		
		Partida partida = new Partida(j1, j2);

				
	}
	
	//Combinaciones en modos de: Ubicar un autobot,
	//ubicar un decepticon, pedir que se ataquen respetando ( y no ) 
	//las distancias verificando los daños ( o no daños ).
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
		
		//optimus no ataca optimus2
		autobot.atacarA(autobot2);
		Assert.assertTrue(autobot2.getPuntosDeVida() == 500);

		//optimus ataca megatron
		autobot.atacarA(decepticon);
		Assert.assertTrue(decepticon.getPuntosDeVida() == 500);
		
		//megatron ataca optimus
		decepticon.atacarA(autobot);
		Assert.assertTrue(autobot.getPuntosDeVida() == 490);
		

		Posicion posicionDestinoAutobot = new Posicion(2,2);
		Assert.assertFalse(tablero.estaOcupado(posicionDestinoAutobot));
		tablero.moverAlgoformer(autobot, posicionDestinoAutobot);
		Assert.assertTrue(tablero.estaOcupado(posicionDestinoAutobot));

		
		//optimus no ataca megatron
		autobot.atacarA(decepticon);
		Assert.assertTrue(decepticon.getPuntosDeVida() == 500);
		
		//megatron no ataca optimus
		decepticon.atacarA(autobot);
		Assert.assertTrue(autobot.getPuntosDeVida() == 490);
				
	}
}
