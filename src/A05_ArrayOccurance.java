import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class A05_ArrayOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int len,i;
		try (Scanner s = new Scanner(System.in)) {
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
			    printDuplicates(arr, len);
		}

	}
	
	 private static void printDuplicates(int[] arr, int n) 
	    {
	        Map<Integer,Integer> map = new HashMap<>();
	        int count = 0;
	        for(int i = 0; i < n; i++){
	            if(map.containsKey(arr[i])){
	                count = map.get(arr[i]);
	                map.put(arr[i], count + 1);
	            }
	            else{
	                map.put(arr[i], 1);
	            }
	        }
	         
	        for(Entry<Integer,Integer> entry : map.entrySet())
	        {
	            // if frequency is more than 1
	            // print the element
	            if(entry.getValue() == 1){
	                System.out.println(entry.getKey()+ " is unique ");
	            }
	            else if ((entry.getValue()) >1){
	            	System.out.println(entry.getKey() + " occurs " + entry.getValue()+ " times ");	
	            }     
	        }
	    }
}
