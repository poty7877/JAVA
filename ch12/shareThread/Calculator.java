package ch12.shareThread;

public class Calculator {
	// 공유된 계산기

	private int memory;

	public int getMemory() { // 값출력용
		return memory;
	}

	public synchronized void setMemory(int memory) { // 값 입력용
		// synchronized -> 동기화 임계 영역 설정. 다른사람이 쓰고 있는 동안 접근 금지.
		this.memory = memory;

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("2초간 딜레이 중 예외 발생");
			// e.printStackTrace();
		} // try - catch문 종료

		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		// 2초 뒤에 메모리 필드 값 출력
	}
}
