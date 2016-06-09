package fiuba.algo3.modelo.superficies;

import fiuba.algo3.modelo.personajes.Personaje;

public class SuperficieNebulosaDeAndromeda extends SuperficieAerea {
	
	private static int TURNOS_DE_INMOVILIZACION = 3;
	
	@Override
	public void producirEfecto(Personaje algoformer) {
		algoformer.setTurnosInmovilizado(TURNOS_DE_INMOVILIZACION);
	}
}
