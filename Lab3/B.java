public class B extends A{
	

	protected int x = 1;

public B(int value_xP, int value_xC){

	super(value_xP);
	x = value_xC; 


};

public int get_x(){

	return x; 

}

public int get_Pasx(){

	int Pasx = super.get_x();
	
	return Pasx;

}



}