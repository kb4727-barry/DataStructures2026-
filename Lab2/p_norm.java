import java.lang.Math;
import java.util.Random;

public class p_norm{
	

	public static double lp_norm(double[] v, int p){

		double norm = 0.0;

		for(int i=0; i<v.length; i++){


		norm+= Math.abs(Math.pow(v[i],p));


		}

	return Math.pow(norm, 1.0/p);

	}




	public static void main(String[] args){


		double[] vec = new double[10];

		Random r = new Random();

		System.out.print("Vector is given by: ");
		System.out.print("[");
		for(int i=0; i<vec.length-1; i++){

			vec[i] = r.nextDouble();
			System.out.print(""+((int) (vec[i]*100))/100.0 +",");


		}
		vec[vec.length-1] = r.nextDouble();
		System.out.print(""+((int) (vec[vec.length-1]*100))/100.0 +"]");
		System.out.println("");

		System.out.print("Lp norm is given by: ");

		int p = 2; 
		double lpnorm = p_norm.lp_norm(vec, p);

		System.out.print(""+(int)(lpnorm*100)/100.0);











	}




}