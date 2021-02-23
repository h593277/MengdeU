package no.hvl.dat102.mengde.datakontakt;


public class Datakontakt {
	
	private int antallMedlemmer = 0;
	private Medlem[] medlemsListe = new Medlem[20];
	
	public Medlem[] getMedlemsListe()
	{
		return medlemsListe;
		
	}
	
	public int getAntallMedlemmer() {
		return antallMedlemmer;
	}

	public boolean leggTilMedlem(Medlem person)
	{
		
			medlemsListe[antallMedlemmer] = person;
			antallMedlemmer++;
			return true;
		
	}
	
	public int finnMedlemsIndex(String medlemsnavn)
	{
	
		for(int i = 0; i < antallMedlemmer; i++)
		{
			if(medlemsListe[i].getNavn().equals(medlemsnavn))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public int finnPartnerFor(String medlemsnavn)
	{
		Medlem medlem1 = null;
		for(int i = 0; i < antallMedlemmer; i++)
		{
			if(medlemsListe[i].getNavn().equals(medlemsnavn))
			{
				medlem1 = medlemsListe[i];
				break;
			}
		}
		
		for(int i = 0; i < antallMedlemmer; i++)
		{
			if(medlemsListe[i].passerTil(medlem1, medlemsListe[i]) && !medlemsListe[i].equals(medlem1))
			{
				medlem1.setStatusIndeks(i);
				medlemsListe[i].setStatusIndeks(finnMedlemsIndex(medlem1.getNavn()));
				return i;
			}
		}
		
		return -1;
		
		
		
	}
	
	public void tilbakestillStatusIndeks(String medlemsnavn)
	{
		Medlem medlem1 = null;
		for(int i = 0; i < antallMedlemmer; i++)
		{
			if(medlemsListe[i].getNavn().equals(medlemsnavn))
			{
				medlem1 = medlemsListe[i];
				break;
			}
		}
		
		medlemsListe[medlem1.getStatusIndeks()].setStatusIndeks(-1);
		medlem1.setStatusIndeks(-1);
		
	}
	
	
		
	
	
}
