
import java.util.Scanner;


public class countVowels{


	public static int Vcount(String s){

		int count_vowels = 0;


		for(int i = 0; i<s.length(); i++){

			char c = s.charAt(i);

			switch(c){

			case('a'): count_vowels++; break;

			case('e'): count_vowels++; break;

			case('i'): count_vowels++; break;

			case('o'): count_vowels++; break;
 
			case('u'): count_vowels++; break;


			case('A'): count_vowels++; break;

			case('E'): count_vowels++; break;

			case('I'): count_vowels++; break;

			case('O'): count_vowels++; break;
 
			case('U'): count_vowels++; break;

		}}


		return count_vowels;


	}

	public static void main(String[] args){

		Scanner myScan = new Scanner(System.in); 


		System.out.println("Enter a string");
		String s1 = " ";
		if(myScan.hasNext()){
		s1 = myScan.next();
		}
		int num_vowels = Vcount(s1);

		System.out.println("Number of vowels is" + num_vowels);







	}



}