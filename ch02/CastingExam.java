package ch02;

public class CastingExam {

	public static void main(String[] args) {
		// Casting은 강제 타입 변환으로 큰 타입을 작은 타입으로 강제 주입할 때 사용.
		// 단, 손실이 발생 할 수 있다. -> 2진법에 영향을 받음.
		// int 변수명 = (int) double값 ;ㅣ
		
		int intValue = 12345678 ;
		byte byteValue = (byte) intValue ; // Type mismatch: cannot convert from int to byte
		System.out.println("int 값 : " + intValue ) ;
		System.out.println("byte 값 : " + byteValue ) ;
		
		System.out.println("=======자동 타입 변환=======");
		int intValue1 = 10 ;
		double doubleValue1 = 5.5 ;
		double result1 = intValue1 + doubleValue1 ;
		System.out.println("int 10 + double 5.5 = " + result1);
		
		System.out.println("======정수로 결과 를 봄======");
		int result2 = (int) (intValue1 + doubleValue1) ; // double 타입을 int로 강제 타입 변환.
		System.out.println("int 10 + double 5.5 = " + result2);

	}

}
