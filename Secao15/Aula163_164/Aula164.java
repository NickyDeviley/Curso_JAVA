package Secao15.Aula163_164;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula164 {
	/**
	 	Try with resources
	*/
	
	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		//FileReader fr = null;
		//BufferedReader br = null;
		
		/*
			Nós transformamos o Try em uma função,
			e podemos passar parâmetros para que ele
			possa fechar automaticamente no final da
			sua execução.
			
			Isso serve para substituir o bloco finally
			no fechamento de objetos
		*/
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			//fr = new FileReader(path);
			//br = new BufferedReader(fr);
		
			String line = br.readLine();
			while (line != null) {
				
				System.out.println(line);
				line = br.readLine();
				
			}
		}
		catch (IOException e) {
			System.out.println("Erro!" + e.getMessage());
		}
	}
}
