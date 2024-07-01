package ch06.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam {
	// 필드 -> 멤버 변수로 main에서 사용할 배열이나 객체등을 생성.
	private static Scanner input = new Scanner(System.in); // 현 class내 모든 메서드에서 호출되어 사용함
	private static Student[] st = new Student[5]; // 학생 객체 용으로 5칸 배열 생성
	String[] string = new String[100]; //
	// 생성자 -> main일 경우 new 사용하지 않음 (정적 static으로 사용하지 않음)

	// 메서드
	public static void main(String[] args) {
		// 주실행 클래스로 메뉴와 클래스.메서드 호출용으로 작업
		// 객체 : 학생, 성적, 통계.....
		boolean run = true; // 반복 실행 시작
		while (run) { // 종료시 run = false ;
			System.out.println("==========학생 관리 프로그램 v2(객체)==========");
			System.out.println("1. 학생관리 | 2. 성적관리 | 3. 통계 | 4. 종료");
			System.out.println("========================================");
			System.out.print(">>>>>>>>");
			int select = input.nextInt(); // 객체 사용 전에 private static 있는지 확인 필수.
			switch (select) {
			case 1:
				boolean stRun = true;
				System.out.println("학생관리 클래스로 진입 합니다.");
				while (stRun) {
					System.out.println("1. 학생등록 | 2. 학생정보 확인 | 3.학생정보 수정 | 4.학생 삭제 | 5. 메인메뉴 복귀");
					System.out.print(">>>>>");
					int stSelect = input.nextInt();
					switch (stSelect) {
					case 1:
						System.out.println("학생등록 메뉴 입니다.");
						Student regStudent = new Student(); // 객체 생성
						System.out.println("이름 : ");
						regStudent.name = input.next(); // 키보드로 받은 이름
						System.out.println("학번 : ");
						regStudent.num = input.nextInt(); // 키보드로 받은 학번
						System.out.println("성별 : ");
						regStudent.sex = input.next(); // 키보드로 받은 성별
						System.out.println("학년 : ");
						regStudent.grade = input.nextInt(); // 키보드로 받은 학년
						System.out.println("반 : ");
						regStudent.classRoom = input.nextInt(); // 키보드로 받은 반
						System.out.println("------ 객체 생성 -> 입력 완료 ------");
						System.out.println("------- 배열 빈칸을 찾아 저장 -------");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) { // st배열의 빈칸을 찾음.
								st[i] = regStudent; // 위에 만든 객체를 넣음.
								System.out.println("저장 성공");
								break;
							} // if문 종료

						} // for문 종료 null을 찾음.
						break; // 학생등록 정지.

					case 2:
						System.out.println("전체 학생 보기");
						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) { // st배열 칸이 null이 아니면
								System.out.println("-------------------------");
								System.out.println("이름 : " + st[i].name);
								System.out.println("학번 : " + st[i].num);
								System.out.println("성별 : " + st[i].sex);
								System.out.println("학년 : " + st[i].grade);
								System.out.println("반 : " + st[i].classRoom);
							} // if문 종료
						} // for st배열 전체 반복 종료
						break;

					case 3:
						System.out.println("수정할 학생 명을 입력하세요 ");
						System.out.print(">>>>>");
						String searchName = input.next();
						Student findStudent = find(searchName); // 아래 만든 메서드로 찾아옴. // findStudent = 아래서 return한 student와
																// 동일하다.
						if (findStudent == null) { // 찾은 학생이 없으면
							System.out.println("찾은 학생이 없습니다.");
						} else { // 찾은 학생이 있으면.
							System.out.println("수정할 학생 번호를 입력 하세요.");
							findStudent.num = input.nextInt();
							System.out.println("학생 정보 수정 완료");
						}
						break;

					case 4:
						System.out.println("삭제할 학생 명을 입력하세요 ");
						System.out.print(">>>>>");
						String deleteName = input.next(); // 객체 새로 생성. 키보드로 받았음.
						Student deleteStudent = find(deleteName); // 입력받은 값을 아래 메서드로 작동시켜서 deleteStudent값을 가져옴.
						if (deleteStudent == null) {
							System.out.println("삭제할 학생이 없습니다.");
						} else {
							for (int i = 0; i < st.length; i++) {
								if (st[i].name.equals(deleteStudent.name)) {
									st[i] = null;
									System.out.println("삭제 완료");
									break;
								}
							}

						}
						break;

					case 5:
						stRun = false;
						System.out.println("메인 메뉴로 돌아갑니다.");
					default:
						System.out.println("1~5까지 입력해주세요.");
					} // 학생관리 switch문 종료

				} // 학생관리 while문 종료
				break;
			case 2:
				System.out.println("성적관리 클래스로 진입 합니다.");
				break;
			case 3:
				System.out.println("통계 클래스로 진입 합니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료 합니다.");
				run = false;
				break;

			default:
				System.out.println("1~4번 값만 입력 하세요.");
				// break를 작성하면 꺼짐.

			} // switch문 종료 (주메뉴 용)

		} // while문 종료

	}// main 메서드 종료

	private static Student find(String name) {
		// 이름으로 객체를 찾아오는 메서드 -> 리턴은 Student 객체
		Student student = null; // 빈객체 생성
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name; // 배열에 있는 이름을 가져옴
				if (arrayName.equals(name)) { // 배열name과 키보드name을 비교
					student = st[i]; // 찾은 객체를 빈 객체에 넣음.
					break;
				} // if문 종료
			} // if 문 종료
		} // for문 종료

		return student; // 리턴 객체 생성

	}// find 메서드 종료

} // class 종료
