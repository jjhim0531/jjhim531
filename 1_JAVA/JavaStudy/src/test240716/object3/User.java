package test240716.object3;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	
	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//alt + shift + s 누르면 나오는 목록 중에 
	//Override/Implement Methods를 클릭하면 오버라이딩 가능한 메소드들의 목록이 보여진다.
	@Override
	public boolean equals(Object obj) {
		//User 객체인 users[i]가 Object 타입의 obj에 전달되는 것은 업캐스팅(자동으로 수행)
		User tmp = (User)obj;// 다운캐스팅(명시적으로 해줘야함)
		return this.id.equals(tmp.id) &&
			   this.password.equals(tmp.password) &&
			   this.age == tmp.age &&
			   this.gender == tmp.gender &&
			   this.name.equals(tmp.name) &&
			   this.phone.equals(tmp.phone);
	}

	//clone 메서드는 Object 클래스에서 정의된 메서드로, 반환 타입이 기본적으로 Object이다.
	//이것을 항상 유지해줘야한다.
	//다만, 자바 5부터는 공변 반환 타입(Covariant Return Type)을 지원하여, 오버라이딩된 메서드에서 반환 타입을 더 구체적인 타입으로 지정할 수 있다.
	//따라서 자바5부터는 꼭 Object타입을 안써주고 원하는 대로 써주고 다운캐스팅을 굳이 안해도 된다.
	@Override
	protected Object clone() {
		User copy = new User(id, password, name, age, gender, phone);
		//여기서 copy 변수는 User 클래스 타입
		//new User(...)를 통해 User 객체가 생성되고, 이 객체의 참조가 copy 변수에 저장
		return copy;//// User 객체가 반환되지만, Object 타입으로 업캐스팅됨
	}
	//clone 메서드의 반환 타입은 Object로 선언되어 있다.
	//따라서, return copy;에서 User 객체가 반환되지만, Object 타입으로 업캐스팅됩니다.

	@Override
	public String toString() {
		return id + " " + password + " " + name + " " + gender + " " + phone;
	}
}
