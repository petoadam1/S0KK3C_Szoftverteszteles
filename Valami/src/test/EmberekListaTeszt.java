package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import emberek.EmberekLista;

public class EmberekListaTeszt {

	EmberekLista adatok;

	@Before
	public void feltolt() {
		this.adatok = new EmberekLista();
		adatok.add("Erika");
		adatok.add("Szilveszter");
		adatok.add("Judit");
		adatok.add("Miki");
		adatok.add("Miki");
	}

	@Test
	public void meretEllenorzes() {
		int tenylegesMeret = this.adatok.size();
		int elvartMeret = 4;

		assertEquals(elvartMeret, tenylegesMeret);
	}

	@Test
	public void uressegEllenorzes() {
		boolean uresE = this.adatok.isEmpty();

		assertFalse(uresE); // ez ugyan az például --> assertTrue(!uresE);
	}

	@Test
	public void ujElemHozzaad() {
		String ujEmber = "Valaki";
		int jelenlegiMeret = this.adatok.size();
		this.adatok.add(ujEmber);
		int ujMeret = this.adatok.size();

		assertEquals(jelenlegiMeret + 1, ujMeret);
		assertTrue(this.adatok.getEmberek().contains(ujEmber));

	}

	@Test
	public void teljesTartalomTorles() {
		this.adatok.removeAll();
		boolean uresE = adatok.isEmpty();
		
		assertTrue(uresE);
	}
	
	@Test
	public void letezoEmberTorlese() {
		String letezoEmber = "Erika";
		this.adatok.remove(letezoEmber);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void nemLetezoEmberTorlese() {
		String nemLetezoEmber = "Laci";
		this.adatok.remove(nemLetezoEmber);
	}
	
	@After
	public void listaUrit() {
		this.adatok.removeAll();
	}
}
