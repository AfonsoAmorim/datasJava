package datasJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasCalendar {

	public static void main(String[] args) throws ParseException {
	
		Calendar calendario = Calendar.getInstance();//pega data atual
		
		calendario.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("06-06-2022"));
		
		calendario.add(Calendar.DAY_OF_MONTH, +250);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
	}
	
	
}
