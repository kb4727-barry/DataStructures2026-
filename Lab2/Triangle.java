
import java.lang.Math;


public class Triangle extends Shape{

	// assuming triangle is rectangle
	private double basis;
	private double height; 



	public Triangle(double b, double h){

		super(3);
		basis = b;
		height = h;


	}



	public double get_basis(){

	return basis;

	};

	public double get_height(){

	return height;

	};	

	public void set_basis(double b){

	basis = b;

	};

	public void set_height(double h){

	height = h;

	};


	public double getArea(){

		return basis*height/2.0;

	};

	public double getPerimeter(){

		return basis + height + Math.sqrt(Math.pow(basis,2) + Math.pow(height,2) ); 



	} ;






}