package ch07.exam1.package2;

import ch07.exam1.package1.A;
import ch07.exam1.package1.B;

public class C {
	A a; // default는 다른 패키지에서 안됨.
	B b; // public은 import 처리 하면 접근 가능

	A a1 = new A(true); // public 생성자
	//A a2 = new A(1); // default 생성자
	//A a3 = new A("문자열"); // private 생성자

}
