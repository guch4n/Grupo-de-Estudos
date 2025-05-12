import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas, minutos, minutosTotais, horasTotais;
		
		System.out.println("Digite a quantidade de horas disponiveis, sem pontos ou virgulas : ");
		Scanner teclado = new Scanner (System.in);
		horas = teclado.nextInt();
		minutosTotais = horas * 60;
		
		System.out.println("Agora digite os minutos que possui disponivel, sem pontos ou virgulas: ");
		minutos = teclado.nextInt();
		minutosTotais = minutosTotais + minutos;
		horasTotais = minutosTotais/60;
		
		if (minutosTotais > 0 && minutosTotais <= 5) {
			System.out.println("Você tem " + horasTotais + "h (" + minutosTotais + " minutos). " + "Aqui estão algumas sugestões: ");
			System.out.println("Beba água, levante-se e alongue-se, respire fundo.");
		}else if (minutosTotais >5 && minutosTotais <= 10) {
			System.out.println("Você tem " + horasTotais + "h (" + minutosTotais + " minutos). " + "Aqui estão algumas sugestões: ");
			System.out.println("Leia um artigo curto, revise suas anotações, faça uma meditação.");
		}else if (minutosTotais > 10 && minutosTotais <= 20) {
			System.out.println("Você tem " + horasTotais + "h (" + minutosTotais + " minutos). " + "Aqui estão algumas sugestões: ");
			System.out.println("Assista um video-aula, faça uma caminhada curta.");
		}else if (minutosTotais > 20 && minutosTotais <= 45) {
			System.out.println("Você tem " + horasTotais + "h (" + minutosTotais + " minutos). " + "Aqui estão algumas sugestões: ");
			System.out.println("Estude um módulo, escreva um texto, resolva exercicios.");
		}else if (minutosTotais > 45) {
			System.out.println("Você tem " + horasTotais + "h (" + minutosTotais + " minutos). " + "Aqui estão algumas sugestões: ");
			System.out.println("Desenvolva um projeto pessoal, estude algo aprofundadamente, realize alguma tarefa doméstica longa.");
		}else {
			System.out.println("Como seu tempo é bem curto, aqui está uma sugestão: ");
			System.out.println("Conte até 10 a cada respiração.");
		}
		
		
	}

}
