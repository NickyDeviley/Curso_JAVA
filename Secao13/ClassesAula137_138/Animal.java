package Secao13.ClassesAula137_138;

public abstract class Animal {

	/*
	 	Usamos a palavra chave "Abstract", para
	 	avisar que esta classe não pode ser instanciada.
	 	
		Animal é a abstração máxima. Poderiamos
		também utilizar "ser-vivo", mas para esse exemplo
		vai servir.
		
		Na abstração máxima nós colocamos características
		e comportamentos que TODOS os animais possuem.
	*/
	
	// CARACTERÍSTICAS
	public int idade;	// Todo animal tem uma idade
	public String nome;	// Todo animal possuí um nome
	
	// COMPORTAMENTOS
	public void comer() { // Todo animal come.
		System.out.println("Comendo!");
	}
	
}
