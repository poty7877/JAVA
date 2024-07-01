package ch04;

import java.util.Scanner;

public class SSNExam2 {

	public static void main(String[] args) {
		// if문과 substring을 이용하여,성별, 나이, 태어난 월 하여 출력하기.

		Scanner input = new Scanner(System.in); // 키보드로 입력 받을 객체 생성.

		System.out.println("주민등록 번호를 입력 하세요 (-포함) : "); // 주민등록번호 -포함 총 14자리 입력.
		String ssn = input.next();
		if (ssn.length() > 14) {
			System.out.println("입력 오류");
		}

		char ssn1 = ssn.charAt(7); // 입력받은 주민 등록번호의 7번째 자리 문자 추출.
		int num = Character.getNumericValue(ssn1);

		if (ssn1 % 2 == 1) {
			System.out.println("남자"); // 7번째 자리 문자 나누기 2의 나머지값이 1이면 남자.
		} else if (ssn1 % 2 == 0) {
			System.out.println("여자"); // 7번째 자리 문자 나누기 2의 나머지값이 0이면 여자.
		}

		int year = Integer.parseInt(ssn.substring(0, 2)); // ssn 문자열의 0,1 자리 문자 추출 후 int로 변환. ex) 961028-******* = '96'

		if (num == 1 || num == 2 || num == 5 || num == 6) { // num은 ssn의 7번째문자열인 ssn1을 int로 변환한것.
			System.out.println("나이는 " + (2024 - (1900 + year)) + "입니다."); // num = 1,2,5,6인 경우
		} else if (num == 3 || num == 4 || num == 7 || num == 8) {
			System.out.println("나이는 " + (2024 - (2000 + year)) + "입니다."); // num = 3,4,7,8인 경우
		} else {
			System.out.println("다시 작성해주세요.");
		}

		int month = Integer.parseInt(ssn.substring(2, 4)); // ssn 문자열의 2,3 자리 문자 추출 후 int로 변환. ex) 961028-******* = '10'

		if (month <= 0 || month > 12) { // month가 0이하이거나, 12초과 일 때
			System.out.println("다시 작성해주세요. ");
		} else if (month >= 3 && month <= 5) {
			System.out.println("봄에 태어났습니다.");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름에 태어났습니다.");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을에 태어났습니다.");
		} else {
			System.out.println("겨울에 태어났습니다.");
		}

	}

}
