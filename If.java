package estruturaDeControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média :");
		double media  = entrada.nextDouble();
		
		// Obrigatoriamente deve retorna true or false , não converte n nada em boleano, java é mais restrito 
		if(media<=10&&media>=7) {
			System.out.println("Aprovado!");
			System.out.println("Prabéns!");
			}
		if(media<7 && media >=4.5) {
			System.out.println("Recuperação");
			
		}
		
	    if(media >=4.0 && media >=0) {
	    	System.out.println("Reprovado");
	    	
	    	
	    }
	    
			
			
		
		
		
		
		
		entrada.close();
	}

}
