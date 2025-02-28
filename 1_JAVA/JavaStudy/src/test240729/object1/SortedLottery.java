package test240729.object1;

import java.util.Comparator;

//Comparator<T>는 객체를 정렬할 때 사용하는 인터페이스
//compare(T o1, T o2) 메서드를 오버라이딩하여 원하는 정렬 기준을 직접 정의할 수 있음.
//Lottery 객체를 이름 순으로 정렬하고, 이름이 같다면 전화번호 순으로 정렬
public class SortedLottery implements Comparator<Lottery>{

	@Override
	public int compare(Lottery o1, Lottery o2) {
		int num = o1.getName().compareTo(o2.getName());//이름 기준 정렬
		
		if (num == 0) {//이름이 같다면
			return o1.getPhone().compareTo(o2.getPhone());//전화번호 기준 정렬
		}
		
		//compareTo() 메서드 반환 값:
		// 0보다 작은 값(음수) → o1이 o2보다 작다
		// 0 → o1과 o2가 동일
		// 0보드 큰 수(양수) → o1이 o2보다 크다.
		//오름차순(compare(Lottery o2, Lottery o2)처럼 순서를 바꾸면 내림차순이 된다)
		return num;
	}


}
