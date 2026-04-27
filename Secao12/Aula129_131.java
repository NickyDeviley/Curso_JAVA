package Secao12;

// COMPOSIÇÃO
public class Aula129_131 {

	public static void main(String[] args) {
		
		/*
			Quando trabalhamos com o paradigma de POO,
			nós trabalhamos com classes e objetos. Quando
			temos que criar um objeto que pertença a outros
			objetos nós estamos criando uma composição.
			
			Exemplo:	
				Quando um cliente faz um pedido, este pedido
				é composto por vários itens. Cada item é composto
				por uma quantidade X de produtos.
		*/
		
		// Exemplo prático:
		
		Objeto1 obj = new Objeto1();
		
		System.out.println("Valor dentro do objeto2 instanciado dentro do objeto1: " + obj.obj.quantidade);
	
		/*
			O instrutor utilizou um exemplo mais complexo,
			onde ele cria um trabalhador que possuí um contrato,
			com várias informações dentro.
		*/
		
	}

}
