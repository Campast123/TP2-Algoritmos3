package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.BumblebeeAlterno;
import fiuba.algo3.modelo.estados.BumblebeeHumanoide;
import fiuba.algo3.modelo.estados.ModoAlgoformer;

public class Bumblebee extends Autobot {
	public Bumblebee(){
		this.ptosDeVida = 350;
		this.modoAlgoformer = new BumblebeeHumanoide();
		ModoAlgoformer modoAlterno = new BumblebeeAlterno();
		this.distintosModos = new Stack<ModoAlgoformer>();
		this.distintosModos.push(modoAlterno);
	}
}
