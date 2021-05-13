package assignment6;

import java.util.Scanner;

public class CheckEvenOrOdd {
	
	public boolean checkEvenOdd(int i) {
		if(i%2==0) {
			
			return true;
		}else {
			
			return false;
		}
		
	}
	
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CheckEvenOrOdd chkEvenOdd=new CheckEvenOrOdd();
		System.out.println("Enter the number to check Odd or Even\n");
		int chkNum=scan.nextInt();
		boolean chkTrueOrFalse=chkEvenOdd.checkEvenOdd(chkNum);
		if(chkTrueOrFalse) {
			System.out.println("Entered Number is Even\n"+chkNum);
		}
		else {
			System.out.println("Entered Number is Odd\n"+chkNum);
		}
		scan.close();
	}

}
