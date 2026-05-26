public class displayHI{
	
	

	public static void PrintMiddleTopOfHI(){

	for(int row = 0; row<3; row++){
	for(int col = 0; col<3; col++){

		System.out.print("I ");
	
	}
	System.out.print("        ");
	System.out.print(" ");
	System.out.print("        "); 
	for(int col = 0; col<3; col++){

		System.out.print("I ");
		
	}
	
	System.out.print("                ");
	System.out.print("H");
	System.out.println("");


}


	}


	public static void PrintTopOfHI(){


	for(int row = 0; row<1; row++){
	for(int col = 0; col<3; col++){

		System.out.print("I ");
	
	}
	System.out.print("        ");
	System.out.print(" ");
	System.out.print("        "); 
	for(int col = 0; col<3; col++){

		System.out.print("I ");
		
	}
	
	System.out.print("        ");
	for(int i=0; i<9;i++){
		System.out.print("H ");
	}
	
	System.out.println("");


}



	}




	public static void main(String[] args){


	PrintTopOfHI();

	PrintMiddleTopOfHI();

 	for(int col = 0; col<7; col++){

		System.out.print("I ");

	}

	System.out.print(" ");
	for(int col = 0; col<7; col++){

		System.out.print("I ");

	}
	System.out.print("                ");
	System.out.print("H ");
	System.out.println("");
	PrintMiddleTopOfHI();

	PrintTopOfHI();






}}


