package switchCase;

import java.util.Scanner;

public class Signos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia, mes;

		System.out.println("Escreva o numero do dia do mês (1 a 31)");
		dia = ler.nextInt();
		System.out.println("Escreva o numero do mês");
		mes = ler.nextInt();
		ler.close();
		switch (mes) {
		case 1:
			System.out.println(dia <= 19 ? "O signo correspondente é Capricórnio" : "O signo correspondente é Aquário");
			break;
		case 2:
			System.out.println(dia <= 18 ? "O signo correspondente é Aquário" : "O signo correspondente é Peixes");
			break;
		case 3:
			System.out.println(dia <= 20 ? "O signo correspondente é Peixes" : "O signo correspondente é Áries");
			break;
		case 4:
			System.out.println(dia <= 19 ? "O signo correspondente é Áries" : "O signo correspondente é Touro");
			break;
		case 5:
			System.out.println(dia <= 21 ? "O signo correspondente é Touro" : "O signo correspondente é Gêmeos");
			break;
		case 6:
			System.out.println(dia <= 20 ? "O signo correspondente é Gêmeos" : "O signo correspondente é Câncer");
			break;
		case 7:
			System.out.println(dia <= 22 ? "O signo correspondente é Câncer" : "O signo correspondente é Leão");
			break;
		case 8:
			System.out.println(dia <= 22 ? "O signo correspondente é Leão" : "O signo correspondente é Virgem");
			break;
		case 9:
			System.out.println(dia <= 22 ? "O signo correspondente é Virgem" : "O signo correspondente é Libra");
			break;
		case 10:
			System.out.println(dia <= 22 ? "O signo correspondente é Libra" : "O signo correspondente é Escorpião");
			break;
		case 11:
			System.out.println(dia <= 21 ? "O signo correspondente é Escorpião" : "O signo correspondente é Sargitário");
			break;
		case 12:
			System.out.println(dia <= 21 ? "O signo correspondente é Sargitário" : "O signo correspondente é Capricórnio");
			break;
		default:
			System.out.println("O mês é inválido");
		}

	}
}
