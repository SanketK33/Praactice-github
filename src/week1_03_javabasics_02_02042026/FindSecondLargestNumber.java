package week1_03_javabasics_02_02042026;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
          int arr[] = {2,7,9,5,12,10,11};
          
          int n = arr.length;
          
          int largest = Integer.MIN_VALUE;
          
          for(int i = 0; i < n; i++) {
        	  if(arr[i] > largest) {
        		  largest = arr[i];
        	  }
          }
          
          int sLargest = Integer.MIN_VALUE;
          
          for(int i = 0; i < n; i++) {
        	  if(arr[i] > sLargest && arr[i] != largest) {
        		  sLargest = arr[i];
        	  }
          }
          
          
          System.out.println("Second largest number in the array : " + sLargest);

	}

}

