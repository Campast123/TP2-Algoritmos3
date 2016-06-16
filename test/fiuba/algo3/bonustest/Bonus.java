package fiuba.algo3.bonustest;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.bonus.*;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.jugabilidad.TipoTransformer;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Posicion;

public class Bonus {
public void test01AlgoformerCapturaCanionYAtacaDobleHumanoide(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		Personaje megatron =j2.getPersonaje1();
		
		Posicion posicionOptimus = new Posicion(12,12);
		Posicion posicionMegatron = new Posicion(14,14);		
		
		p1.moverAlgoformerA(optimus, posicionOptimus);
		p1.moverAlgoformerA(megatron, posicionMegatron);		
		
		//Optimus en Humanoide tiene 50 fuerza
		Assert.assertEquals(optimus.getAtaque(),50);		
		//Megatron en Humanoide tiene 50 fuerza
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		
		DobleCanion canion = new DobleCanion();
		Posicion posicionBonus = new Posicion(12,12);
		canion.setPosicion(posicionBonus);
		optimus.agregarBonusPersonaje(canion);
		
		//Optimus en Humanoide tiene 100 fuerza, con el doble canion
		Assert.assertEquals(optimus.getAtaque(),100);	
		
		//Ataco, con danio de 100 y cambio de turno. Baja la vigencia de bonus en 1
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),450);		
		p1.finalizarTurno();
		
		//Me posiciono con Megatron, en el mismo lugar y paso turno
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),350);		
		p1.finalizarTurno();
		
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),250);		
		p1.finalizarTurno();
		
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),200);
		Assert.assertEquals(optimus.getAtaque(),50);		
				
	}
	
	
	@Test
	public void test02AlgoformerCapturaCanionYAtacaDobleAlterno(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		Personaje megatron =j2.getPersonaje1();
		
		Posicion posicionOptimus = new Posicion(12,12);
		Posicion posicionMegatron = new Posicion(14,14);		
		
		p1.moverAlgoformerA(optimus, posicionOptimus);
		p1.moverAlgoformerA(megatron, posicionMegatron);
		
		p1.transformarAlgoformer(optimus);
		p1.transformarAlgoformer(megatron);		
		
		//Optimus en Alterno tiene 15 fuerza
		Assert.assertEquals(optimus.getAtaque(),15);		
		//Megatron en Humanoide tiene 550 vida
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		
		DobleCanion canion = new DobleCanion();
		Posicion posicionBonus = new Posicion(12,12);
		canion.setPosicion(posicionBonus);
		optimus.agregarBonusPersonaje(canion);
		
		//Optimus en Humanoide tiene 30 fuerza, con el doble canion
		Assert.assertEquals(optimus.getAtaque(),30);	
		
		//Ataco, con danio de 30 y cambio de turno. Baja la vigencia de bonus en 1
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),520);		
		p1.finalizarTurno();
		
		//Me posiciono con Megatron, en el mismo lugar y paso turno
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),490);		
		p1.finalizarTurno();
		
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),460);		
		p1.finalizarTurno();
		
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),445);
		
		//Finalizado los 3 turnos la fuerza vuelve al estado inicial
		Assert.assertEquals(optimus.getAtaque(),15);		
				
	}
	
/*	
	@Test
	public void test03AlgoformerCapturaBurbujaYEsInmuneHumanoide(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		Personaje megatron =j2.getPersonaje1();
		
		Posicion posicionOptimus = new Posicion(12,12);
		Posicion posicionMegatron = new Posicion(14,14);		
		
		p1.moverAlgoformerA(optimus, posicionOptimus);
		p1.moverAlgoformerA(megatron, posicionMegatron);		
				
		//Optimus en Humanoide tiene 15 fuerza
		Assert.assertEquals(optimus.getAtaque(),50);		
		//Megatron en Humanoide tiene 550 vida
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		
		Bonus canion = new BurbujaInmaculada();
		Posicion posicionBonus = new Posicion(14,14);
		canion.setPosicion(posicionBonus);
		megatron.agregarBonusPersonaje(canion);			
		
		//Ataco, con danio de 50 y cambio de turno. Baja la vigencia de bonus en 1
		//La vida de megatron sigue igual
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),520);		
		p1.finalizarTurno();
		
		//Me posiciono con Megatron, en el mismo lugar y paso turno
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),490);		
		p1.finalizarTurno();
		
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),460);		
		p1.finalizarTurno();
		
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),445);
		
		//Finalizado los 3 turnos la fuerza vuelve al estado inicial
		Assert.assertEquals(optimus.getAtaque(),15);		
				
	}

*/


}
