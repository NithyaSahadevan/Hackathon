import java.util.Scanner;

public class A12_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr;
		int iNum;

		Scanner s=new Scanner(System.in);

		//String Palindrome
		System.out.println("String Palindrome ");
		System.out.println("Enter a string to check palindrome: ");
		inputStr=s.nextLine();


		isPalindrome(inputStr);	

		//Integer Palindrome
		System.out.println("Integer Palindrome ");
		System.out.println("Enter a number to check palindrome: ");
		iNum=s.nextInt();
		s.close();

		isPalindrome(iNum);
	}
	public static void isPalindrome(String str)
	{
		int i,j;
		int len=str.length();
		for(i=0,j=len-1;i<len/2;i++,j--)
		{
			if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(j)))
			{
				System.out.println(str+" is not a palindrome");
				break;
			}
		}
		System.out.println(str+" is a palindrome");
	}

	public static void isPalindrome(int iNum)
	{
		int iNum1=iNum;
		int revNum=0;
		while(iNum!=0)
		{
			revNum=revNum*10+(iNum%10);
			iNum=iNum/10;

		}
		if(iNum1==revNum)
			System.out.println(iNum1+" is a palindrome");	
		else
			System.out.println(iNum1+" is not a palindrome");
	}

}
