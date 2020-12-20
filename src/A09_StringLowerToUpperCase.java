import java.util.Scanner;

public class A09_StringLowerToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputStr;

		//Read a string
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string in lower case");
		inputStr=s.nextLine();

		s.close();

		System.out.println("Upper Case of "+inputStr+" is "+inputStr.toUpperCase());

	}

}
