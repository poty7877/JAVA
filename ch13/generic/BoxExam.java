package ch13.generic;

public class BoxExam {

	public static void main(String[] args) {
		// generic은 <String> 문자열만 처리함.
		// 			<Integer> 정수만 처리함.
		// 			<Apple> Apple 객체만 처리.

		Box<String> boxS = new Box<String>(); 
		boxS.setT("김기원");
		String name = boxS.getT(); // nonGeneric 타입과 다르게 강제타입변환을 할 필요가 없다.
		System.out.println(name);
		
		Box<Integer> boxI = new Box<Integer>();
		boxI.setT(1234);
		int age = boxI.getT();
		System.out.println(age);
		
	}

}
