package sem3ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double firstNumber = 0, secondNumber = 0, result = 0;
		Scanner scanner = new Scanner(System.in);
		String[] allowedOperation = { "+", "-", "*", "/" };
		String resposta;

		System.out.println("== CALCULADORA BÁSICA ==");
		System.out.print("""
				Digite uma operação!
				adição          +
				subtração       -
				multiplicação   *
				divisão         /
				>>>\s""");

		String operation = scanner.nextLine();

		if (!operation.contentEquals(allowedOperation[0]) && !operation.contentEquals(allowedOperation[1])
				&& !operation.contentEquals(allowedOperation[2]) && !operation.contentEquals(allowedOperation[3])) {
			System.out.println("Operação inválida, reinicie o programa");
			return;
		}

		try {
			System.out.print("Digite o primeiro número: ");
			firstNumber = scanner.nextDouble();
			scanner.nextLine();

			System.out.print("Digite o segundo número: ");
			secondNumber = scanner.nextDouble();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Caracter inválido, reinicie o programa.");
			System.exit(0);
		}

		switch (operation) {
		case "+":
			result = firstNumber + secondNumber;
			break;

		case "-":
			result = firstNumber - secondNumber;
			break;

		case "*":
			result = firstNumber * secondNumber;
			break;

		case "/":
			if (secondNumber == 0) {
				System.out.println("Erro: divisão por zero não é permitida. Encerrando");
				System.exit(0);
			} else {
				result = firstNumber / secondNumber;
			}
			break;

		}

		System.out.println("Resultado: " + firstNumber + " " + operation + " " + secondNumber + " = " + result);
		System.out.print("Deseja fazer outra operação? (sim/nao) ");

		do {
			resposta = scanner.nextLine().toLowerCase();
	
				if (resposta.equals("sim")) {
					Main restartProgram = new Main();
					restartProgram.main(args);
					
				} else if(resposta.equals("nao") || resposta.equals("não")){
					System.out.println("O programa será encerrado");
					System.exit(0);
					
				} else {
					System.out.println("Opção invalida, escolha novamente: ");
				}

		} while (!resposta.equals("sim") || !resposta.equals("nao") || !resposta.equals("não"));

	}
}
