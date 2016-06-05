package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.ModoAlgoformer;
import fiuba.algo3.modelo.estados.RatchetAlterno;
import fiuba.algo3.modelo.estados.RatchetHumanoide;

public class Ratchet extends Autobot {
	public Ratchet(){
		this.ptosDeVida = 150;
		this.modoAlgoformer = new RatchetHumanoide();
		ModoAlgoformer modoAlterno = new RatchetAlterno();
		this.distintosModos = new Stack<ModoAlgoformer>();
		this.distintosModos.push(modoAlterno);
	}
}
