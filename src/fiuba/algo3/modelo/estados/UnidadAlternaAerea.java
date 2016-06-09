package fiuba.algo3.modelo.estados;

import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.superficies.SuperficieAerea;
import fiuba.algo3.modelo.superficies.SuperficieTerrestre;

public abstract class UnidadAlternaAerea extends ModoAlterno{
	int tormentaPsionica;
	
	@Override
	public boolean puedeAtravesarPantano(){
		return true;
	}
	
	@Override
	public void quitarVidaEspinas(Personaje algoformer){
		
	}
	
	@Override
	public void reducirAtaque(){
		if (this.tormentaPsionica == 0){
		this.ataque = this.ataque - ((this.ataque *40)/100);
		this.tormentaPsionica++;
		}
	}
}
