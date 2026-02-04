package week1_03_javabasics_02_02042026;

import java.util.Arrays;
public class FindDuplicates {

	public static void main(String[] args) {
		
		int arr[] = {9,7,8,4,1,3,6,5,4};
	
		int n = arr.length;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println("Duplicate Element in the array : " + arr[i]);
				break;
			}
		}

	}

}
