package no.hvl.dat102.mengde.datakontakt;

public class Hobby {

private String hobbyNavn;
	
	public String getHobbyNavn() {
		return hobbyNavn;
	}

	public void setHobbyNavn(String hobbyNavn) {
		this.hobbyNavn = hobbyNavn;
	}

	public Hobby(String hobby)
	{
		hobbyNavn = hobby;
	}
	
	@Override
	public String toString()
	{
		return "<" + hobbyNavn + ">"; 
	}
	
	@Override
	public boolean equals(Object hobby2)
	{
		Hobby hobbyDenAndre = (Hobby)hobby2;
		
		return(hobbyNavn.equals(hobbyDenAndre.getHobbyNavn()));
	}
}
