import java.util.Scanner;

public class A03_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner s = new Scanner(System.in)) {
			int len,i,j,temp=0;
			
			//Read array size
			System.out.println("Enter the array size: ");
			len=s.nextInt();

			int[] arr=new int[len];

			//Read the array
			System.out.println("Enter the array elements: ");
			for(i=0;i<len;i++)
			{
				arr[i]=s.nextInt();
			}
			s.close();

			//bubble sort

			for(i=0;i<(arr.length-1);i++)
			{
				for(j=0;j<(arr.length-1-i);j++)
				{
					if(arr[j]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}

				}

			}

			System.out.println("Sorted Array: ");
			for(i=0;i<len;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
