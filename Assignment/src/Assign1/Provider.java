package Assign1;

public class Provider {

// FindEvenOddNumber
	int num;

	public int FindEvenOddNumber(int num) {
		if (num % 2 == 0) {
			System.out.println("entered num is Evennumber\n" + num);
		} else {

			System.out.println("entered num is Oddnumber\n" + num);
		}
		return num;

	}

// Sum of Two numbers
	int a;
	int b;
	int c;

	public int SumOfTwoNumbers(int a, int b) {
		int c = a + b;
		System.out.println("Addtion of two numbers\n" + c);
		return c;

	}

	// Find Area of Rectangle

	int length;
	int breadth;
	int area;

	public int AreaOfRectangle(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of Rectangle\n" + area);
		return area;

	}

	// Print the String ,if it is Java

	String str;

	public String PrintString(String str) {
		if (str.equalsIgnoreCase("java")) {
			System.out.println("Entered String is\n " + str);
		} else {
			System.out.println("Invalid String is\n " + str);
		}
		return str;

	}
}
