package ch13.nonGeneric;

public class BoxExam {

	public static void main(String[] args) {
		// Object 타입은 최상위 클래스로 모든 타입으로 자동타입, 강제타입 변환이 된다.
		// 자동타입 변환 후 사용하려면, 강제타입으로 변환하며 활용 한다.
		// 예외 : System.out.print(int | String | double )는 자동으로 강제타입 변환 코드가 들어있음.
		
		// 강제 타입 변환 테스트
		Box box = new Box(); // 기본생성자로 box 객체 생성
		box.setObject("문자열"); // Object 최상위 객체 안에 String이 있기때문에 오류 발생하지 않음.(자동타입변환으로 String처리가 알아서 됨).
		System.out.println(box.getObject()); //
		String name = (String) box.getObject(); // 강제 타입 변환 (Casting)

		Box boxI = new Box(); // 기본생성자로 box 객체 생성
		boxI.setObject(1234); // Object 최상위 객체 안에 Int 정수 데이터가 있기때문에 오류 발생하지 않음.(자동타입변환으로 Int 처리가 알아서 됨).
		Integer val = (Integer) boxI.getObject(); // 강제 타입 변환

		Box boxA = new Box(); // 기본생성자로 box 객체 생성
		boxA.setObject(new AppleDTO()); // Box boxA = new AppleDTO(); -> 다형성 // 자동타입변환.
		AppleDTO appleDTO = (AppleDTO) boxA.getObject(); // 강제타입변환.(why ? : AppleDTO타입의 변수에 Box타입의 객체를 넣으려 하는데 타입이 달라서
															// 들어가지않음. // 강제로 타입변환해서 넣어줌.

	}

}
