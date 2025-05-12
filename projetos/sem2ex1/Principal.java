package sem2ex1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int contador = 0, numAtual, numNovo, pontuacao = 0;
		String resposta;
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		System.out.println("-------------------------------");
		System.out.println("Olá, nesse jogo o sistema gerará um numero aleatório entre 1 e 100");
		System.out.println("Você precisará adivinhar se o próximo número será menor ou maior que o atual digitando:");
		System.out.println("MENOR ou MAIOR");
		System.out.println("Para sair a qualquer momento digite SAIR");
		System.out.println("Vamos começar!");
		System.out.println("-------------------------------");

		do {
			numAtual = gerador.nextInt(1, 100);
			System.out.println("Numero atual: " + numAtual);
			System.out.println("O proximo número será maior ou menor?");
			numNovo = gerador.nextInt(1, 100);
			resposta = teclado.nextLine().toLowerCase();

			if (resposta.equals("maior") && numNovo > numAtual) {
				pontuacao++;
				System.out.println("Acertou. Pontuação: " + pontuacao);
				System.out.println("-------------------------------");
				contador++;
				numAtual = numNovo;
			} else if (resposta.equals("maior") && numNovo < numAtual) {
				System.out.println("Errou. Pontuação: " + pontuacao);
				System.out.println("-------------------------------");
				contador++;
				numAtual = numNovo;
			} else if (resposta.equals("menor") && numNovo < numAtual) {
				pontuacao++;
				System.out.println("Acertou. Pontuação: " + pontuacao);
				System.out.println("-------------------------------");
				contador++;
				numAtual = numNovo;
			} else if (resposta.equals("menor") && numNovo > numAtual) {
				System.out.println("Errou. Pontuação: " + pontuacao);
				System.out.println("-------------------------------");
				contador++;
				numAtual = numNovo;
			} else if (resposta.equals("sair")) {
				contador = 100;
				System.out.println("Você saiu do jogo com " + pontuacao + " ponto(s). Até a próxima!");
			} else {
				System.out.println("Resposta inválida, o novo número era " + numNovo);
				System.out.println("-------------------------------");
				contador++;
				numAtual = numNovo;
			}

		} while (contador < 100);

	}

}
