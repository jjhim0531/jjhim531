package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {

	public static void main(String[] args) {
		ZonedDateTime nowZdt = ZonedDateTime.now();
		System.out.println(nowZdt);

		LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
		System.out.println(ldt);
		
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
		System.out.println(zdt1);
		
		ZonedDateTime zdt2 = ZonedDateTime.of(2030,1,1,13,30,50,0, ZoneId.of("Asia/Seoul"));
		System.out.println(zdt2);
		
		ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
		System.out.println(utcZdt);
		
		//utc타임존으로 바꾸면 -9시간이 된다.
		//()안에 필요한 국가의 타임존을 적어주면 된다.
		//ZoneId를 통해 타임존을 알면 일광절약 시간제도 적용가능하다.

	}

}
