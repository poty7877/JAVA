package ch08.extended.package2;

import ch08.extended.package1.A;

public class C extends A{
	// 필드

	// 생성자 -> 다른 클래스에서는 생성자로 부모객체를 연결.
	public C()	 {
		super();
		this.field = "자바";
		this.method();
	}
	
	
	// 메서드
	public void methodC() {
		C c = new C();
		System.out.println(c.field);
		
		
	
	}
	
}
