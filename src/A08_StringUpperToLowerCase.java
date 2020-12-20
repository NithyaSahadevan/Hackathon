import java.util.Scanner;

public class A08_StringUpperToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String inputStr;
		
		//Read a string
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string in upper case");
		inputStr=s.nextLine();
		
		s.close();
		
		System.out.println("Lower Case of "+inputStr+" is "+inputStr.toLowerCase());
	}

}
