package fiuba.algo3.modelo.tablero;


public class Posicion {

	private int coordenadaX;
	private int coordenadaY;
	
	public Posicion( int coordenadaX, int coordenadaY ){
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
	@Override
	public boolean equals(Object o){
		Posicion posicionRecibida = (Posicion) o;
		if (posicionRecibida != null){
			if ((this.coordenadaX == posicionRecibida.getCoordenadaX()) && (this.coordenadaY == posicionRecibida.getCoordenadaY())){
				return true;
			}
		}
		return false;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
}
