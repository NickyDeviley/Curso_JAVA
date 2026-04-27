package Secao12;

// Enumeradores
public class Aula127 {

	public static void main(String[] args) {
		
		/*
			Na programação existe o conceito de enumeradores.
			Eles são utilizados para criar um tipo especial que
			serve para especificar de forma literal um conjunto
			de constantes relacionadas.
			
			De forma mais simplificada, nós podemos utilizar os
			enumeradores como uma forma de organizar o código,
			ao invés de utilizar números, nós podemos usar nomes
			constantes. Exemplo:
			
			Eu preciso criar um método para um jogo, ele identifica
			se uma bola colidiu com um quadrado azul, um quadrado vermelho
			ou não colidiu com nada. Ao invés de utilizar números, Strings
			ou char, nós criamos um enum com os tipos:
			
				VERMELHO;
				AZUL;
				NENHUM;
			
			E este método retorna um destes 3 valores dependendo do que
			ele identificar, isso torna o código mais legível, ao invés de
			ter que interpretar números, a pessoa apenas vê "Ah, retorna vermelho."
		*/
		
		// Criei uma variável do tipo enum.
		Aula127enum valor = Aula127enum.RETORNO;
		
		// Imprimindo essa variável:
		System.out.print(valor + " ");
		
		// Trocando o valor e imprimindo
		valor = Aula127enum.CLARO;
		System.out.print(valor + " ");

		// Trocando o valor e imprimindo
		valor = Aula127enum.DE;
		System.out.print(valor + " ");
		
		// Trocando o valor e imprimindo
		valor = Aula127enum.ENTENDER;
		System.out.print(valor + ".");
	
		/*
			Detalhe adicional:
			
				No JAVA os enumeradores possuem um método "toString",
				que transforma o nome da constante em string quando
				nós pedimos para imprimir.
				
				Por de baixo dos panos as constantes são tratadas como
				números inteiros, no java isso é descartado, mas pode
				ser visto em linguagens de nível mais baixo, como
				C ou C++.
		*/
		
	}
}
