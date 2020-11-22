package commands;

public class Driver {

	public static void main(String[] args) {
		Wand w = new Wand();
		
		ExpectoPatronum exp = new ExpectoPatronum(w);
		Expelliarmus ex = new Expelliarmus(w);
		Protego p = new Protego(w);
		Stupefy s = new Stupefy(w);
		
		Command[] cmds = {exp, ex, p, s};
		ControlPanel cp = new ControlPanel(cmds);
		
		cp.order(0);
		cp.order(1);
		cp.order(2);
		cp.order(3);
	
	}

}
