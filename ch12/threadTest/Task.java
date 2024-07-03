package ch12.threadTest;

public class Task implements Runnable { // implements Runnable 멀티 스레드용
	// 멀티스레드 구축 방법 1. Runnable 인터페이스를 사용 하여 구현체로 만드는 방법.

	@Override // Runnable 인터페이스에서 제공한 추상메서드를 재정의
	public void run() {
		// 스레드로 만든 코드를 개발자가 작성을 함.
		System.out.println("Implemnets Runnable 인터페이스의 run() 추상메서드 실행됨.");

	}

}
