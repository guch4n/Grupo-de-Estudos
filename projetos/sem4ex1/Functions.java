package sem4ex1;

import java.util.Random;
import java.util.Scanner;

public class Functions extends Collections{
	

	
	boolean verificadorVitoria = false;
	Random gerador = new Random();
	Scanner userInput = new Scanner(System.in);
	int posicaoArray;
	int tentativas = palavraSecreta[posicaoArray].length() + 1;
	char escolha = 0;

	
	
	public void randomizadoreConversorPalavraSecreta() {
		
			posicaoArray = gerador.nextInt(0, 4);
		
			for (int i = 0; i < palavraSecreta[posicaoArray].length(); i++) {
			char caractere = palavraSecreta[posicaoArray].charAt(i);
			ListaCharacter.add(caractere);
			Mapeamento.add('_');
		}
	}
	
	
	public void setarLetra() {
		for (int i = 0; i < ListaCharacter.size(); i++) {
			if (ListaCharacter.get(i) == escolha) {
				Mapeamento.set(i, escolha);
			}
		}
		
	}
	
	
	public void verificarVitoria() {
		
		if(tentativas == 0) {
			System.out.println("Você PERDEU!");
			System.out.println("Não foi dessa vez, a palavra correta era: " + palavraSecreta[posicaoArray].toUpperCase());
			System.out.println("Mas não desanime, tente novamente.");
			
		}else {
			System.out.println("Você GANHOU");
			System.out.println("A palavra correta " + palavraSecreta[posicaoArray].toUpperCase());
			System.out.println("Tente novamente para ver quantas palavras você consegue acertar!");
		}
		
		userInput.close();
		
	}
	
	

}
