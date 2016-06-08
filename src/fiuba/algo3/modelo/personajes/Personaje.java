package fiuba.algo3.modelo.personajes;

import fiuba.algo3.modelo.superficies.SuperficieAerea;
import fiuba.algo3.modelo.superficies.SuperficieTerrestre;
import fiuba.algo3.modelo.tablero.Posicion;

public interface Personaje extends Posicionable {
	void atacar(Personaje personaje);
	void recibirAtaqueDe(Decepticon decepticon);
	void recibirAtaqueDe(Autobot autobot);
	boolean puedeAtacar(Posicion posicion);
	boolean puedeMoverse(Posicion posicion);
	void recibirAtaque(int ataque);
	void transformar();
	int getAtaque();
	int getVelocidad();
	int getDistanciaDeAtaque();
	int getPuntosDeVida();
	boolean esAlterno();
	boolean esHumanoide();
	boolean puedeAtravesarSup(SuperficieAerea superficie);
	boolean puedeAtravesarSup(SuperficieTerrestre superficie);
	void reducirVidaEspinas();
	void reducirVida();
	void reducirAtaque();
}
