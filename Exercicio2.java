package estruturaDeControle;

import java.util.Scanner;
import java.time.YearMonth;

public class Exercicio2 {

	public static void main(String[] args) {
		int year = YearMonth.now().getYear();
		System.out.println("O ano atual é :  " + year);
		if (year%4 == 0) {
			System.out.println("ele é bisexto");
			
		}
		System.out.println("Ele não é bisexto");
		
		
		

	}

}
