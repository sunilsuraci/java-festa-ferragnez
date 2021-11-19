package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		//invitati
		String[] invitatiFesta = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Per favore inserisci il tuo nome e cognome: ");
		String nomeCognome = scanner.nextLine();
		
		boolean accettato = false;
		for(int i = 0; i < invitatiFesta.length; i++) {
			
			if(nomeCognome.equals(invitatiFesta[i])) {    
				accettato = true; 
				System.out.println("Perfetto sei sulla lista");
				break;
			}
		}
			 if (!accettato) {
				System.out.println("Mi dispiace non sei sulla lista");
			}				
				
			 	
		
		
		scanner.close(); 
	}
	
}
