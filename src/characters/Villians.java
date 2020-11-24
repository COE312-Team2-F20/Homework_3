package characters;

public abstract class Villians {
	String name;
	boolean defeated;

	Villians() {
		name = "";
	}

	Villians(String name) {
		this.name = name;
	}
	public void setdefeat(boolean flag) {
		defeated = flag;
	}
	public boolean getdefeat() {
		return defeated;
	}
}
