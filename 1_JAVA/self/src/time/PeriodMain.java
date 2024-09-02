package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

	public static void main(String[] args) {
		Period pr = Period.ofDays(10);
		System.out.println(pr);

		LocalDate crDate = LocalDate.of(2030, 1, 1);
		LocalDate plDate = crDate.plus(pr);

		System.out.println(crDate);
		System.out.println(plDate);

		LocalDate stDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 4, 2);
		Period bw = Period.between(stDate, endDate);

		System.out.println(stDate);
		System.out.println(endDate);
		System.out.println(bw);
		System.out.println(bw.getMonths()+"개월" + bw.getDays()+"일");
	}

}
