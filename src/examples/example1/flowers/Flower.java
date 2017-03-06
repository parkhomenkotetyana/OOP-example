package examples.example1.flowers;

import examples.example1.MakeBouquet;

public class Flower implements MakeBouquet{

	protected String name;
	protected String color;
	protected double price;

	public Flower(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public Flower() {
		name = "Unknown";
		color = "Unknown";
		price = 0.0;
	}
	

	@Override
	public void clean() {
		System.out.println("Cleaning " + this.getName());		
	}

	@Override
	public void cut() {
		System.out.println("Cutting " + this.getName());				
	}

	@Override
	public void putInBouquet() {
		System.out.println("Putting " + this.getName() + " in the bouquet");		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
}
