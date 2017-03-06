package examples.example1;

import java.util.HashMap;
import java.util.Map;

import examples.example1.flowers.Flower;

public class Bouquet {

	private Map<Flower, Integer> bouquet;
	
	public Bouquet() {
		bouquet = new HashMap<Flower, Integer>();
	}

	public void addFlower(Flower flower, int amount) {
		flower.clean();
		flower.cut();
		flower.putInBouquet();
		bouquet.put(flower, amount);
	}

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
