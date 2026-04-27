package Secao14;

import java.util.InputMismatchException;
import java.util.Scanner;

// TRY - CATCH
public class Aula151 {
	public static void main(String[] args) {

		/*
		 * A estrutura Try-Catch é a base para o tratamento de exceções do java.
		 * 
		 * O bloco Try, contém o código que representa a execução normal do treco de
		 * código que PODE acarretar em uma exceção.
		 * 
		 * O bloco Catch, contém o código a ser executado caso uma exceção ocorra. -
		 * Deve ser especificado o tipo de exceção a ser tratada
		 */

		// CRIANDO UM SCANNER PARA ENTRADA DE DADOS
		Scanner sc = new Scanner(System.in);

		// CRIANDO UM VETOR QUE RECEBE PALAVRAS SEPARADAS POR UM ESPAÇO
		// O MÉTODO "split" DIZ QUE CADA PALAVRA DIGITADA SEPARADA
		// POR UM ESPAÇO É UMA NOVA POSIÇÃO NO ARRAY.

		// String[] vect = sc.nextLine().split(" ");
		// int position = sc.nextInt();
		// System.out.println(vect[position]);

		/*
		 * Esse código acima pode causar vários tipos de exceção dependendo da escrita.
		 * Se, na hora de entrar a posição, digitarmos uma letra, ocorre
		 * "InputMismatchExceptionn", se digitarmos um número maior que o tamanho do
		 * array, ou menor "ArrayIndexOutOfBoundsException"
		 */

		// CÓDIGO TRATADO DA MANEIRA CORRETA:
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		} catch (InputMismatchException e) {
			System.out.println("Não pode digitar letras!");
		} catch (Exception e) {
			System.out.println("Algum erro ocorreu!");
		}

		/*
		 * O bloco "try" tenta executar o código, caso alguma exceção ocorra dentro
		 * dele, ele "joga" a exceção para o bloco "catch", caso essa exceção seja igual
		 * a declarada como parâmetro, o bloco catch executa o código dentro dele e o
		 * programa continua rodando normalmente.
		 * 
		 * Perceba que cada bloco catch trata uma exceção, para prevenir também é
		 * possivel utilizar UPCASTING no tratamento de exceções, como é possível
		 * observar que eu estou tratando apenas uma "Exception". Isso significa que, se
		 * ocorrer um erro, mas não for nenhum dos especificados acima, o último catch,
		 * vai detectar a exceção, pois ele é genérico.
		 */

		// DELETA O OBJETO SCANNER (boa prática)
		sc.close();
	}

}
