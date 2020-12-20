import java.io.IOException;
import java.util.Scanner;

public class A16_RemoveGivenCharacter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str,newStr;
		char c;
		Scanner s=new Scanner(System.in);

		//Enter the sentence
		System.out.println("Enter the string");
		str=s.nextLine();
		
		System.out.println("Enter the character to be removed");
		c=(char)System.in.read();
		
		s.close();

		newStr = str.replaceAll(Character.toString(c), "");
		
		System.out.println(str+" after removing "+c+" is "+newStr);
	}

}
