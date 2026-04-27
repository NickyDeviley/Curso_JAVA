package Secao10;

public class Aula103 {

	public static void main(String[] args) {
		
		/*
		 	Quando nós mexemos com Objetos e Variáveis primitivas
		 	existe o conceito de Boxing e Unboxing.

			Quando nós armazenamos uma variável tipo valor em um
			tipo referência, isso se chama Boxing.
			
			Quando nós armazenamos uma variavel tipo referência em
			um tipo valor, isso é Unboxing.
			
			Também existem as classes Wrapper, é uma forma de declarar
			variáveis como tipos referência ao invés de tipo valor.
		*/
		
		// BOXING
		int x = 20;				// Tipo Valor inteiro
		Integer valorX = x;		// Classe Wrapper
		
		// UNBOXING
		int z = (int) valorX;	// Tipo valor inteiro recebendo valor da classe Wrapper.
		
		
		// As classes Wrapper são referentes aos tipos primitivos:
		
		Short valorCurto = 100;
		Integer valorInteiro = 1000;
		Long valorLongo = 10000L;
		
		Float valorFlutuante = 100.10f;
		Double valorDobro = 1000.150;
		
		Character valorLetra = 'A';
		
		// No JAVA a variável String já funciona exatamente como uma classe Wrapper,
		// mas é tratado como uma variável primitiva.

	}

}
