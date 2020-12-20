import java.util.Scanner;

public class A01_BooleanVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean a,b,c;
		Scanner s=new Scanner(System.in);

		//Enter the boolean values
		System.out.println("Enter three boolean values");
		System.out.print("Enter the first boolean value-- ");
		a=s.nextBoolean();
		System.out.print("Enter the second boolean value-- ");
		b=s.nextBoolean();
		System.out.print("Enter the third boolean value-- ");
		c=s.nextBoolean();

		s.close();
		
		//Call the twoBooleansTrue function
		boolean result=twoBooleansTrue(a,b,c);
		if(result)
			System.out.println("Atleast two values are true");
		else
			System.out.println("Two values are not true");

	}

	public static boolean twoBooleansTrue(Boolean a, Boolean b, Boolean c) {
		return ((a & b) || (b & c) || (a & c));
	}
}
