package fiuba.algo3.modelo.jugabilidad;

import fiuba.algo3.modelo.personajes.*;

public class Jugador {
	
	private String Nombre;
	boolean ganador;
	private Personaje personaje1;
	private Personaje personaje2;
	private Personaje personaje3;
	
	public void finalizarTurno(){
		this.personaje1.reestablecerEfectos();
		this.personaje2.reestablecerEfectos();
		this.personaje3.reestablecerEfectos();
	}
	
	public Jugador(String nombre,TipoTransformer tipo){
		this.Nombre= nombre;
		this.ganador=false;
		
		if(tipo.equals(TipoTransformer.AUTOBOT)){
			personaje1 = new Optimus();
			personaje2 = new Bumblebee();
			personaje3 = new Ratchet();			
		}
		else{
			personaje1 = new Megatron();
			personaje2 = new Bonecrusher();
			personaje3 = new Frenzy();
		}
	}	

	public String getNombre() {
		return this.Nombre;
	}
	public Personaje getPersonaje1() {
		return this.personaje1;
	}	
	public Personaje getPersonaje2() {
		return this.personaje2;
		
	}public Personaje getPersonaje3() {
		return this.personaje3;
	}
	
	public boolean getGanador(){
		return this.ganador;
	}
}
