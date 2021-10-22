package loops_em_java;

import java.util.Scanner;

public class Loop_01 {

	public static void main(String[] args) {
	      
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digíte uma nota de 0 a 10");
		
		@SuppressWarnings("unused")
		boolean notaVerdadeira = false;
		
		do {
			int nota = scan.nextInt();
			
			if (nota >= 0 && nota <= 10) {
				notaVerdadeira = true;
				System.out.println("Sua nota é "+ nota);
	       }else {
	    	   System.out.println("Nota invalida!");
	       }
			
		} while (notaVerdadeira = true);
		
		scan.close();


	}

}