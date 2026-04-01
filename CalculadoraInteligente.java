package switchCase;

import java.util.Scanner;

public class CalculadoraInteligente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double num1, num2;
		String operacao;

		
		System.out.println("Escreva o primeiro valor: ");
		num1 = ler.nextDouble();
		System.out.println("Escreva o segundo valor: ");
		num2 = ler.nextDouble();
		System.out.println("Escreva a operação que deseja fazer (escreva com a primeira letra maiúscula): ");
		operacao = ler.next();
		ler.close();
		
		switch (operacao) {
		case "Adição":
			System.out.println("O resultado é: "+(num1+num2));
			break;
			
		case "Subtração":
			System.out.println("O resultado é: "+(num1-num2));
			break;
				
		case "Multiplicação":
			System.out.println("O resultado é: "+(num1*num2));
			break;
		case "Divisão":
			System.out.println("O resultado é: "+(num1/num2));
		
		default:
			System.out.println("Informe uma operação válida");
		}
	}
}
