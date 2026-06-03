public class testInheritanceHierarchy{
	

	public static void main(String[] args){


	C myGrandChild = new C(0,1,2);


	System.out.println("Value of GrandParent's x");
	System.out.println(""+myGrandChild.get_GrandPasx());
	System.out.println("Value of Parent's x");
	System.out.println(""+myGrandChild.get_Pasx());
	System.out.println("Value of Child's x");
	System.out.println(""+myGrandChild.get_x());


	}




}