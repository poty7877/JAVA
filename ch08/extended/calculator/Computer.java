package ch08.extended.calculator;

public class Computer extends Calculator {// 자식클래스 (최신형 컴퓨터)

	@Override // 재정의 함!
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의  areaCircle()메서드 재정의 결과");
		return Math.PI * r * r;
	}

}
