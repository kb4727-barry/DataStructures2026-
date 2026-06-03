import java.util.Scanner; 

public class testShapes {
	

	

	public static void main(String[] args){

	Scanner my_scan = new Scanner(System.in);

	System.out.println("Enter Rectangle width: ");
	double w = my_scan.nextDouble();
	System.out.println("Enter Rectangle length: ");
	double l = my_scan.nextDouble();

	Rectangle2 R = new Rectangle2(w, l);

	System.out.println("Enter Triangle basis: ");
	double b = my_scan.nextDouble();
	System.out.println("Enter Triangle height: ");
	double h = my_scan.nextDouble();	

	Triangle T = new Triangle(b, h);


	System.out.println("Rectangle area = "+ R.getArea());

	System.out.println("Triangle perimeter = "+ T.getPerimeter());


	}




}