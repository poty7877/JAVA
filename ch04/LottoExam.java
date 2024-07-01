package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성.
		// 몇개가 맞았는지 파악.

		Scanner input = new Scanner(System.in);

		System.out.println("1부터 45까지의 번호중 6개의 번호를 입력해주세요.");

		int myNum1 = input.nextInt();
		System.out.println("첫번째 번호 : " + myNum1);

		int myNum2 = input.nextInt();
		System.out.println("두번째 번호 : " + myNum2);

		int myNum3 = input.nextInt();
		System.out.println("세번째 번호 : " + myNum3);

		int myNum4 = input.nextInt();
		System.out.println("네번째 번호 : " + myNum4);

		int myNum5 = input.nextInt();
		System.out.println("다섯번째 번호 : " + myNum5);

		int myNum6 = input.nextInt();
		System.out.println("여섯번째 번호 : " + myNum6); // 키보드로 번호 6개를 입력받아 저장.

		int num1 = (int) (Math.random() * 45) + 1;
		int num2 = (int) (Math.random() * 45) + 1;
		int num3 = (int) (Math.random() * 45) + 1;
		int num4 = (int) (Math.random() * 45) + 1;
		int num5 = (int) (Math.random() * 45) + 1;
		int num6 = (int) (Math.random() * 45) + 1; // 6개의 로또번호를 생성 후 저장.

		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}
		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}
		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}
		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}
		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}
		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}
		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}
		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}
		if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4
				|| num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5
				|| num4 == num6 || num5 == num6) {
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;
		}

		int x = 0; // 맞은 숫자.

		if (myNum1 == num1 || myNum1 == num2 || myNum1 == num3 || myNum1 == num4 || myNum1 == num5 || myNum1 == num6) {
			x++;
		}
		if (myNum2 == num1 || myNum2 == num2 || myNum2 == num3 || myNum2 == num4 || myNum2 == num5 || myNum2 == num6) {
			x++;
		}
		if (myNum3 == num1 || myNum3 == num2 || myNum3 == num3 || myNum3 == num4 || myNum3 == num5 || myNum3 == num6) {
			x++;
		}
		if (myNum4 == num1 || myNum4 == num2 || myNum4 == num3 || myNum4 == num4 || myNum4 == num5 || myNum4 == num6) {
			x++;
		}
		if (myNum5 == num1 || myNum5 == num2 || myNum5 == num3 || myNum5 == num4 || myNum5 == num5 || myNum5 == num6) {
			x++;
		}
		if (myNum6 == num1 || myNum6 == num2 || myNum6 == num3 || myNum6 == num4 || myNum6 == num5 || myNum6 == num6) {
			x++;
			// 6개의 로또번호를 키보드로 입력받아 저장한 6개와 전체 비교후 일치하는 숫자가 있으면 x값을 증가 시킴.
		}
		System.out.println("==================================");
		System.out.println("이번주 로또 번호는 : " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6); // 랜덤으로
																														// 생성한
																														// 번호
																														// 6개를
																														// 출력.
		System.out.println(
				"입력하신 로또 번호는 : " + myNum1 + " " + myNum2 + " " + myNum3 + " " + myNum4 + " " + myNum5 + " " + myNum6); // 키보드로
																														// 입력받은
																														// 번호
																														// 6개를
																														// 출력.
		if (x == 0) {
			System.out.println(" 맞은 숫자가 없습니다. ");
		}
		if (x == 1) {
			System.out.println(" 축하합니다. 번호가 1개 맞았습니다. ");
		}
		if (x == 2) {
			System.out.println(" 축하합니다. 번호가 2개 맞았습니다. ");
		}
		if (x == 3) {
			System.out.println(" 축하합니다. 번호가 3개 맞았습니다. ");
		}
		if (x == 4) {
			System.out.println(" 축하합니다. 번호가 4개 맞았습니다. ");
		}
		if (x == 5) {
			System.out.println(" 축하합니다. 번호가 5개 맞았습니다. ");
		}
		if (x == 6) {
			System.out.println(" 축하합니다. 번호가 6개 맞았습니다. ");
		} // 증가된 x값에 따라 결과를 출력.
	}

}
