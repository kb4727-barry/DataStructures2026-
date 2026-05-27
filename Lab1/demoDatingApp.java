
import java.util.Arrays;


public class demoDatingApp{
	
	
	static Profile Rudolph = new Profile("Rudolph", 28, "M", "F");

	static Profile Simon = new Profile("Simon", 30, "M", "M");

	static Profile Cindy = new Profile("Cindy", 30, "F", "M");

	static Profile Caroline = new Profile("Caroline", 30, "F", "F");

	

	public static void main(String[] args){

		Rudolph.add_new_interest("reading");

		Simon.add_new_interest("lifting");

		Simon.add_new_interest("going out");

		Cindy.add_new_interest("cooking");

		Cindy.add_new_interest("flower");

		Cindy.add_new_interest("drinking");

		Caroline.add_new_interest("travelling");

		Caroline.add_new_interest("backpacking");

		System.out.println("Printing list of all profiles:");
		for(int i=0; i< 2; i++)
			System.out.print(Rudolph.Profile_summary()[i] + " ");
		for(int i=0; i< Rudolph.number_of_interests; i++)
			System.out.print(Rudolph.returnMyListofInterests()[i] + " ");

		System.out.println("");


		for(int i=0; i< 2; i++)
			System.out.print(Simon.Profile_summary()[i] + " ");
		for(int i=0; i< Simon.number_of_interests; i++)
			System.out.print(Simon.returnMyListofInterests()[i] + " ");

		System.out.println("");


		for(int i=0; i< 2; i++)
			System.out.print(Cindy.Profile_summary()[i] + " ");
		for(int i=0; i< Cindy.number_of_interests; i++)
			System.out.print(Cindy.returnMyListofInterests()[i] + " ");

		System.out.println("");


		for(int i=0; i< 2; i++)
			System.out.print(Caroline.Profile_summary()[i] + " ");
		for(int i=0; i< Caroline.number_of_interests; i++)
			System.out.print(Caroline.returnMyListofInterests()[i] + " ");

		System.out.println("");


		


			





	}






}