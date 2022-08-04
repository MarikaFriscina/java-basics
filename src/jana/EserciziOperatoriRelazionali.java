package jana;

import java.util.Scanner;

public class EserciziOperatoriRelazionali {
	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Inserisci il valore di x");
		x= scan.nextInt();
		
		System.out.println("Inserisci il valore di y");
		y= scan.nextInt();
		
		if(x==y) {
			
			System.out.println("x uguale a y");
		} else if(x<y){
			System.out.println("x minore di y");
			
		}
		else {
			System.out.println("x maggiore di y");
			
		}

		
		if(!(x==y)) {
			System.out.println("x diverso da y");
		}
		
		scan.close();
	}
	

}
