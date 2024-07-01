package ch04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기.
		// C -> 시동을 건다. (START)
		// R -> 계기판 정보 출력
		// U -> 주행속도변경
		// D -> 시동을 끈다. (END)

		Scanner inInt = new Scanner(System.in);
		boolean run = true; // 시동을 건다.
		int speed = 0; // 차량 속도.
		final int MAXSPEED = 300; // 최고 속도 상수(변경 안됨)
		final int MINSPEED = +0; // 최저 속도 상수(변경 안됨)

		// MAXSPEED = 400;

		System.out.println("GV80이 입고 되었습니다. ");
		System.out.println("시동을 켭니다. ");
		System.out.println("현재 속도 : " + speed + "km/h");

		while (run) {
			// 무한 반복 중 메뉴가 출력
			System.out.println("=========================");
			System.out.println("0. 시동 종료 "); // 종료 성공
			System.out.println("1. 엑셀 "); // 5km/h 가속 + 300이하 최대 성공
			System.out.println("2. 브레이크 "); // 5km/h 감속 + 0이상 최소 성공
			System.out.println("3. 멀티미디어 ");
			System.out.println("4. 주유 ");
			System.out.println("5. 가속시 증가되는 속도");
			System.out.println("=========================");
			System.out.print("(0 ~ 4 숫자 입력)>>>>> : ");
			int select = inInt.nextInt();

			switch (select) {
			case 0:
				System.out.println("시동을 종료합니다.");
				run = false;
				break; // while문 종료

			case 1:
				System.out.println("가속을 진행합니다.");
				speed += 5;
				if (speed >= MAXSPEED) { // 현재속도가 최고속도보다 크거나 같으면
					speed = MAXSPEED;
				} // if문 종료 : 300km/h 이상 출력 안됨.
				System.out.println("현재 속도 : " + speed + "km/h");
				break;

			case 2:
				System.out.println("감속을 진행합니다.");
				speed -= 5;
				if (speed <= MINSPEED) { // 현재속도가 최저속도보다 작거나 같으면
					speed = MINSPEED;
				} // if문 종료 : 0km/h 이하 출력 안됨.
				System.out.println("현재 속도 : " + speed + "km/h");
				break;

			case 3:
				System.out.println("멀티 미디어");
				break;

			case 4:
				System.out.println("주유");
				break;

			case 5:
				System.out.println("주유");
				break;

			} // switch문 종료

		} // while문 종료
		System.out.println("GV80이 사라집니다.");
	} // main문 종료

} // class문 종료
