package estruturaDeControle;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int divisores=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um número");
		int numero= entrada.nextInt();
		
		for(int i =2;i<numero;i++) {
			if(numero%i==0) {
				divisores++;
			}
		}
		
		
		
		switch(divisores){
	
		case  0 :
			System.out.println("O núemro é primo");
			break;
		default :
			System.out.println("Não é primo");
	}

	}

}
