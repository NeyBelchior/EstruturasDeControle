package estruturaDeControle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner entrada = new Scanner(System.in);
		String conceito = "";
		System.out.println("informe a nota");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9 :
			conceito ="A";
			break;
	/*	case 9:
			conceito = "A";
		    break;*/
		case 8: 
		case 7 :
			conceito = "b";
		break;
		case 6: case 5 :
			conceito = "c";
		break;
		case 4: 
		case 3 :
			conceito = "d";
		break;
		case 2: case 1 : case 0:
		conceito = "E";
		break;
		default :
			conceito = "Não informao!";
		}//não necessariamente o default precisa está na ultima posição 
		
		
		System.out.println("conceito é " +conceito);
		
entrada.close();		

	}

	
}
