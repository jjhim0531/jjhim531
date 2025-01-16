package i.polymorphism.ex1;

public class Run {
	public static void main(String[] args) {
		/*
		 	클래스 참조변수  =  new 클래스 생성자;
  ( 부모클래스가 올 수 있다.)  /  (자식클래스로 생성할 수 있다.)
   실제로 어디까지 접근이 가능  /  실제로 어떤 형태의 메모리가 생성이 되는가.	
		 */
		
		
		Cake c1 = new CheeseCake();
		//Cake까지 접근가능하며 메모리공간은 실제 CheeseCake다
		//업캐스팅에만 new 키워드 사용이 가능하다.ㄴ
		c1.sweet();
		
		c1.yummy(); 
		//오버라이딩 시에는 무조건 실제 메모리에 있는 재정의된 메서드가 호출됨
	
		//CheeseCake ch2 = new Cake();
		//실제메모리공간이 Cake이므로 CheeseCake공간에 접근할 수 없다.
		//다운캐스팅에는 new 키워드를 쓸 수 없다.
	}
}
