import java.util.Random;

public class LockableCoinDemo{
	
	

	public static void main(String[] args){

		LockableCoin myCoin = new LockableCoin();
		myCoin.locked();
		if(myCoin.locked()==true){
		System.out.print("Coin is locked");}
		else{
		System.out.print("Coin is unlocked");}

		System.out.println("");

		Random ran = new Random();

       	int k = ran.nextInt();

       	System.out.println("Initial key is "+k);

		myCoin.setKey(k);
       	myCoin.lock(k);

       	if(myCoin.locked()==true){
		System.out.print("Coin is locked");}
		else{
		System.out.print("Coin is unlocked");}

		System.out.println("");

		// System.out.println("Trying to check whether the coin in heads...");

		// myCoin.isHeads();

		System.out.println("Trying to check whether the coin can be flipped...");

		myCoin.flip();








	}




}