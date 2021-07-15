package functionalinterfaces;

import java.util.Scanner;

public class MainValidMark {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the RollNo\n");
		long rollNo = scan.nextLong();
		System.out.println("Enter English Mark \n");
		float englishMark = scan.nextFloat();
		System.out.println("Enter Maths Mark\n");
		float mathsMark = scan.nextFloat();
		Marks objMarks = new Marks(rollNo, englishMark, mathsMark);

		CheckValidMark objCheckValidMark = () -> {
			if ((objMarks.getEnglishMark() >= 0) && (objMarks.getEnglishMark() <= 100)) {
				System.out.println("Given English Mark is Valid-->" + objMarks.getEnglishMark());
			}
			if ((objMarks.getMathsMark() >= 0) && (objMarks.getMathsMark() <= 100)) {
				System.out.println("Given Maths Mark is valid --->" + objMarks.getMathsMark());
			}

			else {
				System.out.println("Given Mark is not Valid-->");
			}
		};

		objCheckValidMark.validMark();
	}

}
