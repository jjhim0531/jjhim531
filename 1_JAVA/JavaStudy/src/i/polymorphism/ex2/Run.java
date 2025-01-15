package i.polymorphism.ex2;

public class Run {

	public static void main(String[] args) {
		//1. 부모타입 레퍼런스(참조변수)로 부모객체를 다루는 경우
		Car c1 = new Car("빨간색", "가솔린", 2020);
		c1.drive();
		System.out.println();
		
		//2.자식타입 레퍼런스로 자식객체를 다루는 경우
		Avante c2 = new Avante("검은색", "디젤", 2022);
		c2.drive();
		c2.moveAvante();
		System.out.println();
		
		//3.부모타입 레퍼런스로 자식객체를 다루는 경우
		Car c3 = c2;
		c3.drive();
		((Car)c2).drive();//자식의 참조변수를 부모의 참조변수로 바꿈.(업캐스팅 - 자동이므로 (Car)c2)를 굳이 안적어줘도 된다.)
		System.out.println();
		//c3는 Car 타입으로 선언되어 있습니다.
		//하지만 실제로 c3가 참조하는 객체는 Avante 객체이다.
		//(c2가 Avante 객체이기 때문).
		
		Car c4 = new Sonata("횐색", "가스", 2023);//업캐스팅
		c4.drive();
		Sonata c5 = (Sonata)c4;//부모 클래스 타입인 c4를 자식 클래스 타입(Sonata)으로 다운캐스팅(Downcasting)
		//c5는 Sonata 타입 변수
		((Sonata)c4).moveSonata();//c4를 다운캐스팅하여 moveSonata 메서드 호출.
		System.out.println();
		
		/*
		 * "상속 구조"의 클래스들 간에 형변환 가능
		 * 
		 * 1. UpCasting
		 *    자식 타입 -> 부모 타입으로 형변환
		 *    자동형변환
		 * 	  ex) Car c1 = new Sonata();
		 * 
		 * 2. DownCasting
		 * 	  부모 타입 -> 자식 타입으로 형변환
		 *    강제형변환 해야함
		 *    ex) ((Sonata)c1).moveSonata();
		 *         ((자식)부모).자식메소드();
		 * 
		 */
		
		// 다형성
		// 부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로 다룰 수 있는 기술
		
		//다형성의 장점
		
		//다형성 사용 전
		Sonata[] sonataArr = new Sonata[5];
		sonataArr[0] = new Sonata("횐색", "가스", 2023);
	
		
		Avante[] avanteArr = new Avante[5];
		avanteArr[0] = new Avante("검은색", "가솔린", 2023);
		
		//다형성 사용 후
		Car[] carArr = new Car[4];
		carArr[0] = new Sonata("횐색", "가스", 2023);
		carArr[1] = new Avante("검은색", "가솔린", 2023);
		carArr[2] = new Sonata("횐색", "가스", 2023);
		carArr[3] = new Avante("검은색", "가솔린", 2023);
		
		for(int i=0; i<carArr.length; i++) {
			//해당 참조변수가 실제 Sonata 객체를 참조하고 있니?
			if(carArr[i] instanceof Sonata) {
				((Sonata)carArr[i]).moveSonata();
			} else if(carArr[i] instanceof Avante) {
				((Avante)carArr[i]).moveAvante();
			} else {
				carArr[i].drive();
			}
		}
		
	}

}
