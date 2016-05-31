package fiuba.algo3.modelo.personajes;

public abstract class Decepticon extends Personaje{

	@Override 
	public boolean esAutobot(){
		return false;
	}
	
	@Override 
	public boolean esDecepticon(){
		return true;
	}
	
	@Override
	public void atacarA(Personaje personaje) {
		if (personaje.esAutobot() && (this.puedeAtacar(personaje.posicion))){
			personaje.recibirAtaque(this.getAtaque());
		}
	}
}
