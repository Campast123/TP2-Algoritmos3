package fiuba.algo3.modelo.personajes;

public abstract class Autobot extends Personaje{

	@Override 
	public boolean esAutobot(){
		return true;
	}
	
	@Override 
	public boolean esDecepticon(){
		return false;
	}
	
	@Override
	public void atacarA(Personaje personaje) {
		if ((personaje.esDecepticon()) && (this.puedeAtacar(personaje.posicion))){
			personaje.recibirAtaque(this.getAtaque());
		}
	}

}
