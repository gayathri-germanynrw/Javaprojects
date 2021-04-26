package Assign1;

public class ProviderLoop {
	// Method to print Hello World and Hello Java

	String str1;
	String str2;
	String str3;

	public String PrintString() {
		str1 = "World";
		str2 = "Java";
		str3 = "Hello " + str1 + "\nHello " + str2;
		System.out.println(str3 + "\n");
		return str3;
	}

//Method to Print Odd or Even

	int num;

	public int EvenOrOdd(int num) {
		if (num % 2 != 0) {
			System.out.println("entered number is Weird\n" + num);
		} else if (num % 2 == 0 && num <= 10) {
			System.out.println("entered number is not  Weird\n" + num);
		} else if (num % 2 == 0 && num >= 10) {
			System.out.println("entered number is  Weird\n" + num + "\n");
		}
		return num;

	}

// Given an integer n, print its first 10 multiple
	int NumMul;
	int i;

	public int FirstTenMultiple(int NumMul) {

		int result;
		System.out.println("FirstTenMultiple \n");
		for (i = 1; i <= 10; i++) {

			result = NumMul * i;

			System.out.println("Multiple of " + NumMul + "  *  " + i + " = " + result);

		}

//System.out.println("Number multiple of \n "+i +"="+ NumMul);
		return NumMul;

	}

	public String printMyName(String name) {
		int strlen = name.length();
		String fname = "";

		for (int i = strlen - 1; i >= 0; i--) {

			fname = fname + name.charAt(i);
		}
		System.out.println(fname);
		return str1;

	}

	public void printstar() {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	public void printStarOne() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("*");

			}
			System.out.print("\n");
		}

	}

	public void printStarTwo(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("print the value of i and n" + "\n" + i + "\n" + n);

			for (int j = 2 * (n - i); j >= 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("valus " + i);
			}

			System.out.println();
		}

	}

	public void printNumber(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(i);
			}
			System.out.print(i);
			System.out.print("\n");
		}

	}

}
