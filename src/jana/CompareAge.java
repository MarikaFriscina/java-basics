package jana;

import java.util.Scanner;

public class CompareAge {

	public static void main(String[] args) {
		int eta1;
		int eta2;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Inserisci l'età della prima persona");
		eta1=scan.nextInt();
		
		System.out.print("Inserisci l'età della seconda persona");
		eta2=scan.nextInt();
		
		if(eta1>eta2) {
			System.out.print("La prima persona è più grande della seconda");
		} else if(eta2>eta1) {
			System.out.print("La seconda persona è più grande della prima");
		} else {
			System.out.println("Hanno entrambi la stessa età");
		}
		
		
		scan.close();
		

	}

}
