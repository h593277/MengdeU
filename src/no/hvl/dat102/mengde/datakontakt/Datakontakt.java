package no.hvl.dat102.mengde.datakontakt;

import java.util.Iterator;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class Datakontakt {
	
	private int antallMedlemmer;
	private MengdeADT<Medlem> medlemsListe = new TabellMengde<Medlem>(20);
	
	public MengdeADT<Medlem> getMedlemsListe()
	{
		return medlemsListe;
	}
	
	public boolean leggTilMedlem(Medlem person)
	{
		
		if(!medlemsListe.inneholder(person))
		{
			medlemsListe.leggTil(person);
			antallMedlemmer++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int finnMedlemsIndex(String medlemsnavn)
	{
	
		Iterator<Medlem> medlemsIterator = medlemsListe.oppramser();
		int index = 0;
		while(medlemsIterator.hasNext())
		{
			if(!medlemsIterator.next().getNavn().equals(medlemsnavn))
			{
				index++;
			}
			else if(medlemsIterator.hasNext() && medlemsIterator.next().getNavn().equals(medlemsnavn))
			{
				return index;
			}
			else
			{
				index = -1;
			}
			
		}
		
		return index;
	}
	
	public int finnPartnerFor(String medlemsnavn)
	{
		Iterator<Medlem> medlemIterator = medlemsListe.oppramser();
		Medlem medlem1 = null;
		int index = -1;
		while(medlemIterator.hasNext() && medlem1 == null)
		{
			if(medlemIterator.next().getNavn().equals(medlemsnavn))
			{
				medlem1 = medlemIterator.next();
			}
		}
		
		while(medlemIterator.hasNext())
		{
			if(medlem1.passerTil(medlem1, medlemIterator.next()))
			{
				medlem1.setStatusIndeks(finnMedlemsIndex(medlemsnavn));
				medlemIterator.next().setStatusIndeks(finnMedlemsIndex(medlem1.getNavn()));
				index = medlem1.getStatusIndeks();
			}
		}
		
		return index;
		
	}
	
	public void tilbakestillStatusIndeks(String medlemsnavn)
	{
		Iterator<Medlem> medlemIterator = medlemsListe.oppramser();
		Medlem medlem1 = null;
		int index = 0;
		while(medlemIterator.hasNext() && medlem1 == null)
		{
			if(medlemIterator.next().getNavn().equals(medlemsnavn))
			{
				medlem1 = medlemIterator.next();
			}
		}
	
		while(medlemIterator.hasNext())
		{
			if(medlemIterator.next().getStatusIndeks() == medlem1.getStatusIndeks())
			{
				medlemIterator.next().setStatusIndeks(-1);
			}
		}
		
		medlem1.setStatusIndeks(-1);
		
	
		
		
	}
	
	
		
	
	
}
