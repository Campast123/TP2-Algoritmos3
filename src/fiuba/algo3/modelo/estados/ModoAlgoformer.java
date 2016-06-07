package fiuba.algo3.modelo.estados;

import fiuba.algo3.modelo.superficies.*;

public interface ModoAlgoformer {
	int getAtaque();
	int getVelocidad();
	int getDistanciaDeAtaque();
	boolean esHumanoide();
	boolean esAlterno();
	boolean esUnico();
	boolean esUnidadTerrestre();
	boolean esUnidadAerea();
	boolean puedeAtravesar(SuperficieAerea superficie);
	boolean puedeAtravesar(SuperficieTerrestre superficie);
}
