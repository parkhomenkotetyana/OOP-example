package example;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents bouquet entity.
 * 
 * @author Tetiana Parkhomenko
 *
 */
public class Bouquet {

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
		if (amount < 0) return;
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

	public int getAmountOfFlowers() {
		int amount = 0;

		for (Map.Entry<Flower, Integer> flower : bouquet.entrySet()) {
			amount += flower.getValue();
		}

		return amount;
	}

}
