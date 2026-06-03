public class Rectangle implements Resizable{
	

	private static double width;
	private static double height;

	public Rectangle(double w, double h){


		width = w;
		height = h;

	}

	public static void resize(double x){

		width *= x;
		height *= x;

	}

	public double get_width(){

		return width;


	}
	public double get_height(){

		return height;
	}

	public void set_width(double w){

		width=w;

	}

	public void set_height(double h){

		height=h;

	}

	public static double perimeter(){

		return 2*width + 2*height;

	}

	public static double area(){

		return width*height;

	}




	public static void main(String[] args){

		Rectangle rect = new Rectangle(2.0, 3.0);

		System.out.println("area and perimeter before rescaling:");
		System.out.println("area: "+ area());
		System.out.println("perimeter: "+ perimeter());
		System.out.println("Rescaling the rectangle by factor 2");
		System.out.println("New are and perimeter:");
		resize(2.0);
		System.out.println("area: "+ area());
		System.out.println("perimeter: "+ perimeter());









	}



}