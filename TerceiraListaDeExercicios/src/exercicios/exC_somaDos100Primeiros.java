package exercicios;

public class exC_somaDos100Primeiros {

	public static void main(String[] args) {
		int i = 1, num = 0;
		
		do {
			num+= i;
			System.out.println(num);
			i++;
			
		}while(i <= 100);
		
		System.out.println("\nA soma dos 100 primeiros números naturais, é: " + num);

	}

}
