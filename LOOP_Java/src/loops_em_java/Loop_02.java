package loops_em_java;

import java.util.Scanner;

public class Loop_02 {

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Informe o primeiro n�mero: ");
		 int num1 = scan.nextInt();
		 
		 boolean numMaior = false;
		 
		 int num2 = 0;
		 
		 // verifica se o segundo n�mero � maior que o primeiro.
		 do {
			 System.out.println("Informe o segundo n�mero!");
			 num2 = scan.nextInt();
			 
			 if (num1 < num2) {
				 numMaior = true;
			 }
			 else {
				 System.out.println("O segundo n�mero precisa ser maior que o primeiro!");
			 }
			 
		 } while (!numMaior);
		 
		 // Mostrar os valores entre o primeiro n�mero e o segundo.
		 for (int i = num1; i <= num2; i++) {
			 System.out.println(i);
		 }
		 
	}

}
