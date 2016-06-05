package fiuba.algo3.modelo.personajes;

import java.util.Stack;

import fiuba.algo3.modelo.estados.ModoAlgoformer;
import fiuba.algo3.modelo.estados.MegatronAlterno;
import fiuba.algo3.modelo.estados.MegatronHumanoide;

public class Megatron extends Decepticon {
	public Megatron(){
		this.ptosDeVida = 550;
		this.modoAlgoformer = new MegatronHumanoide();
		ModoAlgoformer modoAlterno = new MegatronAlterno();
		this.distintosModos = new Stack<ModoAlgoformer>();
		this.distintosModos.push(modoAlterno);
	}
}
