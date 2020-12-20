import java.util.Scanner;

public class A11_StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String inputStr;

		//Read a string
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string ");
		inputStr=s.nextLine();

		s.close();

		System.out.println("Split with Regular expression");
		String[] arrStr1 = inputStr.split(" "); 
		System.out.println("There are "+arrStr1.length+" words in the given string");
		for(String splitStr:arrStr1) 
			System.out.println(splitStr); 
		
		System.out.println("Split with Regular expression and limit");
		String[] arrStr2 = inputStr.split(" ",3); 
		System.out.println("There are "+arrStr2.length+" words in the given string");
		for(String splitStr:arrStr2) 
			System.out.println(splitStr); 
		}
}
