package datasJava;

import java.time.LocalDate;

public class TemposEmJava {

	public static void main(String[] args) {
		LocalDate datas = LocalDate.now();
		System.out.println("Data de Hoje: " + datas);
		
		System.out.println("Dia do mês: " + datas.getDayOfWeek().name());
		
	}
	
	
	
}
