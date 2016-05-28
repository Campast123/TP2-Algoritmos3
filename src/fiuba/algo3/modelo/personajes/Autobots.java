package fiuba.algo3.modelo.personajes;

public abstract class Autobots extends Personaje{

	@Override 
	public boolean esAutobot(){
		return true;
	}
	
	@Override 
	public boolean esDecepticon(){
		return false;
	}
}
