package ro.ase.cts;

public class Program {

	public static void main(String[] args) {

		APizza pizza = new PizzaVegetariana();
		System.out.println(pizza.getComponente());
		System.out.println(pizza.getPret());
		

		APizza pizzaDecorata = new DecoratorCrown(pizza);
		System.out.println(pizzaDecorata.getComponente());
		System.out.println(pizzaDecorata.getPret());


		APizza pizzaDecorataMultiplu = new DecoratorPicant
				(new DecoratorCrown
						(new PizzaVegetariana()), 10);
		System.out.println(pizzaDecorataMultiplu.getComponente());
		System.out.println(pizzaDecorataMultiplu.getPret());


	}

}
