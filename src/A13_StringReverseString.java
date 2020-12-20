import java.util.Scanner;

public class A13_StringReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		String str,revWord;
		String revStr="";

		//Enter the sentence
		System.out.println("Enter the string");
		str=s.nextLine();
		s.close();

		String[] words=str.split(" ");

		for(int i=words.length-1;i>=0;i--)
		{
			String w=words[i];
			revWord="";
			for(int j=w.length()-1;j>=0;j--)
			{
				revWord=revWord+w.charAt(j);
			}
			revStr=revStr+revWord+" ";
		}

		System.out.println("Reversed string: "+revStr);
	}

}
