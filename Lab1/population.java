public class population{


	private static int total_population = 0;

	private int own_population;


	public population(int pop){

		this.own_population = pop;	
		total_population += pop; 


	}


	public static int get_total_population(){

	return total_population;

	}


	public void increment_population(){

		total_population+=1;
		own_population +=1;

	}

	public int get_own_population(){

	return own_population;

	}









}