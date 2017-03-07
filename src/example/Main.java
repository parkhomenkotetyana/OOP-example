package example;

/**
 * This class demonstrates the work of this OOP-example.
 * 
 * @author Tetiana Parkhomenko
 *
 */
public class Main {  

	public static void main(String[] args) {		
		
		Plant rose = new Flower("Rose", 10, "red", 50.0);
		Plant tulip = new Flower("Tulip", 8, "yellow", 30.0);
		Plant dandelion = new Flower("Dandelion", 1, "yellow", 10.0);
		
		//Create bouquet
		Bouquet bouquet = new Bouquet();		
		bouquet.addFlower((Flower)rose, 10);
		bouquet.addFlower((Flower)tulip, 1);
		bouquet.addFlower((Flower)dandelion, 1);
				
		double cost = bouquet.getCost();
		System.out.println("This bouquet costs: " + cost);
		
		int amountOfFlowers = bouquet.getAmountOfFlowers();
		System.out.println("There are " + amountOfFlowers + " flowers in the bouquet.");
		
		Plant oak = new Tree("Oak", 30, 20);
		Plant poplar = new Tree("Poplar", 50, 10);
		Plant apple = new Tree("Apple", 20, 5);
		
		//Create garden
		Garden garden = new Garden();		
		garden.addPlant(oak, 10);
		garden.addPlant(poplar, 20);
		garden.addPlant(apple, 5);
		garden.addPlant(rose, 40);
		garden.addPlant(dandelion, 100);
		
		System.out.println(garden);
		
		garden.growGarden(20);
		
		System.out.println("After 20 years:");
		System.out.println(garden);
	}
}
