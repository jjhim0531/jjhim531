package o.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapRun {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		//Set => 중복을 방지하기 위해 hashCode()와 equals()를 오버라이딩해야 함. 
		//Map => 일반적으로 String을 키(Key)로 사용하므로 오버라이딩이 필요하지 않음.
		// 이유: String은 이미 hashCode()와 equals()가 잘 구현되어 있기 때문!
		// Map에서도 String이 아니라 
		//사용자 정의 객체를 키로 사용할 때는 hashCode()와 equals()를 오버라이딩해야 함.
		
		//계층 구조를 보면
		// List 계열, Set 계열의 클래스들은 Collection을 구현한 클래스이다.
		// => 객체를 추가하고자  할 때 공통적으로 add 메소드를 이용.
		
		//Map 계열은 Collection을 구현한 클래스가 아님!!
		//=> 객체를 추가하고자 할때 put 메소드를 이용("key + value" 한 쌍으로 담아야한다.)
		
		//1. put(k, v) : map에 (키, 벨류) 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1000));
		hm.put("칸초", new Snack("단맛", 500));
		hm.put("먹태깡", new Snack("짠맛", 600));
		hm.put("아이셔", new Snack("신맛", 300));

		System.out.println("hm : " + hm);
		//저장되는 순서 유지 안됨(랜덤)! value 값이 중복되어도 키 값이 중복되지 않으면 잘 저장됨.
		
		hm.put("먹태깡", new Snack("매운맛", 700));
		System.out.println("hm : " + hm);
		//동일한 키 값으로 다시 추가하는 경우 value 값이 덮어씌워진다.!! 
		//(중복된 키 값이 공존할 수 없음. 키 값이 식별자 역할을 함)
		System.out.println();
		
		//2. get(Object key) : 해당 키 값을 가지는 value 값을 리턴해준다.
		System.out.println("다이제 : " + hm.get("다이제"));
		
		//3.size() : 담겨 있는 객체들의 수
		System.out.println("hm에 담겨있는 객체들의 수 : " + hm.size());
		System.out.println();
		
		//4. replace(key, value) => 해당 키 값을 찾아서 다시 전달한 value  값으로 수정
		hm.replace("먹태깡", new Snack("아주 매운맛", 800));
		System.out.println(hm);
		System.out.println();
		
		//5. remove(Object key) => 해당 키 값을 찾아서 그 벨류세트를 삭제시켜주는 메소드
		hm.remove("다이제");
		System.out.println("다이제 삭제 후 hm : " +hm);
		System.out.println();
		
		
		//전체객체에 대해서 접근하는 방법
		
		//for each 가능? x
		//Iterator 반복자 이용가능? x
		//(Iterator - list, set 계열에서만 사용 가능.)
		
		// Map의 key는 set과 매우 유사하다.(Value는 중복될 수 있으므로 List가 적절함!)
		//1. key를 모아서 set 자료구조의 형태로 받을 수 있다.
		//Map.keySet()이 Set을 반환(Map 자체가 Set으로 변환되는 것이 아니라, Map의 Key 부분만 Set으로 변환되는 것!)
		Set keySet = hm.keySet();
		System.out.println("keySet : " + keySet);
		for(Object key : keySet) {
			System.out.println("키 : "+ key + ",  값 : " + hm.get(key));
		}
		System.out.println();
		
		
		//2. entrySet() 이용하는 방법
		Set entrySet = hm.entrySet();//Map의 모든 Key-Value 쌍을 Set<Entry<K, V>> 형태로 변환
		
		Iterator it = entrySet.iterator();//Set을 Iterator로 변환하여 순회 준비
		
		while(it.hasNext()) {//다음 요소가 있는지 확인
			Entry entry = (Entry)it.next(); //다음 요소를 가져와서 Entry 객체로 변환
			// Entry 객체 안에 key, value 값이 모두 다 담겨져 있다.
			
			String key = (String)entry.getKey();//Entry에서 Key 추출
			Snack value = (Snack)entry.getValue();//Entry에서 value 추출
			System.out.println("키:"+ key + ",  값:" + value);
		}
	}

}
