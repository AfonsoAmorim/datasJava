package datasJava;

public class EscolherDia {

	public void diasSemana(String incluirDiaSemana) {
		System.out.println("O dia da semana �:");
		switch (incluirDiaSemana) {
		case "segunda":
			System.out.println("Segunda-feira, uma nova semana se inicia com �timas perspectivas.");
			break;
		case "terca":
			System.out.println("Ter�a-feira");
			System.out.println("N�o se negocia com a disciplina. -Rick Chester");
			break;
		case "quarta":
			System.out.println("Quarta-feira");
			System.out.println(
					"Saiba que s�o suas decis�es, e n�o suas condi��es, que determinam seu destino. -Tony Robbins");
			break;
		case "quinta":
			System.out.println("Quinta-feira");
			System.out.println("Vai ter muita gente dizendo que n�o vai dar certo. Acredite em voc�. -Fl�vio Augusto");
			break;
		case "sexta":
			System.out.println("Sexta-feira");
			System.out.println("Nada � f�cil. Tudo � poss�vel. Comece pequeno e sonhe grande. -Fl�vio Augusto");
			break;
		case "sabado":
			System.out.println("S�bado");
			System.out.println("� nos momentos de decis�o que o seu destino � tra�ado. -Tony Robbins");
			break;
		case "domingo":
			System.out.println("Domingo");
			System.out.println("O sucesso depende de voc�.");
			break;
		default:
			System.out.println("Inserir texto v�lido");

		}
	}

}
