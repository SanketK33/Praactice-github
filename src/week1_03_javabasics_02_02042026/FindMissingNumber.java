package week1_03_javabasics_02_02042026;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,7,8};
		
		int n = arr.length + 1;
		
		int expectedSum = n * (n + 1) / 2;
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		int missingNumber = expectedSum - sum;
		
		System.out.println("The missing number from array " + missingNumber);

	}

}

