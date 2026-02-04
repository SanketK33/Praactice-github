package week1_03_javabasics_02_02042026;

import java.util.Scanner;
public class MoneyManagment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income this month : ");
        int income = sc.nextInt();
        
        int NEC = (income * 55) / 100;
        int FFA = (income * 10) / 100;
        int EDU = (income * 10) /100;
        int LTSS = (income * 10) / 100;
        int PLAY = (income * 10) / 100;
        int GIVE = (income * 5) / 100;
        
        System.out.println("NEC : " + NEC);
        System.out.println("FFA : " + FFA);
        System.out.println("EDU : " + EDU);
        System.out.println("LTSS : " + LTSS);
        System.out.println("PLAY : " + PLAY);
        System.out.println("GIVE : " + GIVE);

	}

}
