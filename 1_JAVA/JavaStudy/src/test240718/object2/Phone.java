package test240718.object2;

public interface Phone {
	static final char[] NUMBERPAD = {'1','2','3','4','5','6','7','8','9','*','0','#'};
	//static final 생략 가능
	
	public abstract String makeCall();
	public abstract String takeCall();
	//public abstract 생략가능
}
//추상클래스나 인터페이스가 객체생성이 안되는 이유?
//구현부가 없기 때문(객체생성은 구현부에서만 가능)