package estruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int total =0;
		Integer nota=0;
		int contador =0;
		int teste =0;
		
		do{
			System.out.println("Digite uma nota ou -1 para sair");
			    teste=entrada.nextInt();
	          
			if( teste>=0 && teste<=10) {
				nota=teste;
			    contador+=1;
				total=total+nota;
				
			
				}else {
					System.out.println("Digite uma nota válida");
					
				}			
			
		}while(teste != -1);
		
		System.out.println("Sua Média é :" +total/contador);

	}

}
