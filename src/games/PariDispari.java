package games;

import java.util.Random;
import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		
		int num;
		boolean sceltaPari;
		boolean puoiProcedere=true;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Scegli pari o dispari?");
		String scelta = scan.nextLine();
		
		
		if(scelta.equalsIgnoreCase("pari")) {
			
			sceltaPari=true;
			
		} else if(scelta.equalsIgnoreCase("dispari")) {
			
			sceltaPari=false;
			
		} else {
			System.out.println("Scelta non valida");
			puoiProcedere=false;
			sceltaPari=false;
		}
		
		if(puoiProcedere) {
			
			System.out.println("Procediamo");
			System.out.println("Scegli un numero tra 0 e 5");
			num = scan.nextInt();
			
			Random randomGenerator= new Random();			
			int numeroPc = randomGenerator.nextInt(6);
			
			System.out.println("Hai scelto: "+ num);
			System.out.println("Computer ha scelto: "+ numeroPc);
			
			int somma= num+ numeroPc;
			
			if(somma%2 == 0) {
				if(sceltaPari) {									
				System.out.println("La somma è: " + somma+ ", hai vinto!");
				}else {
					System.out.println("La somma è: " + somma+ ", ha vinto il Computer");
				}
				} else {
					if(!sceltaPari) {
						System.out.println("La somma è: " + somma+ ", hai vinto!");
					}else {
						System.out.println("La somma è: " + somma+ ", ha vinto il Computer");
					}
			}
			
		}
		
		
		scan.close();

	}

}
