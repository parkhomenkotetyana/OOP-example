package example;

import java.util.HashMap;
import java.util.Map;

/**
 * Bouquet entity.
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

	/**
	 * Returns amount of flowers in the bouquet.
	 * 
	 * @return amount of flowers
	 */
	public int getAmountOfFlowers() {
		int amount = 0;

		for (Map.Entry<Flower, Integer> flower : bouquet.entrySet()) {
			amount += flower.getValue();
		}

		return amount;
	}

}
