package Secao14.Aula154_155;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// CRIANDO UMA EXCEÇÃO PERSONALIZADA
public class Aula154_155 {
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
		
		if (!checkOut.after(checkIn)) {
			
			System.out.println("Erro na reserva:  a data de check-out deve ser após a data de check-in");
			
		}
		else {
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			
			System.out.println("Envie novas datas para atualizar as datas");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			// SOLUÇÃO MUITO RUIM
			// Esta lógica de atualização de dados deveria estar
			// Dentro da classe Reservation. Por isso ela é a 
			// "Solução muito ruim"
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro de reserva: As novas datas precisam ser posteriores a data atual");
			}
			else if (!checkOut.after(checkIn)) {
				System.out.println("Erro de reserva: a data de check-out precisa ser após a data de check-in");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);	
			}

		}
		sc.close();
	}
}
