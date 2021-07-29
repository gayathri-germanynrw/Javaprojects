package assignment4;

import java.util.Arrays;

public class ArraySortSearch {

	public void arrayOperations(int[] scores) {
		int binarypos = -1;
		for (int i = 0; i < scores.length; i++) {

			System.out.println("print the sorted Array \n" + scores[i]);
			if (scores[i] == 67) {
				binarypos = Arrays.binarySearch(scores, 67);

				System.out.println("print the value of  " + scores[i] + "  index pos \n" + binarypos);

			} else if (scores[i] == 99) {
				binarypos = Arrays.binarySearch(scores, 99);

				System.out.println("print the value of  " + scores[i] + "  index pos \n" + binarypos);

			} else if (scores[i] == 2) {
				binarypos = Arrays.binarySearch(scores, 2);

				System.out.println("print the value of " + scores[i] + "  index pos \n" + binarypos);

			} else if (scores[i] == 200) {
				binarypos = Arrays.binarySearch(scores, 200);
				System.out.println("print the value of  " + scores[i] + "  index pos \n" + binarypos);

			}
		}

	}

	public static void main(String[] args) {
		int[] scores = { 99, 4, 23, 67, 89, 10, 67, 9, 23, 88, 45, 9, 37, 8, 12, 2, 100 };
		ArraySortSearch arraySort = new ArraySortSearch();
		scores[3] = 100;
		Arrays.sort(scores);
		arraySort.arrayOperations(scores);

	}

}
