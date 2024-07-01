package ch06.Ranking;

import java.util.Scanner;

public class RankingExam {

	public static void main(String[] args) {
		// 열거 타입을 사용하려면, 객체를 생성하여 활용(new 사용 안됨)
		// Ranking rk = new Ranking(); xxxx

		Ranking rk = Ranking.GUEST;
		String rkString = rk.name()	; // enum 타입의 상수값을 문자열로 변환
		
		System.out.println("enum 값 : " + rk);

		Ranking rk1 = Ranking.VVVIP;

		Ranking rk2 = Ranking.VIP;
		System.out.println(rk == rk1);
		
		Scanner input = new Scanner(System.in);
		System.out.println("키보드 입력 : ");
		System.out.print(">>>>>");
		String rank = input.next();
		System.out.println("값 비교 " + (rkString == rank));
		System.out.println("equals 비교 " + rkString.equals(rank));
		
		int enumIndex1 = rk.ordinal() ;
		System.out.println("열거 순서 파악 : " + enumIndex1);
		int enumIndex2 = rk1.ordinal() ;
		System.out.println("열거 순서 파악 : " + enumIndex2);
		int enumIndex3 = rk2.ordinal() ;
		System.out.println("열거 순서 파악 : " + enumIndex3);

	}

}
