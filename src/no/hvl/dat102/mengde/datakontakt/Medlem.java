package no.hvl.dat102.mengde.datakontakt;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {
	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;
	
	public Medlem(String navn, MengdeADT<Hobby> hobbyer, int statusIndeks)
	{
		this.navn = navn;
		this.hobbyer = hobbyer;
		this.statusIndeks = statusIndeks;
	}
	
	public boolean passerTil(Medlem medlem1, Medlem medlem2)
	{
		if(medlem1.getHobbyer().equals(medlem2.getHobbyer()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public MengdeADT<Hobby> getHobbyer() {
		return hobbyer;
	}

	public void setHobbyer(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}

	public int getStatusIndeks() {
		return statusIndeks;
	}

	public void setStatusIndeks(int statusIndeks) {
		this.statusIndeks = statusIndeks;
	}
	
	
}
