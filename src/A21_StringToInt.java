import java.util.Scanner;

public class A21_StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		int result=Integer.MIN_VALUE;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.nextLine();
		s.close();
		try
		{
			result = Integer.parseInt(str);				
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter a string in number format");
		}
		finally
		{
			System.out.println("Number format of "+str +" is "+result);
		}
	}

}
