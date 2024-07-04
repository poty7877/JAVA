package ch14.collection.hashMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 id와 pw를 이용한 로그인 성공 테스트

		Map<String, String> login = new Hashtable<String, String>();

		login.put("kkw1", "1");
		login.put("kkw2", "12");
		login.put("kkw3", "123");
		login.put("kkw4", "1234");
		login.put("kkw5", "12345"); /// <"id", "pw">

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("ID 입력 : ");
			String id = scanner.next();
			System.out.print("PW 입력 : ");
			String pw = scanner.next();

			if (login.containsKey(id)) { // 테이블에 k 가 id와 같은 것을 찾음.
				if (login.get(id).equals(pw)) { // id와 pw가 같은것을 찾음.
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호 오류");
				} // 패스워드 일치 if 문 종료
			} else {
				System.out.println("입력된 ID가 없습니다. ");
			} // 아이디 일치 if 문 종료
		} // while 종료
	}// main method 종료

}// clss 종료
