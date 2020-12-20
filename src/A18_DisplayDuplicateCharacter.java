import java.util.HashMap;
import java.util.Scanner;

public class A18_DisplayDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		str1=sc.nextLine();
		sc.close();
		
        char[] chars = str1.toCharArray();
         
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : chars) 
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
         
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
        for(char c : map.keySet()) {
            if(map.get(c) > 1 && !Character.isWhitespace(c)) {
                System.out.println(c + " occurs " + map.get(c) + " times");
            }
        }

	}

}
