package example;

import java.util.HashMap;
import java.util.Map;

public class Garden {

	private Map<Plant, Integer> garden;

	public Garden() {
		garden = new HashMap<Plant, Integer>();
	}

	public void addPlant(Plant plant, int amount) {
		if (amount < 0)	return;
		garden.put(plant, amount);
		plant.plant();
	}

	public void growGarden(int years) {

		for (int i = 1; i <= years; i++) {
			for (Map.Entry<Plant, Integer> plant : garden.entrySet()) {
				plant.getKey().grow();
				if (plant.getKey().getAge() == plant.getKey().getMaxAge()) {
					plant.getKey().die();
					garden.remove(plant.getKey());
					break;
				}
			}
		}
 
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Map.Entry<Plant, Integer> plant : garden.entrySet()) {
			stringBuilder.append(plant.getKey().getName());
			stringBuilder.append(" : ");
			stringBuilder.append(plant.getValue());
			stringBuilder.append(System.lineSeparator());
		}
		return stringBuilder.toString();
	}	

}
