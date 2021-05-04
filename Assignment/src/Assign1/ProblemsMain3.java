package Assign1;

import java.util.Scanner;

public class ProblemsMain3 {

	/*
	 * 4. Find sum of all numbers in n. Eg if n=5 Sum= 1+2+ 3+ 4+5 = 15
	 *
	 *
	 * 5. Find largest of 3 numbers
	 *
	 *
	 * 6. Find smallest of 3 numbers
	 *
	 *
	 * 7. Write a program to get mark of students, and calculate percentage. At the
	 * end Provide grade according to average Mark scored. For eg the output should
	 * look like, Enter no of subjects : 4 Enter Mark of subject 1: 80 Enter Mark of
	 * subject 2: 60 Enter Mark of subject 3: 90 Enter Mark of subject 4: 40 Average
	 * : 67.5 Grade: D
	 */

	public static void main(String[] args) {
		ProviderCalc pc = new ProviderCalc();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dividend value\n");
		int dividend = sc.nextInt();
		System.out.println("enter the divisor value\n");
		int divisor = sc.nextInt();
		pc.getQuotientReminder(dividend, divisor);
		pc.findOccurChar("Gayathri", 'y');
		System.out.println("Enter the number which needs to get sum of numbers");
		int get_Num = sc.nextInt();
		pc.sumOfAllnumbers(get_Num);
		System.out.println("Enter first number \n");
		int num1 = sc.nextInt();
		System.out.println("Enter second number \n");
		int num2 = sc.nextInt();
		System.out.println("Enter third number \n");
		int num3 = sc.nextInt();
		pc.findLargeThreenumbers(num1, num2, num3);
		pc.gradeMarks();

		sc.close();
	}

}
