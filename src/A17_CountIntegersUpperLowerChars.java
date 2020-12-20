import java.util.Scanner;

public class A17_CountIntegersUpperLowerChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner s=new Scanner(System.in);

		//Enter the string
		System.out.println("Enter the string");
		str=s.nextLine();
		
		s.close();
		
		int upper = 0, lower = 0, num = 0; 

		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				upper++; 
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				lower++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				num++; 
			}
		}
		System.out.println("Number of Lower case letters : " + lower); 
		System.out.println("Number of Upper case letters : " + upper); 
		System.out.println("Number of Numbers : " + num); 

	}

}
