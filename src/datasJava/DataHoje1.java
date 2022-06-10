package datasJava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoje1 {

	public static void main(String[] args) {
		// API LOCALDATE
		
		LocalDate dataHoje = LocalDate.now();
		
		System.out.println("Data atual: " + dataHoje);
	
		LocalDateTime horaAtual = LocalDateTime.now();
		
		System.out.println("Hora atual: " + horaAtual);
	
		LocalDate dataAtualEHorAtual = LocalDate.now();
		
		System.out.println("data e hora atuais: " + dataAtualEHorAtual);
		
	}
	
	
}
