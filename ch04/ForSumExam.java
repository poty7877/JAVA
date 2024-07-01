package ch04;

import java.util.Scanner;

public class ForSumExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 값을 반복 더해 주는 코드.

		Scanner inputInt = new Scanner(System.in);

		int sum = 0; // 반복 더해 주는 결과 값.
		int x = 0; // 초기값.
		int y = 0; // 종료값.
		int z = 0; //

		System.out.print("더할 처음 값을 입력 하세요 . : ");
		x = inputInt.nextInt(); // 키보드로 입력 한 초기 값 저장.

		System.out.print("더할 마지막 값을 입력 하세요. :  ");
		y = inputInt.nextInt(); // 키보드로 입력 한 마지막 값 저장.

		z = x; // 입력받은 x의 초기값을 z에 저장.

		for (; x <= y; x++) {
			sum = sum + x;
		}

		System.out.println(z + "~" + y + "까지의 누적 합계 값은 : " + sum);

	}

}
