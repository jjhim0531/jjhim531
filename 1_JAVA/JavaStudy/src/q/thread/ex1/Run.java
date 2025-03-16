package q.thread.ex1;

public class Run {
	//쓰레드 : 프로그램 내에서 실행의 흐름을 가지고 있는 최소 단위
	//        main 메소드 실행 시 메인쓰레드가 실행되는 것이다.
	public static void main(String[] args) {
		
		Task t1 = new Task(); // 방법 1: Thread를 상속받아 만든 쓰레드 객체 생성
		
		Runnable task = new MyRunable(); // 방법 2: Runnable을 구현한 객체 생성
		Thread t2 = new Thread(task); //// Runnable 객체를 Thread 객체의 생성자에 넘겨준다.
		
		// 두 개의 쓰레드 실행(start() 메서드를 호출하면 새로운 쓰레드가 실행됨)
		// (실행 순서는 OS가 결정하므로 랜덤하게 출력됨)
		// Java 내부적으로 Thread 객체를 생성할 때마다 Thread-n 형태의 기본 이름이 생성됨
		t1.start();
		t2.start();
		for (int i = 0; i < 3; i++) {
			new Task().start();
			new Thread(new MyRunable()).start();
		}
		System.out.println("END : " + Thread.currentThread().getName());
	}

}
