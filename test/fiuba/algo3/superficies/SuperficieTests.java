package fiuba.algo3.superficies;

import org.junit.Assert;
import org.junit.Test;
import fiuba.algo3.modelo.estados.*;
import fiuba.algo3.modelo.personajes.*;
import fiuba.algo3.modelo.superficies.*;

public class SuperficieTests {
	@Test
	public void test01AlgoformerHumanoideNoPuedeAtravesarPantano(){
		ModoAlgoformer modoOptimusHumanoide = new OptimusHumanoide();
		ModoAlgoformer modoMegatronHumanoide = new MegatronHumanoide();
		SuperficieTerrestre pantano = new SuperficiePantano();
		Assert.assertFalse(modoOptimusHumanoide.puedeAtravesar(pantano));
		Assert.assertFalse(modoMegatronHumanoide.puedeAtravesar(pantano));
	}
	@Test
	public void test02AlgoformerAlternoPuedeAtravesarPantano(){
		Optimus optimus = new Optimus();
		Megatron megatron = new Megatron();
		
		SuperficieTerrestre pantano = new SuperficiePantano();
		
		Assert.assertFalse(optimus.puedeAtravesarSup(pantano));
		Assert.assertFalse(megatron.puedeAtravesarSup(pantano));
		
		optimus.transformar();
		megatron.transformar();
		
		Assert.assertTrue(optimus.puedeAtravesarSup(pantano));
		Assert.assertTrue(megatron.puedeAtravesarSup(pantano));
	}
	@Test
	public void test03AlgoformersHumanoidesYAlternosPuedeAtravesarRocosaYNube(){
		ModoAlgoformer modoOptimusHumanoide = new OptimusHumanoide();
		ModoAlgoformer modoMegatronHumanoide = new MegatronHumanoide();	
		ModoAlgoformer modoOptimusAlterno = new OptimusAlterno();
		ModoAlgoformer modoMegatronAlterno = new MegatronAlterno();
		SuperficieTerrestre rocosa = new SuperficieRocosa();
		SuperficieAerea nube = new SuperficieNube();
		
		Assert.assertTrue(modoOptimusHumanoide.puedeAtravesar(rocosa));
		Assert.assertTrue(modoMegatronHumanoide.puedeAtravesar(rocosa));
		Assert.assertTrue(modoOptimusAlterno.puedeAtravesar(rocosa));
		Assert.assertTrue(modoMegatronAlterno.puedeAtravesar(rocosa));
		
		Assert.assertTrue(modoOptimusHumanoide.puedeAtravesar(nube));
		Assert.assertTrue(modoMegatronHumanoide.puedeAtravesar(nube));
		Assert.assertTrue(modoOptimusAlterno.puedeAtravesar(nube));
		Assert.assertTrue(modoMegatronAlterno.puedeAtravesar(nube));
	}
	@Test
	public void test04EspinasNoLastimanAlgoformerAereo(){
		Ratchet ratchet = new Ratchet();
		Optimus optimus = new Optimus();
		
		SuperficieTerrestre espinas = new SuperficieEspinas();
		
		Assert.assertTrue(ratchet.puedeAtravesarSup(espinas));
		Assert.assertTrue(optimus.puedeAtravesarSup(espinas));
		
		ratchet.transformar();
		
		espinas.producirEfecto(ratchet);
		
		Assert.assertTrue(ratchet.getPuntosDeVida() == 150);
		
		ratchet.transformar();

		espinas.producirEfecto(ratchet);
		espinas.producirEfecto(optimus);

		Assert.assertTrue(ratchet.getPuntosDeVida() == 143);
		Assert.assertTrue(optimus.getPuntosDeVida() == 475);
		
		espinas.producirEfecto(optimus);
		
		Assert.assertTrue(optimus.getPuntosDeVida() == 452);
		
		optimus.transformar();
		
		espinas.producirEfecto(optimus);
		
		Assert.assertTrue(optimus.getPuntosDeVida() == 430);

	}
}
