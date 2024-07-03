package ch12.priority;

public class PriorityExam {

	public static void main(String[] args) {
		// 스레드를 10개 만든다. 10번 스레드의 우선순위 값을 10으로 준다.
		// 누가먼저 2000000000을 반복하고 끝나는지 확인한다.

		for (int i = 1; i <= 10; i++) {
			Thread th = new CalcThread("스레드" + i); // 객체가 생성되며 이름 생성
			if (i != 10) {
				th.setPriority(Thread.MIN_PRIORITY); // (우선순위 1)
			} else {
				th.setPriority(Thread.MAX_PRIORITY); // (우선순위 10)
			}
			
			th.start();

		} // 스레드 10개 생성및 실행

	}

}
