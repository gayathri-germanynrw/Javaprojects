package Assign1;

import java.util.Scanner;

public class ProviderPractice {
	private static int $;

	public void pyramidCode()
	{
		//Pyramid code


		 
	    int rows = 5, k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	  
		
	}
	
	
	
	public void loopChecking()
	{
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		System.out.println("llllxxxx"+x);
		while(count++ < 3) {
		int y = (1 + 2 * count) % 3;
		System.out.println("print the value of y---"+y);
		switch(y) {

		default:
			
		case 0: x -= 1;
		System.out.println("llllxxxx"+x);
		System.out.println("inside Switch case 0---"+x);
		        break;
		case 1: x += 5;
		 }
		}
		 System.out.println(x); 
	}
	
	
	
	
	public void compareString()
	{

		  String a_b; 
		  System.out.print($);
		 // System.out.print(a_b);
		  
		  String s1 = "Java"; 
		  String s2 = "Java"; StringBuilder
		  sb1 = new StringBuilder(); 
		  sb1.append("Ja").append("va");
		  System.out.println(s1 == s2); 
		  System.out.println(s1.equals(s2));
		  System.out.println(sb1.toString() == s1);
		  System.out.println(sb1.toString().equals(s1));
		 
	}
	
}


