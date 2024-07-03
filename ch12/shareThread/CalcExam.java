package ch12.shareThread;

public class CalcExam {

	public static void main(String[] args) {
		// 만든 스레드들을 동작 시킴.

		Calculator calculator = new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); // 스레드 시작

		// Calculator calculator2 = new Calculator();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator); // 객체가 공유된다.
		user2.start(); // 스레드 시작

	}

}
