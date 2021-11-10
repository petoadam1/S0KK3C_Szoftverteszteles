package hu.uni.miskolc.teszteles.dao.mongo;

import org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import hu.uni.miskolc.teszteles.core.Auto;
import hu.uni.miskolc.teszteles.core.enums.Kivitel;
import hu.uni.miskolc.teszteles.core.enums.Uzemanyag;
import hu.uni.miskolc.teszteles.core.enums.Valto;
import hu.uni.miskolc.teszteles.core.exceptions.AjtokSzamaNemMegfelelo;
import hu.uni.miskolc.teszteles.core.exceptions.GyartasiIdoNemMegfelelo;
import hu.uni.miskolc.teszteles.core.exceptions.RendszamNemMegfelelo;
import hu.uni.miskolc.teszteles.dao.AutoDao;
import hu.uni.miskolc.teszteles.service.exception.AutoNemTalalhato;
import hu.uni.miskolc.teszteles.service.exception.RendszamMarFoglalt;
import junit.framework.TestCase;

public class AutoDAOMongoTest {

	
	@Test
	public void testDatabase() throws RendszamMarFoglalt, RendszamNemMegfelelo, GyartasiIdoNemMegfelelo, AjtokSzamaNemMegfelelo, AutoNemTalalhato {
		AutoDao dao = new AutoDAOMongo("mongodb+srv://test:test@szoftverteszteles2021.bqwgi.mongodb.net/test?retryWrites=true&w=majority", "S0KK3C", "autok");
		Auto auto = new Auto("Opel", "Astra", "1.2", "XYZ-123", Uzemanyag.BENZIN, 
				LocalDate.of(2017, 5, 12), "#dedede", false, "123456EE", 
				Valto.MANUALIS_5_FOKOZAT, Kivitel.KOMBI, 5);
		//dao.createAuto(auto);
		System.out.println(dao.readAllAutos());
		System.out.println(dao.readAutoById("XYZ-123"));
	}
}
