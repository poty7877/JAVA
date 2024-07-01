package ch04;

import java.util.Scanner;

public class SSNExam {

	public static void main(String[] args) {
		// 주민번호 7번째 글자를 입력 받아 남여 파악용.
		Scanner input = new Scanner(System.in);

		System.out.print("주민번호 7번째 숫자 입력 : ");
		int ssn = input.nextInt();

		if (ssn > 8 || ssn < 1) { // ssn이 1미만이거나, 8초과 이면 입력 오류를 안내.
			System.out.println("입력 오류 : 1부터 8사이의 숫자를 입력해주세요. ");
		}

		if (ssn <= 8 && ssn >= 1 && ssn % 2 == 1) { // ssn이 1이상 8이하이면서 2로 나눈 나머지가 1일 때,
			System.out.println("남자 입니다.");

		}
		if (ssn <= 8 && ssn >= 1 && ssn % 2 == 0) { // ssn이 1이상 8이하이면서 2로 나눈 나머지가 0일 때,
			System.out.println("여자 입니다.");
		}

	}

}
