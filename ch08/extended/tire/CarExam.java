package ch08.extended.tire;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주행 테스트
		// 결론 Tire tire = new Tire();
		// 	   Tire tire = new HankookTire();
		//	   Tire tire = new KumhoTire();
		Scanner scanner = new Scanner(System.in);
		Car car = new Car(); // 서비스 객체

		for (int i = 1; i <= 8888; i++) {
			// 30번 주행
			int problemLocation = car.run();
			// 0이면 정상 1~4는 고장(위치정보)

			switch (problemLocation) {
			case 0:
				System.out.println();
				break;

			case 1:
				System.out.println("왼쪽 앞 타이어가 펑크");
				System.out.println("1.한국타이어 | 2.금호타이어 | 3.oem타이어");
				System.out.print(">>>");
				int select = scanner.nextInt();
				if (select == 1) {
					car.fl = new HankookTire(8000, "앞왼");
					System.out.println("한국타이어로 교체 성공");
				} else if (select == 2) {
					car.fl = new KumhoTire(8000, "앞왼");
					System.out.println("금호 타이어로 교체 성공");
				} else {
					car.fl = new Tire(8000, "앞왼");
					System.out.println("OEM타이어로 교체 성공");
				} // if문 종료
				break;

			case 2:
				System.out.println("오른쪽 앞 타이어가 펑크");
				System.out.println("1.한국타이어 | 2.금호타이어 | 3.oem타이어");
				System.out.print(">>>");
				int select1 = scanner.nextInt();
				if (select1 == 1) {
					car.fr = new HankookTire(8000, "앞오");
					System.out.println("한국타이어로 교체 성공");
				} else if (select1 == 2) {
					car.fr = new KumhoTire(8000, "앞오");
					System.out.println("금호 타이어로 교체 성공");
				} else {
					car.fr = new Tire(8000, "앞오");
					System.out.println("OEM타이어로 교체 성공");
				} // if문 종료
				break;

			case 3:
				System.out.println("왼쪽 뒤 타이어가 펑크");
				System.out.println("1.한국타이어 | 2.금호타이어 | 3.oem타이어");
				System.out.print(">>>");
				int select2 = scanner.nextInt();
				if (select2 == 1) {
					car.bl = new HankookTire(8000, "뒤왼");
					System.out.println("한국타이어로 교체 성공");
				} else if (select2 == 2) {
					car.bl = new KumhoTire(8000, "뒤왼");
					System.out.println("금호 타이어로 교체 성공");
				} else {
					car.bl = new Tire(8000, "뒤왼");
					System.out.println("OEM타이어로 교체 성공");
				} // if문 종료
				break;

			case 4:
				System.out.println("오른쪽 뒤 타이어가 펑크");
				System.out.println("1.한국타이어 | 2.금호타이어 | 3.oem타이어");
				System.out.print(">>>");
				int select3 = scanner.nextInt();
				if (select3 == 1) {
					car.br = new HankookTire(8000, "뒤오");
					System.out.println("한국타이어로 교체 성공");
				} else if (select3 == 2) {
					car.br = new KumhoTire(8000, "뒤오");
					System.out.println("금호 타이어로 교체 성공");
				} else {
					car.br = new Tire(8000, "뒤오");
					System.out.println("OEM타이어로 교체 성공");
				} // if문 종료
				break;

			}// switch 종료
			System.out.println("========정상주행=========");
		} // for 종료

	}// main method 종료

}// CarExam class 종료
