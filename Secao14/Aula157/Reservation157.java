package Secao14.Aula157;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//Criando a classe reservation
public class Reservation157 {
	/**
	  	Classe criada para testar os 3 jeitos de tratamento de exceção.
	*/
	
		
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
		
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	public Reservation157(int roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)) {
			
			// Usando minha exceção personalizada
			throw new DomainException("Erro de reserva: a data de check-out precisa ser após a data de check-in");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
			
	}
		
	public long duration() {
			
		// Diferença entre duas datas calculada em milissegundos
		// O método getTime() retorna o tampo em milissegundos
		long diff = checkOut.getTime() - checkIn.getTime();
			
		// Convertendo a diferença em milissegundos para dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
		
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		// SOLUÇÃO boa
		// Fazemos tratamento de exceção
		// e até criamos uma exceção personalizada
		// "Solução Boa"
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			// Aqui eu estou criando uma nova exception do tipo
			// argumento ilegal. Isso significa que, se o usuário
			// ativar este IF com uma data inválida
			// Vai ocorrer uma exceção do tipo "IllegalArgumentException"	
			//throw new IllegalArgumentException("Erro de reserva: As novas datas precisam ser posteriores a data atual");
			
			// Usando minha exceção personalizada
			throw new DomainException("Erro de reserva: As novas datas precisam ser posteriores a data atual");
		}
		else if (!checkOut.after(checkIn)) {
			
			// Usando minha exceção personalizada
			throw new DomainException("Erro de reserva: a data de check-out precisa ser após a data de check-in");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
		
	@Override
	public String toString() {
		
		return "Room"
			 + roomNumber
			 + ", check-in: "
			 + sdf.format(checkIn)
			 + ", check-out"
			 + sdf.format(checkOut)
			 + ", "
			 + duration()
			 + " nights";
	}
		
	// Getters & Setters
	public Integer getRoomNumber() { return roomNumber; }
	public void setRoomNumber(Integer roomNumber) { this.roomNumber = roomNumber; }
	public Date getCheckIn() { return checkIn; }
	public Date getCheckOut() { return checkOut; }
			
}