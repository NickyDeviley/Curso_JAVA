package Secao13;

import Secao13.ClassesAula137_138.Cachorro;
import Secao13.ClassesAula137_138.Mamifero;

// UPCASTING & DOWNCASTING
public class Aula138 {

	public static void main(String[] args) {
		
		/*
			CASTING é "Converter", quando falamos em up e down,
			estamos nos referindo a converter entre subclasse e
			superclasse.
		*/
		
		Mamifero animalMamifero = new Mamifero();
		Cachorro dog = new Cachorro();
		
		Mamifero animalMamifero2 = new Mamifero();
		Cachorro dog2 = new Cachorro();
		
		// Upcasting (Classe  mais baixa <- classe mais alta)
		animalMamifero2 = dog;

		// Downcasting (Classe mais alta <- classe mais baixa)
		dog = (Cachorro) animalMamifero;
		
		/*
			Quando fazemos um Upcasting ocorre
			perda de conteúdo. Isso acontece porque a subclasse
			"Cachorro" possuí características e comportamentos
			que não existem na classe "Mamífero", essa diferenças
			entre as classes são perdidas durante a conversão.
			
			Já no Downcasting é necessário converter explicitamente,
			justamente para que essas características e comportamentos
			sejam alocados na memória com este objeto.
		*/
		
		
	}

}
