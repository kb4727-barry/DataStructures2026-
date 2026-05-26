
import java.lang.Math;
import java.util.Scanner;

public class sumOfsquares{
	

	public static int sos(int n){


	int sum_of_squares = 0;

	for(int i=0; i<=n; i++){

	sum_of_squares += Math.pow(i, 2.0);

	}

	return sum_of_squares;



	}


	public static void main(String[] args){

		int n;

		System.out.println("Enter a new integer");
		Scanner myscan = new Scanner(System.in);
		n = myscan.nextInt();
		int sum_of_squares = sos(n);
		System.out.println("Sum of squared numbers up to n is : ");
		System.out.println(Integer.toString(sum_of_squares));




	}





}