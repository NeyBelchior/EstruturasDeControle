package estruturaDeControle;

public class For1 {

	public static void main(String[] args) {
		// É a estrutura mais indicada para repedições DEFINIDAS 
		
		int contador = 1;//Definição da variável
		//fica no laço até que a expressão retorno false
		while(contador <=10/*Expresão*/) {
			System.out.printf("\ni = %d",contador);
			contador ++;//incremento
			
		}
		//Nem sempre eu preciso ter as 3 partes bem definiadas dentro do for(variável, expressão,controle)
		for(contador = 1/*Definição da variável*/;contador <=10/*Expressão*/;contador ++/*incremento*/) {
			System.out.printf("\ni = %d",contador);
			
		}
		//Parecido Com while
		int x = 2;
		for (;x<10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		//laço infinito
		
		/*for(;;) {
			System.out.println("Laço infinito ");
		}*/
		
		

	}

}
