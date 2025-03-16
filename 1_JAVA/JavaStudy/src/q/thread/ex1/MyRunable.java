package q.thread.ex1;

//쓰레드 생성방법2. Runnable의 추상메소드 run을 구현하는 객체를 만든다.
//			   (Runnable 인터페이스를 구현하여 Thread 객체에서 실행 )
//				Runnable 인터페이스 자체는 쓰레드를 직접 나타내지 않음.
//				단순히 "쓰레드에서 실행할 작업(로직)"을 정의하는 역할.
//				Thread 클래스와 직접적인 관계가 없어 보이지만, 실제 쓰레드는 Thread 객체가 실행할 때 만들어짐.
public class MyRunable implements Runnable{

	@Override
	public void run() {
		int n1 = 10;
		int n2 = 20;
		
		//currentThread() : 지금 실행하고 있는 쓰레드의 정보객체를 반환한다
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}

}
