package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.FrenzyAlterno;
import fiuba.algo3.modelo.estados.FrenzyHumanoide;
import fiuba.algo3.modelo.estados.ModoAlgoformer;

public class Frenzy extends Decepticon {
	public Frenzy(){
		this.ptosDeVida = 400;
		this.modoAlgoformer = new FrenzyHumanoide();
		ModoAlgoformer modoAlterno = new FrenzyAlterno();
		this.distintosModos = new Stack<ModoAlgoformer>();
		this.distintosModos.push(modoAlterno);
	}
}
