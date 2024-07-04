package ch13.genericMethod;

public class BoxingMethodExam {

	public static void main(String[] args) {
		// 제네릭 메서드를 사용하여 강한 타입 체크

		Box<Integer> boxI = Utill.<Integer>boxing(100);
		int intValue = boxI.get();

		System.out.println(intValue);

		Box<String> boxS = Utill.<String>boxing("홍길동");
		String strValue = boxS.get();
		System.out.println(strValue);
	}

}
