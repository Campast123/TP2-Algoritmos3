package fiuba.algo3.modelo.tablero;


public class Posicion {

	private int coordenadaX;
	private int coordenadaY;
	
	public Posicion( int coordenadaX, int coordenadaY ){
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	

    @Override
    public int hashCode() {
	    int hash = 0;
	    hash = (this.coordenadaX * 1000) +this.coordenadaY;
        return hash;
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


	public int distanciaA(Posicion posicion){
		int maxCoordenadaX = Math.max(this.coordenadaX, posicion.getCoordenadaX());
		int minCoordenadaX = Math.min(this.coordenadaX, posicion.getCoordenadaX());
		int maxCoordenadaY = Math.max(this.coordenadaY, posicion.getCoordenadaY());
		int minCoordenadaY = Math.min(this.coordenadaY, posicion.getCoordenadaY());
		
		int distaciaAX = maxCoordenadaX - minCoordenadaX;
		int distanciaAY = maxCoordenadaY - minCoordenadaY;
		
		int mayorDistancia = Math.max(distaciaAX, distanciaAY);
		
		return mayorDistancia;
	}
}
