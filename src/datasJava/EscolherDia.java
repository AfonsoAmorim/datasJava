package datasJava;

public class EscolherDia {

	public void diasSemana(String incluirDiaSemana) {
		System.out.println("O dia da semana é:");
		switch (incluirDiaSemana) {
		case "segunda":
			System.out.println("Segunda-feira, uma nova semana se inicia com ótimas perspectivas.");
			break;
		case "terca":
			System.out.println("Terça-feira");
			System.out.println("Não se negocia com a disciplina. -Rick Chester");
			break;
		case "quarta":
			System.out.println("Quarta-feira");
			System.out.println(
					"Saiba que são suas decisões, e não suas condições, que determinam seu destino. -Tony Robbins");
			break;
		case "quinta":
			System.out.println("Quinta-feira");
			System.out.println("Vai ter muita gente dizendo que não vai dar certo. Acredite em você. -Flávio Augusto");
			break;
		case "sexta":
			System.out.println("Sexta-feira");
			System.out.println("Nada é fácil. Tudo é possível. Comece pequeno e sonhe grande. -Flávio Augusto");
			break;
		case "sabado":
			System.out.println("Sábado");
			System.out.println("É nos momentos de decisão que o seu destino é traçado. -Tony Robbins");
			break;
		case "domingo":
			System.out.println("Domingo");
			System.out.println("O sucesso depende de você.");
			break;
		default:
			System.out.println("Inserir texto válido");

		}
	}

}
