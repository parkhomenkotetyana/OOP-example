package examples.example1.flowers;

/**
 * Rose entity.
 * 
 * @author Tetiana Parkhomenko
 *
 */
public class Rose extends Flower{

	public Rose(){
		name = "Rose";
		color = "Red";
		price = 50.0;
	}
	
	public Rose(String color, double price){
		name = "Rose";
		this.color = color;
		this.price = price;
	}
}
