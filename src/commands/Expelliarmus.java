package commands;

public class Expelliarmus implements Command{
	
	Wand w;
	Expelliarmus(Wand w){
		this.w = w;
	}
	@Override
	public void execute() {
		w.Expelliarmus();
	}
}
