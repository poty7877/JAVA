package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1~100까지의 합을 구하시오

		int i = 0; // 반복용 변수 i
		int sum = 0; // 합을 구하는 변수 sum

		while (i <= 100) { // 1~100까지 반복(true),
			sum += i; // sum = sum + i -> i값 1~100까지를 sum이랑 더함.
			i++; // i = i + 1 -> 1~100까지 i를 증가시킴.
		} // while문 종료.

		System.out.println("1부터 100까지의 합은 : " + sum);

	}

}
