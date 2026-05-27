import java.util.Arrays;

public class Profile{
	
	private String name;
	private int age; 
	private String my_gender;
	private String interested_in;
	private String[] my_general_interests = new String[1];
	public int number_of_interests = 0;

	private String[] summary = new String[2]; 


	public Profile(String input_name){

		name = input_name;


	}


	public Profile(String input_name, int input_age){

		name = input_name;
		age = input_age; 

	}

	public Profile(String input_name, int input_age, String gender, String physical_interests){

		name = input_name;
		age = input_age; 
		my_gender = gender; 
		interested_in = physical_interests;

		summary[0] = input_name;
		summary[1] = Integer.toString(input_age);

	}


	// used to update physical interests
	public void attracted_to(String new_interest){


		interested_in = new_interest;


	}

	// used to update list of personal interests 
	public void add_new_interest(String new_interest){


		
		my_general_interests[number_of_interests] = new_interest;
		my_general_interests = Arrays.copyOf(my_general_interests, my_general_interests.length+1);
		number_of_interests+=1;
		


	}

	public String returnMyPhysicalInterests(){

		return interested_in;

	}

	public String[] returnMyListofInterests(){

		return my_general_interests;

	}

	public String[] Profile_summary(){

		return summary;

	}






}