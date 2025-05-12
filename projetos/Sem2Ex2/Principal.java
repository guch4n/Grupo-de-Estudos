package Sem2Ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Principal {
	

	public static void main(String[] args) {

		int dificuldade, numSecreto, tentativas = 10, numDigitado, numAtual, pontuacao = 0, rodadas = 0, jogarNovamente;
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();

		try {

			do {

				do {
					System.out.println("Selecione o nivel da dificuldade:");
					System.out.println("1 - Facil (0 a 50)");
					System.out.println("2 - Medio (0 a 250)");
					System.out.println("3 - Dificil (0 a 500)");
					dificuldade = teclado.nextInt();
				} while (dificuldade < 1 || dificuldade > 3);

				switch (dificuldade) {
				
				case 1:
					numSecreto = gerador.nextInt(0, 50);
					do {
						System.out.println("Digite um numero:");
						numDigitado = teclado.nextInt();
						lista.add(numDigitado);

						System.out.println("Tentativas restantes:" + tentativas);
						System.out.println("Seu chute:" + numDigitado);
						System.out.print("Numeros chutados:[");
						for (Integer s : lista) {
							System.out.print(s + ",");
						}
						System.out.println("]");
						if (numDigitado < numSecreto) {
							if (tentativas > 0) {
								System.out.println("O numero secreto é maior!");
								tentativas--;
							} else {
								System.out.println("Suas tentativas acabaram! O número secreto era " + numSecreto);
								tentativas--;
							}

						} else if (numDigitado > numSecreto) {
							if (tentativas > 0) {
								System.out.println("O numero secreto é menor!");
								tentativas--;
							} else {
								System.out.println("Suas tentativas acabaram! O número secreto era " + numSecreto);
								tentativas--;
							}

						} else {
							System.out.println("Você acertou! O número secreto era " + numSecreto);
							pontuacao++;
							tentativas = -1;
						}

					} while (tentativas != -1);
					rodadas++;
					tentativas = 10;
					break;

				case 2:

					numSecreto = gerador.nextInt(0, 250);
					do {
						System.out.println("Digite um numero:");
						numDigitado = teclado.nextInt();
						lista.add(numDigitado);

						System.out.println("Tentativas restantes:" + tentativas);
						System.out.println("Seu chute:" + numDigitado);
						System.out.print("Numeros chutados:[");
						for (Integer s : lista) {
							System.out.print(s + ",");
						}
						System.out.println("]");
						if (numDigitado < numSecreto) {
							if (tentativas > 0) {
								System.out.println("O numero secreto é maior!");
								tentativas--;
							} else {
								System.out.println("Suas tentativas acabaram! O número secreto era " + numSecreto);
								tentativas--;
							}

						} else if (numDigitado > numSecreto) {
							if (tentativas > 0) {
								System.out.println("O numero secreto é menor!");
								tentativas--;
							} else {
								System.out.println("Suas tentativas acabaram! O número secreto era " + numSecreto);
								tentativas--;
							}

						} else {
							System.out.println("Você acertou! O número secreto era " + numSecreto);
							pontuacao++;
							tentativas = -1;
						}

					} while (tentativas != -1);
					rodadas++;
					tentativas = 10;
					break;

				case 3:

					numSecreto = gerador.nextInt(0, 500);
					do {
						System.out.println("Digite um numero:");
						numDigitado = teclado.nextInt();
						lista.add(numDigitado);

						System.out.println("Tentativas restantes:" + tentativas);
						System.out.println("Seu chute:" + numDigitado);
						System.out.print("Numeros chutados:[");
						for (Integer s : lista) {
							System.out.print(s + ",");
						}
						System.out.println("]");
						if (numDigitado < numSecreto) {
							if (tentativas > 0) {
								System.out.println("O numero secreto é maior!");
								tentativas--;
							} else {
								System.out.println("Suas tentativas acabaram! O número secreto era " + numSecreto);
								tentativas--;
							}

						} else if (numDigitado > numSecreto) {
							if (tentativas > 0) {
								System.out.println("O numero secreto é menor!");
								tentativas--;
							} else {
								System.out.println("Suas tentativas acabaram! O número secreto era " + numSecreto);
								tentativas--;
							}

						} else {
							System.out.println("Você acertou! O número secreto era " + numSecreto);
							pontuacao++;
							tentativas = -1;
						}

					} while (tentativas != -1);
					rodadas++;
					tentativas = 10;
					break;

				}

				jogarNovamente = 0;
				lista.clear();

				do {
					System.out.println("Deseja jogar novamente? ");
					System.out.println("1 - sim");
					System.out.println("2 - sair");
					jogarNovamente = teclado.nextInt();
				} while (jogarNovamente < 1 || jogarNovamente > 2);
			} while (jogarNovamente == 1);

			System.out.println("Você jogou " + rodadas + " rodada(s) e acertou " + pontuacao + " vez(es). Até logo!");

		} catch (InputMismatchException e) {
			System.out.println("Erro: você digitou um caracter não autorizado");
		}

	}

}
