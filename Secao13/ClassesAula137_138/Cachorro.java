package Secao13.ClassesAula137_138;

public class Cachorro extends Mamifero {

	/*
		Agora nós estamos na especialização MÁXIMA.
		Essa classe possuí todas as características
		e comportamentos da classe mamífero e da classe
		animal, mas possuí suas próprias características
		e comportamentos.
	*/
	
	
	
	// Construtor
	public Cachorro() {
		
		this.corDoPelo = "Marrom";
		this.idade = 2;
		this.nome = "Toto";
		
	}
	
	// COMPORTAMENTOS DE TODOS OS CACHORROS
	public void latir() {
		
		System.out.println("Au au!");
		
	}
	
}
