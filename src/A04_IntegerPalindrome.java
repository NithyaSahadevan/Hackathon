import java.util.Scanner;

public class A04_IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		int len;
		
		//Read array size
		System.out.println("Enter the array size: ");
		len=s.nextInt();

		int[] arr=new int[len];

		//Read the array
		System.out.println("Enter the array elements: ");
		for(int i=0;i<len;i++)
		{
			arr[i]=s.nextInt();
		}
		s.close();
		
		//Read isPalindrome function
		boolean res=isPalindrome(arr);
		if(res)
			System.out.println("Entered array is a Palindrome");
		else
			System.out.println("Entered array is not a Palindrome");
	}
	
	public static boolean isPalindrome(int[] arr) {
		int length = arr.length;
		for (int index = 0; index < arr.length; index++)
		{
			// get the element from the start
			int start = arr[index];
			// get corresponding element from end
			int end = arr[--length];
			
			
			if (length < index) {
				return true;
			}
			// if start element is not the same as end element, the array is not palindrome
			if (start != end) {
				return false;
			}
		}
		// if the control reaches here, means all the elements were same 
		return true;
	}

}
