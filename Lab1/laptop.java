public class laptop{
	

	private String model;
	private String make;
	private String purchaser;
	private int purchaseYear;

	public laptop(String model_type){

		model = model_type;
		

	}


	
	// Mutator methods

	public void setMaker(String mker){

		make = mker;

	}

	public void setPurchaseYear(int pYear){

		purchaseYear = pYear;

	}

	// Accessor methods

	public String getModel(){

		return model;

	}

	public int getPurchaseYear(){

		return purchaseYear;

	}

	
	public String getMaker(){

		return make;

	}

	public void toStr(){

		System.out.println("Laptop model is " + getModel());

		System.out.println("Brand is " + getMaker());

		System.out.println("Purchase Year is " + getPurchaseYear());		



	}




}