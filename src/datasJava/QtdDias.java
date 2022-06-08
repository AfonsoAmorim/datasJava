package datasJava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class QtdDias {

	public static void main(String[] args) {
		long dias = ChronoUnit.DAYS.between( LocalDate.now(),LocalDate.parse("2022-06-10"));
		
		for(int pos=0;pos<dias;pos++) {
			System.out.println("Faltam " + dias + " até o aniver" );
			System.out.println("Faltam " + pos  + " até o aniver" );
		}
		

	}

}
