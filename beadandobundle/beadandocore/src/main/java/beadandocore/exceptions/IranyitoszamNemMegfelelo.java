package beadandocore.exceptions;

public class IranyitoszamNemMegfelelo extends Exception {

	public IranyitoszamNemMegfelelo(int iranyitoszam) {
		super(String.valueOf(iranyitoszam));
	}
}
