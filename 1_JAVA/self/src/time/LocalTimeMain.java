package time;

import java.time.LocalTime;

public class LocalTimeMain {
	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		LocalTime ofTime = LocalTime.of(9,10,13);
		
		
		System.out.println(nowTime);
		System.out.println(ofTime);
		
		LocalTime ofTimeplus = ofTime.plusHours(2);
		System.out.println(ofTimeplus);
		
		
	}
}
