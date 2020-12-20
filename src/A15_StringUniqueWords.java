import java.util.ArrayList;
import java.util.Scanner;

public class A15_StringUniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner s=new Scanner(System.in);

		//Enter the sentence
		System.out.println("Enter the sentence");
		str=s.nextLine();
		s.close();

		ArrayList<String> list=new ArrayList<String>();
		String words[]=str.split(" ");

		for (int i = 0; i < words.length; i++) 
		{
			if (!(list.contains(words[i]))) {
				list.add(words[i]);
			}
		}

		System.out.println("The unique words in the above sentence are ");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}

}
