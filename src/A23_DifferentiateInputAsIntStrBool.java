import java.util.Scanner;

public class A23_DifferentiateInputAsIntStrBool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
	
		str=s.nextLine();

		//String str2=new String(str);
		s.close();
		
		if(Boolean.parseBoolean(str))
		{
			System.out.println("Entered string is Boolean");
		}
		else
		{
			for (int i = 0; i<str.length(); i++) 
			{
				if(!(Character.isDigit(str.charAt(i))))
				{
					System.out.println("Entered string is a string");
					System.exit(0);
				}

			}		
			System.out.println("Entered string is an Integer");
		}		

	}

}
