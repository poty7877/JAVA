package ch04;

public class For2To9Exam {

	public static void main(String[] args) {
		// 2단에서 9단까지 구구단을 찍어보자.
		// for문 안쪽에 for를 또 작성하면 바깥쪽에 for가 돌면서 안쪽 for문이 돈다.
		// 블럭 for { for }를 조심할 것.

		System.out.println("========구구단 시작 =========");
		for (int m = 2; m <= 9; m++) { // 2부터 9까지 반복(앞단)
			System.out.println("******** " + m + "단 *********");
			for (int n = 1; n <= 9; n++) { // 1부터 9까지 반복
				System.out.println(m + " X " + n + " = " + (m * n));
			}
		}

	}

}
