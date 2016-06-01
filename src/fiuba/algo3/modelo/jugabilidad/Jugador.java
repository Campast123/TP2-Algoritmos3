package fiuba.algo3.modelo.jugabilidad;

import java.util.ArrayList;
import java.util.List;

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
	
	public List getPersonajes(){
		List<Personaje> list = new ArrayList<Personaje>();
		list.add(this.personaje1);
		list.add(this.personaje2);
		list.add(this.personaje3);
		return list;
	}
}
