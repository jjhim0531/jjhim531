package o.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRun {
	//List, Set, Map 같은 컬렉션 프레임워크는 데이터를 효율적으로 관리하는 "자료구조"이고,
	//제네릭은 "타입 안정성"을 위한 기능임!
	// 즉, 컬렉션 프레임워크는 "데이터를 저장하고 관리하는 구조",
	//제네릭은 "타입을 제한하여 오류를 방지하는 기능"!

	/*
	 	컬렉션이란
	 	자료구조 개념이 내장되어있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크".
	 	
	 	- 자료구조 : 방대한 데이터를 보다 효율적으로 관리(추가, 삭제, 조회, 정렬, 수정)할 수 있도록 도와주는 개념
	 	- 프레임워크 : 이미 만들어져있는 틀(코드 더미)
	 	
	 	* 배열의 단점과 컬렉션의 장점
	 	> 배열의 단점
	 		1. 배열은 크기를 지정해야한다. 
	 		   새로운 값을 더 추가하고자 한다면 새로운 크기의 배열을 만들고 기존의 값을 전부 복사하는 코드를 작성해야한다.
	 		   
	 		2. 배열 중간에 값을 추가하거나 삭제하는 경우 값을 매번 이동시켜주는 복잡한 코드를 직접 작성해야한다.
	 		
	 		3. 한 공간에 한 타입의 데이터들만 저장이 가능하다.
	 	
	 	>컬렉션의 장점
	 		1. 크기를 지정해 줄 필요가 없음!! 만일 지정했다고해도 더 많은 데이터들을 담으면 알아서 사이즈를 늘려준다.
	 		
	 		2. 중간에 값을 추가한다거나 삭제하는 경우 값을 당겨주는 작업(알고리즘)을 직접 기술할 필요가 없다
	 		   단지 메소드 호출만으로 알아서 내부적으로 진행이 된다.
	 		   
	 		3. 한 공간에 여러 타입의 데이터들을 저장할 수 있다.(단, 객체만 가능)
	 		   한 타입만 담도록 제한할 수도 있음(제네릭 사용 가능)
	 		   
	 */
	public static void main(String[] args) {
//		ArrayList list
		
		List list = new LinkedList(); //크기지정을 할수도 있고 안해도 괜찮다.//제네릭을 사용하지 않음 (비추천)
		
		//List<String> list = new ArrayList<>();  // String 타입만 저장 가능
		System.out.println(list); // 비어있는 상태
		System.out.println(list.size());
		
		
		//1. add(E e) : 리스트 공간 끝에 전달된 데이터를 추가시켜주는 메소드
		//배열은 기본 타입(int, double 등)도 저장 가능하지만, List는 객체만 저장할 수 있음!
		//하지만, 오토박싱(Auto-Boxing) 덕분에 int 같은 기본 타입도 자동으로 객체(Integer)로 변환됨!
		list.add(new Music("에피소드", "이무진"));//Music 클래스의 객체.
		list.add(new Music("비의 랩소디", "임재현"));//Music 클래스의 객체.
		list.add(new Music("천상연", "이창섭"));//Music 클래스의 객체.
		list.add("끝");//"끝"도 String 클래스의 객체이므로, 객체가 맞음.
		
		//지정된 크기보다 더 많이 넣어도 오류가 발생하지 않는다. -> 장점1. 크기 제약 x
		//다양한 타입의 데이터를 담을 수 있음 -> 장점3. 여러 타입 보관가능
		
		System.out.println(list); // list의 특징 : 순서를 유지하면서 담겨짐(0번 인덱스부터 차곡차곡)
		System.out.println(list.size());
		
		
		//2. add(int index, E e) : 직접 인덱스를 지정해서 해당 위치에 데이터를 추가할 수 있다.
		list.add(1, new Music("고민중독","qwer"));
		System.out.println(list);
		System.out.println(list.size());
		
		
		//3. remove(int index) : 해당 인덱스 위치의 데이터를 삭제시켜주는 메소드
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		
		//4. set(int index, E e) : 해당 인덱스 위치의 값을 전달받은 e 객체로 변경
		list.set(2, new Music("고민중독", "qwer"));
		System.out.println(list);
		System.out.println(list.size());
		
		//5. size() : 리스트의 사용 중인 사이즈를 반환시켜주는 메소드
		System.out.println(list.size());
		
		//6. get(int index) : 해당 인덱스위의 객체 반환시켜주는 메소드
		Music m = (Music)list.get(0);//다운캐스팅
		System.out.println(m);
		
		System.out.println(((Music)list.get(1)).getTitle());
		
		//7. subList(int index1, int index2) : List -> 추출해서 새로운 List로 변환
		List sub = list.subList(1, 3); // 1번주터 3번 인덱스 전까지
		System.out.println(sub);
		
		//8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가시켜주는 메소드
		list.addAll(sub);
		System.out.println(list);
		System.out.println(list.size());
		
		//9. isEmpty() : boolean -> 컬렉션이 비어있는지 묻는 메소드
		System.out.println("컬렉션이 비어 있는가? " + list.isEmpty());
		
		//10. clear() : 전부 비워주는 메소드
//		list.clear();
//		System.out.println("컬렉션이 비어 있는가? " + list.isEmpty());
		
		System.out.println("==================================================");
		//전체접근 방법
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==================================================");
		for(Object o : list) {
			System.out.println(o);
		}
		
		List<Integer> list2 = new ArrayList<>();
		list.add(10);  // 오토박싱 덕분에 Integer 객체로 자동 변환됨
		list.add(new Integer(20));  // 명시적으로 Integer 객체 추가 가능

	}

}
