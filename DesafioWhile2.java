package estruturaDeControle;

import static java.lang.System.in;

import java.util.Scanner;

public class DesafioWhile2 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(in);
		int contador=0;
		int soma = 0;
		int teste =0;
		int nota=0;
		while(teste!=-1) {
			System.out.println("Digite uma nota");
			teste = entrada.nextInt();
			
			if(teste >=0 && teste<=10) {
							
		    nota =teste;
		    contador ++;
			soma +=nota;
			
			}else if (teste !=-1){
				
				System.out.println("Digite um valor entre 0 e 10");
			}
			
			}
		System.out.println("Sua média é : "+soma/contador);
		
	}

}
