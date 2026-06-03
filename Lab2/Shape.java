
public abstract class Shape{
	
	private int numSides = 0;

	public Shape(int n_sides){

	numSides = n_sides;


	};


	public int number_of_sides(){

	return numSides;

	};

	public  abstract double getArea();

	public abstract double getPerimeter();







}

