package Secao13.ClassesAula137_138;

public class Mamifero extends Animal{

	/*
		Usamos a palavra-chave "extends" para declarar uma herança.
		
		Agora nós estamos mais "especialistas". Isso significa
		que todos os mamíferos herdam as características e comportamentos
		da classe animal, mas que possuem suas próprias características
		e comportamentos.
		
	*/
	
	// CARACTERÍSTICAS DE TODOS OS MAMÍFEROS
	public String corDoPelo;
	
	// COMPORTAMENTOS DE TODOS OS MAMÍFEROS
	public void amamentar() {
		System.out.println("Todo mamífero amamenta os filhotes!");
		
	}
	
}
