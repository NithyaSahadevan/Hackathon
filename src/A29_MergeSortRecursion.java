import java.util.Scanner;

public class A29_MergeSortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		int i;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Merge sort: Enter the numbers to sort");
			for(i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			sc.close();
		}
		mergeSortFn(arr, arr.length);
		
		//Print sorted array
		System.out.println("Ascending order: ");
		for(i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void mergeSortFn(int[] arr, int n) {
		if (n<2) {
			return;
		}
		int mid=n/2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[n-mid];
		
		//Left Array
		for(int i=0; i<mid; i++) {
			leftArr[i] = arr[i];
		}
		
		//Right Array
		for(int i=mid; i<n; i++) {
			rightArr[i-mid] = arr[i];
		}
		
		mergeSortFn(leftArr, mid);
		mergeSortFn(rightArr, n-mid);
		merge(arr, leftArr, rightArr, mid, n-mid);
	}
	public static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
		int i=0, j=0, k=0;
		while(i<left && j<right) {
			if(leftArr[i] <= rightArr[j])
			{
				arr[k++] =leftArr[i++];
			}
			else {
				arr[k++] =rightArr[j++];
			}
		}
		
		while(i<left) {
			arr[k++] =leftArr[i++];
		}
		while(j<right) {
			arr[k++] =rightArr[j++];
		}
	}

}
