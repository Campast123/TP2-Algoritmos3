package fiuba.algo3.modelo.tablero;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.superficies.SuperficieDeCampo;
import fiuba.algo3.modelo.superficies.SuperficieNube;
import fiuba.algo3.modelo.superficies.SuperficieRocosa;

public class TableroTest {

	@Test
	public void crearTableroAleatorioTest(){
		Tablero tablero = new Tablero(true);
		SuperficieDeCampo supDeCampoInicialBordes = new SuperficieDeCampo(new SuperficieNube(), new SuperficieRocosa());
		for (int x = 0; x < 2 ; x++ ){
			for (int y = 0 ; y <= 50 ; y++){
				Posicion posicion = new Posicion(x,y);
//				Assert.assertEquals(tablero.obtenerCasillero(posicion).getSuperficies().,supDeCampoInicialBordes);
			}
		}
	}
}
