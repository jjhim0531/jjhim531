package time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		LocalDateTime nowDt = LocalDateTime.now();
		LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
		System.out.println("현재 날짜시간 = " + nowDt);
		System.out.println("지정 날짜시간 = " + ofDt);
		
		// 날짜와 시간 분리
		LocalDate localDate = ofDt.toLocalDate();
		LocalTime localTime = ofDt.toLocalTime();
		System.out.println("localDate = " + localDate);
		System.out.println("localTime = " + localTime);
		
		// 날짜와 시간 합체
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println("localDateTime = " + localDateTime);
		
		// 계산(불변)
		LocalDateTime ofDtPlus = ofDt.plusDays(1000);
		System.out.println("지정 날짜시간+1000d = " + ofDtPlus);
		LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
		System.out.println("지정 날짜시간+1년 = " + ofDtPlus1Year);
		
		// 비교
		System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));
		System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
		System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt));
		System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.equals(ofDt));
		//isEqual은 단순히 시간적으로 같으면 true, 다르면 false이다.
		//equals는 시간을 구성하는 방식과 내부 모든 요소가 같아야 true이다. 예를 들어 서울 9시와 베를린의 1시는 시간적으로 같지만 타임존의 데이터가 다르기에 false를 반환한다.	
	
	}
}
