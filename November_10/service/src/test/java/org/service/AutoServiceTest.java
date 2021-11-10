package org.service;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import hu.uni.miskolc.teszteles.core.Auto;
import hu.uni.miskolc.teszteles.core.enums.Kivitel;
import hu.uni.miskolc.teszteles.core.enums.Uzemanyag;
import hu.uni.miskolc.teszteles.core.enums.Valto;
import hu.uni.miskolc.teszteles.dao.AutoDao;
import hu.uni.miskolc.teszteles.service.AutoService;

public class AutoServiceTest {

	private AutoService service;
	
	@Before
	public void setUp() {
		AutoDao mock = Mockito.mock(AutoDao.class);
		service = new AutoService(mock);
		Auto auto = new Auto("Opel", "Astra", "1.2", "ABC-123", Uzemanyag.BENZIN, 
				LocalDate.of(2017, 5, 12), "#dedede", false, "123456EE", 
				Valto.MANUALIS_5_FOKOZAT, Kivitel.KOMBI, 5);
		Auto auto2 = new Auto("Kia", "Picanto", "1.0", "ABC-222", Uzemanyag.BENZIN, 
				LocalDate.of(2012, 8, 30), "#ffffff", true, "121212EE", 
				Valto.MANUALIS_5_FOKOZAT, Kivitel.HATCHBACK, 4);
		Auto auto3 = new Auto("Renault", "Thalia", "1.2", "ABC-333", Uzemanyag.DIESEL, 
				LocalDate.of(2009, 12, 24), "#000000", false, "987654AA", 
				Valto.AUTOMATA, Kivitel.SEDAN, 4);
		Collection<Auto> autok = new ArrayList();
		autok.add(auto);
		autok.add(auto2);
		autok.add(auto3);
		Mockito.when(service.getAllAuto()).thenReturn(autok);
	}
	@Test
	public void test() {
		assertEquals(service.getAllAuto().size(), 3);
	}

}
