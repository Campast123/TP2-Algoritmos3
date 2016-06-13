package fiuba.algo3.modelo.bonus;

import fiuba.algo3.modelo.personajes.Personaje;
import fiuba.algo3.modelo.personajes.Posicionable;
import fiuba.algo3.modelo.tablero.Posicion;

public abstract class Bonus  implements Posicionable {
	protected int turnos;	
	
	public int getTurnos(){
		return this.turnos;
	}
	
	public void reducirTurno(){
		this.turnos = this.turnos -1;
	}	
		
	public abstract void aplicarEfecto(Personaje personaje);

	@Override
	public Posicion getPosicion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosicion(Posicion posicion) {
		// TODO Auto-generated method stub
		
	}
}
