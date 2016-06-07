package fiuba.algo3.superficies;

import org.junit.Assert;
import org.junit.Test;
import fiuba.algo3.modelo.estados.*;
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
		ModoAlgoformer modoOptimusAlterno = new OptimusAlterno();
		ModoAlgoformer modoMegatronAlterno = new MegatronAlterno();
		SuperficieTerrestre pantano = new SuperficiePantano();
		Assert.assertTrue(modoOptimusAlterno.puedeAtravesar(pantano));
		Assert.assertTrue(modoMegatronAlterno.puedeAtravesar(pantano));
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
}
