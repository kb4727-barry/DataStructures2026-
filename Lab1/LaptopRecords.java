public class LaptopRecords{
	
	
	static laptop L1;
	static laptop L2;
	static laptop L3;


	public static void main(String[] args){

		L1 = new laptop("Mac Pro");
		L2 = new laptop("Dell latitude");
		L3 = new laptop("HP victus");


		L1.setMaker("Apple");
		L1.setPurchaseYear(2024);

		L2.setMaker("Dell");
		L2.setPurchaseYear(2025);

		L3.setMaker("HP");
		L3.setPurchaseYear(2026);


		System.out.println("Printing Purchase Summary");
		System.out.println("First computer");
		L1.toStr();

		System.out.println("Second computer");
		L2.toStr();

		System.out.println("Third computer");
		L3.toStr();









	}


}