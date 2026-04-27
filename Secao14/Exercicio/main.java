package Secao14.Exercicio;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os detalhes da conta: ");
		
		int numero = 0;
		String nome = "";
		double saldo = 0.0f;
		double limiteSaque = 0.0f;
		double saque = 0.0f;
		
		try {
			
			System.out.println(); // Pulando linha
			

			System.out.println("\n" + "Qual o número da conta: ");
			numero = sc.nextInt();

			System.out.print("\n" + "Qual o nome do dono da conta: ");
			sc.nextLine();	// Limpando a última entrada
			nome = sc.nextLine();
			
			System.out.print("\n" + "Saldo Inicial: ");
			saldo = sc.nextDouble();
			
			System.out.print("\n" + "Limite de saque: ");
			limiteSaque = sc.nextDouble();
			
			// Criando a conta
			Conta conta1 = new Conta(numero, nome, saldo, limiteSaque);
			
			// Realizando o saque
			System.out.print("\n" + "Quanto deseja sacar: ");
			saque = sc.nextDouble();
			
			conta1.withdraw(saque);
			
			
		}
		catch (OutOfLimitsException e) {
			System.out.println("Erro!" + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();
	}
}
