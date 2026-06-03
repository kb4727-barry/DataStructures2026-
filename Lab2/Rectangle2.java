public class Rectangle2 extends Shape{


	private double length;
	private double width; 



	public Rectangle2(double l, double w){

		super(4);
		length = l;
		width = w;


	}



	public double get_length(){

	return length;

	};

	public double get_width(){

	return width;

	};	

	public void set_length(double l){

	length = l;

	};

	public void set_width(double w){

	width = w;

	};


	public double getArea(){

		return width*length;

	};

	public double getPerimeter(){

		return (2*width + 2*length);



	} ;






}