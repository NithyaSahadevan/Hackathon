
public class A07_StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2="Hello";
		
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		
		if(s1==s2) {
			System.out.println("same variables");
		}
		else
		{
			System.out.println("different variables");
			
		}
		if(s3==s4)
		{
			System.out.println("same variables");
		}
		else
		{
			System.out.println("different variables");
			
		}
		

	}

}
