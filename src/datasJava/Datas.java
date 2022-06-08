package datasJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
	
		System.out.println("---------------------------------");
	
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDate.format(date)); // formato no BD
		SimpleDateFormat simpleDate2 = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println(simpleDate2.format(date)); 
		
		//Calendar 
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		
		
		
	
	
	}
	
	
}
