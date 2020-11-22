package Potions;

public class PolyjuicePotion extends Potion{

	void AddIngredients() {
		
		System.out.println("Adding fluxweed and lacewings in cauldron...");
	}

	
	void Stir() {
		
		System.out.println("Stirring 4 times clockwise...");
	}

	public boolean WandNeeded(){
		return true;
	}

	void WaveWand() {
		System.out.println("Waving wand to complete brewing...");
		
	}

	
}
