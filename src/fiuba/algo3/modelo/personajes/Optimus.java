package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.ModoAlgoformer;
import fiuba.algo3.modelo.estados.OptimusAlterno;
import fiuba.algo3.modelo.estados.OptimusHumanoide;

public class Optimus extends Autobot {
	public Optimus(){
		this.ptosDeVida = 500;
		this.modoAlgoformer = new OptimusHumanoide();
		ModoAlgoformer modoAlterno = new OptimusAlterno();
		this.distintosModos = new Stack<ModoAlgoformer>();
		this.distintosModos.push(modoAlterno);
	}
}
