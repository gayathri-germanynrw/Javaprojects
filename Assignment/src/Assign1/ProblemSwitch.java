package Assign1;

import java.util.Scanner;

public class ProblemSwitch {

	public void chkSwitch(int daynum) {
		
		switch (daynum) {

		case 1:
			System.out.println("Sunday");
			break;
		
		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		default:
			System.out.println("Nothing");
			break;

		}

	}

	public static void main(String[] args) {
		ProblemSwitch pvb = new ProblemSwitch();
		Scanner scanner = new Scanner(System.in);
		int daynum = scanner.nextInt();
		pvb.chkSwitch(daynum);
		scanner.close();
	}

}
