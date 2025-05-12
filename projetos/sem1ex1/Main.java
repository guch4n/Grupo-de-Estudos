import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		String senha = teclado.nextLine();
		
		//Verificador de tamanho minimo da senha
		while (senha.length() < 6) {
			System.out.println("Digite uma senha com no minimo 6 caracteres: ");
			senha = teclado.nextLine();
		}
			
			System.out.println("Você digitou uma senha fraca: ");
			System.out.println(senha);
			System.out.println("Para reforçar a sua senha selecione uma das seguintes opçoes:");			
			//invertida
			StringBuilder invertida = new StringBuilder(senha);
			System.out.println("1- Senha invertida: " + invertida.reverse());
			
			//caixa alta
			System.out.println("2- Caixa alta: " + senha.toUpperCase());
			
			//sem vogais
			System.out.println("3- Sem vogais: " + senha.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", ""));
			
			//cifrada
			System.out.println("4- Cifrada: " + senha.replace("a", "@").replace("e", "&").replace("i", "!").replace("o", "0").replace("u", "$"));
				int opcao = teclado.nextInt();		
				
				//comparador opção
				while (opcao < 1 || opcao > 4) {
					System.out.println("Opção invalida, selecione um numero de 1 a 4");
					opcao = teclado.nextInt();	
				}
				
				//seleção e atribuição de nova senha
				switch(opcao) {
					case 1:
						senha = invertida.reverse().toString();
						System.out.println("Sua senha foi definida como: " + senha);
						break;
					case 2:
						senha = senha.toUpperCase();
						System.out.println("Sua senha foi definida como: " + senha);
						break;
					case 3:
						senha = senha.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
						System.out.println("Sua senha foi definida como: " + senha);
						break;
					case 4:
						senha = senha.replace("a", "@").replace("e", "&").replace("i", "!").replace("o", "0").replace("u", "$");
						System.out.println("Sua senha foi definida como: " + senha);
						break;
					default:
						System.out.println("Opção invalida");	
						
				}

	}
}
