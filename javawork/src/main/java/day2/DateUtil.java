package day2;

import java.time.LocalDate;
import java.util.Calendar;

public class DateUtil {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.get(calendar.get(Calendar.DAY_OF_YEAR));
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate birth = LocalDate.of(1994, 05, 04);
		System.out.println(birth);
	}
	
	
}
