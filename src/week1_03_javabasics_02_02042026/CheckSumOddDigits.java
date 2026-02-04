package week1_03_javabasics_02_02042026;

import java.util.Scanner;
class UserMainCode{
	  public static int checkSum(int num) {
		  int sum = 0;
		  
		  while(num != 0) {
			  int digit = num % 10;
			  if(digit % 2 != 0) {
				  sum += digit;
			  }
			  num = num / 10;
		  }
		  
		  if(sum % 2 == 0) {
			  return -1;
		  } else {
			  return 1;
		  }
	  }
}
public class CheckSumOddDigits {

	public static void main(String[] args) {
		   
		   System.out.print("Enter Number : ");
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           
           
           int result = UserMainCode.checkSum(n);

           if (result == 1) {
        	   System.out.println("Sum of odd digits is odd.");        	   
           }
           else {
        	   System.out.println("Sum of odd digits is even.");        	   
           }
	}

}

