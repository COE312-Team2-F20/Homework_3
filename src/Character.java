//Abstract class to for characters
public abstract class Character {
	String name;
	// Every character needs a location updater if they move around
	LocationUpdater lu;

	Character() {
		name = "";
	}

	Character(String name, LocationUpdater lu) {
		this.name = name;
		this.lu = lu;
	}
}
