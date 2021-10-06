package emberek;

import java.util.*;

public class EmberekLista {
	private List<String> emberek;

	public EmberekLista() {
		super();
		this.emberek = new ArrayList<String>();
	}

	public void add(String people) {
		if (!this.emberek.contains(people)) {
			emberek.add(people);
		}
	}

	public void remove(String people) {
		if (this.emberek.contains(people)) {
			emberek.remove(people);
			return;
		}

		throw new NoSuchElementException();

	}

	public List<String> getEmberek() {
		return emberek;
	}

	public void setEmberek(List<String> emberek) {
		this.emberek = emberek;
	}

	public int size() {
		return this.emberek.size();
	}

	public boolean isEmpty() {
		return this.emberek.isEmpty();
	}

	public void removeAll() {
		this.emberek.removeAll(emberek);
		this.emberek.clear();
	}
}
