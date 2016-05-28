package fiuba.algo3.integracion;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.excepciones.PosicionInvalidaException;
import fiuba.algo3.modelo.personajes.Optimus;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Posicion;
import fiuba.algo3.modelo.tablero.Tablero;

public class IntegrationTests {

	@Test
	public void AlgoformerEnTableroSeMueve() throws PosicionInvalidaException{
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
		Assert.assertEquals(algoformerHumanoide.obtenerPosicion(),posicionInicial);

		// Se considera que el algoformer sabe como moverse y es el que puede moverse, luego
		// se comunica con el tablero para indicar el cambio de posicion
		
		// el movimiento valida que en el eje x se mueva < = a la distancia maxima y tambien 
		// que ne el eje y se mueva < = a la distancia maxima
		Posicion posicionFinal = new Posicion(8,4);
		Assert.assertFalse(tablero.estaOcupado(posicionFinal));
		tablero.moverAlgoformer(algoformerHumanoide,posicionFinal);
		Assert.assertTrue(tablero.estaOcupado(posicionFinal));
		Assert.assertEquals(algoformerHumanoide.obtenerPosicion(),posicionFinal);

		
	}
}
