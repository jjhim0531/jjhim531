package o.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetRun {

	public static void main(String[] args) {
		//Object에 equals()
		//=> 두 객체의 "주소값"을 비교해서 일치하면 true / 일치하지 않으면 false
		
		//Object에 hashCode()
		//=> 해당 객체의 "주소값"을 가지고 10진수의 형태로 만들어서 반환
		HashSet<String> hsi = new HashSet<String>();
		
		hsi.add("반갑습니다");
		hsi.add(new String("반갑습니다"));
		hsi.add(new String("여러분"));
		hsi.add(new String("안녕하세요"));
		hsi.add(new String("여러분"));
		
		System.out.println(hsi);
		System.out.println();
		//저장 순서를 유지하지 않는다! 중복된 데이터(동일 객체) 보관 불가!
		
		//String에 equals() 오버라이딩 
		//=> "실제 담긴 문자열"을 가지고 동등 비교를 진행해서 일치하면 true / 일치하지 않으면 false
		
		//String에 hashCode() 오버라이딩 
		//=> "실제 담긴 문자열"을 가지고 10진수의 형태로 만들어서 반환.

		HashSet hsi2 = new HashSet();
		
		//만약 hashCode, equals를 오버라이딩 하지 않으면 중복인 것을 알아차리지 못하고 2번 출력됨.
		hsi2.add(new Student("최지원", 22, 95));
		hsi2.add(new Student("최지원", 22, 95));
		
		hsi2.add(new Student("홍길동", 42, 75)); 
		hsi2.add(new Student("김지민", 41, 60));
		
		//동일객체 : 각 객체마다 hashCode 결과가 일치하고, equals 메소드로 비교시 true가 나올 때
		
		//Student에 hashCode() 오버라이딩 
		//=> "실제 각 필드에 담긴 데이터"들이 일치하면 동일한 10진수 반환
		
		//Student에 equals() 오버라이딩 
		//=> "실제 각 필드에 담긴 데이터"들이 모두 다 일치하면 true / 일치하지 않으면 false를 반환

		//작동순서
		/*
		 1. 새로운 Student("최지원", 22, 95) 객체가 HashSet에 추가되려고 함.(add)
		 2. HashSet 내부에서 해당 객체의 hashCode()를 자동으로 호출하여 해시값을 구함.
		 3. 이미 같은 hashCode()를 가진 객체가 있다면 equals()를 실행하여 중복 여부를 검사.
		 4. equals() 결과가 true면 중복으로 판단되어 추가되지 않음.
		 5. equals() 결과가 false면 새로운 객체로 저장됨.
		*/
		
		// Student 전체 인원 출력
		System.out.println("Student는 총 " + hsi2.size() + "명입니다.\n" + hsi2 +"\n");
		
		//hsi2.get() => 불가능!
		//인덱스의 개념이 없기 때문에 get을 할 수 없음 -> 한 개씩 무작위로 가져올 수 있음.
		
		//HashSet에 담긴 모든 객체들을 순차적으로 접근하는 방법
		//1. for each 문 이용
		for(Object s : hsi2) {
			System.out.println(s);
		}
		
		//2. Iterator 반복자를 이용해서 순차적 접근 방법
		Iterator it = hsi2.iterator();
		
		while(it.hasNext()) {//다음에 가져올 값이 있니?
			Object obj = it.next();
			System.out.println(obj);
		}
		
		//3. ArrayList에 담아준 다음 그 ArrayList를 반복적으로 돌아가며 접근 방법
		ArrayList list = new ArrayList();
		list.addAll(hsi2);
		
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}






