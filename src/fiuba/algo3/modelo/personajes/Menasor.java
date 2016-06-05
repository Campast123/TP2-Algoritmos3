package fiuba.algo3.modelo.personajes;

import fiuba.algo3.modelo.estados.MenasorUnico;

public class Menasor extends Decepticon {
	public Menasor(int vida){
		this.ptosDeVida = vida;
		this.modoAlgoformer = new MenasorUnico();
	}
	@Override
	public void transformar(){
		
	}
}
