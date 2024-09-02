package time;

import java.time.LocalDate;

public class LocalDataMain {
	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		LocalDate ofDate = LocalDate.of(2013,11,21);
		System.out.println(nowDate);
		System.out.println(ofDate);
		
		LocalDate plusDays = ofDate.plusDays(10);
		System.out.println(plusDays);
		

	}
}
