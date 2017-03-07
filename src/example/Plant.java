package example;

public abstract class Plant implements Plantable {
	
	private final String name;
	private final int maxAge;
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
