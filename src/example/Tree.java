package example;

/**
 * Tree entity.
 * 
 * @author Tetiana Parkhomenko
 *
 */
public class Tree extends Plant {
	
	private double height;
	
	public Tree(String name, int maxAge, double height) {
		super(name, maxAge);
		this.height = height;		
	}	 

	public double getHeight() {
		return height;
	}

	@Override
	public void plant() {
		age = 0;	
	}

	@Override
	public void grow() {
		age++;
		height++;		
	}

	@Override
	public void die() {
		age = -1;	
		height = -1;
	}
}
