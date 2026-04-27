package Secao13;

import Secao13.ClassesAula139_145.Subclasse;

// Sobreposição, palavra super, anotação @Override
public class Aula139_145 {

	public static void main(String[] args) {
		
		/*
		 	Quando nós falamos de herança, nós, além
		 	de criarmos classes que herdam comportamentos
		 	e características, nós podemos alterar certos
		 	comportamentos através da sobreposição.
		 	
		 	Vamos supor, todo animal é capaz de produzir
		 	algum barulho, mas todos fazem barulhos diferentes.
		 	Um cachorro, late. Um gato, mia. Etc. E para
		 	declarar uma sobreposição em java, nós utilizamos
		 	a anotação "@Override".
		 	
		 	Outra coisa que também temos é a palavra "super",
		 	trata-se de uma maneira de chamar o construtor
		 	da super classe dentro da subclasse.
		 	
		 	Para declarar que uma classe não pode ser herdada,
		 	nós utilizamos a palavra chave "final", isso significa
		 	que não podemos criar uma subclasse que extende essa.
		 	Caso nós utilizarmos a palavra chave "final" em um método,
		 	nós ainda podemos extender essa classe, mas o método não
		 	será herdado.
		 	
		 	Outro conceito para explorar é a palavra chave "abstract",
		 	quando utilizamos essa palavra em uma classe, estamos
		 	declarando que aquela classe NÃO pode ser instanciada. E
		 	quando nós utilizamos em um método, estamos dizendo que
		 	aquele método PRECISA ser reescrito nas subclasses.
		 	
		 		- Perceba que a palavra chave "Final" é o oposto da
		 		palavra "abstract".
		*/
		
		Subclasse obj = new Subclasse(10, 20, "Nicky", "Deviley");
		
		// ACESSANDO TODOS OS MÉTODOS DE AMBAS AS CLASSES
		obj.imprimirNome();
		obj.morreAqui();
		obj.fazerConta();
		obj.seraDeclaradoDepois();
		
	}
	
}
