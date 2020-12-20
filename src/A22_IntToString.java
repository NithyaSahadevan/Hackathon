import java.util.Scanner;

public class A22_IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iNum1,iNum2;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		iNum1=s.nextInt();
		iNum2=s.nextInt();		

		s.close();

		String str1 = Integer.toString(iNum1); 
		System.out.println("String format of "+iNum1+" is "+str1+" using Integer.tostring() method");

		String str2 = String.valueOf(iNum2); 
		System.out.println("String format of "+iNum2+" is "+str2+" using String.valueOf() method");

	}

}
