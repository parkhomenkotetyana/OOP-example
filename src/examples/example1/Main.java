package examples.example1;

import examples.example1.flowers.Flower;
import examples.example1.flowers.Rose;
import examples.example1.flowers.Tulip;

/**
 * This class demonstrates the work of this OOP-example.
 * 
 * @author Tetiana Parkhomenko
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Flower dandelion = new Flower("Dandelion", "Yellow", 20.0);
		Flower redRose = new Rose("Red", 100.0);
		Flower yellowTulip = new Tulip("Yellow", 60.0);
		
		Bouquet bouquet = new Bouquet();
		bouquet.addFlower(dandelion, 1);
		bouquet.addFlower(redRose, 10);
		bouquet.addFlower(new Rose(), 1);
		bouquet.addFlower(yellowTulip, 2);
		
		double cost = bouquet.getCost();
		System.out.println(cost);

	}
}
