package exercicios;

public class exD_somaDosPares {

	public static void main(String[] args) {
		int rest, i = 1, num = 0;
		
		do {
			rest = i % 2;
			if (rest == 0) {
				num+= i;
				System.out.println(num);
			}
			i++;

			
		}while(i <= 500);
		
		System.out.println("\nA soma dos valores pares existentes na faixa de 1 até 500, é: " + num);

	}

}