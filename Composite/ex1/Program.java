package DP.Structurale.Composite.ex1;


public class Program {

	public static void main(String[] args) {

				Structura structuraMeniu = new Structura("Meniu restaurant");
				
				Meniu meniu = new Meniu(structuraMeniu, "Pizzeria ASE");
				

				ANod structuraBauturi = new Structura("Bauturi");
				ANod structuraMancare = new Structura("Mancare");
				structuraMeniu.adaugaNod(structuraBauturi);
				structuraMeniu.adaugaNod(structuraMancare);
				

				structuraBauturi.adaugaNod(new Produs("CocaCola", 10));
				structuraBauturi.adaugaNod(new Produs("Pepsi", 9));
				

				Structura structuraMancarePizza = new Structura("Pizza");
				Structura structuraMancarePaste = new Structura("Paste");
				structuraMancare.adaugaNod(structuraMancarePizza);
				structuraMancare.adaugaNod(structuraMancarePaste);
				

				structuraMancarePizza.adaugaNod(new Produs("Pizza Margherita", 25));
				structuraMancarePizza.adaugaNod(new Produs("Pizza Capriciosa", 29));
			

				structuraMancarePaste.adaugaNod(new Produs("Paste carbonara", 27));
				structuraMancarePaste.adaugaNod(new Produs("Paste branza", 32));
			

				System.out.println(meniu.getNumeRestaurant());
				System.out.println(structuraMeniu.getInfo());

	}

}
