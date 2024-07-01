package ch05;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class GradeExam {
	// 학생이름 테이블 -> String[]
	// 점수 테이블 -> byte[]
	// 총점 테이블 -> int[]
	// 평균 테이블 -> double[]

	public static void main(String[] args) {
		// 주 메뉴 구현용
		Scanner mainSC = new Scanner(System.in);

		System.out.println("초기작업 : 학생 수를 입력 하세요.");
		int count = mainSC.nextInt(); // 학생수 등록완료
		String[] name = new String[count]; // count 수 만큼의 배열길이 생성
		byte[] engScores = new byte[count];
		byte[] korScores = new byte[count];
		int[] totalScores = new int[count];
		double[] avgScores = new double[count];

		boolean run = true;

		while (run) { // 메인메뉴 반복 실행.

			System.out.println("======MBC 교육 센터 성적관리 프로그램======");
			System.out.println("1.학생관리 | 2.성적관리 | 3.통계 | 4.종료");
			System.out.println("===================================");
			System.out.print(" >>> ");
			int select = mainSC.nextInt(); // 1~4 까지 정수 입력후에 분기

			switch (select) {

			case 1: // 학생 관리 완료
				System.out.println("학생 관리 메서드로 진입합니다.");
				student(name);
				break;

			case 2: // 성적 관리 완료
				System.out.println("성적 관리 메서드로 진입합니다.");
				scores(engScores, korScores, name);
				break;

			case 3: // 통계 관리 완료
				System.out.println("통계 관리 메서드로 진입합니다.");
				total(totalScores, avgScores, name, engScores, korScores);
				break;

			case 4: // 종료
				System.out.println("프로그램을 종료 합니다.");
				run = false;

				break;

			default: // 1~4사이의 숫자가 아닌경우
				System.out.println("입력값 오류 : 1~4사이의 숫자만 입력해주세요");
			} // 주메뉴 switch문 종료
		} // while문 종료
	} // main 메서드 종료

	public static String[] student(String[] name) { // 학생 관리 메서드 시작
		Scanner studentSC = new Scanner(System.in);
		boolean run = true;
		while (run) { // 학생 관리 메뉴 반복.
			System.out.println("=============학생 관리 메뉴============");
			System.out.println("1.등록 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("===================================");
			System.out.print(">>>");
			int select = studentSC.nextInt();

			switch (select) {
			case 1: // 학생 등록
				System.out.println("학생 등록을 시작합니다.");
				System.out.println("총 학생수는 : " + name.length);
				for (int i = 0; i < name.length; i++) { // 학생이름 반복문
					System.out.print((i + 1) + "번 학생의 이름을 입력 하세요 : ");
					name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열 i에 넣는다.
				}
				System.out.println("학생 등록 완료.");
				break;
			case 2: // 학생 리스트
				System.out.println("학생 리스트 출력");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + "번 학생의 이름은 " + name[i] + " 입니다");

				}
				break;
			case 3: // 학생 이름 수정
				System.out.println("학생 이름 수정 : ");
				System.out.println("수정 할 학생의 번호를 입력 하세요 : ");
				int nameNum = studentSC.nextInt();
				System.out.println(nameNum + "번 학생은 현재 " + name[nameNum - 1] + " 학생 입니다.");
				System.out.println("수정 할 학생 이름을 입력하세요 : ");
				String nameMOD = studentSC.next();
				name[nameNum - 1] = nameMOD;
				System.out.println("수정 완료.");
				break;

			case 4: // 학생 삭제
				System.out.println("삭제할 학생 번호를 입력하세요. ");
				int deleteNum = studentSC.nextInt();
				name[deleteNum - 1] = null;
				System.out.println(deleteNum + " 번" + " 학생을 삭제 했습니다.");
				break;

			case 5: // 종료
				System.out.println("메인 메뉴로 돌아 갑니다.");
				run = false;
				break;

			default:
				System.out.println("입력값 오류 : 1~5사이의 숫자만 입력해주세요");
				break;

			} // 학생 관리 switch문 종료
		} // 학생 관리 while문 종료
		return name;

	}// 학생관리 메서드 종료

	private static void scores(byte[] engScores, byte[] korScores, String[] name) { // 성적 관리 메뉴 메서드 시작
		// 영어점수와 국어점수를 입력.
		Scanner selectSC = new Scanner(System.in);
		boolean run = true;
		while (run) { // 성적 관리 메뉴 반복.

			System.out.println("=====================성적 관리 메뉴=====================");
			System.out.println("1.성적 입력 | 2.성적 확인 | 3.성적 수정 | 4.성적 삭제 | 5.종료");
			System.out.println(" >>> ");
			int select = selectSC.nextInt();

			switch (select) {

			case 1: // 성적 입력 하기
				System.out.println("성적 입력 프로그램입니다.");
				for (int i = 0; i < engScores.length; i++) {
					System.out.println((i + 1) + "번 " + name[i] + " 학생의 영어점수를 입력 해주세요 ."); // 영어 점수 입력
					byte enSc = selectSC.nextByte();
					engScores[i] = enSc;
					System.out.println((i + 1) + "번 " + name[i] + " 학생의 국어점수를 입력 해주세요 ."); // 국어 점수 입력
					byte koSc = selectSC.nextByte();
					korScores[i] = koSc;
				}
				System.out.println("성적 등록 완료.");// for문 종료
				break;

			case 2: // 성적 확인 하기
				System.out.println("==========성적 확인===========");
				System.out.println("성적을 확인 할 학생의 번호를 입력하세요");
				System.out.println(">>>");
				int num = selectSC.nextInt();
				System.out.println(num + "번 " + name[num - 1] + " 학생의 영어 점수는 : " + engScores[num - 1] + " 점 입니다");
				System.out.println(num + "번 " + name[num - 1] + " 학생의 국어 점수는 : " + korScores[num - 1] + " 점 입니다");
				break;

			case 3: // 성적 수정하기
				System.out.println("성적 수정 프로그램 입니다.");
				System.out.println("성적수정을 진행 할 학생의 번호를 입력해주세요.");
				int stuNum = selectSC.nextInt(); // 성적 수정 할 학생의 번호 입력
				System.out.println("1. 영어 점수 수정 | 2. 국어 점수 수정 | 3. 뒤로가기");
				System.out.println(">>>");
				int select1 = selectSC.nextInt(); // 어떤 점수를 수정할지 입력
				switch (select1) { // 성적 수정의 swtich문 시작
				case 1: // 영어 점수 수정
					System.out.println("현재 " + stuNum + " 번" + name[stuNum - 1] + "학생의 영어 점수는 " + engScores[stuNum - 1]
							+ " 점 입니다.");
					System.out.print("수정 할 영어 점수 입력 :");
					byte updateScore = selectSC.nextByte(); // 수정할 점수를 키보드로 입력
					engScores[stuNum - 1] = updateScore; // 입력된 점수를 기존 배열에 저장
					System.out.println(
							stuNum + "번" + name[stuNum - 1] + "학생의 영어 점수가" + engScores[stuNum - 1] + "점으로 변경 되었습니다.");
					break;

				case 2: // 국어 점수 수정
					System.out.println("현재 " + stuNum + " 번" + name[stuNum - 1] + "학생의 국어 점수는 " + korScores[stuNum - 1]
							+ " 점 입니다.");
					System.out.print("수정 할 국어 점수 입력 : ");
					byte updateScore1 = selectSC.nextByte(); // 수정할 점수를 키보드로 입력
					korScores[stuNum - 1] = updateScore1; // 입력된 점수를 기존 배열에 저장
					System.out.println(
							stuNum + "번" + name[stuNum - 1] + "학생의 영어 점수가" + korScores[stuNum - 1] + "점으로 변경 되었습니다.");
					break;

				case 3: // 종료
					System.out.println(" 성적 관리 메뉴로 돌아갑니다. ");
					break;
				}// 성적 수정의 switch문 종료
				break;

			case 4: // 성적 삭제
				System.out.println("성적 삭제 프로그램 입니다. ");
				System.out.println("선택한 학생의 모든 점수가 삭제 됩니다.");
				System.out.print("성적을 삭제할 학생의 번호를 입력하세요 : ");
				int deleteScore = selectSC.nextInt(); // 삭제할 학생의 번호 입력.
				System.out.println(deleteScore + "번 " + name[deleteScore - 1] + " 학생의 점수를 삭제 하시겠습니까 ? ");
				System.out.println("YES or NO");
				String yesNo = selectSC.next(); // 정말 삭제 할 것인지 확인.
				if (yesNo.equalsIgnoreCase("yes")) { // yes입력을 받으면 점수 삭제
					System.out.println(deleteScore + "번 " + name[deleteScore - 1] + " 학생의 점수가 삭제 되었습니다. ");
					korScores[deleteScore - 1] = 0;
					engScores[deleteScore - 1] = 0;
				} else if (yesNo.equalsIgnoreCase("no")) { // no 입력을 받으면 삭제하지 않음.
					System.out.println("성적 삭제를 하지 않습니다.");
				} else {
					System.out.println("다시 입력해주세요.");
				} // if문 종료
				break;

			case 5: // 종료.
				System.out.println(" 메인메뉴로 돌아갑니다. ");
				run = false;
				break;

			default:
				System.out.println("1~5까지의 숫자만 입력해주세요.");

			} // 성적 관리 메뉴 switch문 종료

		} // 성적 관리 메뉴 while문 종료

	}// 성적관리 메서드 종료

	private static void total(int[] totalScores, double[] avgScores, String[] name, byte[] engScore, byte[] korScore) {
		// 통계 메서드 시작
		// 학생1명의 총점과 평균
		// 전체학생의 총점과 평균
		Scanner select = new Scanner(System.in);
		int engSum = 0;
		int korSum = 0;

		boolean run = true;
		while (run) {

			System.out.println("통계 관리 프로그램 입니다.");
			System.out.println("1.개인 학생의 총점, 평균 | 2.전체 학생의 총점, 평균 | 3.1등 확인 | 4.종료");
			int menu = select.nextInt();

			switch (menu) {

			case 1:
				System.out.print("총점과 평균을 확인 할 학생의 번호를 입력해주세요 : ");
				int num = select.nextInt();
				System.out.println(num + "번 " + name[num - 1] + " 학생 ");
				System.out.println("총점 : " + (engScore[num - 1] + korScore[num - 1]) + "점");
				System.out.println("평균 : " + ((engScore[num - 1] + korScore[num - 1]) / 2) + "점");
				System.out.println("입니다.");
				break;

			case 2:
				for (int i = 0; i < totalScores.length; i++) {

					engSum += engScore[i];
					korSum += korScore[i];

				}
				System.out.println("전체 학생의 국어 총점 : " + korSum + "점");
				System.out.println("전체 학생의 영어 총점 : " + engSum + "점");
				System.out.println("국어 평균 : " + korSum / korScore.length + "점");
				System.out.println("영어 평균 : " + engSum / engScore.length + "점");
				System.out.println(" 입니다. ");
				break;

			case 3:
				int max = engScore[0];
				int min = engScore[0];
				int max1 = korScore[0];
				int min1 = korScore[0];
				int maxIndex = 0;
				int minIndex = 0;
				int maxIndex1 = 0;
				int minIndex1 = 0;

				for (int i = 1; i < engScore.length; i++) {
					if (engScore[i] > max) {
						max = engScore[i];
						
					}if (engScore[i] < min) {
						min = engScore[i];
					}

				} // 최대값을 구하는 for문 종료
				for (int j = 1; j < korScore.length; j++) {
					if (korScore[j] > max1) {
						max1 = korScore[j];
						
					}if (korScore[j] < min1) {
						min1 = korScore[j];
					}

				} // 최솟값을 구하는 for문 종료

				for (int i = 1; i < engScore.length; i++) {
					if (max == engScore[i]) {
						maxIndex = i;
						
					}if (min == engScore[i]) {
						minIndex = i;
						
					}
				} // 최대값을 name[] 배열 index와 비교하여 같은 값을 찾아 maxIndex에 집어 넣음.

				for (int j = 1; j < korScore.length; j++) {
					if (max1 == korScore[j]) {
						maxIndex1 = j;
						
					}if (min1 == korScore[j]) {
						minIndex1 = j;
						
					}
				}

				System.out.println("영어 1등은 : " + name[maxIndex] + " 학생 | 점수 : " + max + "점");
				System.out.println("국어 1등은 : " + name[maxIndex1] + " 학생 | 점수 : " + max1 + "점");
				System.out.println("영어 꼴등은 : " + name[minIndex] + " 학생 | 점수 : " + min + "점");
				System.out.println("국어 꼴등은 : " + name[minIndex1] + " 학생 | 점수 : " + min1 + "점");
				break;

			case 4:
				run = false;
				System.out.println("메인 메뉴로 돌아갑니다.");
				break;
			default:
				System.out.println("입력값 오류 : 1~5사이의 숫자만 입력해주세요");

			} // switch 문 종료
		} // while문 종료
	}// total 메서드 종료

} // class 종료
