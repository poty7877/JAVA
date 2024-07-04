package ch13.generic;

public class Box<T> { // <T> generic code로 타입을 정하고 시작한다.
	// 위에 명시된 T가 String이면??
	
	
	// 필드
	private T t; // Box 클래스 옆에 <T> 타입으로 넘어옴.

	// 기본생성자

	
	// 메서드

	public T getT() { //getter
		return t;
	}

	public void setT(T t) { //setter
		this.t = t;
	}
}
