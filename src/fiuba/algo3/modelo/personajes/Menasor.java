package fiuba.algo3.modelo.personajes;

import java.util.HashMap;

import fiuba.algo3.modelo.bonus.Bonus;
import fiuba.algo3.modelo.bonus.TipoBonus;
import fiuba.algo3.modelo.estados.MenasorUnico;

public class Menasor extends Decepticon {
	public Menasor(int vida){
		this.ptosDeVida = vida;
		this.listaBonus = new HashMap<TipoBonus,Bonus>();
		this.modoAlgoformer = new MenasorUnico();
	}
	@Override
	public void transformar(){
		
	}
}
