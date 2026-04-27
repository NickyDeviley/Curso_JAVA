package Secao13;

import Secao13.ClassesAula137_138.Cachorro;

// HERANÇA
public class Aula137 {

	public static void main(String[] args) {
		
		/*
			Na POO existe o conceito de HERANÇA. Trata-se
			de uma maneira de abstrair objetos. É um tipo
			de associação que permite que uma classe herde
			todos os dados e comportamentos de outra classe.
			
			O sistema de POO foi criado para tornar a programação
			mais lógicamente fácil de entender, expandir e reutilizar.
			Através do sistemas de objetos que imita a vida real, e
			nós podemos enxergar o sistemad e HERANÇA fora da programação:
			
			Todo mamífero é um animal. Todo cachorro é um mamífero, portanto
			também é um animal. Ele compartilha características e comportamentos
			com todos os animais e com todos os mamíferos.
			
			Percebe como funciona a herança? Um exemplo mais visual:
			
			Animal
			|- Mamífero
			|  |- Cachorro
			
			Veja as classes nomeadas como o exemplo acima para continuar os exemplos!
		*/
		
		// Criando um  cachorro
		Cachorro dog = new Cachorro();
		
		dog.comer();		// Acessando um método dos animais
		dog.amamentar();	// Acessando um método dos mamíferos
		dog.latir();		// Acessando um método dos cachorros

	}

}
