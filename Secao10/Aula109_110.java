package Secao10;

// Matrizes
public class Aula109_110 {

	public static void main(String[] args) {
		/*
			Nós já aprendemos sobre os Arrays, eles são
			estruturas de código sequencial que armazenam
			variáveis e objetos de um mesmo tipo.
			
			Agora somos apresentados as Matrizes. Estruturas
			de código sequencial que armazenam variáveis e
			objetos de um mesmo tipo. Porém, a matriz funciona
			utilizando linhas e colunas.
			
			Exemplo visual:
			
			Array:
			
			Index:    0   1   2   3   4
					| 1 - 2 - 3 - 4 - 5 |
			
			Matriz:
			
			index:	  0   1   2
				  0	| 1 - 2 - 3 |
				  1 | 4 - 5 - 6 |
				  2	| 7 - 8 - 9 |
		*/
		
		// Declarando uma matriz
		int[][] matriz = new int[3][3];
		
		// Podemos entrar com valores de várias maneiras:
		
			// Durante a instanciação:
			int[][] matriz2 = {{1, 2, 3},
							   {4, 5, 6},
							   {7, 8, 9}};
			
			// Com dois laços FOR:
			int a = 1;
			
			for (int i = 0; i < 3; i++) {
				
				for (int j = 0; j < 3; j++) {
					
					matriz[i][j] = a;
					a++;
				}
			}
			
			// Manualmente:
			int[][] matriz3 = new int[2][2];	// Matriz 2x2
			
			// Nós declaramos manualmente qual valor fica em cada
			// espaço da matriz.
			matriz3[0][0] = 1;	matriz3[0][1] = 2;
			matriz3[1][0] = 3;	matriz3[1][1] = 4;
		
		
	}

}
