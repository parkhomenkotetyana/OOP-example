package example;

/**
 * Flower entity.
 * 
 * @author Tetiana Parkhomenko
 *
 */ 
public class Flower extends Plant{

	private final String color;
	private double price;

	public Flower(String name, int maxAge, String color, double price) {
		super(name, maxAge);
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0.0) return;
		this.price = price;		
	}
	
	@Override
	public void plant() {
		age = 0;		
	}

	@Override
	public void grow() {
		age++;
	}

	@Override
	public void die() {
		age = -1;		
	}
	
}
