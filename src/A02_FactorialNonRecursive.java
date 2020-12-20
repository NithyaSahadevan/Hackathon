import java.util.Scanner;

public class A02_FactorialNonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iNum,i,fact=1;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		iNum=s.nextInt();
		
		s.close();
		
		for(i=1;i<=iNum;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);

	}

}
