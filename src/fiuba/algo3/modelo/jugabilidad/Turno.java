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
	
	public void cambioDeTurno(){
		if (jugadorActual.equals(p1)){
			this.jugadorActual = p2;
		} else {
			this.jugadorActual = p1;			
		}
	}

	
	
	
	
}
