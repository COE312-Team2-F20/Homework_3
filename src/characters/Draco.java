package characters;


public class Draco extends Villians {
	public Draco() {
		super("Draco Malfoy");
	}

	public void fight() {
		System.out.println("I won't let you get away this time Potter!");
		setdefeat(true);
	}
}
