package fiuba.algo3.bonustest;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.bonus.*;
import fiuba.algo3.modelo.jugabilidad.Jugador;
import fiuba.algo3.modelo.jugabilidad.Partida;
import fiuba.algo3.modelo.jugabilidad.TipoTransformer;
import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.tablero.Posicion;

public class BonusTest {
	
	@Test	
public void test01AlgoformerCapturaCanionYAtacaDobleHumanoide(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		Personaje megatron =j2.getPersonaje1();
		
		optimus.getModoAlgoformer().setVelocidad(100);
		megatron.getModoAlgoformer().setVelocidad(100);
		
		
		Posicion posicionOptimus = new Posicion(12,12);
		Posicion posicionMegatron = new Posicion(14,14);
		
		optimus.setPosicion(posicionOptimus);
		megatron.setPosicion(posicionMegatron);

		
		optimus.getModoAlgoformer().reestablecerVelocidad();;
		megatron.getModoAlgoformer().reestablecerVelocidad();
		
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
		optimus.getModoAlgoformer().setVelocidad(100);
		megatron.getModoAlgoformer().setVelocidad(100);
		
		
		Posicion posicionOptimus = new Posicion(12,12);
		Posicion posicionMegatron = new Posicion(14,14);
		
		optimus.setPosicion(posicionOptimus);
		megatron.setPosicion(posicionMegatron);

		
		optimus.getModoAlgoformer().reestablecerVelocidad();;
		megatron.getModoAlgoformer().reestablecerVelocidad();				
		
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
	
	
	@Test
	public void test03AlgoformerCapturaBurbujaYEsInmuneHumanoide(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		Personaje megatron =j2.getPersonaje1();
		
		optimus.getModoAlgoformer().setVelocidad(100);
		megatron.getModoAlgoformer().setVelocidad(100);
		
		
		Posicion posicionOptimus = new Posicion(12,12);
		Posicion posicionMegatron = new Posicion(14,14);
		
		optimus.setPosicion(posicionOptimus);
		megatron.setPosicion(posicionMegatron);

		
		optimus.getModoAlgoformer().reestablecerVelocidad();;
		megatron.getModoAlgoformer().reestablecerVelocidad();		
			
				
		//Optimus en Humanoide tiene 50 fuerza
		Assert.assertEquals(optimus.getAtaque(),50);		
		//Megatron en Humanoide tiene 550 vida
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		
		BurbujaInmaculada burbuja = new BurbujaInmaculada();
		Posicion posicionBonus = new Posicion(14,14);
		burbuja.setPosicion(posicionBonus);
		megatron.agregarBonusPersonaje(burbuja);			
		
		Assert.assertTrue(megatron.getModoAlgoformer().getInmunidad());
		
		//Ataco, con danio de 50 y cambio de turno. 
		//La vida de megatron sigue igual
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		p1.finalizarTurno();
		
		//Me posiciono con Megatron, en el mismo lugar y paso turno. Ajusto vigencia
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		p1.finalizarTurno();
		
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		//Finaliza la vigencia de la burbuja
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),500);		
		p1.finalizarTurno();
		
		
		Assert.assertTrue(!(megatron.getModoAlgoformer().getInmunidad()));		
				
	}
	
	
	@Test
	public void test04AlgoformerCapturaBurbujaYEsInmuneAlterno(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		Personaje megatron =j2.getPersonaje1();
		
		optimus.transformar();
		megatron.transformar();
		
		optimus.getModoAlgoformer().setVelocidad(100);
		megatron.getModoAlgoformer().setVelocidad(100);
		
		
		Posicion posicionOptimus = new Posicion(12,12);
		Posicion posicionMegatron = new Posicion(14,14);
		
		optimus.setPosicion(posicionOptimus);
		megatron.setPosicion(posicionMegatron);

		
		optimus.getModoAlgoformer().reestablecerVelocidad();;
		megatron.getModoAlgoformer().reestablecerVelocidad();		
			
				
		//Optimus en Humanoide tiene 15 fuerza
		Assert.assertEquals(optimus.getAtaque(),15);		
		//Megatron en Humanoide tiene 550 vida
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		
		BurbujaInmaculada burbuja = new BurbujaInmaculada();
		Posicion posicionBonus = new Posicion(14,14);
		burbuja.setPosicion(posicionBonus);
		megatron.agregarBonusPersonaje(burbuja);			
		
		Assert.assertTrue(megatron.getModoAlgoformer().getInmunidad());
		
		//Ataco, con danio de 15 y cambio de turno. 
		//La vida de megatron sigue igual
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		p1.finalizarTurno();
		
		//Me posiciono con Megatron, en el mismo lugar y paso turno. Ajusto vigencia
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),550);		
		p1.finalizarTurno();
		
		p1.moverAlgoformerA(megatron, posicionMegatron);
		p1.finalizarTurno();
		
		//Finaliza la vigencia de la burbuja
		p1.atacarConAlgoformerA(optimus, megatron);
		Assert.assertEquals(megatron.getPuntosDeVida(),535);		
		p1.finalizarTurno();
		
		//megatron ya no tiene inmunidad
		Assert.assertTrue(!(megatron.getModoAlgoformer().getInmunidad()));		
				
	}
	
	@Test
	public void test05AlgoformerCapturaFlashYEsVelozHumanoide(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		
		Posicion posicionOptimus = new Posicion(14,14);		
		optimus.setPosicion(posicionOptimus);			
		
		Assert.assertEquals(optimus.getVelocidad(),2);		
		
		Flash flash = new Flash();
		Posicion posicionBonus = new Posicion(14,14);
		flash.setPosicion(posicionBonus);		
				
		optimus.agregarBonusPersonaje(flash);
		
		//Optimus Humanoide tiene velocidad 2. Flash triplica
		Assert.assertEquals(optimus.getVelocidad(),6);		
		p1.finalizarTurno(); //Forzosamente terminamos los turnos
		
		//Finalizo el turno de megatron		
		p1.finalizarTurno();
		
		Assert.assertEquals(optimus.getVelocidad(),6);		
		p1.finalizarTurno(); //Forzosamente terminamos los turnos		
		
		p1.finalizarTurno();
		
		Assert.assertEquals(optimus.getVelocidad(),6);		
		p1.finalizarTurno(); //Forzosamente terminamos los turnos
		//Finaliza la vigencia de flash
		
		p1.finalizarTurno();
		
		//Optimus nuevamente con velocidad 2
		Assert.assertEquals(optimus.getVelocidad(),2);
		
	}

	@Test
	public void test06AlgoformerCapturaFlashYEsVelozAlterno(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		Personaje megatron = j2.getPersonaje1();
		
		Posicion posicionOptimus = new Posicion(14,14);		
		optimus.setPosicion(posicionOptimus);
		
		//Transformo
		optimus.transformar();
		
		Assert.assertEquals(optimus.getVelocidad(),5);		
		
		Flash flash = new Flash();
		Posicion posicionBonus = new Posicion(14,14);
		flash.setPosicion(posicionBonus);		
				
		optimus.agregarBonusPersonaje(flash);
		
		//Optimus Humanoide tiene velocidad 2. Flash triplica
		Assert.assertEquals(optimus.getVelocidad(),15);		
		p1.finalizarTurno(); //Forzosamente terminamos los turnos
		
		//Finalizo el turno de megatron		
		p1.finalizarTurno();
		
		Assert.assertEquals(optimus.getVelocidad(),15);		
		p1.finalizarTurno(); //Forzosamente terminamos los turnos		
		
		p1.finalizarTurno();
		
		Assert.assertEquals(optimus.getVelocidad(),15);		
		p1.finalizarTurno(); //Forzosamente terminamos los turnos
		//Finaliza la vigencia de flash
		
		p1.finalizarTurno();
		
		//Optimus nuevamente con velocidad 2
		Assert.assertEquals(optimus.getVelocidad(),5);
		
	}
	
	@Test
	public void test08AlgoformerNoCapturaDosBonusIguales(){		
		
		//Creo los jugadores, y la partida. Valido el test con el Personaje 1 de cada uno
		Jugador j1 = new Jugador("j1",TipoTransformer.AUTOBOT);
		Jugador j2 = new Jugador("j2",TipoTransformer.DECEPTICON);
		
		Partida p1 = new Partida(j1, j2);		
		
		Personaje optimus = j1.getPersonaje1();
		Personaje megatron = j2.getPersonaje1();
		
		Posicion posicionOptimus = new Posicion(14,14);		
		optimus.setPosicion(posicionOptimus);
		
		//Velocidad de Optimus es 2 en modo humanoide
		Assert.assertEquals(optimus.getVelocidad(),2);		
		
		Flash flash = new Flash();
		Posicion posicionBonus = new Posicion(14,14);
		flash.setPosicion(posicionBonus);		
				
		optimus.agregarBonusPersonaje(flash);		
		
		//Optimus Humanoide tiene velocidad 6. Flash triplica
		Assert.assertEquals(optimus.getVelocidad(),6);
		
		
		//Intento agregar otro flash
		Flash flash2 = new Flash();		
		flash2.setPosicion(posicionBonus);		
		optimus.agregarBonusPersonaje(flash2);		
		
		//Optimus Humanoide tiene velocidad 6, si ya cuenta con un Flash
		Assert.assertEquals(optimus.getVelocidad(),6);
				
	}
	
		
}
