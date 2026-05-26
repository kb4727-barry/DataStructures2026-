import java.util.Scanner;

public class Rectangle{
	
	public static double[] perimeter_and_area(double w, double l){


		double[] results = new double[2];

		// first element of the array is perimeter, 
		// second element is area 
		results[0] = 2*w + 2*l;
		results[1] = w*l;


		return results;

	}

	public static void main(String[] args){


	System.out.print("Please enter width and length of rectangle:");
	Scanner myScan = new Scanner(System.in);
	double w = myScan.nextDouble();
	double l = myScan.nextDouble();
	System.out.println("perimeter and area are respectively given by:");
	
	double[] my_results = perimeter_and_area(w, l);

	System.out.println("p = "+my_results[0]);
	System.out.println("a = "+my_results[1]);







	}






}