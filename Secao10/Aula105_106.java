package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula105_106 {

	public static void main(String[] args) {

		/*
			No JAVA existe uma estrutura de dados conhecida por Lista.
			Ele funciona como uma um array, mas possuí diversos métodos
			prontos para serem facilmente utilizados.
			
			As listas são separadas em vários tipos, os mais usados são:
			
			ArrayList, que funciona como um array normal com métodos a mais,
			os dados podem ser acessados através do método get(index), podemos
			inserir valores em qualquer posição.
			
			LikedList, você precisa percorrer por cada um dos elementos da lista
			para acessar o valor. Adicionar um valor é mais simples.
			
		*/
	
		List<String> lista01 = new ArrayList<>();
		
		// Os métodos da list:
		
		// Adicionando valores
		lista01.add("Nicky");
		lista01.add("Renato");
		lista01.add("Fernando");
		
		for (String n : lista01) {
			System.out.println(n);
		}
		System.out.println("\n\n\n");
		
		
		// Adicionando valores em uma posição específica:
		lista01.add(1, "Gustavo");
		lista01.add(3, "Nicky");
		lista01.add(3, "Nicky");
		lista01.add(3, "Nicky");
		lista01.add(3, "Nicky");
		lista01.add(3, "Nicky");
		
		for (String n : lista01) {
			System.out.println(n);
		}
		System.out.println("\n\n\n");
		
		// Remover elementos da lista:
		lista01.remove(4);
	
		for (String n : lista01) {
			System.out.println(n);
		}
		System.out.println("\n\n\n");
		
		// Função Lambda
		// Remover através de predicado:
		// Remove da lista quem tem o nome começado com R
		lista01.removeIf(x -> x.charAt(0) == 'R');
		
		for (String n : lista01) {
			System.out.println(n);
		}
		System.out.println("\n\n\n");
		
		// Encontrar primeira posição do elemento:
		int posicao1 = lista01.indexOf("Fernando");
		
		// Encontrar última posição do elemento:
		int posicao2 = lista01.lastIndexOf("Nicky");
		
		// Filtrar a lista, só quem tem o nome com a primeira letra N
		/*
		  	Aqui nós criamos uma lista com nome "Result"
		  	nós convertemos a lista01 para o tipo Stream.
		  	depois nós fazemos a expressão lambda filtrando
		  	todos os elementos que começam com 'N', então nós
		  	convertemos de volta para o tipo lista usando o método collect, para
		  	enfim atribuirmos a lista "result"
		  	
		  	O tipo Stream foi adicionado no JAVA 8 para permitir que usassemos
		  	expressões LAMBDA com o tipo List, que é antigo.
		*/
		List<String> result = lista01.stream().filter(x -> x.charAt(0) == 'N').collect(Collectors.toList());
		for (String n : result) {
			System.out.println(n);
		}
		
		// Encontrar o primeiro nome com a letra F
		/*
			O método findFirst vai retornar o primeiro elemento que
			começa com "F" que for encontrado, a função orElse(null)
			serve para que, caso o elemento não seja encontrado,
			é retornado um valor nulo.
		*/
		String name = lista01.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
		
	}

}
