package Secao14;

import java.util.InputMismatchException;
import java.util.Scanner;

// PILHA DE CHAMADAS DE MÉTODOS (Stack Trace)
public class Aula152 {

	// CRIANDO OBJETO SCANNER COMO GLOBAL
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * O stack trace trata-se de um "rastreamento do stack". Quando nós tratamos uma
		 * exceção dentro de um catch, nós podemos pedir para imprimir o "stacktrace",
		 * então todo o caminho até a exceção é imprimido.
		 * 
		 * Por exemplo: - Exceção X - Ocorreu no método 2 (na linha y) - que foi chamada
		 * pelo método 1 (na linha Z) - que foi chamado no método main (na linha A)
		 */

		method1();

		System.out.println("Fim do programa!");

		// DELETA O OBJETO SCANNER (boa prática)
		sc.close();

	}

	public static void method1() {
		System.out.println("***METHOD1 START***");

		method2();

		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Não pode digitar letras!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Algum erro ocorreu!");
			e.printStackTrace();
		}

		System.out.println("***METHOD2 END***");
	}

}
