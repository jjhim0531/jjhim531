package j.Interface.ex1;


public interface Animal {
	//상수도 멤버로 포함가능.(인터페이스 변수의 값 변경시도 시 컴파일 에러 발생 - 상수라서)
	public static final int num = 0;
	
	public abstract void move();
	//void move();  //public void move()  //모두 가능.
	//단, 오버라이딩헤서 구현 시에는 반드시 public을 적어줘야함.
	public abstract void eat();
	public abstract void makeSound();

	//인터페이스는 메모리 공간을 잡을 수 없음. -> 따라서 필드도 만들 수 없음.
	//인터페이스는 참조변수는 만들 수 있음.
	//인터페이스 간의 상속도 가능함.(extends로 표현)
	
	
	//실제로 어떻게 구현되는지 그 안을 몰라도 됨.
	//구현은 implements로 받는 클래스에서 자세히 코드를 작성.
	//자판기나 키오스크의 화면 같은 곳. 실제로는 그안에서 기계나 다른 머신들이 엄청 돌아가고 있음.
	//그러나 사용자는 그런거 몰라도 됨.
}
