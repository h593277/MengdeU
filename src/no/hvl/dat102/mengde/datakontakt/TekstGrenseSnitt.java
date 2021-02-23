package no.hvl.dat102.mengde.datakontakt;

import java.util.Scanner;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class TekstGrenseSnitt {

	public static Medlem lesMedlem()
	{
		
		Scanner scanner = new Scanner(System.in);
		MengdeADT<Hobby> hobbyene = new TabellMengde<>();
		
		System.out.println("Skriv in navnet");
		String navn = scanner.nextLine();
		
		System.out.println("Skriv in hobby");
		Hobby hobbier = new Hobby(scanner.nextLine());
		hobbyene.leggTil(hobbier);
		
		System.out.println("Skriv in hobby 2");
		Hobby hobbier2 = new Hobby(scanner.nextLine());
		hobbyene.leggTil(hobbier2);
		
		Medlem medlemLes = new Medlem(navn, hobbyene, -1);
		
		return medlemLes;
	}
	
	public static void skrivHobbyListe(Medlem medlem)
	{
		System.out.println("Personens hobbyer:");
		System.out.println(medlem.getHobbyer().toString());
	}
	
	public static void skrivParListe(Datakontakt arkiv)
	{
		MengdeADT<Medlem> listet = new TabellMengde<Medlem>();
		Medlem medlem1 = null;
		Medlem medlem2 = null;
		Medlem[] tabell = arkiv.getMedlemsListe();
		int antallPar = 0;
		System.out.println("Parnavn               " + "Hobbyer");
		
		for(int i = 0; i < arkiv.getAntallMedlemmer(); i++)
		{
			if(!listet.inneholder(tabell[i]) && tabell[i].getStatusIndeks() != -1)
			{
				medlem1 = tabell[i];
				medlem2 = tabell[medlem1.getStatusIndeks()];
				System.out.println(medlem1.getNavn() + " og " + medlem2.getNavn() + "		" + medlem1.getHobbyer().toString());
				listet.leggTil(medlem1);
				listet.leggTil(medlem2);
				antallPar++;
			}
			
		}
		
		System.out.println("Antall par: " + antallPar);
	}

}
