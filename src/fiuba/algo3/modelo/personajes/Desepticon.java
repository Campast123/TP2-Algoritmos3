package fiuba.algo3.modelo.personajes;

public abstract class Desepticon extends Personaje{

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
		if (personaje.esAutobot()){
			personaje.recibirAtaque(this.getAtaque());
		}
	}
}
