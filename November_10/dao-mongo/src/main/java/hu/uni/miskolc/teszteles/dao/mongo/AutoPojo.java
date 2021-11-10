package hu.uni.miskolc.teszteles.dao.mongo;

import java.time.LocalDate;

import org.bson.codecs.pojo.annotations.BsonId;

import hu.uni.miskolc.teszteles.core.enums.Kivitel;
import hu.uni.miskolc.teszteles.core.enums.Uzemanyag;
import hu.uni.miskolc.teszteles.core.enums.Valto;
import hu.uni.miskolc.teszteles.core.exceptions.AjtokSzamaNemMegfelelo;
import hu.uni.miskolc.teszteles.core.exceptions.GyartasiIdoNemMegfelelo;
import hu.uni.miskolc.teszteles.core.exceptions.RendszamNemMegfelelo;

public class AutoPojo {
	public String gyarto;
	public String modell;
	public Integer hengerurtartalom;
	@BsonId
	public String rendszam;
	public Uzemanyag uzemanyag;
	public LocalDate gyartasiIdo;
	public String szinHex;
	public boolean korozott;
	public String forgalmiSzama;
	public Valto valto;
	public Kivitel kivitel;
	public int ajtokSzama;
	
	public AutoPojo() {
		
	}
	public AutoPojo(String gyarto, String modell, Integer hengerurtartalom, String rendszam, Uzemanyag uzemanyag,
			LocalDate gyartasiIdo, String szinHex, boolean korozott, String forgalmiSzama, Valto valto, Kivitel kivitel,
			int ajtokSzama) {
		super();
		setGyarto(gyarto);
		setModell(modell);
		setHengerurtartalom(hengerurtartalom);
		setRendszam(rendszam);
		setUzemanyag(uzemanyag);
		setGyartasiIdo(gyartasiIdo);
		setSzinHex(szinHex);
		setKorozott(korozott);
		setForgalmiSzama(forgalmiSzama);
		setValto(valto);
		setKivitel(kivitel);
		setAjtokSzama(ajtokSzama);
	}
	
	public String getGyarto() {
		return gyarto;
	}
	public String getModell() {
		return modell;
	}
	public Integer getHengerurtartalom() {
		return hengerurtartalom;
	}
	public String getRendszam() {
		return rendszam;
	}
	public Uzemanyag getUzemanyag() {
		return uzemanyag;
	}
	public LocalDate getGyartasiIdo() {
		return gyartasiIdo;
	}
	public String getSzinHex() {
		return szinHex;
	}
	public boolean isKorozott() {
		return korozott;
	}
	public String getForgalmiSzama() {
		return forgalmiSzama;
	}
	public Valto getValto() {
		return valto;
	}
	public Kivitel getKivitel() {
		return kivitel;
	}
	public int getAjtokSzama() {
		return ajtokSzama;
	}
	public void setGyarto(String gyarto) {
		this.gyarto = gyarto;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public void setHengerurtartalom(Integer hengerurtartalom) {
		this.hengerurtartalom = hengerurtartalom;
	}
	public void setRendszam(String rendszam) {
		this.rendszam = rendszam;
	}
	public void setUzemanyag(Uzemanyag uzemanyag) {
		this.uzemanyag = uzemanyag;
	}
	public void setGyartasiIdo(LocalDate gyartasiIdo) {
		this.gyartasiIdo = gyartasiIdo;
	}
	public void setSzinHex(String szinHex) {
		this.szinHex = szinHex;
	}
	public void setKorozott(boolean korozott) {
		this.korozott = korozott;
	}
	public void setForgalmiSzama(String forgalmiSzama) {
		this.forgalmiSzama = forgalmiSzama;
	}
	public void setValto(Valto valto) {
		this.valto = valto;
	}
	public void setKivitel(Kivitel kivitel) {
		this.kivitel = kivitel;
	}
	public void setAjtokSzama(int ajtokSzama) {
		this.ajtokSzama = ajtokSzama;
	}

}
