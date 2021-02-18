package no.hvl.dat102.mengde.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

class MengdeTest {
 
	
		MengdeADT<Integer> m1;
		MengdeADT<Integer> m2;
		int[] testTall = {2, 4, 6, 8, 10};
		int[] testTall2 = {1, 2, 3, 5, 7, 9};
	
	
	@Test
	void testUnion() {
		
		MengdeADT<Integer> fasit = new KjedetMengde<>();
		int[] testFasit = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		m1 = new KjedetMengde<>();
		m2 = new KjedetMengde<>();
	
		for(int i = 0; i < testFasit.length; i++)
		{
			fasit.leggTil(testFasit[i]);
		}
		
		for(int i = 0; i < testTall.length; i++)
		{
			m1.leggTil(testTall[i]);
		}
		
		for(int i = 0; i < testTall2.length; i++)
		{
			m2.leggTil(testTall2[i]);
		}
	
		assertEquals(m1.union(m2), fasit);
	}
	
	@Test
	void testSnitt() {
		
		MengdeADT<Integer> fasit = new KjedetMengde<>();
		int[] testFasit = {2};
		m1 = new KjedetMengde<>();
		m2 = new KjedetMengde<>();
		
		for(int i = 0; i < testFasit.length; i++)
		{
			fasit.leggTil(testFasit[i]);
		}
		
		for(int i = 0; i < testTall.length; i++)
		{
			m1.leggTil(testTall[i]);
		}
		
		for(int i = 0; i < testTall2.length; i++)
		{
			m2.leggTil(testTall2[i]);
		}
		
		assertEquals(m1.snitt(m2), fasit);
	}
	
	@Test
	void testDifferanse() {
		
		MengdeADT<Integer> fasit = new KjedetMengde<>();
		int[] testFasit = {4, 6, 8, 10};
		m1 = new KjedetMengde<>();
		m2 = new KjedetMengde<>();
		
		for(int i = 0; i < testFasit.length; i++)
		{
			fasit.leggTil(testFasit[i]);
		}
		
		for(int i = 0; i < testTall.length; i++)
		{
			m1.leggTil(testTall[i]);
		}
		
		for(int i = 0; i < testTall2.length; i++)
		{
			m2.leggTil(testTall2[i]);
		}
		
		assertEquals(m1.differens(m2), fasit);
	}

}
