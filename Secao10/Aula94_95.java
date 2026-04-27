package Secao10;

public class Aula94_95 {

	public static void main(String[] args) {
		
		/*
		  	Tipos Referência e Tipos Valor.
		  
		  	Na programação com linguagens de mais baixo nível
		  	é necessário conhecer os dois tipos de memória.
		  	Stack e heap.
		  	
		  	A memória STACK funciona como um armazenamento
		  	temporário e volátil, que está constantemente
		  	sendo reescrito.
		  	
		  	A memória HEAP funciona como um armazenamento
		  	mais concreto.
		*/
		
		// No java, quando declaramos uma variável, ela é
		// criada dentro da memória Stack. Ela existirá
		// até que seu escopo (Corpo do método ou classe)
		// termine de executar. As variáveis são os TIPOS VALOR.

		short a = 10;
		int b = 100;
		long c = 100;
		
		float d = 10.1f;
		double f = 100.2;
		
		char letraA = 'A';
		
		// --------------------
		
		// Já os objetos, intâncias ou variáveis compostas
		// são declarados através do operador NEW, isso
		// significa que elas são declaradas como PONTEIROS
		// para variáveis DENTRO da memória HEAP. Essas são as variáveis TIPO REFERÊNCIA.
		
		Objeto obj = new Objeto();
		
		
		/*
		 	Na linguagem JAVA não utilizamos ponteiros assim como
		 	em C ou C++, pois a memória é parcialmente gerenciada
		 	pela Virtual Machine, mas os PONTEIROS são muito simples.
		 	
		 	Quando nós criamos um ou mais objetos desta forma:
		 	
		 		Objeto obj; 
		 		Objeto obj = null;
		 	
		 	nós estamos, na verdade, criando PONTEIROS e não objetos,
		 	o objeto só é criado no momento que chamamos o Operador New:
		 	
		 		Objeto obj = new Objeto();
		 	
		 	Agora sim, o objeto foi declarado dentro da memória HEAP, agora
		 	nós utilizamos o ponteiro "obj" para acessar as variáveis declaradas
		 	dentro da memória HEAP.
		 	
		 		obj.val1 = 10;
		 		
		 	Ao contrário de C e C++ o JAVA gerencia a memória automáticamente,
		 	não é necessário anular o objeto para que ele seja deletado da memória,
		 	a Virtual Machine se encarrega disso sozinha.
		*/
	}

}
