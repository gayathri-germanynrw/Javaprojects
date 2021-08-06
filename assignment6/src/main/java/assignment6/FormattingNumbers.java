package localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;



public class FormattingNumbers {
	/**
	 *  This method used to get local currency details with {@link NumberFormat} 
	 *  getCurrencyInstance method
	 * 
	 * @param locale
	 */
	public static void formatNumbers(Locale locale) {
		float k=65.876f;
		NumberFormat numberFormatter=NumberFormat.getCurrencyInstance(locale);
		System.out.println("Locale ---->"+locale);
		System.out.println("Depends on locale--->"+numberFormatter.format(k));

	}
	
	/**
	 *  This method used to parse the given number with help of {@link NumberFormat}
	 *  and parse method.
	 * @throws ParseException
	 */
	public static void parseBack() throws ParseException {
		String eu="24,76hhh543";
		NumberFormat numberFormatter=NumberFormat.getInstance(Locale.GERMANY);
		System.out.println("Number Formatter with"
				+ " getInstance depends on Locale--->"+numberFormatter.parse(eu));
		
		
	}
	
	public static void main(String[] args) throws ParseException {
		
		  Locale de=Locale.GERMANY; formatNumbers(de);
		  
			/*
			 * Locale ind=Locale.CANADA; formatNumbers(ind);
			 * 
			 * 
			 * parseBack();
			 */
		
	}
  
}
