package exercicios;

public class exE_impares {

	public static void main(String[] args) {
		int rest, i = 0;
		
		System.out.println("Estes são todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20:");
		
		do {
			rest = i % 2;
			if (rest != 0) {
				System.out.println(i);
			}
			i++;

			
		}while(i <= 20);
		
	}

}
