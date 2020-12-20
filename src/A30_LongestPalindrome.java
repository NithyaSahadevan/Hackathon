import java.util.Scanner;

public class A30_LongestPalindrome {

	
	public static String getLongestPalindrome(final String input) 
	{
		int rightIndex = 0, leftIndex = 0;
		String currentPalindrome = "", longestPalindrome = "";
		for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) 
		{
			leftIndex = centerIndex - 1;  rightIndex = centerIndex + 1;
			while (leftIndex >= 0 && rightIndex < input.length()) 
			{
				if (input.charAt(leftIndex) != input.charAt(rightIndex))
				{
					break;
				}
				currentPalindrome = input.substring(leftIndex, rightIndex + 1);
				longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
				leftIndex--;  rightIndex++;
			}
		}
		return longestPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String str = s.nextLine();
		s.close();
		String longestPali = getLongestPalindrome(str);
		System.out.println("String: " + str);
		System.out.println("Longest Palindrome: " + longestPali);
	}

}
