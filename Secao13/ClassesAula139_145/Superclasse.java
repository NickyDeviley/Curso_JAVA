package Secao13.ClassesAula139_145;

// CLASSE ABSTRATA (SÓ PODE SER HERDADA E NÃO INSTANCIADA!)
public abstract class Superclasse {

	/*
		Na superclasse nós temos características
		e comportamentos que serão herdados pela
		subclasse.
	*/
	
	// CARACTERÍSTICAS
	public int val1;
	public int val2;
	
	// CONSTRUTOR
	public Superclasse(int val1, int val2) {
		
		this.val1 = val1;
		this.val2 = val2;
		
	}
	
	// COMPORTAMENTOS
	public void fazerConta() {
		
		int soma = val1 + val2;
		System.out.println("A soma é: " + soma);
		
	}
	
	// MÉTODO ABSTRATO (PRECISA SER REESCRITO NAS CLASSES FILHAS)
	// perceba que nem corpo ele tem.
	public abstract void seraDeclaradoDepois();
	
	
	// MÉTODO FINAL (ELE NÃO PODE SER HERDADO)
	public final void morreAqui() {
		
		System.out.println("Este método morre aqui!");
		
	}
	
}
