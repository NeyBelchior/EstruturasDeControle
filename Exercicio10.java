package estruturaDeControle;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int contador=0;
        int maiorNumero=0;
        
        while(contador<10) {
        	
         System.out.println("Digite um número");
         int numero =entrada.nextInt();
         if (numero>maiorNumero) {
        	maiorNumero=numero;
        	contador ++; 
         }else contador++;
        
         }
        System.out.println("O maior numero é :"+maiorNumero);
		
entrada.close();
	}

}
