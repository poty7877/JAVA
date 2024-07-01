package ch06.Board;

import java.util.Scanner;

public class Member { // 회원에 대한 CRUD
	// 필드 -> 멤버 변수

	String id;
	String pw;
	String nickName;
	String email;

	// 생성자 -> new로 객체 생성시 사용(생략시 기본 생성자가 자동으로 만들어 짐)
	// Member member = new member();

	// 메서드 -> 동작(CRUD)
	public Member register(Scanner input) {
		Member newMember = new Member();
		// 새로운 Member 객체 생성하여 키보드로 넣은 필드값을 삽입 하고 객체로 리턴
		System.out.println("ID를 입력 하세요 : ");
		newMember.id = input.next();
		System.out.println("암호를 입력 하세요 : ");
		newMember.pw = input.next();
		System.out.println("닉네임을 입력 하세요 : ");
		newMember.nickName = input.next();
		System.out.println("이메일을 입력 하세요 : ");
		newMember.email = input.next();
		return newMember;

	}// register 메서드 종료

	public Member login(Scanner input, Member[] members) {
		// 매개값 키보드 입력, 회원 배열
		System.out.println("로그인을 시작 합니다.");
		Member loginMember = new Member(); // 키보드로 입력한 객체 생성
		System.out.println("아이디를 입력 하세요 : ");
		System.out.print(">>>>");
		loginMember.id = input.next(); // 키보드로 입력 받은 id를 새로만든 객체에 저장
		System.out.println("비밀번호를 입력 하세요 : ");
		System.out.println(">>>>");
		loginMember.pw = input.next(); // 키보드로 입력 받은 pw를 새로만듣 객체에 저장

		// 배열에 있는 객체와 새로 만든 객체 비교 시작

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].id.equals(loginMember.id) && members[i].pw.equals(loginMember.pw)) {
					// 배열에 빈칸이 아니고, 배열에 있는 id와 키보드로 입력한 id가 같고, 배열에 있는 wp와 키보드로 입력한 pw가 같으면
					// loginMember 2개의값, members[i] 4개의 값을 가지고 있다.
					loginMember = members[i]; // 위조건이 일치하면 loginMember를 4개의 값을 가지고 있는 members[i]값으로 교체.
				} // if문 종료 (id,pw비교 -> 객체 치환)
				break;

			} else {
				System.out.println("회원 정보가 없습니다. id/pw를 확인하세요");
				break;

			}
		} // for문 종료

		return loginMember;
	}// login 메서드 종료

	public void modify() {
		System.out.println("회원 정보 수정을 시작합니다.");
	}// modify 메서드 종료

	public void delete() {
		System.out.println("회원 탈퇴를 시작 합니다.");
	}// delete 메서드 종료

	public void menu(Scanner input, Member[] members) {
		// 매개값 스태너 멤버배열
		boolean run = true;
		while (run) {
			System.out.println("================== 회원 전용 메뉴 ==================");
			System.out.println("1.회원가입 | 2.로그인 | 3.정보수정 | 4.회원탈퇴 | 5.종료");
			System.out.print(">>>>>");
			int memMenu = input.nextInt();
			switch (memMenu) {

			case 1:
				System.out.println("회원 가입을 진행 합니다. ");
				// 키보드로 입력받을 필드 완성후 객체로 받음.
				Member newMember = register(input);
				// 멤버배열 null을 찾아 삽입
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = newMember;
						// System.out.println(newMember.nickName + newMember.email + newMember.id +
						// newMember.pw + "객체가 배열에 저장됨");
						break; // for문이 끝나야함.
					} // if문 종료
				} // for문 종료
				break;
			case 2:
				System.out.println("로그인을 진행 합니다");
				Member loginMember = login(input, members); // 호출시 스캐너와 배열 객체 전달
				System.out.println(loginMember.nickName + "님 환영 합니다.");
				break;
			case 3:
				System.out.println("정보를 수정 합니다");
				modify();
				break;
			case 4:
				System.out.println("회원 탈퇴를 진행 합니다.");
				delete();
				break;
			case 5:
				System.out.println("종료 합니다.");
				run = false;
				break;
			default:
				System.out.println("1~5사이의 숫자만 입력 하세요");
				break;

			} // switch 문 종료
		} // while 문 종료

	}// menu 메서드 종료

}
