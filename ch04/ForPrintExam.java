package ch04;

public class ForPrintExam {

	public static void main(String[] args) {
		// for문은 횟수가 정해진 반복문이다.
		// for(초기값 ; 조건식 ; 증감식) { 실행문1; 실행문2; } 실행블럭

		int sum = 0; // 총합의 누적 계산용

		for (int i = 1/* 초기값 */ ; i <= 100/* 조건식 */ ; i++/* 증감식 */) {

			sum += i; // sum = sum + i

		} // for문 종료
		System.out.println("1부터 100까지 더한 값 : " + sum);

		for (int j = 0, k = 100; j <= 10 && k >= 90; j++, k--) {
			System.out.println("j값의 증가 : " + j + " // k값의 감소 : " + k);
		}
	}

}
