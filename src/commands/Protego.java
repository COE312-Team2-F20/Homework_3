package commands;

public class Protego implements Command{

	Wand w;
	Protego(Wand w){
		this.w = w;
	}
	@Override
	public void execute() {
		w.Protego();
	}
}
