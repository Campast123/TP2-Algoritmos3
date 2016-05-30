package fiuba.algo3.modelo.jugabilidad;

import fiuba.algo3.modelo.personajes.*;

public class Jugador {
	
	private String Nombre;
	private Personaje personaje1;
	private Personaje personaje2;
	private Personaje personaje3;
	
	public Jugador(String nombre,TipoTransformer tipo){
		this.Nombre= nombre;
		
		if(tipo.equals(TipoTransformer.AUTOBOT)){
			personaje1 = new Optimus();
			personaje1 = new Ratchet();
			personaje1 = new Bumblebee();			
		}
		
		personaje1 = new Frenzy();
		personaje1 = new Megatron();
		personaje1 = new Bonecrusher();
	}
}
