import java.util.Scanner;

public class A10_StringSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr;

		//Read a string
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string ");
		inputStr=s.nextLine();

		s.close();

		// prints the subsequence from 0-7, exclusive 7th index 
		System.out.println("Returns first 6 characters  "+inputStr.subSequence(0, 7)); 


		System.out.println("Returned characters  "+inputStr.subSequence(8,11)); 

	}

}
