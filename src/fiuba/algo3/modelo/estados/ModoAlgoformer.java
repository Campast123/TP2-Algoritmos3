package fiuba.algo3.modelo.estados;


import fiuba.algo3.modelo.personajes.Personaje;

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
	boolean pantanoReduceVelocidad();
}
