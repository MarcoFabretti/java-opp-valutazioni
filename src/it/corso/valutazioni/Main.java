package it.corso.valutazioni;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner cIn = new Scanner(System.in);
		Random r = new Random();
		CalcolaValutazione[] studenti = new CalcolaValutazione[20];
		
		for (int i = 0; i < studenti.length; i++) {
			CalcolaValutazione studente = new CalcolaValutazione();
			studente.IdStudente = i+1;
			studente.pAssenze = r.nextInt(100);
			studente.mVoti = r.nextFloat(10);
			;
			studenti[i]=studente;
			System.out.print("IdStudente: "+studenti[i].IdStudente + "  ");
			System.out.print("pAssenze: "+studenti[i].pAssenze + "  ");
			System.out.println("mVoti: "+studenti[i].mVoti);
		}

		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i].Esito() == false) {
				
			} else
				System.out.println("Lo studente: " + studenti[i].IdStudente + " ha superato il corso");
		}
		cIn.close();
	}
}
