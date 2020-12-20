import java.util.Scanner;

public class A27_QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		int len;
		//Read array size
		System.out.println("Enter the array size: ");
		len=s.nextInt();

		int[] arr=new int[len];

		//Read the array
		System.out.println("Enter the array elememts: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		s.close();
		quickSort(arr, 0, arr.length-1); 

		System.out.println("sorted array"); 
        printArray(arr); 
	}
	
	public static void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex-1);
			quickSort(arr, partitionIndex+1, end);
		}
	}
	public static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin-1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTemp;

		return i+1;
	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

}
