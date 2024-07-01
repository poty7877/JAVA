package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.DTO.Account;

public class LoginService {
	// 로그인에 관한 부메뉴 용

	public static Account menu(Scanner scanner, Account[] accounts, Account loginAccount) {
		System.out.println("1.로그인 | 2.회원가입 | 3.회원수정 | 4.메인메뉴복귀");
		System.out.print(">>>");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("로그인을 시작 합니다.");
			System.out.print("id : ");
			String id = scanner.next();
			System.out.print("pw : ");
			String pw = scanner.next();
			Account account = new Account();
			account.setId(id);
			account.setPw(pw); // 새로만든 account 객체에 id,pw 삽입
			for (int i = 0; i < accounts.length; i++) {// 배열에 있는 값과 비교
				if (accounts[i] != null) {
					if (accounts[i].getId().equals(account.getId())) {
						System.out.println("해당하는 id가 있습니다.");
						if (accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 pw가 있습니다.");
							loginAccount = accounts[i];
							System.out.println("로그인 성공");
							break;
						} else {
							System.out.println("해당하는 pw가 없습니다.");
						} // pw 비교 if 종료
					} else {
						System.out.println("해당하는 id가 없습니다.");
					} // id 비교 if 종료

				} else {
					System.out.println("해당하는 정보가 없습니다.");
					break;
				} // 빈객체 비교 if 종료
			} // for 종료

			break;

		case 2:
			System.out.println("회원가입을 시작 합니다");
			break;

		case 3:
			System.out.println("회원정보 수정을 시작 합니다.");
			break;

		case 4:
			System.out.println("메인메뉴로 복귀 합니다.");
			break;

		} // switch 종료
		return loginAccount;

	} // menu method 종료

}// class 종료
