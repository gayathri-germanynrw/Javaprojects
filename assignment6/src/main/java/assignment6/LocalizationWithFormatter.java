package localization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizationWithFormatter {

	private static void callResourceBundle(Locale locale, Scanner scan) {
		System.out.println("Enter the User Amount\n");
		float usrAmount = scan.nextFloat();
		NumberFormat numberFormatter = NumberFormat.getCurrencyInstance(locale);

		ResourceBundle resource = ResourceBundle.getBundle("Test", locale);

		System.out.println(resource.getString("selectedlanguage"));
		System.out.println(resource.getString("givencash") + numberFormatter.format(usrAmount));
		System.out.println(resource.getString("remainingcash") +"\t"+ numberFormatter.format(usrAmount));
		System.out.println(resource.getString("Press")+"\n");

	}

	private static void printMainMenu() {
		System.out.println("##########     Localization with Assertion   ##################\n");

		System.out.println("1. Deutsch-GER\n");
		System.out.println("2. English-US\n");
		System.out.println("3. Tamil-IND\n");
		System.out.println("4. French-FRA\n");
		
		
		System.out.println("0. EXIT_APPLICATION OF LOCFALIZATION\n");

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount \n");
		boolean exitApplication = false;

		LocalizationWithFormatter obj_assertion = new LocalizationWithFormatter();

		while (!exitApplication) {
			printMainMenu();
			System.out.println("Enter the Option\n");
			int usrOption = scan.nextInt();
			Locale locale;

			switch (usrOption) {
			case 0:
				exitApplication = true;
				break;

			case 1:
				System.out.println("Deutsch-GER");
				locale = new Locale("de", "DE");
				obj_assertion.callResourceBundle(locale, scan);

				break;

			case 2:
				System.out.println("English-US");
				locale = new Locale("en", "US");
				obj_assertion.callResourceBundle(locale, scan);
				break;

			case 3:
				System.out.println("Tamil-IND");
				break;

			case 4:
				System.out.println("French-FRA");
				break;

			default:
				System.out.println("USER_MSG_NO_SUCH_OPTION");

				break;
			}

		}
	}

}
