package h.inherit.ex1;

public class BusinessMan extends Man{
	private String company;
	private String position;
	
	public BusinessMan(String name, String company, String position) {
		//super(); //기본생성자 호출
		super(name);	//BusinessMan의 생성자에서 super(name)을 호출하여 부모 클래스의 생성자 Man(String name)을 실행합니다.
						//부모 클래스의 생성자가 호출될 때마다 System.out.println("Man Name을 초기화하는 생성자 호출")가 실행됩니다.
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + this.company);
		System.out.println("My position is " + this.position);
		super.tellYourName();
	}
}
/*
부모 클래스에 기본 생성자를 추가해 두는 것은:

컴파일 에러 방지에 효과적입니다.
자식 클래스 설계를 유연하게 만듭니다.
협업 환경에서 코드의 안정성과 이해도를 높입니다.
따라서, 특별한 이유가 없다면 부모 클래스에 기본 생성자를 항상 정의해 두는 것이 좋은 습관입
*/