package exercicios;

import java.util.Scanner;

public class exB_tabuada {

	public static void main(String[] args) {
		int i, num, result;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um Número: ");
		num = teclado.nextInt();
		
		System.out.print("\n");
		
		i = 0;
		
		do {
			result = num * i;
			System.out.println(num + " vezes " + i + " é igual à: " + result);
			i++;
			
		}while(i <= 10);

		teclado.close();
		
	}

}
