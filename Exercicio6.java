package estruturaDeControle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random aleatorio=new Random();
		int numero =aleatorio.nextInt(11);
		numero =0;
		int tentativas =0;
		int numeroInformado=0;
		System.out.println(numero);
		
		do {
			System.out.println("Informe um número");
		
			
			System.out.printf("Faça sua  %d tentativa ",tentativas+1);
			System.out.println();
			numeroInformado =entrada.nextInt();
			tentativas++;
		if (numero > numeroInformado) {

			System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);

		} else if (numero < numeroInformado) {

			System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);

		} else {

			System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
		}
		}

		while(numeroInformado != numero && tentativas<10);
		
		/*while(numeroinformado != numero && tentativas<10) {
           System.out.println("Informe um número");
		
			
			System.out.printf("Faça sua  %d tentativa ",tentativas+1);
			System.out.println();
			numeroinformado =entrada.nextInt();
			tentativas++;
		}*/
				
			
			
	
			
			entrada.close();
		
		
		
		
	
		

	}}


