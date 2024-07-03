package ch12.beepTest;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	// 소리가 나는 스레드

	@Override
	public void run() {
		// TODO Auto-generated method stub

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 10; i++) {

			toolkit.beep();

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1초 동안 대기

		} // 소리나는 for 종료

	}

}
