package ch10;

public class StringBufferExam { // 구형

	public static void main(String[] args) {
		// String으로 만든 문자열은 객체로 추가나 변경이 안되고 새로운 객체로 또 만든다.
		// StringBuffer는 문자열을 수정과 변경을 할수있다.
		// StringBuilder는 StringBuffer와 다르게 멀티 스레드 환경에서 안정적이지 않음
		// StringBuilder는 싱글 스레드 환경에서 StringBuffer보다 더 빠른 성능을 가짐.

		StringBuffer stringBuffer = new StringBuffer(); // 16개의 문자열 배열
		StringBuffer stringBuffer1 = new StringBuffer("Hello "); // 6개 문자열 배열
		StringBuffer stringBuffer2 = new StringBuffer("Hello "); // 50개 문자열 배열

		stringBuffer1.append("Programming"); // Hello Programming
		System.out.println(stringBuffer1);

		stringBuffer1.insert(6, "java ");
		System.out.println(stringBuffer1);

		stringBuffer1.replace(1, 4, "Good"); // 1부터 3까지. n 부터 m - 1 까지.
		System.out.println(stringBuffer1);

		stringBuffer1.delete(1, 5); // 1부터 4까지. n 부터 m - 1 까지
		System.out.println(stringBuffer1);

		stringBuffer1.reverse();
		System.out.println(stringBuffer1);

		// System.out.println(stringBuffer1.equals(stringBuffer2));
		// equals 재정의가 안되어있어서 사용 불가능.

	}

}
