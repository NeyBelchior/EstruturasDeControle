package estruturaDeControle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		String faixa = "marrom";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bssai-dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Sandan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o heian nidan");
		case "amerela":
			System.out.println("Sei o Heian Shodan");
		break;
		default: System.out.println("Não sei nada");
		}
		System.out.println("Fim");
		
		int idade = 3;
		
		switch(idade) {
		case 3 :
			System.out.println("Sei programar");
		case 2 :
			System.out.println("Sei andarr");
		case 1 :
			System.out.println("Sei falar");
		}

	}


}
