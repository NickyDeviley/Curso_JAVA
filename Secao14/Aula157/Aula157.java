package Secao14.Aula157;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// CRIANDO UMA EXCEÇÃO PERSONALIZADA
public class Aula157 {
	public static void main(String[] args) /* throws ParseException */ {

		/*
		 	O "throws ParseException" significa que o código do método main
		 	pode gerar uma exceção, mas que ele não é necessariamente responsável 
		 	por tratar essa exceção. No caso, o que causa a exceção é o método parse()
		*/
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Room Number: ");
			int number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
				
			Reservation157 reservation = new Reservation157(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			
			System.out.println("Envie novas datas para atualizar as datas");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reserva: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Data inválida!" + e.getMessage());
		}
		catch (DomainException e) {
			
			// Na classe reservation nós declaramos uma condição
			// que pode "disparar" essa exceção, então, caso ela
			// ocorra, este bloco catch vai "capturar" e mostrará
			// ao usuário a mensagem que nós escrevemos.
			System.out.println("Erro na reserva! " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro Inesperado!");
		}
		
		sc.close();
	}
}
