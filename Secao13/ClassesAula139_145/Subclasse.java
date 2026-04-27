package Secao13.ClassesAula139_145;

// CLASSE FINAL (SÓ PODE SER INSTANCIADA, MAS NÃO HERDADA)
public final class Subclasse extends Superclasse {

	/*
		Na superclasse nós temos características
		e comportamentos que serão herdados pela
		subclasse, mas caso nós tenhamos que modificar
		algum destes comportamentos, podemos utilizar
		o @Override.
		
		E podemos utilizar a palavra super, para chamar
		a superclasse e facilitar a declaração
		das características.
	*/
	
	// CARACTERÍSTICAS DA SUBCLASSE
	public String nome;
	public String sobrenome;
	
	// CONSTRUTOR DA SUBCLASSE
	public Subclasse(int val1, int val2, String nome, String sobrenome) {
		
		super(val1, val2);	// Nós invocamos o método construtor da superclasse
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		
	}
	
	// COMPORTAMENTOS DA SUBCLASSE
	public void imprimirNome() {
		System.out.println(nome + " " + sobrenome);
	}

	// COMPORTAMENTO SENDO REESCRITO
	@Override
	public void fazerConta() {
		
		int subtracao = this.val1 - this.val2;
		
		
	}
	
	// COMPORTAMENTO ABSTRATO SENDO DECLARADO NA CLASSE FILHA
	@Override
	public void seraDeclaradoDepois() {
		
		System.out.println("Agora este método tem um corpo!");
		
	}
	
	/*
		O MÉTODO FINAL NÃO FOI HERDADO, E ELE NÃO PODE SER
		REESCRITO. ELE SE MANTÉM DA MESMA FORMA QUE FOI
		DECLARADO.
	*/
	
}
