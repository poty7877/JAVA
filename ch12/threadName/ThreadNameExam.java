package ch12.threadName;

public class ThreadNameExam {

	public static void main(String[] args) {
		// 스레드의 이름을 정하면 버그 수정에 좋다.

		Thread mainThread = Thread.currentThread(); // 현재Thread 객체를 mainThread에 넣음

		System.out.println(mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println("new ThreadA().getName : " + threadA.getName());
		threadA.setPriority(10);
		threadA.start(); // 스레드 시작
		
		
		ThreadB threadB = new ThreadB();
		System.out.println("new ThreadB().getName : " + threadB.getName());
		threadB.start(); // 스레드 시작
		
		

	}

}
