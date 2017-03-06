package examples.example1;

import examples.example1.flowers.Flower;
import examples.example1.flowers.Rose;
import examples.example1.flowers.Tulip;

public class Main {

	public static void main(String[] args) {
		
		Flower topol = new Flower("Topol", "Green", 90.0);
		Flower redRose = new Rose("Red", 100.0);
		Flower yellowTulip = new Tulip("Yellow", 60.0);
		
		Bouquet bouquet = new Bouquet();
		bouquet.addFlower(topol, 1);
		bouquet.addFlower(redRose, 10);
		bouquet.addFlower(yellowTulip, 2);
		
		double cost = bouquet.getCost();
		System.out.println(cost);

	}

}
