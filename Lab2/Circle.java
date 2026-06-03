import java.util.Scanner;
import java.lang.Math;


public class Circle{


	public static void main(String[] args){

		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		double radius = myScan.nextDouble();
		double perimeter = 2.0*Math.PI*radius;
		System.out.println("Perimeter of circle is " + perimeter);


	}
	



}