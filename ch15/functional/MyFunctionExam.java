package ch15.functional;

public class MyFunctionExam {

	public static void main(String[] args) {
		// 원래는 인터페이스를 사용하기 위해서 구현 클래스가 있어야 한다.
		// 근데 익명의 구현 객체를 이용하기도 한다.

		MyFunction myFunction; // 인터페이스를 변수에 넣음.

		myFunction = (x, y) -> {
			int result = x * y;
			return result;
			// String str = "method call1"; // 실행문1
			// System.out.println(str); // 실행문2
		}; // 익명의 구현 객체 -> 실행문(동작)을 주입

		int result = myFunction.method(10, 30); // 메서드 실행. -> method call1을 실행.
		System.out.println(result);
		System.out.println("---------------------------------");
		System.out.println(myFunction.method(10, 20));
		// 실행문이 2개인 메서드를 실행.

		System.out.println("--------------------------------");

		myFunction = (x, y) -> x * y; // 실행문1개 -> 중괄호가 없이 사용가능, return없이 사용가능.
		// 익명의 구현 객체
		System.out.println(myFunction.method(30, 20)); // 메서드 실행. -> method call2를 실행

		myFunction = (x, y) -> sum(x, y);
		System.out.println(myFunction.method(10, 20));

	}// main method 종료

	public static int sum(int x, int y) {

		return (x + y);

	}

}
