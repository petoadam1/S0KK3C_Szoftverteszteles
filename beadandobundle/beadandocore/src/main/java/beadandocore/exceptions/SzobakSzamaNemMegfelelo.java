package beadandocore.exceptions;

public class SzobakSzamaNemMegfelelo extends Exception {

	public SzobakSzamaNemMegfelelo(int szobakSzama) {
		super(String.valueOf(szobakSzama));
	}
	public SzobakSzamaNemMegfelelo(double szobakSzama) {
		super(String.valueOf(szobakSzama));
	}
}
