package estruturaDeControle;

import java.util.Iterator;

public class Break {
	public static void main(String[] args) {
		
	   for (int i = 0;i<10;i++) {
		   if (i== 5) {
			   break;// ele sai da estrutura for
		   }
		   System.out.println(i);
	   }
		System.out.println("Fim");
	}

}
