package Secao14.Aula156;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// CRIANDO UMA EXCEÇÃO PERSONALIZADA
public class Aula156 {
	public static void main(String[] args) throws ParseException {

		/*
		 	O "throws ParseException" significa que o código do método main
		 	pode gerar uma exceção, mas que ele não é necessariamente responsável 
		 	por tratar essa exceção. No caso, o que causa a exceção é o método parse()
		*/
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room Number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		// ESSA VALIDAÇÃO DEVERIA ESTAR NO CONSTRUTOR
		// DA CLASSE RESERVATION
		if (!checkOut.after(checkIn)) {
			
			System.out.println("Erro na reserva:  a data de check-out deve ser após a data de check-in");
			
		}
		else {
			
			Reservation156 reservation = new Reservation156(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			
			System.out.println("Envie novas datas para atualizar as datas");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error na reserva: " + error);
			}
			else {
				System.out.println("Reserva: " + reservation);
			}
			

		}
		sc.close();
	}
}
