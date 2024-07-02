package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteExam {

	public static void main(String[] args) {
		// 인터페이스를 사용한 구현 클래스를 이용해본다.

		System.out.println("리모컨 인터페이스를 사용합니다.");
		Scanner scanner = new Scanner(System.in);
		RemoteControl.changeBattery();
		RemoteControl rc = null; // 인터페이스를 변수에 넣음.

		boolean condition = true;
		while (condition) {
			System.out.println("================================");
			System.out.println("1.TV | 2.오디오 | 3.스마트TV | 4.종료");
			System.out.println("================================");
			System.out.print(">>>>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				rc = new Television();
				rc.turnOn();
				rc.turnOff();
				rc.setMute(true); // 음소거 o
				rc.setMute(false); // 음소거 x
				break;

			case 2:
				rc = new Audio();
				rc.turnOn();
				rc.turnOff();
				rc.setMute(true); // 음소거 o
				rc.setMute(false); // 음소거 x
				break;

			case 3:
				rc = new SmartTelevision();
				rc.turnOn();
			
				Searchable se = new SmartTelevision(); // 2번째 인터페이스 연동
				System.out.println("인터넷 검색을 시작합니다.");
				System.out.print(">>>");
				String url = scanner.next();
				se.search(url);
				rc.turnOff();

				break;
			case 4:
				System.out.println("종료합니다.");
				condition = false;
				break;

			default:
				System.out.println("1~2값만 넣어주세요");
			} // switch 종료

		} // while종료
	}// main method 종료

}
