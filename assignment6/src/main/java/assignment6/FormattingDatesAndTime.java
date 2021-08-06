package localization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDatesAndTime {
	/** Formatting Date and Time
	 * 
	 * 
	 */
	public static void localDateTimeFormatting() {
		LocalDate localDate=LocalDate.now();
		LocalTime localTime=LocalTime.now();
		LocalDateTime localDateTime=LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime.format(DateTimeFormatter.ISO_TIME));
		
		// Customized date and time 
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MMM/YYYY  hh:mm:ss");
		System.out.println("print the customized date and time--->"+localDateTime.format(dateTimeFormatter) );
	
	}
	
	public static void main(String[] args) {
		localDateTimeFormatting();
	}

}
