package beadandocore;

import java.time.LocalDate;

import beadandocore.enums.Futes;
import beadandocore.enums.Tipus;
import beadandocore.exceptions.EpitesIdejeNemMegfelelo;
import beadandocore.exceptions.IranyitoszamNemMegfelelo;
import beadandocore.exceptions.SzobakSzamaNemMegfelelo;
public class House {
	
	
	protected int id;
	protected int iranyitoszam;
	protected int szobakSzama;
	protected int hazszam;
	protected double alapTerulet;
	protected boolean vaneHitel;
	protected String szin;
	protected String telepules;
	protected String utca;
	protected Tipus tipus;
	protected Futes futes;
	protected LocalDate epitesIdeje;
	
	
	public House(int id, int iranyitoszam, int szobakSzama, int hazszam, double alapTerulet, boolean vaneHitel, String szin,
			String telepules, String utca, Tipus tipus, Futes futes, LocalDate epitesIdeje) {
		super();
		this.id = id;
		this.iranyitoszam = iranyitoszam;
		this.szobakSzama = szobakSzama;
		this.hazszam = hazszam;
		this.alapTerulet = alapTerulet;
		this.vaneHitel = vaneHitel;
		this.szin = szin;
		this.telepules = telepules;
		this.utca = utca;
		this.tipus = tipus;
		this.futes = futes;
		this.epitesIdeje = epitesIdeje;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) throws IranyitoszamNemMegfelelo {
		if (id < 0) {
			throw new IranyitoszamNemMegfelelo(id);
		}
		this.id = id;
	}

	public House() {
		super();
		
	}

	public int getIranyitoszam() {
		return iranyitoszam;
	}
	public void setIranyitoszam(int iranyitoszam) throws IranyitoszamNemMegfelelo {
		if (iranyitoszam < 1000 || iranyitoszam > 9999) {
			throw new IranyitoszamNemMegfelelo(iranyitoszam);
		}
		this.iranyitoszam = iranyitoszam;
	}
	public int getSzobakSzama() {
		return szobakSzama;
	}
	public void setSzobakSzama(int szobakSzama) throws SzobakSzamaNemMegfelelo{
		if (szobakSzama < 0 || szobakSzama > 100) {
			throw new SzobakSzamaNemMegfelelo(szobakSzama);
		}
		this.szobakSzama = szobakSzama;
	}
	public int getHazszam() {
		return hazszam;
	}
	public void setHazszam(int hazszam) throws SzobakSzamaNemMegfelelo{
		if (hazszam < 0 || hazszam > 10000) {
			throw new SzobakSzamaNemMegfelelo(hazszam);
		}
		this.hazszam = hazszam;
	}
	public double getAlapTerulet() {
		return alapTerulet;
	}
	public void setAlapTerulet(double alapTerulet) throws SzobakSzamaNemMegfelelo{
		if (alapTerulet < 0 || alapTerulet > 100000000) {
			throw new SzobakSzamaNemMegfelelo(alapTerulet);
		}
		this.alapTerulet = alapTerulet;
	}
	public boolean isVaneHitel() {
		return vaneHitel;
	}
	public void setVaneHitel(boolean vaneHitel) {
		this.vaneHitel = vaneHitel;
	}
	public String getSzin() {
		return szin;
	}
	public void setSzin(String szin) {
		this.szin = szin;
	}
	public String getTelepules() {
		return telepules;
	}
	public void setTelepules(String telepules) {
		this.telepules = telepules;
	}
	public String getUtca() {
		return utca;
	}
	public void setUtca(String utca) {
		this.utca = utca;
	}
	public Tipus getTipus() {
		return tipus;
	}
	public void setTipus(Tipus tipus) {
		this.tipus = tipus;
	}
	public Futes getFutes() {
		return futes;
	}
	public void setFutes(Futes futes) {
		this.futes = futes;
	}
	public LocalDate getEpitesIdeje() {
		return epitesIdeje;
	}
	public void setEpitesIdeje(LocalDate epitesIdeje) throws EpitesIdejeNemMegfelelo {
		if (epitesIdeje.isAfter(LocalDate.now()) || epitesIdeje.isBefore(LocalDate.of(1850, 1, 1))) {
			throw new EpitesIdejeNemMegfelelo(epitesIdeje);
		}
		this.epitesIdeje = epitesIdeje;
	}
	
}
