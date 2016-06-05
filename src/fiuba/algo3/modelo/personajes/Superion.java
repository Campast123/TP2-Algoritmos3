package fiuba.algo3.modelo.personajes;

import fiuba.algo3.modelo.estados.SuperionUnico;

public class Superion extends Autobot {
	public Superion(int vida){
		this.ptosDeVida = vida;
		this.modoAlgoformer = new SuperionUnico();
	}
	@Override
	public void transformar(){
		
	}
}
