import java.util.Scanner;

public class A24_ConsecutiveNumberCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=in.nextInt();
		in.close();
		int sum=0,j=0;
		for(int i=1;i<n;i++)
		{
			sum=i;
			j=i+1;
			while(sum<n)
			{
				sum=sum+j;
				j++;
			}
			if(sum==n)
			{
				for(int k=i;k<j;k++)
				{
					if(k==i)
						System.out.print(k);
					else
						System.out.print(" + "+k);
				}
				System.out.println();
			}
		}

	}

}
