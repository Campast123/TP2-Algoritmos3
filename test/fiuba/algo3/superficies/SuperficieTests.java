package fiuba.algo3.superficies;

import org.junit.Assert;
import org.junit.Test;
import fiuba.algo3.modelo.estados.*;
import fiuba.algo3.modelo.personajes.*;
import fiuba.algo3.modelo.superficies.*;

public class SuperficieTests {
	@Test
	public void test01AlgoformerHumanoideNoPuedeAtravesarPantano(){
		//Optimus y Megatron no pueden atravesar pantanos en modo humanoide
		Optimus optimus = new Optimus();
		Megatron megatron = new Megatron();
		
		SuperficieTerrestre pantano = new SuperficiePantano();
		
		Assert.assertFalse(optimus.puedeAtravesarSup(pantano));
		Assert.assertFalse(megatron.puedeAtravesarSup(pantano));
	}
	@Test
	public void test02AlgoformerAlternoPuedeAtravesarPantano(){
		//Optimus y Megatron pueden atravesar pantano en modo alterno
		Optimus optimus = new Optimus();
		Megatron megatron = new Megatron();
		
		SuperficieTerrestre pantano = new SuperficiePantano();
		
		optimus.transformar();
		megatron.transformar();
		
		Assert.assertTrue(optimus.puedeAtravesarSup(pantano));
		Assert.assertTrue(megatron.puedeAtravesarSup(pantano));
	}
	@Test
	public void test03AlgoformersHumanoidesYAlternosPuedeAtravesarRocosaYNube(){
		//Optimus y Megatron pueden atravesar roca y nube en cualquier modo
		Optimus optimus = new Optimus();
		Megatron megatron = new Megatron();
		
		SuperficieTerrestre rocosa = new SuperficieRocosa();
		SuperficieAerea nube = new SuperficieNube();
		
		Assert.assertTrue(optimus.puedeAtravesarSup(rocosa));
		Assert.assertTrue(megatron.puedeAtravesarSup(rocosa));
		Assert.assertTrue(optimus.puedeAtravesarSup(nube));
		Assert.assertTrue(megatron.puedeAtravesarSup(nube));
		
		optimus.transformar();
		megatron.transformar();
		
		Assert.assertTrue(optimus.puedeAtravesarSup(rocosa));
		Assert.assertTrue(megatron.puedeAtravesarSup(rocosa));
		Assert.assertTrue(optimus.puedeAtravesarSup(nube));
		Assert.assertTrue(megatron.puedeAtravesarSup(nube));
		
	}
	@Test
	public void test04EspinasNoLastimanAlgoformerAereo(){
		//Algoformers aereos no sufren quita de vida de espinas
		Ratchet ratchet = new Ratchet();
		Megatron megatron = new Megatron();
		
		SuperficieTerrestre espinas = new SuperficieEspinas();
		
		Assert.assertTrue(ratchet.puedeAtravesarSup(espinas));
		Assert.assertTrue(megatron.puedeAtravesarSup(espinas));
		
		ratchet.transformar();
		
		Assert.assertTrue(ratchet.puedeAtravesarSup(espinas));

		espinas.producirEfecto(ratchet);
		
		Assert.assertTrue(ratchet.getPuntosDeVida() == 150);
		
		megatron.transformar();
		Assert.assertTrue(megatron.puedeAtravesarSup(espinas));

		espinas.producirEfecto(megatron);

		Assert.assertTrue(megatron.getPuntosDeVida() == 550);
	}
	
	@Test
	public void test04EspinasLastimanAlgoformerNoAereo(){
		Ratchet ratchet = new Ratchet();
		Optimus optimus = new Optimus();
		Megatron megatron = new Megatron();
		Superion superion = new Superion(1000);
		
		SuperficieTerrestre espinas = new SuperficieEspinas();
		
		//Pueden atravesar la superficie espinas
		Assert.assertTrue(ratchet.puedeAtravesarSup(espinas));
		Assert.assertTrue(optimus.puedeAtravesarSup(espinas));
		Assert.assertTrue(megatron.puedeAtravesarSup(espinas));
		Assert.assertTrue(superion.puedeAtravesarSup(espinas));
		
		//Espinas sacan 5% vida ratchet en modo humanoide
		espinas.producirEfecto(ratchet);
		
		Assert.assertTrue(ratchet.getPuntosDeVida() == 143);
		
		//Espinas sacan 5% vida optimus en cualquiera de sus modos y todas las veces que pase por ellas
		espinas.producirEfecto(optimus);

		Assert.assertTrue(optimus.getPuntosDeVida() == 475);
		
		espinas.producirEfecto(optimus);
		
		Assert.assertTrue(optimus.getPuntosDeVida() == 452);
		
		optimus.transformar();
		Assert.assertTrue(optimus.puedeAtravesarSup(espinas));

		espinas.producirEfecto(optimus);
		
		Assert.assertTrue(optimus.getPuntosDeVida() == 430);
		
		//Espinas sacan 5% vida Megatron en modo humanoide
		espinas.producirEfecto(megatron);
		
		Assert.assertTrue(megatron.getPuntosDeVida() == 523);
		
		//Espinas sacan 5% vida Superion en modo unico
		espinas.producirEfecto(superion);
		
		Assert.assertTrue(superion.getPuntosDeVida() == 950);
	}
}
