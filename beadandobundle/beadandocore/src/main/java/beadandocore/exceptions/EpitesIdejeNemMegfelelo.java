package beadandocore.exceptions;

import java.time.LocalDate;

public class EpitesIdejeNemMegfelelo extends Exception {

	public EpitesIdejeNemMegfelelo(LocalDate epitesIdeje) {
		super(epitesIdeje.toString());
	}
}
