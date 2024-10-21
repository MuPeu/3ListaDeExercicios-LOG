package exercicios;

public class exF_divisivelPor4 {

	public static void main(String[] args) {
		int rest, i = 0;
		
		System.out.println("Estes são todos os valores numéricos divisíveis por 4 e menores que 200:");
		
		do {
			rest = i % 4;
			if (rest == 0) {
				System.out.println(i);
			}
			i++;

			
		}while(i <= 200);
		
	}

}
