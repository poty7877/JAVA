package ch15.functional;

@FunctionalInterface // 람다식용 인터페이스인지 검증하는 코드.
public interface MyFunction {
	// 인터페이스는 원래 자신을 객체로 사용할 수 없다.
	// 기본적인 상수와 메서드만으로 동작한다.
	// 생성자가 없어 new를 안씀.
	// 메서드는 추상 메서드가 기본.(구현 클래스에게 강제로 주입)
	// 추상 메서드는 실행문{} 없고 (); 으로 끝남.
	// 람다식은 추상메서드가 '1개만' 있어야한다.
	// MyFunction myfunction = () -> {실행문};

	public abstract int method(int x, int y);

	// public abstract void otherMethod(); // 메서드는 1개만 존재해야 하기때문에 오류 발생.

}
