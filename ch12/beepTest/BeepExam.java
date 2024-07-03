package ch12.beepTest;

import java.awt.Toolkit;

public class BeepExam {

	public static void main(String[] args) {
		// 소리와 자막이 동시에 나오고 싶은 프로그램.

		Runnable beepTask = new BeepTask();
		// 스레드 run 용 객체 생성

		Thread th1 = new Thread(beepTask);
		// run 메서드가 들어있는 객체를 스레드에 넣음

		th1.start(); // 스레드 시작

		for (int i = 0; i < 10; i++) {
			System.out.println("띠리링");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // 자막 for 종료

	} // main method 종료

}// BeepExam
