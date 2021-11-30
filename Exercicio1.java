package estruturaDeControle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = entrada.nextInt();
		
		if(numero >10 || numero<0  ) {
			System.out.println("O número precisa estar entre 10");
			
		}
		else if (numero%2==1) {
			System.out.println("O número é impar");
	
		}else if (numero%2==0){
			
			System.out.println("O núemro é par");
		}	
		
		
		
		entrada.close();

	}

}
