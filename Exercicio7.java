package estruturaDeControle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
		Scanner entrada =new Scanner(System.in);
	
		int numero =0;
		int soma =0;
		
		while(numero>=0) {
			System.out.println("Digite um numero");
			numero=entrada.nextInt();
			soma +=numero;
			System.out.println("A soma até agora é :" +soma);
			
		}
		System.out.println(" Número negativo digitado, programa finalizado");
		
	 
	
	
	
	

		entrada.close();
	}

}
