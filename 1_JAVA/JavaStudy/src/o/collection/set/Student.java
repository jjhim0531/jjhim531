package o.collection.set;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int score;

	public Student() {
		super();
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ", age = " + age + ", score = " + score + "]";
	}

	@Override
	public int hashCode() { // 모든 필드에 담긴 값이 일치하면 동일한 hashCode 반환

		// 방법1. Objects 이용(String 변환이 없어서 더 빠름)(더 직관적이고 가독성이 좋음)
		// Java의 Objects.hash() 메서드를 활용하여 name, age, score 필드 값을 기반으로 해시 값을 자동으로 생성.
		// 내부적으로 Arrays.hashCode()를 사용하여 객체들의 해시 값을 조합하여 새로운 해시 코드 생성.
		//null 값이 들어와도 null-safe하게 처리됨.
		 return Objects.hash(name, age, score);

		// 방법2. String의 hashCode를 이용
		// name, age, score를 하나의 문자열(String)로 변환한 후(모든 필드를 String으로 변환해야 함), String.hashCode()를 호출.
		//문자열을 하나로 합쳐서 해시 값을 생성(문자열의 각 문자를 31을 곱해서 해시값을 생성)하므로 단순하고 직관적 but 비효율적.
		//하지만 Objects.hash()에 비해 유연성이 낮음.
		// return ("" + name + age + score).hashCode();
	}

	// Student.equals(Student객체)
	@Override
	public boolean equals(Object obj) { 
		// 현재 객체와 전달받은 객체의 각 필드값들이 모두 일치하면 true / 하나라도 일치하지 않는다면 false반환
		
		// this(현재 객체) <-> obj(전달받은 객체)

		if (obj instanceof Student) {
			//제네릭을 사용해도 instanceof 체크는 필수!
			//제네릭은 컴파일 타임에서만 동작. 런타임에서는 타입이 지워짐 → equals() 비교 시 타입 검사가 필요함
			Student other = (Student) obj;//Object로 받았으니 Student로 다운캐스팅.
			if (this.name.equals(other.getName()) && this.age == other.getAge() && this.score == other.getScore()) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

}
