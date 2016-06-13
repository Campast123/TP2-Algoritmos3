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
	boolean pantanoReduceVelocidad();
	void quitarVidaEspinas(Personaje personaje);
	void reducirAtaque();
	void reducirVelocidad();
	void reestablecerVelocidad();
	void setAtaque(int ataque);
	void setInmunidad(boolean inmunidad);
	void setVelocidad(int velocidad);	
}
