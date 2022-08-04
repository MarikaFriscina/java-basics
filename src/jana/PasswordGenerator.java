package jana;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		String nome;
		String cognome;
		String colorePreferito;
		int giornoDiNascita;
		int meseDiNascita;
		int annoDiNascita;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci il nome: ");
		nome= scan.nextLine();
		
		System.out.print("Inserisci il cognome: ");
		cognome= scan.nextLine();
		
		System.out.print("Inserisci il colore preferito: ");
		colorePreferito= scan.nextLine();
		
		System.out.print("Inserisci il giorno di nascita: ");
		giornoDiNascita= scan.nextInt();
		
		System.out.print("Inserisci il mese di nascita: ");
		meseDiNascita= scan.nextInt();
		
		System.out.print("Inserisci l' anno di nascita: ");
		annoDiNascita= scan.nextInt();
		
		
		int sommaDataDiNascita= giornoDiNascita + meseDiNascita + annoDiNascita;
		
		String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataDiNascita;
		System.out.println(password);
		
		scan.close();
		
	}

}
