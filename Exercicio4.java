package estruturaDeControle;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		int contador=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("Digite um número");
		int numero = entrada.nextInt();
		
      for (int i=2;i<numero;i++) {
    	  if (numero%i==0) {
    		  contador++;
    	  }
    	  
      }
      if (contador == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
      
	}

}
