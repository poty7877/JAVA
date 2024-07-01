package ch03;

import java.util.Scanner;

public class ConditionalExam {

	public static void main(String[] args) {
		// 3항 연산자는 if를 간단히 처리하기 위해 활용된다.
		// (조건식) ? 참 : 거짓 ;
		
		int score = 0 ;
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("점수를 입력하시오 : ");
		score = input.nextInt();
		
		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F' ;
		
		System.out.println(score + " 점은 " + grade+ "등급 입니다." );
		
	}

}
