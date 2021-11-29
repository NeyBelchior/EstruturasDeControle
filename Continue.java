package estruturaDeControle;

public class Continue {

	public static void main(String[] args) {
		//forma não muito inteligente de imprimir os valores pares
		//Enquando o break gera uma interrupçãoo continue interrompe apenas aquela iteração 
		for (int i =0;i<10;i++) {
			if (i %2 == 1){
				continue;
				
			}
			System.out.println(i);
		}
		for (int i =0;i<10;i++) {
			if (i  == 5){
				continue;
				
			}
			System.out.println(i);
		}
	}

}
