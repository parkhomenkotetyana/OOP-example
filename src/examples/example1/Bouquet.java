package examples.example1;

import java.util.HashMap;
import java.util.Map;

import examples.example1.flowers.Flower;

/**
 * This class represents bouquet entity.
 * 
 * @author Tetiana Parkhomenko
 *
 */
public class Bouquet{

	private Map<Flower, Integer> bouquet;
	
	public Bouquet() {
		bouquet = new HashMap<Flower, Integer>();
	}

	/**
	 * Add flower in the bouquet.
	 * 
	 * @param flower 
	 * @param amount
	 */
	public void addFlower(Flower flower, int amount) {
		System.out.println("Adding " + amount + " " + flower.getName());
		bouquet.put(flower, amount);
	}

	/**
	 * Returns cost of the bouquet.
	 * 
	 * @return cost of the bouquet
	 */
	public double getCost() {
		double cost = 0.0;

		for (Map.Entry<Flower, Integer> flower : bouquet.entrySet()) {
			cost += flower.getKey().getPrice() * flower.getValue();
		}

		return cost;
	}

	@Override
	public String toString() {
		return "Bouquet: " + bouquet;
	}

}
