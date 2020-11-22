package commands;

public class ExpectoPatronum implements Command{

	Wand w;
	ExpectoPatronum(Wand w){
		this.w = w;
	}
	@Override
	public void execute() {
		w.ExpectoPatronum();
	}

}
