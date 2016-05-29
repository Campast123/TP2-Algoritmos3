package fiuba.algo3.modelo.excepciones;

public class MovimientoInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public MovimientoInvalidoException(String mensaje){
		super(mensaje);
	}
	
	public MovimientoInvalidoException(){
		super();
	}
}
