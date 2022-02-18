package Assign1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input String\n");
		String inputstring=scan.next();
		String reversestring="";
		for(int i=inputstring.length()-1;i>=0;i--) {
			reversestring+=inputstring.charAt(i);
			
		}
		System.out.println("Print the Reverse String \n"+reversestring);
		if(inputstring.equals(reversestring)) {
			System.out.println("Given String is Palindrome ");
		}else
		{
			System.out.println("Given String is not a Palindrome ");
		}
		
		
	}

}
