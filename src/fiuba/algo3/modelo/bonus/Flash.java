package fiuba.algo3.modelo.bonus;

import fiuba.algo3.modelo.personajes.Personaje;

public class Flash extends Bonus {
	
	public Flash(){
		this.turnos = 3;
	}
	
	@Override
	public void aplicarEfecto(Personaje personaje){
		personaje.triplicarVelocidad(personaje.getVelocidad() *3);
	}



}
