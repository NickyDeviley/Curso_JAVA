package Secao10;

public class Aula104 {

	public static void main(String[] args) {
		
		/*
			O laço FOR EACH é um laço automático
			que é muito útil para percorrer arrays.
		*/
		
		int valor[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		// O laço percorre automáticamente pelos 10 valores
		// do array.
		for (int n : valor) {
			System.out.println(n);
		}

	}

}
