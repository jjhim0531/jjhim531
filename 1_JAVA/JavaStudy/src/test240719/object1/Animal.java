package test240719.object1;

public abstract class Animal {
	private String name;
	private String kinds;
	/*
	 * protected의 기본 규칙
		1. 같은 패키지 내 접근 가능: 같은 패키지의 클래스는 상속 관계가 아니더라도 protected 멤버에 접근 가능하다.
		이는 패키지 내부의 클래스 간 협력을 지원합니다.
		
		2. 다른 패키지에서의 접근 제한: 다른 패키지에 있는 클래스는 상속 관계가 아니면 protected 멤버에 접근할 수 없다.
		다른 패키지의 자식 클래스에서 접근 가능:
		
		3. 특별 규칙으로, 다른 패키지의 자식 클래스는 부모 클래스의 protected 멤버에 접근할 수 있다.

	 * */
	protected Animal() {
		
	}
	

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다. \n";
	}
	
	public abstract void speak();
}
