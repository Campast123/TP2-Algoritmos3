package fiuba.algo3.modelo.personajes;


import java.util.HashMap;

import fiuba.algo3.modelo.bonus.Bonus;
import fiuba.algo3.modelo.bonus.TipoBonus;
import fiuba.algo3.modelo.estados.SuperionUnico;

public class Superion extends Autobot {
	public Superion(int vida){
		this.ptosDeVida = vida;
		this.listaBonus = new HashMap<TipoBonus,Bonus>();
		this.modoAlgoformer = new SuperionUnico();
	}
	@Override
	public void transformar(){
		
	}
}
