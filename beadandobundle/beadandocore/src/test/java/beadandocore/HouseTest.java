package beadandocore;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import beadandocore.enums.Futes;
import beadandocore.enums.Tipus;
import beadandocore.exceptions.EpitesIdejeNemMegfelelo;
import beadandocore.exceptions.IranyitoszamNemMegfelelo;
import beadandocore.exceptions.SzobakSzamaNemMegfelelo;
import org.junit.Before;
import org.junit.Test;

public class HouseTest {
	
	House testHouse;
	House testHouse2;
	@Before
	public void initHouse() {
		testHouse = new House();
		testHouse2 = new House(8, 3484, 4, 15, 81, true, "Sarga", "Miskolc", "Kossuth Lajos", Tipus.LAKAS, Futes.KLIMA, LocalDate.of(2002, 9, 02));
	}
	@Test
	public void testKonstruktor() throws SzobakSzamaNemMegfelelo {
		assertEquals(testHouse.id, testHouse.getId());
		assertEquals(testHouse.iranyitoszam, testHouse.getIranyitoszam());
		assertEquals(testHouse.szobakSzama, testHouse.getSzobakSzama());
		assertEquals(testHouse.hazszam, testHouse.getHazszam());
		assertEquals(testHouse.getAlapTerulet(), testHouse.alapTerulet, 0.01);
		assertEquals(testHouse.vaneHitel, testHouse.isVaneHitel());
		assertEquals(testHouse.szin, testHouse.getSzin());
		assertEquals(testHouse.telepules, testHouse.getTelepules());
		assertEquals(testHouse.utca, testHouse.getUtca());
		assertEquals(testHouse.tipus, testHouse.getTipus());
		assertEquals(testHouse.futes, testHouse.getFutes());
		assertEquals(testHouse.epitesIdeje, testHouse.getEpitesIdeje());
	}
	@Test
	public void testIdMegfelelo() throws IranyitoszamNemMegfelelo {
		House house = new House();
		house.setId(11);
	}
	@Test
	public void testIdGetter() throws IranyitoszamNemMegfelelo {
		testHouse.id = 15;
		assertEquals(testHouse.id, testHouse.getId());
	}
	@Test(expected = IranyitoszamNemMegfelelo.class)
	public void testIdNemMegfelelo() throws IranyitoszamNemMegfelelo {
		House house = new House();
		house.setId(-5);
	}
	@Test
	public void testIranyitoszamMegfelelo() throws IranyitoszamNemMegfelelo {
		House house = new House();
		house.setIranyitoszam(3528);
	}
	@Test(expected = IranyitoszamNemMegfelelo.class)
	public void testIranyitoszamTulKicsi() throws IranyitoszamNemMegfelelo {
		House house = new House();
		house.setIranyitoszam(-5);
	}
	
	@Test(expected = IranyitoszamNemMegfelelo.class)
	public void testIranyitoszamTulMagas() throws IranyitoszamNemMegfelelo {
		House house = new House();
		house.setIranyitoszam(108500);
	}
	@Test
	public void testIranyitoszamSetter() throws IranyitoszamNemMegfelelo{
		int iranyitoszam = 5542;
		testHouse.setIranyitoszam(iranyitoszam);
		assertEquals(iranyitoszam, testHouse.iranyitoszam);
		
	}
	@Test
	public void testIranyitoszamSetter2() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		Futes futes = Futes.KLIMA;
		house.setFutes(futes);
	}
	
	@Test
	public void testJoEpiteseiIdo() throws EpitesIdejeNemMegfelelo {
		String epitesIdeje = "2021-04-17";
		testHouse.setEpitesIdeje(LocalDate.parse(epitesIdeje));
	}
	
	@Test(expected = EpitesIdejeNemMegfelelo.class)
	public void testKoraiEpiteseiIdo() throws EpitesIdejeNemMegfelelo {
		String epitesIdeje = "1789-02-27";
		testHouse.setEpitesIdeje(LocalDate.parse(epitesIdeje));
	}
	
	@Test(expected = EpitesIdejeNemMegfelelo.class)
	public void testKesoiEpiteseiIdo() throws EpitesIdejeNemMegfelelo {
		String epitesIdeje = "2028-12-06";
		testHouse.setEpitesIdeje(LocalDate.parse(epitesIdeje));
	}

	
	@Test
	public void testSzinSetter() {
		String szinkod = "#FFFFFF";
		testHouse.setSzin(szinkod);
		assertEquals(szinkod, testHouse.szin);
	}
	
	@Test
	public void testSzinGetter() {
		testHouse.szin = "#FFFFFF";
		assertEquals(testHouse.szin, testHouse.getSzin());
	}
	
	@Test
	public void testTipusJo() {
		testHouse.tipus = Tipus.KERTESHAZ;
		assertEquals(testHouse.tipus, testHouse.getTipus());
	}
	@Test
	public void testSzobakSzamaMegfelelo() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setSzobakSzama(5);
	}
	
	@Test(expected = SzobakSzamaNemMegfelelo.class)
	public void testSzobakSzamaNegativ() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setSzobakSzama(-4);
	}
	@Test(expected = SzobakSzamaNemMegfelelo.class)
	public void testSzobakSzamaTulNagy() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setSzobakSzama(150);
	}
	@Test
	public void testHazszamMegfelelo() throws SzobakSzamaNemMegfelelo{
		House house = new House();
		house.setHazszam(15);
	}
	@Test(expected = SzobakSzamaNemMegfelelo.class)
	public void testHazszamNegativ() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setHazszam(-6);
	}
	@Test(expected = SzobakSzamaNemMegfelelo.class)
	public void testHazszamTulNagy() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setHazszam(170000);
	}
	@Test
	public void testAlapTeruletMegfelelo() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setAlapTerulet(780);
	}
	
	@Test(expected = SzobakSzamaNemMegfelelo.class)
	public void testAlapTeruletNegativ() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setAlapTerulet(-8);
	}
	@Test
	public void testAlapTeruletSet() throws SzobakSzamaNemMegfelelo {
		double alapTerulet = 1000.5;
		testHouse.setAlapTerulet(alapTerulet);
		assertEquals(alapTerulet, testHouse.alapTerulet, 0);
	}
	@Test(expected = SzobakSzamaNemMegfelelo.class)
	public void testAlapTeruletTulNagy() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setAlapTerulet(1100000000);
	}
	
	@Test
	public void testVaneHitelSetter(){
		boolean vaneHitel = true;
		testHouse.setVaneHitel(vaneHitel);
		assertEquals(vaneHitel, testHouse.vaneHitel);
		
	}
	@Test
	public void testTelepulesSetter() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setTelepules("Miskolc");
	}
	@Test
	public void testTelepulesGetter() throws SzobakSzamaNemMegfelelo {
		testHouse.telepules = "Miskolc";
		assertEquals(testHouse.telepules, testHouse.getTelepules());
	}
	@Test
	public void testUtcaSetter() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		house.setUtca("Csokonai Vitez Mihaly");
	}
	@Test
	public void testUtcaGetter() throws SzobakSzamaNemMegfelelo {
		testHouse.utca = "Csokonai Vitez Mihaly";
		assertEquals(testHouse.utca, testHouse.getUtca());
	}
	@Test
	public void testTipusSetter() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		Tipus tipus = Tipus.TARSASHAZ;
		house.setTipus(tipus);
	}
	@Test
	public void testTipusGetter() throws SzobakSzamaNemMegfelelo {
		testHouse.tipus = Tipus.LAKAS;
		assertEquals(testHouse.tipus, testHouse.getTipus());
	}
	@Test
	public void testFutesSetter() throws SzobakSzamaNemMegfelelo {
		House house = new House();
		Futes futes = Futes.KLIMA;
		house.setFutes(futes);
	}
	@Test
	public void testFutesGetter() throws SzobakSzamaNemMegfelelo {
		testHouse.futes = Futes.RADIATOR;
		assertEquals(testHouse.futes, testHouse.getFutes());
	}
	@Test
	public void testVaneHitelGetter(){
		testHouse.vaneHitel = false;
		assertEquals(testHouse.vaneHitel, testHouse.isVaneHitel());
		
	}
	@Test
	public void testIranyitoszamGetter() {
		testHouse.iranyitoszam = 3528;
		assertEquals(testHouse.iranyitoszam, testHouse.getIranyitoszam());
		
	}
	@Test
	public void testSzobakSzamaGetter() {
		testHouse.szobakSzama = 3528;
		assertEquals(testHouse.szobakSzama, testHouse.getSzobakSzama());
		
	}
	@Test
	public void testHazszamGetter() {
		testHouse.hazszam = 3528;
		assertEquals(testHouse.hazszam, testHouse.getHazszam());
		
	}
	@Test
	public void testAlapTeruletGetter() {
		double a = 5.55, b = 55.5;
		testHouse.alapTerulet = (a * b);
		assertEquals(testHouse.getAlapTerulet(), testHouse.alapTerulet, 0.0001);
		
	}
	@Test
	public void testEpitesIdejeGetter() {
		testHouse.epitesIdeje = LocalDate.of(2021, 1, 1);
		assertEquals(testHouse.epitesIdeje, testHouse.getEpitesIdeje());
		
	}
	/*
	
	@Test
	public void testSzinGetter() {
		testHouse.szin = "#FFFFFF";
		assertEquals(testHouse.szin, testHouse.getSzin());
	}
	*/
}
