package n.generic;

public class Run {
	public static void main(String[] args) {
		//객체를 생성하는 시점에 어떤 타입을 사용할지
		//타입인자를 정해준다.
		//타입을 보통 1개, 최대 2개까지는 할 수 있다.  
		//ex) Box<String, Integer> box = new Box<String, Integer>();
		//	  box.set("Apple", 25);
		
		
		//객체를 생성하는 시점에 타입을 정해줌
		Box<Integer> aBox = new Box<>();
		
		// Integer 배열을 생성하여 aBox에 저장
		Integer[] arr = new Integer[10];
		
		//Box 객체에 Integer 배열 저장
		//배열 전체를 한 번에 저장할 때는 setObArr(arr)처럼 배열을 통째로 넘길 수 있음.
		aBox.setObArr(arr);
		
		//aBox.getObArr() - 반환된 배열을 받아온 후 
		//[0] = 10; - 특정 인덱스 값을 변경하는 것!
		aBox.getObArr()[0] = 10;
		
		System.out.println(aBox.toString());
		
	}
}
