package switchCase;

import java.util.Scanner;

public class Estacoes {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String nome;
		int mes;

		System.out.println("Qual é o seu nome?");
		nome = ler.next();
		System.out.println("Digite um mês (deve ser um número. ex: janeiro = 1)");
		mes = ler.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Olá, " + nome + ". Janeiro pertence ao verão");
			break;
		case 2:
			System.out.println("Olá, " + nome + ". Fevereiro pertence ao verão");
			break;
		case 3:
			System.out.println("Olá, " + nome + ". Março pertence ao outono.");
			break;
		case 4:
			System.out.println("Olá, " + nome + ". Abril pertence ao outono.");
			break;
		case 5:
			System.out.println("Olá, " + nome + ". Maio pertence ao outono.");
			break;
		case 6:
			System.out.println("Olá, " + nome + ". Junho pertence ao inverno.");
			break;
		case 7:
			System.out.println("Olá, " + nome + ". Julho pertence ao inverno.");
			break;
		case 8:
			System.out.println("Olá, " + nome + ". Agosto pertence ao inverno.");
			break;
		case 9:
			System.out.println("Olá, " + nome + ". Setembro pertence à primavera.");
			break;
		case 10:
			System.out.println("Olá, " + nome + ". Outubro pertence à primavera.");
			break;
		case 11:
			System.out.println("Olá, " + nome + ". Novembro pertence à primavera.");
			break;
		case 12:
			System.out.println("Olá, " + nome + ". Dezembro pertence ao verão.");
			break;
		default:
			System.out.println("Informe um mês válido");

		}
		ler.close();
	}
}
