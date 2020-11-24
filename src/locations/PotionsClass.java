package locations;
import characters.*;
import runtime.*;
public class PotionsClass extends Location {
	String next;
	Reader reader;
	Snape s = new Snape();
	PotionsClass(Reader reader) {
		super("Potions Classroom");
		this.reader = reader;
	}

	public void look() {
		System.out.println("Potions is one of the core subjects that first year students are required to study. "
				+ "In the potions class there is Professor Snape who teaches the subject. ");
	}

}
