import java.util.Scanner;

public class A14_StringReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String str;

		// Enter the sentence
		System.out.println("Enter the string");
		str = s.nextLine();
		s.close();

		String[] words = str.split(" ");

		String revWord = "";
		for (int j = words.length - 1; j >= 0; j--) {
			revWord = revWord + words[j] + " ";
		}

		System.out.println("Reversed string: " + revWord);
	}

}
