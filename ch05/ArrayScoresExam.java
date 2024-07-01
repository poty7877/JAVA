package ch05;

import java.util.Scanner;

public class ArrayScoresExam {

	public static void main(String[] args) {
		// 배열을 이용해서 성적표를 만들어 보자.
		// 학생수를 파악한다.
		// 점수를 입력한다.
		// 총점과 평균을 구하여 출력한다.

		Scanner input = new Scanner(System.in);

		System.out.println("=======성적표=======");
		System.out.println("학생수를 입력하세요 :  ");
		int count = input.nextInt();

		int[] scores = new int[count]; // 키보드로 입력받은 count의 값 만큼 scores의 배열길이 생성.
		for (int i = 0; i < scores.length; i++) { // scores.length(배열길이)
			System.out.println((i + 1) + "번째 학생의 점수를 입력하세요 : ");
			scores[i] = input.nextInt();
		} // 학생 수 만큼 배열의 점수를 입력한다. (C)

		System.out.println("======입력된 점수 확인======");
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수는 " + scores[i]);

		}
		System.out.println("======수정할 번호 입력======");
		int select = input.nextInt();
		System.out.println("======수정할 점수 입력======");
		int score = input.nextInt();

		scores[select - 1] = score;
		System.out.println("수정한 결과 확인");
		System.out.println(select + "번 학생의 점수가 " + score + " 로 수정되었습니다. ");

		// 총점과 평균을 구함.

		int sum = total(scores);
		System.out.println("총점은 : " + sum + "점 입니다. ");
		
		double avg = average(sum, count);
		System.out.println("평균은 : " + avg + "점 입니다. ");
		

	}// 메인메서드 종료

	static int total(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; // scores의 모든 값을 sum에 더한다.
		}
		return sum;

	} // scores 배열을 받아 int로 return. // sum 메소드 종료.

	static double average(int sum, int count) {
		double avg = 0;
		avg = sum / count ;
				
		return avg ;
		
	}
}
