package ch13.nonGeneric;

public class Box /* extends Object 자동 상속 (JRE System Library) */ {
	// 필드
	private Object object; // 최상위 객체를 필드로 사용.

	// 기본 생성자

	
	// 메서드
	public Object getObject() { // getter
		return object;
	}

	public void setObject(Object object) { // setter
		this.object = object;
	}
}
