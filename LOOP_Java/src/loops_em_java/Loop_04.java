package loops_em_java;

import java.util.Scanner;

public class Loop_04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// gerador de tabuada

		int num1 = scan.nextInt();
		int result;
		System.out.println("Tabuada do " + num1 + ":");

		// gerar um contador que imprima na tela a tabuada de 1 a 10.

		for (int i = 1; i <= 10; i++) {
			result = i * num1;

			System.out.println(num1 + " X " + i + " = " + result);
		}

	}

}
