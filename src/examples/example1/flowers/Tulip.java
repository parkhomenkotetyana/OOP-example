package examples.example1.flowers;

public class Tulip extends Flower {	

	public Tulip(){
		name = "Tulip";
		color = "Red";
		price = 30.0;
	}
	
	public Tulip(String color, double price){
		name = "Tulip";
		this.color = color;
		this.price = price;
	}
}
