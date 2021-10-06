package org.core;


import org.junit.Test;


public class AutoTest {
	
	@Test
	public void testAjtokSzamaMegfelelo() throws AjtokSzamaNemMegfelelo{
		Auto auto = new Auto();
		auto.setAjtokSzama(3);
	}
	
	@Test(expected = AjtokSzamaNemMegfelelo.class)
	public void testAjtokSzamaTulAlacsony() throws AjtokSzamaNemMegfelelo{
		Auto auto = new Auto();
		auto.setAjtokSzama(-1);
	}
	
	@Test(expected = AjtokSzamaNemMegfelelo.class)
	public void testAjtokSzamaTulMagas() throws AjtokSzamaNemMegfelelo{
		Auto auto = new Auto();
		auto.setAjtokSzama(6);
	}
	
}
