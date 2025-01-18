package test240718.object2;

public interface CellPhone extends Phone, Camera{
	public String charge();
}
//인터페이스 간에는 extends를 사용하지만, 구현하는 클래스는 항상 implements를 사용합니다.
//인터페이스가 다른 인터페이스를 상속받을 때 extends를 사용하며, 이를 구현하는 클래스는 모든 상속된 인터페이스의 메서드를 반드시 구현해야 합


//CellPhone을 구현하는 클래스는:

	//1. Phone 인터페이스의 모든 메서드.
	//2. Camera 인터페이스의 모든 메서드.
	//3. CellPhone 인터페이스에서 추가로 정의한 메서드.
//이 모든 메서드를 구현해야 합니다.