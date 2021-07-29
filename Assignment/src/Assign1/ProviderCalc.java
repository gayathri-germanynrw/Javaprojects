package Assign1;

import java.util.Scanner;

public class ProviderCalc {

	public void getQuotientReminder(int num_Dividend, int num_Divisor) {
		int num_Quotient =num_Dividend / num_Divisor;
		int num_Reminder =num_Dividend % num_Divisor;
		
		System.out.println("Quotient value is\n" + num_Quotient);
		System.out.println("Reminder value is \n" + num_Reminder);

	}

	// Find occurrence of a character in a string
	public void findOccurChar(String str_OccurChar, char charString) {
		int len = str_OccurChar.length();
		int tot_occur = 0;
		for (int i = 0; i < len; i++) {
			if (str_OccurChar.charAt(i) == charString) {
				tot_occur++;

			}
		}
		System.out.println("Print the total occurence \n" + tot_occur);
	}

	public void sumOfAllnumbers(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;

		}
		System.out.println("Print the total Value --->" + sum);

	}

	public void findLargeThreenumbers(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			System.out.println("First large number \n" + n1);
		} else if (n2 > n3) {
			System.out.println("second large number \n" + n2);
		} else {
			System.out.println("third large number \n" + n3);
		}

	}
	
	public void gradeMarks()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1 st subject Marks");
		int s1=sc.nextInt();
		
		System.out.println("Enter the 2 nd subject Marks");
		int s2=sc.nextInt();
		
		System.out.println("Enter the 3 rd subject Marks");
		int s3=sc.nextInt();
		
		System.out.println("Enter the 4 th subject Marks");
		int s4=sc.nextInt();
		
		int total=s1+s2+s3+s4;
		
		Float grade=total/4f;
		if(grade > 60)
		{
			System.out.println("U r scored first class marks\n"+grade);
		}
		else
		{
			System.out.println("U r scored second class marks\n"+grade);
		}
		sc.close();
	}
}
