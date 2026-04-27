package Secao14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// BLOCO FINNALY
public class Aula153 {
	public static void main(String[] args) {

		/*
		 * Além do bloco "try" e do "catch", no tratamento de exceções nós temos o bloco
		 * "finally" que é um bloco que o código dentro dele, obrigatóriamente precisa
		 * ser executado ao finalizar o código que pode causar um problema.
		 * 
		 * É importante ressaltar que o código é executado TENDO OU NÃO uma exceção.
		 */

		File file = new File("\\ArquivoAula153.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
