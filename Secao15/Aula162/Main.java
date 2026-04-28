package Secao15.Aula162;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	/**
		Testando a classe FILE
	*/
	public static void main(String[] args) {
		
		// Criando um objeto file que armazena o arquivo
		// Caminho do arquivo meramente ilustrativo
		File file = new File("c:\\temp\\in.txt");
		
		Scanner sc = null;
		
		try {
			
			// Ao invés de receber a entrada do usuário,
			// o sc recebe o arquivo como entrada
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
