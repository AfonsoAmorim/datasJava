package datasJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasJava {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleData = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoDoBoleto = simpleData.parse("07/05/2022");
		
		
		
		Date hoje = simpleData.parse("06/06/2022");
		
		if(dataVencimentoDoBoleto.after(hoje)) {
			System.out.println("Boleto em dia");
		}else {
			System.out.println("Boleto vencido");
		}
		
		if(dataVencimentoDoBoleto.before(hoje)) {
			System.out.println("Boleto em dia");
		}else {
			System.out.println("Boleto vencido");
		}
		
		
	}
	
	
}
