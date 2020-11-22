package commands;

public class Stupefy implements Command{
	Wand w;
	Stupefy(Wand w){
		this.w = w;
	}
	@Override
	public void execute() {
		w.Stupefy();
	}
}
