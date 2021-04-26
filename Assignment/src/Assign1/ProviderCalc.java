package Assign1;

public class ProviderCalc {

	int num_Quotient;
	int num_Reminder;

	String str_OccurChar;
	char charString;
	int sum = 0;
	int n, n1, n2, n3;

	public void getQuotientReminder(int num_Dividend, int num_Divisor) {

		num_Quotient = num_Dividend / num_Divisor;
		num_Reminder = num_Dividend % num_Divisor;
		System.out.println("Quotient value is\n" + num_Quotient);
		System.out.println("Reminder value is \n" + num_Reminder);

	}

	public void findDuplicateChar(String str_Valid) {

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

}
