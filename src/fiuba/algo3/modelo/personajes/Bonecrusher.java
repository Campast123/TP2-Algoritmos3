package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.BonecrusherAlterno;
import fiuba.algo3.modelo.estados.BonecrusherHumanoide;
import fiuba.algo3.modelo.estados.ModoAlgoformer;

public class Bonecrusher extends Decepticon {
	public Bonecrusher(){
		this.ptosDeVida = 200;
		this.modoAlgoformer = new BonecrusherHumanoide();
		ModoAlgoformer modoAlterno = new BonecrusherAlterno();
		this.distintosModos = new Stack<ModoAlgoformer>();
		this.distintosModos.push(modoAlterno);
	}
}
