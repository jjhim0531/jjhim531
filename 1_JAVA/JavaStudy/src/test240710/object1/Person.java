package test240710.object1;

public class Person {
	String name = "이름없음";// 값이 없다면 "이름없음"
	// String name = "이름없음";도 가능하지만 기본생성자 생성으로 초기화하기에 왠만하면 직접 초기화하지않음.

	int age;// 값이 없다면 1
// 모든 필드 데이터를 전달받은 값으로 초기화하는 생성자

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("name : " + name + " age : " + age);
	}

	public Person(String name) {
		this(name, 1);// this()는 본인의 생성자 호출, 생성자의 가장 첫번쨰 줄에 작성해야한
		System.out.println("name : " + name + " age : " + age);
	}

	public Person() {
		this("이름없음", 1);
		System.out.println("name : " + name + " age : " + age);
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

}
