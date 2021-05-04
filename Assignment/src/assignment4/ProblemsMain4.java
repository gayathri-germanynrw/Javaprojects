package assignment4;

import java.util.Scanner;

public class ProblemsMain4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProviderAssign4 pv=new ProviderAssign4();
	    System.out.println("Enter the String to Reverse\n");
	    String inString=sc.next(); 
	    pv.reverseString(inString); 
	    System.out.println("\n");
		System.out.println("Enter the String to check Palindrome\n"); 
		String chkPalindrome=sc.next(); 
		pv.chkPalindrome(chkPalindrome);
	    pv.strOperations();
	}

}
