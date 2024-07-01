package ch08.extended.promotion;

public class ChildExam {

	public static void main(String[] args) {

		Child ch = new Child(); // 자식 객체 생성

		ch.method1(); // 부모 메서드
		ch.method2(); // 자식 메서드
		ch.method3(); // 자식 메서드

		Parent pr = ch;
		// Parent pr = new Child();
		System.out.println("==자동 타입 변환==");
		pr.method1(); // 부모 메서드
		pr.method2(); // 자식 메서드
		// pr.method3();
		// 부모 타입으로 정하면 자식 메서드 사용불가.
		// 사용하려면 재정의(@Override)를 해야 함.
		
		
	}

}
