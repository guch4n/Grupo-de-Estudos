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
	
	
	public void interfaceJogo() {
		
		randomizadoreConversorPalavraSecreta();
		
		do {
			System.out.println("Palavra: " + Mapeamento);
			
			System.out.println("Tentativas restantes: " + tentativas);
			System.out.print("Digite uma letra: ");

			
			escolha = userInput.next().toLowerCase().charAt(0);

			
			if(Mapeamento.contains(escolha) && ListaCharacter.contains(escolha)){
				System.out.println("Essa letra já foi utilizada, tente novamente");
				
			}else if(ListaCharacter.contains(escolha)){
				System.out.println("Letra correta!");
				
			}else {
				System.out.println("Letra incorreta!");
				tentativas--;
			}
				
			setarLetra();
			
			if(ListaCharacter.containsAll(Mapeamento)){
				verificadorVitoria = true;
				break;
			}
				
		}while(tentativas > 0 || verificadorVitoria == true);
		
		verificarVitoria();
	}
	
	
	private void randomizadoreConversorPalavraSecreta() {
		
			posicaoArray = gerador.nextInt(0, 4);
		
			for (int i = 0; i < palavraSecreta[posicaoArray].length(); i++) {
			char caractere = palavraSecreta[posicaoArray].charAt(i);
			ListaCharacter.add(caractere);
			Mapeamento.add('_');
		}
	}
	
	
	private void setarLetra() {
		for (int i = 0; i < ListaCharacter.size(); i++) {
			if (ListaCharacter.get(i) == escolha) {
				Mapeamento.set(i, escolha);
			}
		}
		
	}
	
	
	private void verificarVitoria() {
		
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
