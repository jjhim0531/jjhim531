package n.generic;

import java.util.Arrays;
//"제네릭 클래스" (T는 "타입 매개변수") - 모든 변수를 제네릭으로 만들 필요 없음
//제네릭 클래스는 특정 변수나 메서드에서만 제네릭을 사용할 수도 있고, 일부는 일반 타입을 사용할 수도 있다.
//일반 클래스 내에서 특정 메서드만 제네릭을 사용할 수도 있음!
//즉, 제네릭은 필요한 부분에서만 사용하면 됨!
public class Box<T>{
	// 제네릭 배열 (어떤 타입이 들어올지 미정)
	private T[] obArr; //어떤 것들을 담을지 알 수 없음 => 객체

	//배열의 크기 (일반 변수)
	private int size;
	
	//기본 생성자
	public Box() {
		super();
	}
	
	//제네릭 배열 반환 메서드
	public T[] getObArr() {
		return obArr;//배열 자체를 반환.
	}
	
	//제네릭 배열 설정 메서드
	public void setObArr(T[] obArr) {
		this.obArr = obArr;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	// 객체 정보를 문자열로 변환 (배열을 문자열로 변환하여 출력)
	@Override
	public String toString() {
		return "Box [obArr = " + Arrays.toString(obArr) + ", size=" + size + "]";
	}
}
