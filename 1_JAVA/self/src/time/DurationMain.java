package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

	public static void main(String[] args) {
		Duration dr = Duration.ofMinutes(30);
		System.out.println(dr);
		
		LocalTime lt = LocalTime.of(1, 0);
		System.out.println(lt);
		
		LocalTime plus = lt.plus(dr);
		System.out.println(plus);
		
		LocalTime st = LocalTime.of(9, 0);
		LocalTime en = LocalTime.of(10, 0);
		Duration bt = Duration.between(st, en);
		
		System.out.println("차이 : " + bt);
		System.out.println("차이를 초로 ? :"+ bt.getSeconds()+"초");
		System.out.println(bt.toHours()+"시간"+bt.toMinutesPart()+"분");

	}

}
