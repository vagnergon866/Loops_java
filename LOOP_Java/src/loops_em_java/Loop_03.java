package loops_em_java;

import java.util.Scanner;

public class Loop_03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int num1;
		int numMaior = Integer.MIN_VALUE;

		// Informar 5 n�meros na tela.
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Dig�te um n�mero: ");
			num1 = scan.nextInt();

			// Encontrar o maior n�mero.
			
			if (num1 > numMaior) {
				numMaior = num1;
			}

		}
		System.out.println("O maior n�mero �..." + numMaior);
	}

}
