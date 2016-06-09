package fiuba.algo3.modelo.estados;


import fiuba.algo3.modelo.personajes.Personaje;
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
	boolean puedeAtravesarPantano();
	void quitarVidaEspinas(Personaje personaje);
	void reducirAtaque();
	void reducirVelocidad();
}
