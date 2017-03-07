package example;

/**
 * Abstract class for all plants.
 * 
 * @author Tetiana Parkhomenko
 *
 */
public abstract class Plant implements Plantable {
	
	private final String name;
	private final int maxAge;
	
	//Current age
	protected int age;
	
	public Plant(String name, int maxAge) {
		this.name = name;
		this.maxAge = maxAge;
	}

	public String getName() {
		return name;
	}
	
	public int getMaxAge() {
		return maxAge;
	}
	
	public int getAge() {
		return age;
	}

}
