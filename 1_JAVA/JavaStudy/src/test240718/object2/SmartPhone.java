package test240718.object2;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker;

	public SmartPhone() {
		super();
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public abstract String printInformation();
		
}
//추상클래스 - 구현된 메서드, 추상 메서드 모두 작성 가능.
//			단일 상속만 가능
//			인스턴스 변수와 상수 모두 선언 가능

//추상 클래스이므로, 인터페이스에서 정의된 메서드(call(), takePicture(), charge() 등)를 모두 구현할 필요는 없습니다.
//구현하지 않은 메서드는 추상 메서드로 남겨두고, 이를 구체적인 서브클래스가 구현하도록 강제할 수 있습니다.