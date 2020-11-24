package template;

public abstract class Potion {

	final void PreparePotion() {

		AddIngredients();
		Stir();
		Heat();
		WaveWand();
	}

	protected void Heat() {

		System.out.println("Heating at high temperature...");
	}

	abstract void AddIngredients();

	abstract void Stir();

	abstract void WaveWand();

}
