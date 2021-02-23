package no.hvl.dat102.mengde.datakontakt;

public class BrukerKlient {

	public static void main(String[] args) {
		Datakontakt arkiv = new Datakontakt();
		
		
		
		for(int i = 0; i < 5; i++)
		{
			arkiv.leggTilMedlem(TekstGrenseSnitt.lesMedlem());
		}
		
		arkiv.finnPartnerFor("Margunn");
		arkiv.finnPartnerFor("Tord");
		arkiv.finnPartnerFor("Leia");
		
		
		TekstGrenseSnitt.skrivHobbyListe(arkiv.getMedlemsListe()[1]);
		
		TekstGrenseSnitt.skrivParListe(arkiv);
		

	}

}
