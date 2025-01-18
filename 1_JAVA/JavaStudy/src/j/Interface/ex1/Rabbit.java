package j.Interface.ex1;

public class Rabbit implements Animal, Baby{
	//인터페이스는 다중구현 가능(Animal, Baby를 모두 구현되게 이어서 적을수 있음)

	@Override
	public void move() {
		
	}

	@Override
	public void eat() {
		System.out.println("냠냠 먹습니다");
	}

	@Override
	public void makeSound() {
		System.out.println("음메~");
	}
	
}
