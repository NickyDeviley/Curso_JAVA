package Secao14.Aula157;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;	
	/*
		Se extender Exception é obrigatório a tratar
		a exceção no código.
		
		Se extender RuntimeException, não é obrigatório
		tratar a exceção no código.
	*/
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}
