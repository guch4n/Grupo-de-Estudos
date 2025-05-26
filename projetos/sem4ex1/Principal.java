package sem4ex1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] palavraSecreta = {"fusca", "cachorro", "joao", "abacaxi", "brasil"};
		ArrayList<Character> ListaCharacter = new ArrayList<Character>();
		ArrayList<Character> ComparadorCaracteres = new ArrayList<Character>();
		Scanner userInput = new Scanner(System.in);
		Random gerador = new Random();
		
		
		int posicaoArray = gerador.nextInt(0, 4);
        
		for (int i = 0; i < palavraSecreta[posicaoArray].length(); i++) {
			char caractere = palavraSecreta[posicaoArray].charAt(i);
			ListaCharacter.add(caractere);	
		}
		
		
		int tentativas = palavraSecreta[posicaoArray].length() + 1;
		char escolha = 0;
		
		do {
			System.out.print("Palavra: ");
			for (int i = 0; i < ListaCharacter.size(); i++) {
				if (ListaCharacter.contains(escolha)) {
					ComparadorCaracteres.forEach(letras -> System.out.print(letras + " "));
					
				}else {
					System.out.print("_ ");
				}
				
			}
			System.out.println("Tentativas restantes: " + tentativas);
				
			System.out.print("Digite uma letra: ");
			escolha = userInput.next().charAt(0);
			if (ListaCharacter.contains(escolha) && ComparadorCaracteres.contains(escolha)){
				System.out.println("Essa letra já foi utilizada, tente novamente");
			}
			else if(ListaCharacter.contains(escolha)){
				System.out.println("Letra correta!");
				ComparadorCaracteres.add(escolha);
			}else {
				System.out.println("Letra incorreta!");
			}
			
			tentativas--;		
			
		}while(tentativas > 0);
		
		
		if(tentativas == 0) {
			System.out.println("Você PERDEU!");
			System.out.println("Não foi dessa vez, a palavra era correta era: " + palavraSecreta[posicaoArray].toUpperCase());
			System.out.println("Mas não desanime, tente novamente.");
		}else {
			System.out.println("Você GANHOU");
			System.out.println("A palavra correta " + palavraSecreta[posicaoArray].toUpperCase());
			System.out.println("Tente novamente para ver quantas palavras você consegue acertar!");
		}
	
		
		userInput.close();
	}
}
