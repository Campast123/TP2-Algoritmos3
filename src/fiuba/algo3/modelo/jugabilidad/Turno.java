package fiuba.algo3.modelo.jugabilidad;

public class Turno {

	private Jugador p1;
	private Jugador p2;
	private Jugador jugadorActual;

	public Turno (Jugador p1, Jugador p2){
		this.p1 = p1;
		this.p2 = p2;
		this.jugadorActual = this.p1;
	}

	public Jugador getJugadorActual() {
		return this.jugadorActual;
	}

	public Jugador getJugadorEnEspera() {
		if (this.jugadorActual.equals(p1)){
			return this.p2;
		} else {
			return this.p1;
		}
	}

	public void cambioDeTurno(){
		this.reestablecerEfectos(jugadorActual);
		this.actualizarBonus(jugadorActual);

		if (jugadorActual.equals(p1)){
			this.jugadorActual = p2;
		} else {
			this.jugadorActual = p1;
		}
	}

	private void reestablecerEfectos(Jugador jugador){
		jugador.getPersonaje1().reestablecerEfectos();
		jugador.getPersonaje2().reestablecerEfectos();
		jugador.getPersonaje3().reestablecerEfectos();
	}

	private void actualizarBonus(Jugador jugador){
		jugador.getPersonaje1().actualizarBonus();
		jugador.getPersonaje2().actualizarBonus();
		jugador.getPersonaje3().actualizarBonus();
	}


}
