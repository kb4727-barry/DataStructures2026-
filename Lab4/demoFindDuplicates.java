import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class demoFindDuplicates{
	


	public static int findDuplicates(int[] test_array){

	int duplicate_index = 0;

	for (int i=0; i<test_array.length; i++){

		int test_value = test_array[i];

		for(int j=i+1; j<test_array.length; j++){

			if (test_array[j]==test_value)
				
				duplicate_index = j;


		}

	}

	return duplicate_index; 



}


	public static boolean find4(int[] array){

		boolean check = false;

		for(int i=0; i<array.length-1; i++){

			if(array[i]==array[i+1] && array[i+1]==array[i+2] && 
				array[i+2]==array[i+3] ){

				check = true;

			}


		}

		return check;



	}










	public static void main(String[] args){


	Random randomNumbers = new Random();


	Scanner myscan = new Scanner(System.in);

	System.out.print("Enter a value for n");
	int n = myscan.nextInt();

	int[] my_array = new int[n];


	
	for(int i=0; i<n-2; i++){
	
		
		my_array[i] = i;
		

	}
	my_array[n-1] = 1+randomNumbers.nextInt(n-2);


	for(int i=0; i<(n-2)/2; i++){
	
		int match = randomNumbers.nextInt((n-2)/2);

		int temp = my_array[n-1-match]; 
		my_array[n-1-match] = my_array[i];
		my_array[i] = temp;	
		

	}

	// mixing the array


	System.out.println("Array is given by:");
	System.out.print("[");
	for(int i=0; i<n-2; i++){

	System.out.print(""+my_array[i]+",");

	}
	System.out.println(""+my_array[n-1]+"]");


	
	int duplicate_index = demoFindDuplicates.findDuplicates(my_array);


	System.out.println("Finding location of duplicate");

	System.out.println("duplicate is located at position "+duplicate_index);	



	System.out.println("Enter sequence of Integers");

	

	int[] temp_array = new int[1];

	temp_array[0] = myscan.nextInt();

	while(myscan.hasNextInt()){

		temp_array = Arrays.copyOf(temp_array, temp_array.length+1);
		temp_array[temp_array.length-1] = myscan.nextInt();

	}

	myscan.close();


	System.out.println("Array built");

	int l = temp_array.length;


	// System.out.print("Enter a value for n");
	// int n = myscan.nextInt();

	// int[] my_array_f4 = new int[n];

	// for(int i=0; i<n; i++){

	// 	my_array_f4[i] = randomNumbers.nextInt(n-1);


	// }

	// index_c4 = randomNumbers.nextInt(n-4);

	// repeated_value = randomNumbers.nextInt(n-1);

	// for(int j=0;j<4; j++){
	
	// my_array_f4[index_c4+j] = repeated_value;
	
	// }


	System.out.println("Array is given by");

	System.out.print("[");
	for(int i=0; i<l-2; i++){

	System.out.print(""+temp_array[i]+",");

	}
	System.out.println(""+temp_array[l-1]+"]");


	System.out.println("Are there 4 consecutive numbers?");


	if (find4(temp_array))
		System.out.println("yes");
	else
		System.out.println("no");




}











}