package datasJava;

import javax.swing.JOptionPane;

public class EscolherDia {

	public void diasSemana(String incluirDiaSemana) {
		System.out.println("O dia da semana �:");
		switch (incluirDiaSemana) {
		case "segunda":
			System.out.println("Segunda-feira");
			break;
		case "terca":
			System.out.println("Ter�a-feira");
			break;
		case "quarta":
			System.out.println("Quarta-feira");
			break;
		case "quinta":
			System.out.println("Quinta-feira");
			break;
		case "sexta":
			System.out.println("Sexta-feira");
			break;
		case "sabado":
			System.out.println("S�bado");
			break;
		case "domingo":
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Inserir texto v�lido");

		}
	}

}
