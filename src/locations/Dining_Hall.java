package locations;

import characters.*;
import runtime.*;

public class Dining_Hall extends Location {
	String next;
	Reader reader;
	Bellatrix bel = new Bellatrix(Harry.getInstance());
	Dining_Hall(Reader reader) {
		super("Dining Hall");
		this.reader = reader;

	}
public void look() {
		System.out.println("The dining hall is the biggest open area inside Hogwarts.");
		fight();

	}
	public void fight() {
		bel.fight();
	}
}