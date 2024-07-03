package ch10;

public class StringBuilderExam {

	public static void main(String[] args) {
		// StringBuilder는 신형 문자열 처리 방법으로 객체의 문자열을 수정,추가 할 수있다.
		// 동기화 되지 않는다는 점을 제외하고는 StringBuffer 클래스와메서드가 같다. (비동기화)

		// 동기화  ->1. A라는 변수에 10을 넣었음.(처음 만든 K라는 사람이 )
				// 2. 두번째 로그인 한 A라는사람이 A 라는변수에 20을 넣음
				// 3. 처음만든k가 print를 하면 20이나옴.(단일 스레드)
				// 4. 결론 : 여러 객체가 변수를 같이 쓰는 개념
		
		// 구현에서 빠르기 때문에 우선적으로 활용함.

		
		StringBuilder stringBuilder = new StringBuilder(); // 16개의 문자열 배열
		StringBuilder stringBuilder1 = new StringBuilder("Hello "); // 6개 문자열 배열
		StringBuilder stringBuilder2 = new StringBuilder("Hello "); // 50개 문자열 배열

		stringBuilder1.append("Programming"); // Hello Programming
		System.out.println(stringBuilder1);

		stringBuilder1.insert(6, "java ");
		System.out.println(stringBuilder1);

		stringBuilder1.replace(1, 4, "Good"); // 1부터 3까지. n 부터 m - 1 까지.
		System.out.println(stringBuilder1);

		stringBuilder1.delete(1, 5); // 1부터 4까지. n 부터 m - 1 까지
		System.out.println(stringBuilder1);

		stringBuilder1.reverse();
		System.out.println(stringBuilder1);
	}

}
