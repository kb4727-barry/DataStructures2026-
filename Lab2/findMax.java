public class findMax{


public static int f(int x){
	

	int result;
	result = -x*x + 3*x - 2;

	return result;


}


public static int findMaxMethod(){

int maxValue = f(-5);

	for(int i=-4; i<6; i++){

		if (f(i)>maxValue){

			maxValue = f(i);
		}


	}
return maxValue;  

}


public static void displayValues(){


	for(int i=-5; i<6; i++){

		System.out.print(f(i)+" ");


	}
System.out.println();

}





public static void main(String[] args){

	displayValues();

	int maxV = findMaxMethod();

	System.out.println("maximum value is "+maxV);

}


}







