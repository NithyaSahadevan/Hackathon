import java.util.Scanner;

public class A28_FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		//Read array size
		System.out.println("Enter the number: ");
		int iNum=s.nextInt();
		s.close();
		int factorial = fact(iNum);
		System.out.println("Factorial of "+iNum+" is: "+factorial);

	}

	static int fact(int n)
	{
		int output;
		if(n==1){
			return 1;
		}
		//Recursion: Function calling itself!!
		output = fact(n-1)* n;
		return output;
	}

}
