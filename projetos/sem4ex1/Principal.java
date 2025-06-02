package sem4ex1;

public class Principal extends Functions{

	public static void main(String[] args) {
		
		Functions funcoes = new Functions();		
		
		
			funcoes.randomizadoreConversorPalavraSecreta();
		
		do {
			System.out.println("Palavra: " + funcoes.Mapeamento);
			
			System.out.println("Tentativas restantes: " + funcoes.tentativas);
			System.out.print("Digite uma letra: ");

			
			funcoes.escolha = funcoes.userInput.next().toLowerCase().charAt(0);

			
			if(funcoes.Mapeamento.contains(funcoes.escolha) && funcoes.ListaCharacter.contains(funcoes.escolha)){
				System.out.println("Essa letra já foi utilizada, tente novamente");
				
			}else if(funcoes.ListaCharacter.contains(funcoes.escolha)){
				System.out.println("Letra correta!");
				
			}else {
				System.out.println("Letra incorreta!");
				funcoes.tentativas--;
			}
				
			funcoes.setarLetra();
			
			if(funcoes.ListaCharacter.containsAll(funcoes.Mapeamento)){
				funcoes.verificadorVitoria = true;
				break;
			}
				
		}while(funcoes.tentativas > 0 || funcoes.verificadorVitoria == true);
		
		funcoes.verificarVitoria();
		
		
	}
}


