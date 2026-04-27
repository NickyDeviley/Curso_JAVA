package Secao09;

public class Aula83_88 {

	public static void main(String[] args) {
		
		/*
		  	Na POO existem alguns conceitos:
		  	
		  	Construtores: Trata-se de um método que permite ou
		  	obriga que certo objeto receba valores em sua instanciação.
		  	 
		  	This: A palavra "this" funciona como um ponteiro para
		  	o próprio objeto criado, nós utiliamos dentro da classe
		  	para se referir aos atributos daquela instancia.
		  	
		  	Sobrecarga: Podemos criar uma sobrecarga de métodos, ou seja,
		  	criar vários métodos com o mesmo nome, desde que eles possuem
		  	parâmetros diferentes. (Isso se aplica aos construtores)
		  	
		  	Encapsulamento: Nós utilizamos as palavras "Public", "private" e
		  	"protected" para "esconder" os dados de um certo objeto, assim
		  	se eles forem publicos, podem ser acessados fora da classe. Se for
		  	privados precisam ser indiretamente acessados através de métodos,
		  	e protected serve para herança
		*/
		
		Objeto obj = new Objeto();				// CONSTRUTOR PADRÃO
		Objeto obj1 = new Objeto(10, 20, 30);	// SOBRECARGA
		
		// Para acessar os membros encapsulados:
		obj.val1 = 10;		// public
		obj.setVal2(20);	// private
		obj.setVal3(30);	// protected

	}

}
