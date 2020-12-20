import java.util.Scanner;

public class A20_RepeatedIntegersUpperLowerChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner s=new Scanner(System.in);

		//Enter the string
		System.out.println("Enter the string");
		str=s.nextLine();
		s.close();

		int[] occured=new int[128];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				occured[str.charAt(i)]++;
		}

		for(int i = 0; i < occured.length; i++) 
		{ 
			if (occured[i]>1 && ( i >=65 &&i<= 90)) 
				System.out.println((char)(i) + " Upper Case character and is repeated "+occured[i]+ " times" ); 
			else if (occured[i]>1 && ( i >=97 &&i<= 122)) 
				System.out.println((char)(i) + " Lower Case character and is repeated "+occured[i]+ " times" ); 
			else if (occured[i]>1 && ( i >=48 &&i<= 57)) 
				System.out.println((char)(i) + " integer and is repeated "+occured[i]+ " times" );
		} 

	}

}
