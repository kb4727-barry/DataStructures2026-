public class C extends B{
	
	
	protected int x = 2;

	public C(int value_xGP, int valuexP, int valuexC){

		super(value_xGP, valuexP);

		x = valuexC;


	};


	public int get_x(){

	return x; 

}


	public int get_Pasx(){

	int Pasx = super.get_x();

	return Pasx; 

}


public int get_GrandPasx(){

	int GrandPasx = super.get_Pasx();

	return GrandPasx; 

}
	











}