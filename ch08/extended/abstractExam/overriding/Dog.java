package ch08.extended.abstractExam.overriding;

public class Dog extends Animal {

	@Override
	public void sound() {
		// 조원이 직접 오버라이드 함.
		System.out.println("멍멍멍");

	}

}
