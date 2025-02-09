package l.io.ex2;

import java.io.Serializable;

public class Product implements Serializable {
	/*
	 * > 직렬화(Serialization) → 객체를 바이트 스트림(파일, 네트워크 등으로 전송 가능한 형태)으로 변환하는 것!
	 * > 역직렬화(Deserialization) → 바이트 스트림을 다시 객체로 변환하는 것!
	 *  즉, 직렬화를 하면 객체를 파일에 저장하거나, 네트워크를 통해 전송할 수 있음!
	 *  하지만, transient 키워드를 사용하면 특정 필드는 직렬화되지 않음!
	 *  
	 *  직렬화하려는 클래스는 반드시 Serializable 인터페이스를 구현해야 함.
	 * 
	 *  Serializable은 구현해야 할 메서드가 없는 마커 인터페이스(단순 표시용). 
	 *  transient 키워드를 사용하면 특정 필드는 직렬화 대상에서 제외됨.
	 *  transient를 사용하는 이유 - 보안이 중요한 정보를 저장하지 않기 위해 사용됨.
	 *  						비밀번호, 카드번호, 보안키 같은 정보를 보호하기 위해 사용!
	 * 							파일에 저장할 필요 없는 데이터를 제외하기 위해 사용!
	 
	 > 클래스 구조 변경 시 주의
	  
	 * 직렬화된 객체를 읽어올 때 필드가 추가되거나 삭제되면 예외 발생 가능. 해결 방법: serialVersionUID 설정.
	 
	 > 직렬화는 비교적 느리며, JSON이나 XML 같은 포맷보다 비효율적일 수 있음.
	 
	 * Q1. 직렬화된 객체를 읽으려면 동일한 클래스를 가져야 하나요?
	 * A1. 네, 동일한 클래스가 필요하며, serialVersionUID가 일치해야 한다.
	 
	 * Q2. 직렬화할 때 어떤 데이터만 저장되나요?
	 * A2. 인스턴스 변수만 직렬화되며, transient 키워드를 사용한 변수는 저장되지 않는다.
	 
	 * Q3. 직렬화 대신 JSON, XML을 사용할 수 있나요? 
	 * A3. 네, JSON이나 XML 같은 포맷을 사용하면 더 높은 호환성과 가독성을 제공할 수 있다.
	 
	 * Q4. serialVersionUID를 꼭 선언해야 하나요?
	 * A4. 선언하지 않으면 자동 생성되지만, 유지보수를 위해 명시적으로 설정하는 것이 권장된다.
	 */ 

	private String name;
	private int price;
	//private transient String password; // 직렬화에서 제외됨
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name = " + name + ", price = " + price + "]";
	}
	// toString() 메서드는 개별 객체에 대한 문자열 표현을 제공하는 역할.
	// toString()에서 반복문을 사용할 수 없음.
	// 객체 배열을 다룰 때는 외부에서 반복문을 사용해야 함.
	// (print~ 같은 메서드를 추가로 만들어서 반복문을 돌려줘야한다.)
}
