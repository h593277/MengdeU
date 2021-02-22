package no.hvl.dat102.mengde.datakontakt;

import java.util.Iterator;
import java.util.Scanner;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class TekstGrenseSnitt {

	public static Medlem lesMedlem()
	{
		Medlem medlemLes = null;
		Scanner scanner = new Scanner(System.in);
		Hobby hobbier = null;
		MengdeADT<Hobby> hobbyene = new TabellMengde<>();
		
		System.out.println("Skriv in navnet");
		medlemLes.setNavn(scanner.nextLine());
		
		System.out.println("Skriv in hobby");
		hobbier.setHobbyNavn(scanner.nextLine());
		hobbyene.leggTil(hobbier);
		
		medlemLes.setHobbyer(hobbyene);
		
		return medlemLes;
	}
	
	public static void skrivHobbyListe(Medlem medlem)
	{
		System.out.println("Personens hobbyer:");
		System.out.println(medlem.getHobbyer().toString());
	}
	
	public static void skrivParListe(Datakontakt arkiv)
	{
		Iterator<Medlem> medlemIterator = arkiv.getMedlemsListe().oppramser();
		Medlem medlem1 = null;
		int index = -1;
		while(medlemIterator.hasNext())
		{
			medlem1 = medlemIterator.next();
			while(medlemIterator.hasNext())
			{
				//if(medlemIterator.next().getStatusIndeks())
			}
		}
	}

}
