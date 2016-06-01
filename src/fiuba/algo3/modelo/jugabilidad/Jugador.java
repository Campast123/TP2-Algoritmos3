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
			personaje2 = new Ratchet();
			personaje3 = new Bumblebee();			
		}
		
		personaje1 = new Frenzy();
		personaje2 = new Megatron();
		personaje3 = new Bonecrusher();
	}
}
