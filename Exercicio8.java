package estruturaDeControle;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	Scanner entrada =new Scanner(System.in);
	
	System.out.println("Digite uma palavra");
	String palavra =entrada.next();
	int tamnhoPalavra=palavra.length();
	for(int i =0;i<tamnhoPalavra;i++) {
		
	System.out.println(palavra.charAt(i));
	
	}

		
	}
	
	
	}


