package fiuba.algo3.modelo.excepciones;

public class PosicionInvalidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PosicionInvalidaException(String mensaje){
		super(mensaje);
	}
	
	public PosicionInvalidaException(){
		super();
	}
}
