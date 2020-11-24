package characters;

public class Snape extends Villians{
	public Snape() {
		super("Snape");
	}
	
	public void fight() {
		System.out.println("Well well if it isn't Harry Potter, get ready to fight for your life!");
		setdefeat(true);
	}
}