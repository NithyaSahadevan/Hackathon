import java.util.Scanner;

public class A06_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minIndex,temp,len;

		Scanner s=new Scanner(System.in);

		//Read array size
		System.out.println("Enter the array size: ");
		len=s.nextInt();

		int[] arr= new int[len];
		
		//Read the array
		System.out.println("Enter the array elememts: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		s.close();

		//Selection Sort
		for(int i=0;i<arr.length-1;i++)
		{
			minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex]) {
					minIndex=j;}		
			}
			temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		for (int i=0; i<arr.length; i++) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 

	}

}
